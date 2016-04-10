package com.example.daniel.chemistryhandbook;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

/**
 * Created by Daniel on 4/10/16.
 */
public class PeriodicTableActivity extends Activity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_periodic_table);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
                R.drawable.j);
        ZoomableImageView touch = (ZoomableImageView)findViewById(R.id.IMAGEID);
        touch.setImageBitmap(bitmap);

    }
}