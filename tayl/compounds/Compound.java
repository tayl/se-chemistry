package compounds;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import elements.Element;

/**
 * @author Taylor Veith
 *         Created by Taylor on 3/5/2016.
 */
public class Compound implements Comparable<Compound> {

    // Cu(NO3)2|6H2O	copper(II) nitrate hexahydrate	10294-41-4
    private String formula; // chemical formula - case, parenthesis, and pipes preserve formatting in place of bases
    private String[] names; //
    private String CAS;     // Chemical Abstracts Service (CAS) identifier
    private List<Element> elements;
    private double weight;


    public List<Element> getElements() {
        return elements;
    }

    public void setElements(Element[] elements) {
        this.elements = Arrays.asList(elements);
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public boolean hasElements(List<Element> elements, boolean exact) {
        List<Element> copyOfElementsWeHave = new ArrayList<>();

        for (Element element : this.elements) {
            copyOfElementsWeHave.add((Element) element.clone());
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

    public double getWeight() {
        if (weight == 0.0D) {
            for (Element element : elements) {
                weight += element.getAtomicWeight();
            }
        }
        return weight;
    }

    /**
     * @return
     */
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    /**
     * @return Returns the either the first name in the Compounds array of names, or "no name"
     */
    public String getName() {
        if (names.length == 0) {
            return "no name";
        }
        return names[0];
    }

    /**
     * @return Returns the Compounds array of names
     */
    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String getCAS() {
        return CAS;
    }

    public void setCAS(String CAS) {
        this.CAS = CAS;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return "Name: " + getName() + "\nFormula: " + getFormula() + "\nMolar mass: " +
                df.format(getWeight()) + "\nAtoms: " + elements.toString() + "\n";
    }

    @Override
    public int compareTo(Compound that) {
        if (this.getWeight() < that.getWeight()) {
            return -1;
        } else {
            return 1;
        }
    }
}
