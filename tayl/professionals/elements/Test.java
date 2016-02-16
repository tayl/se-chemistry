package tayl.professionals.elements;

/**
 * Created by Taylor on 2/16/2016.
 */
public class Test {
    public static void main(String[] s) {
        TableBuilder tb = new TableBuilder();
        Table table = tb.build("tayl/professionals/elements/data/elements.csv");
        table.printTable();
    }
}