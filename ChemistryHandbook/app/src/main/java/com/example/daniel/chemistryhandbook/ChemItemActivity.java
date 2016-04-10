package com.example.daniel.chemistryhandbook;

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
import android.widget.Filter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
//import java.util.logging.Filter;


public class ChemItemActivity extends Activity implements SearchView.OnQueryTextListener{
    private ListView lvChemItem;
    private SearchView mSearchView;
    private Filter filter;


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
            // id, symbol, mass, name    1,1.0079,Hydrogen,H
            mChemItemList.add(new ChemItem(singleChemItemRow[0], singleChemItemRow[3],
                    singleChemItemRow[1], singleChemItemRow[2]));

        }

        //Init adapter
        ChemItemListAdapter adapter = new ChemItemListAdapter(getApplicationContext(), mChemItemList);
        lvChemItem.setAdapter(adapter);
        lvChemItem.setTextFilterEnabled(true);
        setupSearchView();
        //filter = adapter.getFilter();
        filter = adapter.getFilter();

        // handle when user presses SHORT PRESS
        lvChemItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //show msg with item id, get from view.getTag
                /*
                Toast.makeText(getApplicationContext(), "Press and Hold to open Mole Conversion",
                        Toast.LENGTH_SHORT).cancel();
                */

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
        filter.filter(newText);

        if (TextUtils.isEmpty(newText)){
            //filter.filter(null);
            //lvChemItem.clearTextFilter();

        } else {
            //filter.filter(newText);
            //lvChemItem.setFilterText(newText);
        }
        return true;
    }

}