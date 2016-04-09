package example.com.chem;

/**
 * Created by robertvalladares on 3/14/16.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // IN DANIEL LAUNCHER INSTEAD OF activity_main IT WOULD BE THE FLOATING BUTTONS
        // ACTIVITY
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        Intent i = new Intent(this, ChemItemActivity.class);
        startActivity(i);

    }
}
