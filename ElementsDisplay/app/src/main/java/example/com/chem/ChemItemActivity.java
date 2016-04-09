package example.com.chem;

/**
 * Created by robertvalladares on 3/14/16.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class ChemItemActivity extends Activity implements SearchView.OnQueryTextListener{
    private ListView lvChemItem;
    private SearchView mSearchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem_item);
        lvChemItem = (ListView)findViewById(R.id.listview_chem_item);
        mSearchView = (SearchView)findViewById(R.id.searchView);

        List<ChemItem> mChemItemList = new ArrayList<>();
        // read elements_table.csvle.csv file into string[] list
        InputStream inputStream = getResources().openRawResource(R.raw.elements_table);
        CSVFile csvFile = new CSVFile(inputStream);
        List<String[]> readFileList = csvFile.read();

        // add the data from the "elements_table.csvle.csv" file to the listview
        for(String[] singleChemItemRow: readFileList) {
            mChemItemList.add(new ChemItem(singleChemItemRow[0], singleChemItemRow[1],
                    singleChemItemRow[2], singleChemItemRow[3]));

        }

        //Init adapter
        ChemItemListAdapter adapter = new ChemItemListAdapter(getApplicationContext(), mChemItemList);
        lvChemItem.setAdapter(adapter);
        lvChemItem.setTextFilterEnabled(true);
        setupSearchView();

        // handle when user presses SHORT PRESS
        lvChemItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //show msg with item id, get from view.getTag
                Toast.makeText(getApplicationContext(), "Press and Hold to open Mole Convertion",
                        Toast.LENGTH_SHORT).show();

            }
        });
        // handle when user presses LONG PRESS
        lvChemItem.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view,
                                           int position, long id) {
                //call activity to convert grams to moles
                ChemItem chemItem = (ChemItem) parent.getItemAtPosition(position);

                Intent i = new Intent(getApplicationContext(),MoleActivity.class);
                i.putExtra("ChemItemName", chemItem.getName());
                i.putExtra("ChemItemFormula",chemItem.getChemFormula());
                i.putExtra("ChemItemMolarMass", Double.parseDouble(chemItem.getMolMass()));
                //i.putExtra("ChemItemMolarMass",chemItem.getMolMass());
                startActivity(i);
                return true;
            }
        });

    }
    // set up the Search bar visuals
    private void setupSearchView() {
        mSearchView.setIconifiedByDefault(false);
        mSearchView.setOnQueryTextListener(this);
        mSearchView.setSubmitButtonEnabled(true);
        mSearchView.setQueryHint("Search..");
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return true;
    }

    // Handle the event after the users starts entering or editing text in the search bar
    @Override
    public boolean onQueryTextChange(String newText) {
        if (TextUtils.isEmpty(newText)){
            lvChemItem.clearTextFilter();
        } else {
            lvChemItem.setFilterText(newText);
        }
        return true;
    }

}
