package example.com.chem;

/**
 * Created by robertvalladares on 3/14/16.
 */
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class ChemItemActivity extends Activity implements SearchView.OnQueryTextListener{
    private ListView lvChemItem;
    private ChemItemListAdapter adapter;
    private List<ChemItem> mChemItemList;
    private List<String[]> readFileList;
    private String[] scoreData;
    private SearchView mSearchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem_item);
        lvChemItem = (ListView)findViewById(R.id.listview_chem_item);
        mSearchView = (SearchView)findViewById(R.id.searchView);

        mChemItemList = new ArrayList<>();
        // read elements.csv file into string[] list
        InputStream inputStream = getResources().openRawResource(R.raw.elements);
        CSVFile csvFile = new CSVFile(inputStream);
        readFileList = csvFile.read();

        for(int i = 0; i < 10; i++){
            //String[] scoreData = readFileList.get(i);
            scoreData = readFileList.get(i);
            mChemItemList.add(new ChemItem(scoreData[0],scoreData[1],scoreData[2],scoreData[3]));
        }
        /*
        for(String[] scoreData:readFileList ) {
            // add the data from the "elements.csv" file to the listview
           // mChemItemList.add(new ChemItem(scoreData[0],scoreData[1],scoreData[2],scoreData[3]));
        }
        */
        //Init adapter
        adapter = new ChemItemListAdapter(getApplicationContext(), mChemItemList);
        lvChemItem.setAdapter(adapter);
        lvChemItem.setTextFilterEnabled(true);
        setupSearchView();

        lvChemItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //show msg with item id, get from view.getTag
                Toast.makeText(getApplicationContext(), "Clicked item id =" + view.getTag(),
                        Toast.LENGTH_SHORT ).show();
            }
        });
        // Long Click is giving me problems
        lvChemItem.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                //show msg with item id, get from view.getTag
                // can use (int) view.getTag() as item id to search by item id
                //String string = scoreData[(int)view.getTag()];
                Toast.makeText(getApplicationContext(), "Long Click =" + view.getTag(),
                        Toast.LENGTH_LONG ).show();
                return true;
            }
        });

    }

    private void setupSearchView()
    {
        mSearchView.setIconifiedByDefault(false);
        mSearchView.setOnQueryTextListener(this);
        mSearchView.setSubmitButtonEnabled(true);
        mSearchView.setQueryHint("Search..");
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        if (TextUtils.isEmpty(newText.toString())){
            lvChemItem.clearTextFilter();
        } else {
            lvChemItem.setFilterText(newText.toString());
        }
        return true;
    }
}
