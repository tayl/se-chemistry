package com.taylor.test.chemistry.elements;

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
        elementMap.put(element.getName(), element);
        elementMap.put(element.getSymbol(), element);
    }

    public Element getElementBySymbol(String symbol) {
        return elementMap.get(symbol);
    }

    public Element getElementByName(String symbol) {
        return elementMap.get(symbol);
    }

    public int getElementCount() {
        return elements.size();
    }

    public void printTable() {
        for (Element element : elements) {
            System.out.print(element.getName());
        }
    }
}