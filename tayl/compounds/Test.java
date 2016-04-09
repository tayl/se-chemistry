package compounds;

/**
 * @author Taylor Veith
 *         Created by Taylor on 3/5/2016.
 */
public class Test {
    public static void main(String[] s) {
        CompoundBuilder cb = new CompoundBuilder("tayl/elements/data/elements.csv");

        CompoundList compoundList = cb.build("tayl/compounds/data/compounds.txt");

        System.out.println(compoundList.getCompoundByFormula(cb, "(Na(Cl2)Na)"));

        return;
    }
}