package compounds;

/**
 * @author Taylor Veith
 *         Created by Taylor on 3/5/2016.
 */
public class Test {
    public static void main(String[] s) {
        CompoundBuilder cb = new CompoundBuilder();
        CompoundList compoundList = cb.build("tayl/compounds/data/compounds.tsv");
        compoundList.printCompounds();
    }
}