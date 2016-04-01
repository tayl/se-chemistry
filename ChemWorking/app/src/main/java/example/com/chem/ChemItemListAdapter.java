package example.com.chem;

/**
 * Created by robertvalladares on 3/14/16.
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ChemItemListAdapter extends BaseAdapter {

    private Context mContext;
    private List<ChemItem> mChemItemList;

    //Constructor

    public ChemItemListAdapter(Context mContext, List<ChemItem> mChemItemList) {
        this.mContext = mContext;
        this.mChemItemList = mChemItemList;
    }

    @Override
    public int getCount() {
        return mChemItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return mChemItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.item_chem_list, null);
        TextView itemName = (TextView)v.findViewById(R.id.item_name);
        TextView itemMolarMass = (TextView)v.findViewById(R.id.item_molmass);
        TextView itemFormula = (TextView)v.findViewById(R.id.item_formula);
        //Set text for TextView
        itemName.setText(mChemItemList.get(position).getName());
        itemMolarMass.setText(String.valueOf(mChemItemList.get(position).getMolMass()) + "g");
        itemFormula.setText(mChemItemList.get(position).getChemFormula());

        //Save product id to tag
        v.setTag(mChemItemList.get(position).getId());

        return v;
    }
}
