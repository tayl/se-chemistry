package example.com.chem;

/**
 * Created by robertvalladares on 3/14/16.
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;



public class ChemItemListAdapter extends BaseAdapter implements Filterable {

    private Context mContext;
    private List<ChemItem> mChemItemList;
    public List<ChemItem> orig;

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

        String ChemItemID = String.format("%-3d",Integer.parseInt(
                mChemItemList.get(position).getId())) + " ";

        View v = View.inflate(mContext, R.layout.item_chem_list, null);

        TextView itemName = (TextView)v.findViewById(R.id.item_name);
        TextView itemMolarMass = (TextView)v.findViewById(R.id.item_molmass);
        TextView itemFormula = (TextView)v.findViewById(R.id.item_formula);

        //Set text for TextView
        itemFormula.setText(mChemItemList.get(position).getChemFormula());
        itemName.setText(ChemItemID +  mChemItemList.get(position).getName());
        itemMolarMass.setText(String.valueOf(mChemItemList.get(position).getMolMass()) + "g");


        //Save product id to tag
        v.setTag(mChemItemList.get(position).getId());
        return v;
    }

    // **** code below is to do list search, added to do search on list_view
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {


            @Override
            protected FilterResults performFiltering(CharSequence constraint) {

                final FilterResults oReturn = new FilterResults();
                final List<ChemItem> results = new ArrayList<>();
                if (orig == null)
                    orig = mChemItemList;
                if (constraint != null) {
                    if (orig != null && orig.size() > 0) {
                        for (final ChemItem g : orig) {

                            if (g.getName().toLowerCase().contains(constraint.toString()) ||
                                    g.getChemFormula().toLowerCase().contains(constraint.toString())||
                                    g.getId().toLowerCase().contains(constraint.toString())||
                                    g.getMolMass().toLowerCase().contains(constraint.toString())
                                    )
                                results.add(g);
                        }
                    }
                    oReturn.values = results;
                }
                return oReturn;
            }

            @SuppressWarnings("unchecked")
            @Override
            protected void publishResults(CharSequence constraint,
                                          FilterResults results) {
                mChemItemList = (List<ChemItem>) results.values;
                notifyDataSetChanged();
            }
        };
    }

}
