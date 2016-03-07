package compounds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
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

    //We'll be referencing the elements, so we need a table
    Table table = new Table();

    public CompoundList build(String filename) {

        //create a new TableBuilder and build a table of elements from it
        TableBuilder tb = new TableBuilder();
        table = tb.build(TableBuilder.LIST_OF_ELEMENTS_FILENAME);

        //CompoundList accepts List or generic array, using List for variable length
        List<Compound> compounds = new ArrayList<>();

        //use passed input filename as compound list
        File input = new File(filename);

        try {
            Scanner scanner = new Scanner(input);

            String line = null;

            while (scanner.hasNext()) {

                //Lines are in the format:
                //[formula] [name|names]    [CAS]
                //e.g.:
                //H2O	Water	7732-18-5
                //OR
                //H2SO4 Sulfuric Acid|Hydrogen Sulfate  7664-93-9
                line = scanner.nextLine();

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
        } catch (FileNotFoundException e) {
            System.out.println(filename + " not found");
//            e.printStackTrace();
        } catch (NoSuchElementException nsee) {
            System.out.println("No such element found");
//            nsee.printStackTrace();
        }

        CompoundList compoundList = new CompoundList();

        compoundList.setCompounds(compounds);

        return compoundList;
    }

    /**
     * Given a chemical compounds formula, this method will determine which elements make it up
     * and how many of each. This is useful for determining properties of the compound (weight)
     *
     * @param formula The chemical formula (e.g. "H2O", "Mg3(Si4O10)(OH)2", "(NH4)2(Pt(SCN)6)")
     * @return List of Element objects that make up the Compound
     */
    private List<Element> deriveElementsFromFormula(String formula) {

        List<Element> elements = new ArrayList<>();

        if (formula.isEmpty()) {
            return elements;
        }

        //this regular expression will match nested parenthesis up to two levels deep, possibly
        //followed by a number
        String pattern = "(\\((([^()]*|\\([^()]*\\))*)\\))([0-9]*)";

        Pattern regPattern = Pattern.compile(pattern);
        Matcher matcher = regPattern.matcher(formula);

        //iterate over the matches
        while (matcher.find()) {

            //the second group contains the nested formula without parenthesis
            //to prevent superfluous calls further down, we'll call once and save it for later
            //this recursive call further breaks down this subsegment of the formula
            List<Element> tempElements = deriveElementsFromFormula(matcher.group(2));

            //the fourth group is a number (possibly) that represents how many times the 
            //contained elements are repeated in the formula
            if (!matcher.group(4).isEmpty()) { // ()n
                //the number is there, so parse it as an integer so that we may
                //add the elements that many times
                int count = Integer.parseInt(matcher.group(4));

                for (int i = 0; i < count; i++) {
                    elements.addAll(tempElements);
                }
            } else { // ()
                //otherwise, there was no number so just add the elements once
                elements.addAll(tempElements);
            }
        }

        //at this point, we've processed any portions of the formula nested in parenthesis
        //to avoid erroneously counting elements multiple times, we'll remove all nested
        //parts of the formula
        formula = formula.replaceAll("\\(.+?\\)[0-9]*", "");

        //this regular expression matches one of the following:
        //a possible coefficient followed by the literal "H2O"
        //an element symbol followed by an optional base
        pattern = "(([A-Z][a-z]*)([0-9]*))|(([0-9]*)(H2O))";
        /*          2            3          5       6
                   1                       4
                  0
         *///groups

        regPattern = Pattern.compile(pattern);
        matcher = regPattern.matcher(formula);

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

        return elements;
    }
}
