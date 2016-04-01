package example.com.chem;

/**
 * Created by robertvalladares on 3/14/16.
 */
public class ChemItem {
    private String id;
    private String name;
    private String molMass;
    private String chemFormula;

    //Constructor

    public ChemItem(String id, String name, String molMass, String chemFormula) {
        this.id = id;
        this.name = name;
        this.molMass = molMass;
        this.chemFormula = chemFormula;
    }

    //Setter, getter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMolMass() {
        return molMass;
    }

    public void setMolMass(String molMass) {
        this.molMass = molMass;
    }

    public String getChemFormula() {
        return chemFormula;
    }

    public void setChemFormula(String chemFormula) {
        this.chemFormula = chemFormula;
    }
}