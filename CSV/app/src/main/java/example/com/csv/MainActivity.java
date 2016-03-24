package example.com.csv;

/**
 * Created by robertvalladares on 3/20/16.
 */

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ListView;
import java.io.InputStream;
import java.util.List;


public class MainActivity extends Activity {
    private ListView listView;
    private ItemArrayAdapter itemArrayAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        itemArrayAdapter = new ItemArrayAdapter(getApplicationContext(), R.layout.item_layout);

        Parcelable state = listView.onSaveInstanceState();
        listView.setAdapter(itemArrayAdapter);
        listView.onRestoreInstanceState(state);

        InputStream inputStream = getResources().openRawResource(R.raw.elements);
        CSVFile csvFile = new CSVFile(inputStream);
        List<String[]> scoreList = csvFile.read();

        for(String[] scoreData:scoreList ) {
            itemArrayAdapter.add(scoreData);
        }
        // To Do, add event listener to get id
        // To Do, add event listener for long click
    }
}
