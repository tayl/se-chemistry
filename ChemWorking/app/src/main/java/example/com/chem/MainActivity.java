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

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    private ListView lvProduct;
    private ProductListAdapter adapter;
    private List<Product> mProductList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProduct = (ListView)findViewById(R.id.listview_product);

        mProductList = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        mProductList.add(new Product(1, "H", 1.0079, "Hydrogen"));
        mProductList.add(new Product(2, "He", 4.0026, "Helium"));
        mProductList.add(new Product(3, "Li", 6.941, "Lithium"));
        mProductList.add(new Product(4, "Be", 9.0122, "Beryllium"));
        mProductList.add(new Product(5, "B", 10.811, "Boron"));
        mProductList.add(new Product(6, "C", 12.0107, "Carbon"));
        mProductList.add(new Product(7, "N", 14.0067, "Nitrogen"));
        mProductList.add(new Product(8, "O", 15.9994, "Oxygen"));
        mProductList.add(new Product(9, "F", 18.9984, "Fluorine"));
        mProductList.add(new Product(10, "Ne", 20.1797, "Neon"));

        //Init adapter
        adapter = new ProductListAdapter(getApplicationContext(), mProductList);
        lvProduct.setAdapter(adapter);

        lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Do something
                //Ex: display msg with product id get from view.getTag
                Toast.makeText(getApplicationContext(), "Clicked product id =" + view.getTag(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
