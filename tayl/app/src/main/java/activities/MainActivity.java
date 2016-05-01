package activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.chemistry.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openConversionActivity(View view) {
        Intent intent = new Intent(this, ConversionActivity.class);
        startActivity(intent);
    }

    public void openCompoundResults(View view) {
        Intent intent = new Intent(this, CompoundResults.class);
        startActivity(intent);
    }

    public void openHelpActivity(View view) {
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }

    public void openPeriodicTableActivity(View view) {
        Intent intent = new Intent(this, PeriodicTableActivity.class);
        startActivity(intent);
    }

    public void openElementActivity(View view) {
        Intent intent = new Intent(this, ChemItemActivity.class);
        startActivity(intent);
    }

    public void openContactActivity(View view) {
        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }

}
