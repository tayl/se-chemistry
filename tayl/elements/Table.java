package elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Taylor Veith
 *         Created by Taylor on 2/16/2016.
 */
public class Table {

    private List<Element> elements = new ArrayList<>();

    private HashMap<String, Element> elementMap = new HashMap<>();

    public Element[] getElements() {
        Element[] e = new Element[elements.size()];
        return elements.toArray(e);
    }

    public void setElements(Element[] elements) {
        for (Element element : elements) {
            addElement(element);
        }
    }

    public void addElement(Element element) {
        elements.add(element);
        elementMap.put(element.getName().toLowerCase(), element);
        elementMap.put(element.getSymbol().toLowerCase(), element);
    }

    public Element getElementBySymbol(String symbol) {
        return elementMap.get(symbol.toLowerCase());
    }

    public Element getElementByName(String symbol) {
        return elementMap.get(symbol.toLowerCase());
    }

    public int getElementCount() {
        return this.elements.size();
    }

    public void printTable() {
        for (Element element : elements) {
            System.out.print(element.getName());
        }
    }
}