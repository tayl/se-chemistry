package elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Taylor Veith
 *         Created by Taylor on 2/16/2016.
 */
public class Table {

    private final List<Element> elements = new ArrayList<>();

    private final HashMap<String, Element> elementMap = new HashMap<>();

// --Commented out by Inspection START (5/1/16 4:51 PM):
//    public Element[] getElements() {
//        Element[] e = new Element[elements.size()];
//        return elements.toArray(e);
//    }
// --Commented out by Inspection STOP (5/1/16 4:51 PM)

// --Commented out by Inspection START (5/1/16 4:51 PM):
//    public void setElements(Element[] elements) {
//        for (Element element : elements) {
//            addElement(element);
//        }
//    }
// --Commented out by Inspection STOP (5/1/16 4:51 PM)

    public void addElement(Element element) {
        elements.add(element);
        elementMap.put(element.getName(), element);
        elementMap.put(element.getSymbol(), element);
    }

    public Element getElement(String element) {
        return elementMap.get(element);
    }

// --Commented out by Inspection START (5/1/16 4:51 PM):
//    public int getElementCount() {
//        return elements.size();
//    }
// --Commented out by Inspection STOP (5/1/16 4:51 PM)

// --Commented out by Inspection START (5/1/16 4:52 PM):
//    public void printTable() {
//        for (Element element : elements) {
//            System.out.print(element.getName());
//        }
//    }
// --Commented out by Inspection STOP (5/1/16 4:52 PM)
}