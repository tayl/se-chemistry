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

    Table table = new Table();

    public CompoundList build(String filename) {
        TableBuilder tb = new TableBuilder();
        table = tb.build("tayl/elements/data/elements.csv");

        CompoundList compoundList = new CompoundList();
        ArrayList<Compound> compounds = new ArrayList<>();

        File input = new File(filename);

        try {
            //num	aw	name	symbol	mp	bp	density	% earth crust
            //year	group	electron conf	ionization energy
            Scanner scanner = new Scanner(input);
            String line = null;
            while (scanner.hasNext()) {

                line = scanner.nextLine();

                String[] parts = line.split("\t", 3);

                Compound compound = new Compound();

                //if (parts.length >= 1 && !parts[0].isEmpty()) {
                compound.setFormula(parts[0]);
                //}
                //if (parts.length >= 2 && !parts[1].isEmpty()) {
                compound.setNames(parts[1].split(","));
                //}
                //if (parts.length >= 3 && !parts[2].isEmpty()) {
                compound.setCAS(parts[2]);
                //}

                Element[] compoundElements = deriveElementsFromFormula(compound.getFormula());

                if (compoundElements.length == 0) {
                    continue;
                }
                compound.setElements(compoundElements);

                compounds.add(compound);
            }
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
        } catch (NoSuchElementException nsee) {
            System.out.println("No such element found");
//            nsee.printStackTrace();
        }

        Compound[] compound_array = new Compound[compounds.size()];
        for (int i = 0; i < compound_array.length; i++) {
            compound_array[i] = compounds.get(i);
        }

        compoundList.setCompounds(compound_array);

        return compoundList;
    }

    private Element[] deriveElementsFromFormula(String formula) {
        if (formula.isEmpty()) {
            return new Element[0];
        }

        List<Element> elements = new ArrayList<>();


        String pattern = "([0-9]*H2O)|(\\(*[0-9]*[A-Z][a-z]*[0-9]*\\)*[0-9]*)";

        Pattern regPattern = Pattern.compile(pattern);

        Matcher matcher = regPattern.matcher(formula);

        System.out.println(formula);

        int match = 0;
        while (matcher.find()) {
            String element = matcher.group(match);

            System.out.println(element);

            if (element.matches("[A-Z][a-z]*")) {
                Element matchedElement = table.getElementBySymbol(element);
                if (matchedElement == null) {
                    return new Element[0];
                }
                elements.add(matchedElement);
                System.out.println("Added " + matchedElement.getName());
            }

            if (element.matches("([A-Z][a-z]*)([0-9]+)")) {
                String regularNumberString = "([A-Z][a-z]*)([0-9]+)";
                Pattern numberPattern = Pattern.compile(regularNumberString);
                Matcher numberMatcher = numberPattern.matcher(element);
                numberMatcher.find();
                Element matchedElement = table.getElementBySymbol(numberMatcher.group(1));
                if (matchedElement == null) {
                    return new Element[0];
                }
                int howManyTimesTheElementOccurs = Integer.parseInt(numberMatcher.group(2));
                for (int i = 0; i < howManyTimesTheElementOccurs; i++) {
                    System.out.println("Added " + matchedElement.getName());
                    elements.add(matchedElement);
                }
            }

            if (element.matches("([A-Z][a-z]*)([0-9]+)")) {
                String regularNumberString = "([A-Z][a-z]*)([0-9]+)";
                Pattern numberPattern = Pattern.compile(regularNumberString);
                Matcher numberMatcher = numberPattern.matcher(element);
                numberMatcher.find();
                Element matchedElement = table.getElementBySymbol(numberMatcher.group(1));
                if (matchedElement == null) {
                    return new Element[0];
                }
                int howManyTimesTheElementOccurs = Integer.parseInt(numberMatcher.group(2));
                for (int i = 0; i < howManyTimesTheElementOccurs; i++) {
                    System.out.println("Added " + matchedElement.getName());
                    elements.add(matchedElement);
                }
            }

        }
        System.out.println();


        Element[] elementsArray = new Element[elements.size()];

        return elements.toArray(elementsArray);
    }
}
