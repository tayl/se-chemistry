package compounds;

import java.util.Arrays;

import elements.Element;

/**
 * @author Taylor Veith
 *         Created by Taylor on 3/5/2016.
 */
public class Compound {

    // Cu(NO3)2|6H2O	copper(II) nitrate hexahydrate	10294-41-4
    private String formula; // chemical formula - case, parenthesis, and pipes preserve formatting in place of bases
    private String[] names; //
    private String CAS;     // Chemical Abstracts Service (CAS) identifier
    private Element[] elements;


    public Element[] getElements() {
        return elements;
    }

    public void setElements(Element[] elements) {
        this.elements = elements;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

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
        return formula + " " + names.length + Arrays.toString(names);
    }
}
