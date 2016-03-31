package compounds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import elements.Element;

/**
 * @author Taylor Veith
 *         Created by Taylor on 3/5/2016.
 */
public class CompoundList {

    private List<Compound> compounds = new ArrayList<>();

    private HashMap<String, Compound> compoundMap = new HashMap<>();

    public Compound[] getCompounds() {
        Compound[] c = new Compound[compounds.size()];
        return compounds.toArray(c);
    }

    public void setCompounds(Compound[] compounds) {
        for (Compound compound : compounds) {
            addCompound(compound);
        }
        Collections.sort(this.compounds);
    }

    public void setCompounds(List<Compound> compounds) {
        for (Compound compound : compounds) {
            addCompound(compound);
        }
        Collections.sort(this.compounds);
    }

    public void addCompound(Compound compound) {
        compounds.add(compound);
        compoundMap.put(compound.getName(), compound);
        compoundMap.put(compound.getFormula(), compound);
    }

    /**
     * Returns the Compound object associated with a passed formula.
     *
     * If formula is not found verbatim in database, formula will be broken down into elements
     * and searched that way.
     *
     * @param formula Formula representing
     * @return Compound associated with passed formula
     */
    public Compound getCompoundByFormula(String formula) {
        Compound compound = compoundMap.get(formula);
        if (compound != null) {
            return compound;
        }

        return getCompoundByElements(formula);
    }

    public Compound getCompoundByName(String symbol) {
        return compoundMap.get(symbol);
    }

    public Compound getCompoundByElements(String queryElement) {
        CompoundBuilder cb = new CompoundBuilder();
        List<Element> elements = cb.deriveElementsFromFormula(queryElement);

        return getCompoundByElements(elements);
    }

    public Compound getCompoundByElements(List<Element> elements) {
        for (Compound compound : compounds) {
            if (compound.hasElements(elements, true)) {
                return compound;
            }
        }

        return null;
    }

    public List<Compound> getCompoundsByElements(String queryElements) {
        CompoundBuilder cb = new CompoundBuilder();
        List<Element> elements = cb.deriveElementsFromFormula(queryElements);

        return getCompoundsByElements(elements);
    }

    public List<Compound> getCompoundsByElements(List<Element> elements) {
        List<Compound> results = new ArrayList<>();

        for (Compound compound : compounds) {
            if (compound.hasElements(elements, false)) {
                results.add(compound);
            }
        }

        return results;
    }

    public int getCompoundCount() {
        return compounds.size();
    }

    public void printList() {
        char firstLetter = '\u0000';
        for (Compound compound : compounds) {
            String name = compound.getName();
            if (name.isEmpty()) {
                continue;
            }
            if (firstLetter != name.toUpperCase().charAt(0)) {
                firstLetter = name.toUpperCase().charAt(0);
                System.out.println(firstLetter + " -----------");
            }
            System.out.println("  " + name);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Compound compound : compounds) {
            sb.append(compound).append("\n");
        }
        return sb.toString();
    }
}
