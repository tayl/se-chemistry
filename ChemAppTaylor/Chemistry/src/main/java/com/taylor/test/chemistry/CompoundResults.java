package com.taylor.test.chemistry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.ListView;
import android.widget.SearchView;

import com.taylor.test.chemistry.compounds.Compound;
import com.taylor.test.chemistry.compounds.CompoundBuilder;
import com.taylor.test.chemistry.compounds.CompoundList;

import java.io.InputStream;

public class CompoundResults extends Activity implements SearchView.OnQueryTextListener {

    /**
     * The ListView that will store Compounds as results
     */
    private ListView results;

    /**
     * The SearchView where Compound formulas will be entered
     */
    private SearchView searchView;

    private Filter filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound_results);

        results = (ListView) findViewById(R.id.listview_results);
        searchView = (SearchView) findViewById(R.id.list_search);

        InputStream elementInputStream = getResources().openRawResource(R.raw.elements);
        InputStream compoundInputStream = getResources().openRawResource(R.raw.compounds);

        //Instance of CompoundBuilder requires elements to build a Table of Elements
        CompoundBuilder cb = new CompoundBuilder(elementInputStream);
        CompoundList cl = cb.build(compoundInputStream);

        //The ResultsAdapter will use the CompoundBuilder and CompoundList for searching
        ResultsAdapter adapter = new ResultsAdapter(getApplicationContext(), cb, cl);

        results.setAdapter(adapter);
        results.setTextFilterEnabled(false);

        filter = adapter.getFilter();

        searchView.setIconifiedByDefault(false);
        searchView.setOnQueryTextListener(this);
        searchView.setSubmitButtonEnabled(false);

        results.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //get the clicked Compound
                Compound compound = (Compound) parent.getItemAtPosition(position);

                //when an entry is clicked, fill the search bar with its formula
                searchView.setQuery(compound.getFormula(), true);

                //scroll to the top of the results
                results.setSelectionAfterHeaderView();//.setSelection(0);
            }
        });

        results.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                //get the clicked Compound
                Compound compound = (Compound) parent.getItemAtPosition(position);

                Intent intent = new Intent(getApplicationContext(), MoleActivity.class);

                intent.putExtra("ChemItemName", compound.getName());
                intent.putExtra("ChemItemFormula", compound.getFormula());
                intent.putExtra("ChemItemMolarMass", compound.getWeight());

                startActivity(intent);

                return true;
            }
        });
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        filter.filter(newText);
        return true;
    }

//    // Handle the OnLongPress to open the Grams to Moles activity for that
//    // specific item, it finds the item, then passes the name, formula, mass
//    // to be used in the conversion
//    public void onItemLongPress(String chemItemId) {
//        String singleChemItem[] = null;
//        String ChemItemName;
//        String ChemItemMolarMass;
//        String ChemItemFormula;
//        boolean foundItem = false;
//        Intent i = new Intent(this, MoleActivity.class);
//        // handle the ChemItem id to pass Chem Item name and Formula and Molar Mass
//        // NOT the most efficient search, but it works right now
//        for (String[] singleChemItemRow : readFileList) {
//            if (singleChemItemRow[0].equals(chemItemId)) {
//                singleChemItem = singleChemItemRow;
//                foundItem = true;
//                break;
//            }
//        }
//
//        if (foundItem) {
//            ChemItemFormula = singleChemItem[1];
//            ChemItemMolarMass = singleChemItem[2];
//            ChemItemName = singleChemItem[3];
//            i.putExtra("ChemItemName", ChemItemName);
//            i.putExtra("ChemItemFormula", ChemItemFormula);
//            i.putExtra("ChemItemMolarMass", ChemItemMolarMass);
//            startActivity(i);
//        }
//    }
}
