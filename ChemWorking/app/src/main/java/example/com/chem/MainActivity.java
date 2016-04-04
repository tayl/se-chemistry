package example.com.chem;

/**
 * Created by robertvalladares on 3/14/16.
 */

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    // THIS CODE MUST BE IMPLEMENTED WITH THE FLOATING BUTTONS NAVIGATION ON DANIEL
    // CODE, CHANGE THE btnElst TO THE BUTTON HE SETS AS THE ELEMENT LIST DISPLAY
    // CHANGE THE bthCompLst TO THE BUTTON HE SETS FOR COMPOUND LIST DISPLAY

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // IN DANIEL LAUNCHER INSTEAD OF activity_main IT WOULD BE THE FLOATING BUTTONS
        // ACTIVITY
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        Intent i = new Intent(this, ChemItemActivity.class);
        // handle when reading elements, set intent extra to false
        if(v.getId() == R.id.btnElst) i.putExtra("elements", true);
        // handle when reading compounds, set intent extra to false
        if(v.getId() == R.id.btnCompLst) i.putExtra("elements", false);
        // start ChemItemActivity, and display either elements or compounds
        startActivity(i);

    }
}
