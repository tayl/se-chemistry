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
    private final Map<String, List<Element>> cache;

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

    public Element getElement(String symbol) {
        return table.getElement(symbol);
    }

    private NestedToken getDeepestNest(String formula) {
        NestedToken result = new NestedToken();

        result.originalFormula = formula;

        if (formula.isEmpty()) {
            return result;
        }

        int positionLastOpenParenthesis = -1;
        int positionMatchingCloseParenthesis = -1;
        int positionEndingCoefficient;

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

        if (positionLastOpenParenthesis == -1 || positionMatchingCloseParenthesis == -1) {
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

    private Token getNextToken(String formula) {
        Token result = new Token();

        result.originalFormula = formula;

        if (formula.isEmpty()) {
            return result;
        }

        int positionFirstUpper = -1;
        int positionLastLower;
        int positionFirstNumber = -1;
        int positionLastNumber;
        int positionLastRelevantCharacter = -1;

        for (int i = 0; i < formula.length(); i++) {
            if (Character.isUpperCase(formula.charAt(i))) {
                positionFirstUpper = i;
                positionLastRelevantCharacter = i;
                break;
            }
        }

        if (positionFirstUpper == -1) {
            return result;
        }

        positionLastLower = positionFirstUpper;

        for (int i = positionFirstUpper + 1; i < formula.length(); i++) {
            if (!Character.isLowerCase(formula.charAt(i))) {
                break;
            }
            positionLastLower = i;
            positionLastRelevantCharacter = i;
        }

        for (int i = positionLastLower + 1; i < formula.length(); i++) {
            if (Character.isDigit(formula.charAt(i))) {
                positionFirstNumber = i;
                positionLastRelevantCharacter = i;
            }
            break;
        }

        positionLastNumber = positionFirstNumber;

        for (int i = positionFirstNumber + 1; i < formula.length(); i++) {
            if (Character.isDigit(formula.charAt(i))) {
                positionLastNumber = i;
                positionLastRelevantCharacter = i;
            } else {
                break;
            }
        }

        result.element = formula.substring(positionFirstUpper, positionLastLower + 1);

        if (positionFirstNumber != -1) {
            result.coefficient = Integer.parseInt(formula.substring(positionFirstNumber, positionLastNumber + 1));
        } else {
            result.coefficient = 1;
        }

        result.remainingFormula = formula.substring(positionLastRelevantCharacter + 1);

        return result;
    }

    /**
     * Given a chemical parser formula, this method will determine which elements make it up
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
        }

        Token token = getNextToken(nestedToken.originalFormula);

        do {
            Element element = getElement(token.element);

            if (element == null) {
                return elements;
            }

            for (int i = 0; i < token.coefficient; i++) {
                elements.add(element);
            }

            token = getNextToken(token.remainingFormula);
        } while (token.hasNextToken());

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
                    "\n  originalFormula:" + originalFormula +
                    "\n  nestedFormula:" + nestedFormula +
                    "\n  modifiedFormula:" + modifiedFormula +
                    "\n  modifiedLeftFormula:" + modifiedLeftFormula +
                    "\n  modifiedRightFormula:" + modifiedRightFormula +
                    "\n  coefficient:" + coefficient +
                    "\n}";
        }
    }

    private static class Token {
        private String originalFormula;
        private String element;
        private int coefficient;
        private String remainingFormula;

        public boolean hasNextToken() {
            return remainingFormula != null;
        }

        @Override
        public String toString() {
            return "{" +
                    "\n  originalFormula:" + originalFormula +
                    "\n  element:" + element +
                    "\n  coefficient:" + coefficient +
                    "\n  remainingFormula:" + remainingFormula +
                    "\n}";
        }
    }
}