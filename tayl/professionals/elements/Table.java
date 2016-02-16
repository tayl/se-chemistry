package tayl.professionals.elements;

/**
 * @author Taylor Veith
 *         Created by Taylor on 2/16/2016.
 */
public class Table {
    private Element[] elements;

    public Element[] getElements() {
        return this.elements;
    }

    public void setElements(Element[] elements) {
        this.elements = elements;
    }

    public int getElementCount() {
        return this.elements.length;
    }

    public void printTable() {
        for (Element element : elements) {
            System.out.print(element.getName());
        }
    }
}