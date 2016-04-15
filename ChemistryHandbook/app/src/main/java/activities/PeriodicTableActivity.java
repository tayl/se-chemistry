package activities;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.chemistry.R;

/**
 * Created by Daniel on 4/10/16.
 */
public class PeriodicTableActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_periodic_table);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
                R.drawable.periodic_table_of_elements);
        ZoomableImageView touch = (ZoomableImageView) findViewById(R.id.IMAGEID);
        touch.setImageBitmap(bitmap);

    }
}
