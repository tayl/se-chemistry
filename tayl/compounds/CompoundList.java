package compounds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

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
        compoundMap.put(compound.getName().toLowerCase(), compound);
        compoundMap.put(compound.getFormula().toLowerCase(), compound);
    }

    /**
     * Returns the Compound object associated with a passed formula
     *
     * @param formula Must be exact
     * @return Compound associated with passed formula
     */
    public Compound getCompoundByFormula(String formula) {
        return compoundMap.get(formula.toLowerCase());
    }

    public Compound getCompoundByName(String symbol) {
        return compoundMap.get(symbol.toLowerCase());
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
