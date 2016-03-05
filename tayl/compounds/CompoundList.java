package compounds;

/**
 * @author Taylor Veith
 *         Created by Taylor on 3/5/2016.
 */
public class CompoundList {
    private Compound[] compounds;

    public Compound[] getCompounds() {
        return this.compounds;
    }

    public void setCompounds(Compound[] compounds) {
        this.compounds = compounds;
    }

    public int getCompoundCount() {
        return this.compounds.length;
    }

    public void printCompounds() {
        for (Compound compound : compounds) {
            System.out.println(compound);
        }
    }
}
