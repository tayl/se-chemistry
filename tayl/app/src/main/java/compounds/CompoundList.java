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

    public List<Compound> getCompounds() {
        return this.compounds;
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

    public List<Compound> getCompounds(int limit) {
        if (limit > compounds.size()) {
            return compounds;
        }
        return compounds.subList(0, limit);
    }

    public Compound[] getCompoundsAsArray() {
        Compound[] c = new Compound[compounds.size()];
        return compounds.toArray(c);
    }

    public void addCompound(Compound compound) {
        compounds.add(compound);
        compoundMap.put(compound.getName(), compound);
        compoundMap.put(compound.getFormula(), compound);
    }

    /**
     * Returns the Compound object associated with a passed formula.
     * <p/>
     * If formula is not found verbatim in database, formula will be broken down into elements
     * and searched that way.
     *
     * @param formula Formula representing
     * @return Compound associated with passed formula
     */
    public Compound getCompoundByFormula(CompoundBuilder cb, String formula) {
        if (formula.isEmpty()) {
            return null;
        }

        Compound compound = compoundMap.get(formula);
        if (compound != null) {
            return compound;
        }

        return getCompoundByElements(cb, formula);
    }

    public Compound getCompoundByName(String symbol) {
        return compoundMap.get(symbol);
    }

    public Compound getCompoundByElements(CompoundBuilder cb, String queryElement) {
        List<Element> elements = cb.deriveElementsFromFormula(queryElement);

        return getCompoundByElements(elements);
    }

    public Compound getCompoundByElements(List<Element> elements) {
        if (elements == null || elements.size() == 0) {
            return null;
        }

        for (Compound compound : compounds) {
            if (compound.hasElements(elements, true)) {
                return compound;
            }
        }

        Compound unknownCompound = new Compound();
        unknownCompound.setElements(elements);

        return unknownCompound;
    }

    public List<Compound> getCompoundsByPartialName(String query) {
        List<Compound> results = new ArrayList<>();
        for (Compound compound : compounds) {
            if (compound.getName().toLowerCase().contains(query.toLowerCase())) {
                results.add(compound);
            }
        }
        return results;
    }

    public List<Compound> getCompoundsByElements(CompoundBuilder cb, String queryElements) {
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