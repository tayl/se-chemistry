package activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import tech.ondek.chemistryhandbook.R;


/**
 * Created by robertvalladares on 4/03/16.
 * Updated to add text listener 04/16/16 by Robert Valladares
 */
public class MoleActivity extends Activity {

    private Double mChemItemMolarMass = 1.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Find the layout and it's fields and text boxes
        setContentView(R.layout.activity_mole);
        final EditText EditGrams = (EditText) findViewById(R.id.editGrams);
        final TextView EditMoles = (TextView) findViewById(R.id.editMoles);
        // set the textFields to the corresponding layout items
        final TextView EditChemItemName = (TextView) findViewById(R.id.textChemName);
        final TextView EditChemItemFormula = (TextView) findViewById(R.id.textChemItemFormula);
        final TextView EditChemItemMolarMass = (TextView) findViewById(R.id.textChemItemMolMass);

        // read the chemical items parameters passed with the intent
        Intent intent = getIntent();
        String ipChemItemName = intent.getStringExtra("ChemItemName");
        String ipChemItemFormula = intent.getStringExtra("ChemItemFormula");
        Double ipChemItemMolarMass = intent.getDoubleExtra("ChemItemMolarMass", 1D);

        // set the text to be displayed on the top of the activity for chemical name and formula
        EditChemItemName.setText(ipChemItemName);
        EditChemItemFormula.setText(ipChemItemFormula);
        EditChemItemMolarMass.setText(Double.toString(ipChemItemMolarMass));
        // if the passed molar mass is 0, handle division by 0 here to avoid errors
        // in molar calculation
        if ((mChemItemMolarMass = ipChemItemMolarMass) == 0D) {
            mChemItemMolarMass = 1.0D;
        }

        // *****************TEXT LISTENER FOR IMPUT CHANGE **************
        // set up a text listener to EditGrams to react anytime user
        // enters a grams amount or edit its
        // DANIEL OR TAYLOR THIS HAS BEEN ADDED TO LISTEN TO TEXT CHANGE 04/16/2016
        EditGrams.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                double readGrams;
                double moles;
                // set the result field "EditMoles" to empty unless
                // user enters valid input
                EditMoles.setText("");
                // get input from users as a double, put it in the grams
                // prevent the user from converting an empty input
                if (!(EditGrams.getText().toString().equals(""))) {
                    readGrams = Double.parseDouble(EditGrams.getText().toString());
                    // transform from grams to moles
                    moles = readGrams * (1 / mChemItemMolarMass);
                    // Set the value of the return in moles
                    EditMoles.setText(String.valueOf(moles));
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        }); // this could replace the Button action, and allow the button to disapear
        // *****************END OF TEXT LISTENER FOR IMPUT CHANGE **************

    }// end of protected void onCreate


} // end of public class MoleActivity