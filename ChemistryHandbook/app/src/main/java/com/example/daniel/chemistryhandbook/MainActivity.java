package com.example.daniel.chemistryhandbook;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openConversionActivity(View v) {
        Intent intent = new Intent(this, ConversionActivity.class);
        startActivity(intent);
    }

    public void openCompundResults(View v) {
        Intent intent = new Intent(this, CompoundResults.class);
        startActivity(intent);
    }

    public void openHelpActivity(View v) {
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }

    public void openPeriodicTableActivity(View v) {
        Intent intent = new Intent(this, PeriodicTableActivity.class);
        startActivity(intent);
    }

    public void openElementActivity(View v) {
        Intent intent = new Intent(this, ChemItemActivity.class);
        startActivity(intent);
    }
}
