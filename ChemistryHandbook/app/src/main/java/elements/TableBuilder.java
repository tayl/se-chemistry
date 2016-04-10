package elements;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

/**
 * @author Taylor Veith
 *         Created by Taylor on 2/16/2016.
 *         Builds the Periodic Table from elements in data folder
 */
public class TableBuilder {

    public Table build(InputStream is) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        Table table = new Table();

        try {
            //num	aw	name	symbol	mp	bp	density	% earth crust
            //year	group	electron conf	ionization energy
            String line;
            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                Element element = new Element();

                element.setAtomicNumber(parseInt(parts[0]));
                element.setAtomicWeight(parseDouble(parts[1]));
                element.setName(parts[2]);
                element.setSymbol(parts[3]);
                element.setMeltingPoint(parseDouble(parts[4]));
                element.setBoilingPoint(parseDouble(parts[5]));
                element.setDensity(parseDouble(parts[6]));
                element.setPercentageComposition(parseDouble(parts[7]));
                element.setYearDiscovered(parseInt(parts[8]));
                element.setGroup(parseInt(parts[9]));

                table.addElement(element);
            }
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
        } catch (NoSuchElementException nsee) {
            System.out.println("No such element found");
//            nsee.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return table;
    }

    private int parseInt(String s) {
        if (s == null || s.isEmpty()) {
            return -99999;
        }
        if (s.contains("ancient")) {
            return -99998;
        }
        return Integer.parseInt(s);
    }

    private double parseDouble(String s) {
        if (s == null || s.isEmpty()) {
            return -99999D;
        }
        return Double.parseDouble(s);
    }
}
