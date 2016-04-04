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
    private List<String[]> readFileList;

    private SearchView mSearchView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem_item);
        lvChemItem = (ListView)findViewById(R.id.listview_chem_item);
        mSearchView = (SearchView)findViewById(R.id.searchView);

        // handle which part of the file will be displayed, if intent contains True
        // then display elements, else display compounds
        Intent intent = getIntent();
        boolean biReadElements = intent.getBooleanExtra("elements", false);

        List<ChemItem> mChemItemList = new ArrayList<>();
        // read elements.csv file into string[] list
        InputStream inputStream = getResources().openRawResource(R.raw.elements);
        CSVFile csvFile = new CSVFile(inputStream);
        readFileList = csvFile.read();

        // add the data from the "elements.csv" file to the listview
        for(String[] singleChemItemRow:readFileList ) {
            // check if reading only periodic table elements where the element # is <= 118
            if (biReadElements && (Integer.parseInt(singleChemItemRow[0]) > 118)) continue;
            // if we are reading compounds, then add all the items that id is >= to 119
            if (!biReadElements && (Integer.parseInt(singleChemItemRow[0]) < 118)) continue;
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
                /*
                Toast.makeText(getApplicationContext(), "Clicked item id =" + view.getTag(),
                        Toast.LENGTH_SHORT ).show();
                */
            }
        });
        // handle when user presses LONG PRESS
        lvChemItem.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view,
                                           int position, long id) {
                //call activity to convert grams to moles
                String chemItemId = "" + view.getTag();
                onItemLongPress(chemItemId);
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
        return false;
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
    
    // Handle the OnLongPress to open the Grams to Moles activity for that
    // specific item, it finds the item, then passes the name, formula, mass
    // to be used in the conversion
    public void onItemLongPress(String chemItemId){
        String singleChemItem[] = null;
        String ChemItemName;
        String ChemItemMolarMass;
        String ChemItemFormula;
        boolean foundItem = false;
        Intent i = new Intent(this, MoleActivity.class);
        // handle the ChemItem id to pass Chem Item name and Formula and Molar Mass
        // NOT the most efficient search, but it works right now
        for (String[] singleChemItemRow:readFileList){
            if (singleChemItemRow[0].equals(chemItemId)){
                singleChemItem = singleChemItemRow;
                foundItem = true;
                break;
            }
        }

        if (foundItem){
            ChemItemFormula = singleChemItem[1];
            ChemItemMolarMass = singleChemItem[2];
            ChemItemName = singleChemItem[3];
            i.putExtra("ChemItemName", ChemItemName);
            i.putExtra("ChemItemFormula",ChemItemFormula);
            i.putExtra("ChemItemMolarMass",ChemItemMolarMass);
            startActivity(i);

        }


    }
}
