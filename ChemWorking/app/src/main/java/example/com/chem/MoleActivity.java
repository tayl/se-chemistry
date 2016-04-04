package example.com.chem;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by robertvalladares on 4/03/16.
 */
public class MoleActivity extends Activity {

    Double mChemItemMolarMass = 1.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Find the layout and it's fields and text boxes
        setContentView(R.layout.activity_mole);
        final EditText EditGrams = (EditText) findViewById(R.id.editGrams);
        final TextView EditMoles = (TextView)findViewById(R.id.editMoles);
        Button buttonConvert = (Button)findViewById(R.id.buttonConvert);
        // set the textFields to the corresponding layout items
        final TextView EditChemItemName = (TextView)findViewById(R.id.textChemName);
        final TextView EditChemItemFormula = (TextView)findViewById(R.id.textChemItemFormula);

        // read the chemical items parameters passed with the intent
        Intent intent = getIntent();
        String ipChemItemName = intent.getStringExtra("ChemItemName");
        String ipChemItemFormula = intent.getStringExtra("ChemItemFormula");
        String ipChemItemMolarMass = intent.getStringExtra("ChemItemMolarMass");

        // set the text to be displayed on the top of the activity for chemical name and formula
        EditChemItemName.setText(ipChemItemName);
        EditChemItemFormula.setText(ipChemItemFormula);
        // if the passed molar mass is 0, handle division by 0 here to avoid errors
        // in molar calculation
        if((mChemItemMolarMass = Double.parseDouble(ipChemItemMolarMass))== 0){
            mChemItemMolarMass = 1.0;
        }


        // what to do once the "Convert" button is pressed
        buttonConvert.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                double readGrams;
                double moles = 0.0;
                // set the result field "EditMoles" to empty unless
                // user enters valid input
                EditMoles.setText(String.valueOf(" "));
                // get input from users as a double, put it in the grams
                // prevent the user from converting an empty input
                if (!(EditGrams.getText().toString().equals(""))){
                    readGrams = Double.parseDouble(EditGrams.getText().toString());
                    // transform from grams to moles
                    moles = readGrams * (1/mChemItemMolarMass);
                    //moles = readGrams * 0.393700787;
                    // Set the value of the return in moles
                    EditMoles.setText(String.valueOf(moles));
                }

            } // end of public void onClick

        });// end of "buttonConvert.setOnClickListener"


    }// end of protected void onCreate


} // end of public class MoleActivity