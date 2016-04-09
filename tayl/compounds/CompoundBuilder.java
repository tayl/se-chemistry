package compounds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import elements.Element;
import elements.Table;
import elements.TableBuilder;

/**
 * @author Taylor Veith
 *         Created by Taylor on 3/5/2016.
 */
public class CompoundBuilder {

    /**
     * We'll be referencing the elements, so we need a table
     */
    private Table table = new Table();

    /**
     * This Class has a heavy method with recursion that benefits from a cache
     */
    private Map<String, List<Element>> cache;

    public CompoundBuilder(String elementInputFilename) {
        TableBuilder tb = new TableBuilder();

        InputStream is = null;

        try {
            is = new FileInputStream(new File(elementInputFilename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (is == null) {
            System.out.println("Cannot open file " + elementInputFilename);
        }

        table = tb.build(is);

        cache = new HashMap<>();
    }

    public CompoundBuilder(InputStream elementInputStream) {
        TableBuilder tb = new TableBuilder();
        table = tb.build(elementInputStream);

        cache = new HashMap<>();
    }

    public CompoundList build(String compoundInputFilename) {
        try {
            return build(new FileInputStream(new File(compoundInputFilename)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public CompoundList build(InputStream compoundInputStream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(compoundInputStream));

        //CompoundList accepts List or generic array, using List for variable length
        List<Compound> compounds = new ArrayList<>();

        try {
            String line;

            while ((line = reader.readLine()) != null) {
                //Lines are in the format:
                //[formula] [name|names]    [CAS]
                //e.g.:
                //H2O	Water	7732-18-5
                //OR
                //H2SO4 Sulfuric Acid|Hydrogen Sulfate  7664-93-9

                //break the line into its 3 parts
                String[] parts = line.split("\t", 3);

                //create the compound to fill with properties
                Compound compound = new Compound();

                //all will be Strings except the names, which will be an array of Strings
                compound.setFormula(parts[0]);
                //split() will return an array regardless of whether or not it finds the splitter
                compound.setNames(parts[1].split("\\|"));
                compound.setCAS(parts[2]);

                //given the chemical formula, determine the elements that make it up
                List<Element> compoundElementList = deriveElementsFromFormula(compound.getFormula());

                //what?
                if (compoundElementList.size() == 0) {
                    continue;
                }

                //associate the generated Elements with the Compound
                compound.setElements(compoundElementList);

                //add the new Compound to the list of Compounds
                compounds.add(compound);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        CompoundList compoundList = new CompoundList();

        compoundList.setCompounds(compounds);

        return compoundList;
    }

    public NestedToken getDeepestNest(String formula) {
        NestedToken result = new NestedToken();

        result.originalFormula = formula;

        if (formula.isEmpty()) {
            return result;
        }

        int positionLastOpenParenthesis = 0;
        int positionMatchingCloseParenthesis = 0;
        int positionEndingCoefficient = 0;

        for (int i = 0; i < formula.length(); i++) {
            if (formula.charAt(i) == '(') {
                positionLastOpenParenthesis = i;
            }
        }

        for (int i = positionLastOpenParenthesis + 1; i < formula.length(); i++) {
            if (formula.charAt(i) == ')') {
                positionMatchingCloseParenthesis = i;
                break;
            }
        }

        if (positionLastOpenParenthesis == positionMatchingCloseParenthesis) {
            return result;
        }

        positionEndingCoefficient = positionMatchingCloseParenthesis;

        for (int i = positionMatchingCloseParenthesis + 1; i < formula.length(); i++) {
            if (Character.isDigit(formula.charAt(i))) {
                positionEndingCoefficient = i;
            } else {
                break;
            }
        }

        result.nestedFormula = formula.substring(positionLastOpenParenthesis + 1, positionMatchingCloseParenthesis);
        result.modifiedFormula = formula.substring(0, positionLastOpenParenthesis) + formula.substring(positionEndingCoefficient + 1, formula.length());
        result.modifiedLeftFormula = formula.substring(0, positionLastOpenParenthesis);
        result.modifiedRightFormula = formula.substring(positionEndingCoefficient + 1, formula.length());
        if (positionEndingCoefficient != positionMatchingCloseParenthesis) {
            result.coefficient = Integer.parseInt(formula.substring(positionMatchingCloseParenthesis + 1, positionEndingCoefficient + 1));
        }
        return result;
    }

    /**
     * Given a chemical compounds formula, this method will determine which elements make it up
     * and how many of each. This is useful for determining properties of the compound (weight)
     *
     * @param formula The chemical formula (e.g. "H2O", "Mg3(Si4O10)(OH)2", "(NH4)2(Pt(SCN)6)")
     * @return List of Element objects that make up the Compound
     */
    public List<Element> deriveElementsFromFormula(String formula) {

        List<Element> elements;

        elements = cache.get(formula);
        if (elements != null) {
            return elements;
        }

        elements = new ArrayList<>();

        if (formula.isEmpty()) {
            cache.put(formula, elements);
            return elements;
        }

        NestedToken nestedToken = getDeepestNest(formula);

        System.out.println(nestedToken);

        //iterate over the matches
        while (nestedToken.nestedFormula != null) {

            StringBuilder sb = new StringBuilder();

            if (nestedToken.coefficient > 1) {
                for (int i = 0; i < nestedToken.coefficient; i++) {
                    sb.append(nestedToken.nestedFormula);
                }
            } else {
                sb.append(nestedToken.nestedFormula);
            }

            nestedToken.modifiedFormula = nestedToken.modifiedLeftFormula + sb.toString() + nestedToken.modifiedRightFormula;

            nestedToken = getDeepestNest(nestedToken.modifiedFormula);

            System.out.println(nestedToken);

        }

        //this regular expression matches one of the following:
        //a possible coefficient followed by the literal "H2O"
        //an element symbol followed by an optional base
        String pattern = "(([A-Z][a-z]*)([0-9]*))|(([0-9]*)(H2O))";
        /*          2            3          5       6
                   1                       4
                  0
         *///groups

        Pattern regPattern = Pattern.compile(pattern);
        Matcher matcher = regPattern.matcher(nestedToken.originalFormula);

        //the matcher will return true as it consumes matches
        while (matcher.find()) {
            String match;

            //group 2 is the element symbol - if this is null, H2O was matched
            if ((match = matcher.group(2)) != null) {

                //get the Element once
                Element matchedElement = table.getElementBySymbol(match);

                //group 3 is the element base
                String countAsString = matcher.group(3);

                //if the base contains a number, add the element that many times
                if (!countAsString.isEmpty()) {
                    int count = Integer.parseInt(countAsString);
                    for (int i = 0; i < count; i++) {
                        elements.add(matchedElement);
                    }
                } else { //otherwise, just add it once
                    elements.add(matchedElement);
                }
                continue;
            }

            //group 6 is the literal H2O, we're going to manually add water
            if ((match = matcher.group(6)) != null) {

                //cache the Hydrogen and Oxygen Element objects in case we need to add them more than once
                Element hydrogen = table.getElementBySymbol("H");
                Element oxygen = table.getElementBySymbol("O");

                //group 5 is waters coefficient
                String countAsString = matcher.group(5);

                //if the coefficient exists, add the elements that many times
                if (!countAsString.isEmpty()) {
                    int count = Integer.parseInt(countAsString);
                    for (int i = 0; i < count; i++) {
                        elements.add(hydrogen);
                        elements.add(hydrogen);
                        elements.add(oxygen);
                    }
                } else { //otherwise, just add it once
                    elements.add(hydrogen);
                    elements.add(hydrogen);
                    elements.add(oxygen);
                }
                continue;
            }
        }

        cache.put(formula, elements);

        return elements;
    }

    private static class NestedToken {
        private String originalFormula;
        private String nestedFormula;
        private String modifiedFormula;
        private String modifiedLeftFormula;
        private String modifiedRightFormula;
        private int coefficient;

        @Override
        public String toString() {
            return "{" +
                    "\n originalFormula:" + originalFormula +
                    "\n nestedFormula:" + nestedFormula +
                    "\n modifiedFormula:" + modifiedFormula +
                    "\n modifiedLeftFormula:" + modifiedLeftFormula +
                    "\n modifiedRightFormula:" + modifiedRightFormula +
                    "\n coefficient:" + coefficient +
                    "\n}";
        }
    }
}