package compounds;

import java.util.List;

import elements.Element;

/**
 * @author Taylor Veith
 *         Created by Taylor on 3/5/2016.
 */
public class Test {
    public static void main(String[] s) {
        CompoundBuilder cb = new CompoundBuilder();
        CompoundList compoundList = cb.build("tayl/compounds/data/compounds.txt");


//        // returns ALL Compounds that have AT LEAST the given elements
//        System.out.println("----------All Compounds containing Cu and Te");
//        List<Compound> compounds = compoundList.getCompoundsByElements("CuTe");
//        System.out.println(compounds);
//        System.out.println();
//
//        // returns THE Compound that has the EXACT elements, if it exists (null otherwise)
//        System.out.println("----------Compound containing exactly Cu and Te");
//        Compound compound = compoundList.getCompoundByElements("CuTe");
//        System.out.println(compound);
//        System.out.println();
//
//        // returns THE Compound that has the EXACT elements, if it exists (null otherwise)
//        // optimized for exact formulas, but will still fall back to element by element search
//        System.out.println("----------Compound with the formula H2O");
//        compound = compoundList.getCompoundByFormula("H2O"); //HHO will also work
//        System.out.println(compound);
//        System.out.println();
//
//        // returns the Compound that has the EXACT elements, if it exists (null otherwise)
//        System.out.println("----------Compound with the formula HOHO (but it doesn't exist, so it falls back to searching for Compounds with the element H, O, H, and O");
//        compound = compoundList.getCompoundByFormula("HOHO");
//        System.out.println(compound);
//        System.out.println();
//
//        // if the compound exists and is associated with a name (most are), it will return it
//        System.out.println("----------Searches for compound with the name Water");
//        compound = compoundList.getCompoundByName("Water");
//        System.out.println(compound);

        List<Element> elements = cb.deriveElementsFromFormula("(Na(H2O)4Cl)2");
        System.out.println(elements);
        elements = cb.deriveElementsFromFormula("(NaCl(H2O)4)2");
        System.out.println(elements);
        return;
    }
}