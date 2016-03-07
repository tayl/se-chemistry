package elements;

/**
 * @author Taylor Veith
 * Created by Taylor on 2/16/2016.
 */

/**
 * error codes
 * if a field contains one of the following, the corresponding issue occurred
 * (ideally, this will be replaced with a better system. works as-is though)
 * <p>
 * -99999 unknown
 * -99998 ancient times
 */
public class Element {
    private int atomic_number;
    private double atomic_weight;
    private String name;
    private String symbol;
    private double melting_point;
    private double boiling_point;
    private double density;
    private double percentage_composition; // % of Earth's crust made up of element
    private int year_discovered;
    private int group;
    private Configuration electron_configuration;

    public int getAtomicNumber() {
        return atomic_number;
    }

    public void setAtomicNumber(int atomic_number) {
        this.atomic_number = atomic_number;
    }

    public double getAtomicWeight() {
        return atomic_weight;
    }

    public void setAtomicWeight(double atomic_weight) {
        this.atomic_weight = atomic_weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getMeltingPoint() {
        return melting_point;
    }

    public void setMeltingPoint(double melting_point) {
        this.melting_point = melting_point;
    }

    public double getBoilingPoint() {
        return boiling_point;
    }

    public void setBoilingPoint(double boiling_point) {
        this.boiling_point = boiling_point;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getPercentageComposition() {
        return percentage_composition;
    }

    public void setPercentageComposition(double percentage_composition) {
        this.percentage_composition = percentage_composition;
    }

    public int getYearDiscovered() {
        return year_discovered;
    }

    public void setYearDiscovered(int year_discovered) {
        this.year_discovered = year_discovered;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Configuration getElectronConfiguration() {
        return electron_configuration;
    }

    public void setElectronConfiguration(Configuration electron_configuration) {
        this.electron_configuration = electron_configuration;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
