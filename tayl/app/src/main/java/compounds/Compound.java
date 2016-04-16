package compounds;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import elements.Element;

/**
 * @author Taylor Veith
 *         Created by Taylor on 3/5/2016.
 */
public class Compound implements Comparable<Compound> {

    /**
     * chemical formula - case, parenthesis, and pipes preserve formatting in place of bases
     */
    private String formula;

    /**
     * if the Compound is unknown and is built solely from Elements, a formula will be generated
     */
    private String fauxFormula;

    /**
     * array regardless of number of names. Some Compounds have multiple. If only one name exists,
     * index 0 contains that name
     */
    private String[] names;

    /**
     * the Elements this Compound is made up of. Elements can exist multiple times
     * CO2 = {C, O, O}, NOT {C, O}
     */
    private List<Element> elements;

    /**
     * the Elements this Compound is made up of. Elements can exist multiple times
     * CO2 = {C, O, O}, NOT {C, O}
     */
    private List<String> condensedElements;

    /**
     * the weight of the Compound is the combined weight of all Elements making it up
     */
    private double weight;

    /**
     * used interally by ResultsAdapter
     * ideally, this should be represented in a wrapper class that transports the Compound
     */
    private boolean exactMatch;

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(Element[] elements) {
        this.elements = Arrays.asList(elements);
    }

    /**
     * Example(s):
     * Formula  -> Elements                           -> Condensed Elements
     * Be(BH4)2 -> {B, H, H, H, H, B, H, H, H, H, Be} -> {B2, H8, Be}
     * NH4ClO4  -> {N, H, H, H, H, Cl, O, O, O, O}    -> {N, H4, Cl, O4}
     *
     * @return The Compounds Elements with associated coefficients
     */
    public List<String> getElementsCondensed() {

        // if the condensed version has already been generated, skip generation and return it
        if (condensedElements == null) {
            HashMap<Element, Integer> hm = new HashMap<>();
            for (Element element : elements) {
                Integer count = hm.get(element);
                if (count == null) {
                    count = 0;
                }

                hm.put(element, count + 1);
            }

            List<String> results = new ArrayList<>();
            for (Element element : hm.keySet()) {
                int count = hm.get(element);
                if (count == 1) {
                    results.add(element.getSymbol());
                } else {
                    results.add(element.getSymbol() + count);
                }
            }
            condensedElements = results;
        }

        return condensedElements;
    }

    /**
     * Given a List of Elements, this function compares the Elements of this Compound to the
     * Elements that were passed in. It will return True if this Compound contains all of
     * those Elements, disregarding quantity. If exact is True, quantity will matter.
     *
     * @param elements Elements to compare to this Compounds Elements
     * @param exact    If set, quantity of Elements must match as well
     * @return Whether or not this Compound contains all of the Elements passed in
     */
    public boolean hasElements(List<Element> elements, boolean exact) {
        List<Element> copyOfElementsWeHave = new ArrayList<>();

        for (Element element : this.elements) {
            copyOfElementsWeHave.add(element);
        }

        for (Element element : elements) {
            if (copyOfElementsWeHave.contains(element)) {
                copyOfElementsWeHave.remove(element);
            } else {
                return false;
            }
        }

        if (exact) {
            return copyOfElementsWeHave.size() == 0;
        }
        return true;
    }

    public boolean isExactMatch() {
        return exactMatch;
    }

    public void setExactMatch(boolean exactMatch) {
        this.exactMatch = exactMatch;
    }

    public double getWeight() {
        if (weight == 0.0D) {
            for (Element element : elements) {
                weight += element.getAtomicWeight();
            }
        }
        return weight;
    }

    /**
     * Returns the known formula, or generated formula if a formula does not exist.
     *
     * @return A formula representing this Compound
     * @see Compound#formula
     * @see Compound#fauxFormula
     */
    public String getFormula() {
        if (formula == null) {
            if (fauxFormula == null) {
                List<String> elements = getElementsCondensed();
                StringBuilder sb = new StringBuilder();
                for (String element : elements) {
                    sb.append(element);
                }
                fauxFormula = sb.toString();
            }
            return fauxFormula;
        }
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    /**
     * @return Returns either the first name in the Compounds array of names, "Unknown Compound",
     * or, if the Compound consists of a single Element, that Elements name.
     */
    public String getName() {
        if (elements.size() == 1) {
            return elements.get(0).getName();
        }
        if (names == null || names.length == 0) {
            return "Not Listed/Unknown";
        }
        return names[0];
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return "Name: " + getName() + "\nFormula: " + getFormula() + "\nMolar mass: " +
                df.format(getWeight()) + "\nAtoms: " + elements.toString() + "\n";
    }

    @Override
    public boolean equals(Object that) {
        return formula.equals(((Compound) that).formula);
    }

    @Override
    public int compareTo(Compound that) {
        String thisName = this.getName();
        String thatName = that.getName();

        if (!Character.isAlphabetic(thisName.charAt(0))) {
            int i = 1;
            while (!Character.isAlphabetic(thisName.charAt(i))) {
                i++;
            }
            thisName = thisName.substring(i);
        }

        if (!Character.isAlphabetic(thatName.charAt(0))) {
            int i = 1;
            while (!Character.isAlphabetic(thatName.charAt(i))) {
                i++;
            }
            thatName = thatName.substring(i);
        }

        return thisName.compareToIgnoreCase(thatName);
    }
}