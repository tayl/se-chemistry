package example.com.chem;

/**
 * Created by robertvalladares on 3/14/16.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class ChemItemActivity extends Activity {
    private ListView lvChemItem;
    private ChemItemListAdapter adapter;
    private List<ChemItem> mChemItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem_item);

        lvChemItem = (ListView)findViewById(R.id.listview_chem_item);

        mChemItemList = new ArrayList<>();
        // read elements.csv file into string[] list
        InputStream inputStream = getResources().openRawResource(R.raw.elements);
        CSVFile csvFile = new CSVFile(inputStream);
        List<String[]> readFileList = csvFile.read();

        for(int i = 0; i < 10; i++){
            String[] scoreData = readFileList.get(i);
            mChemItemList.add(new ChemItem(scoreData[0],scoreData[1],scoreData[2],scoreData[3]));
        }
        /*
        for(String[] scoreData:readFileList ) {
            // add the data from the "elements.csv" file to the listview
           // mChemItemList.add(new ChemItem(scoreData[0],scoreData[1],scoreData[2],scoreData[3]));
        }
        */
        //Add sample data for list
        //We can get data from DB, webservice here
        /*
        mChemItemList.add(new ChemItem("1", "H", "1.0079", "Hydrogen"));
        mChemItemList.add(new ChemItem("2", "He", "4.0026", "Helium"));
        mChemItemList.add(new ChemItem("3", "Li", "6.941", "Lithium"));
        mChemItemList.add(new ChemItem("4", "Be", "9.0122", "Beryllium"));
        mChemItemList.add(new ChemItem("5", "B", "10.811", "Boron"));
        mChemItemList.add(new ChemItem("6", "C", "12.0107", "Carbon"));
        mChemItemList.add(new ChemItem("7", "N", "14.0067", "Nitrogen"));
        mChemItemList.add(new ChemItem("8", "O", "15.9994", "Oxygen"));
        mChemItemList.add(new ChemItem("9", "F", "18.9984", "Fluorine"));
        mChemItemList.add(new ChemItem("10", "Ne", "20.1797", "Neon"));
        */

        //Init adapter
        adapter = new ChemItemListAdapter(getApplicationContext(), mChemItemList);
        lvChemItem.setAdapter(adapter);

        lvChemItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //show msg with item id, get from view.getTag
                Toast.makeText(getApplicationContext(), "Clicked item id =" + view.getTag(),
                        Toast.LENGTH_SHORT ).show();
            }
        });

        lvChemItem.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                //show msg with item id, get from view.getTag
                // can use (int) view.getTag() as item id to search by item id
                Toast.makeText(getApplicationContext(), "Long Click =" + view.getTag(),
                        Toast.LENGTH_LONG ).show();
                return true;
            }
        });
    }
}
