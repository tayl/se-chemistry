package example.com.csv;


/**
 * Created by robertvalladares on 3/20/16.
 * Based on tutorial by http://javapapers.com/android/android-read-csv-file/
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class ItemArrayAdapter extends ArrayAdapter<String[]> {
    private List<String[]> scoreList = new ArrayList<String[]>();

    static class ItemViewHolder {
        TextView no;
        TextView symbol;
        TextView molmass;
        TextView name;


    }

    public ItemArrayAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    @Override
    public void add(String[] object) {
        scoreList.add(object);
        super.add(object);
    }

    @Override
    public int getCount() {
        return this.scoreList.size();
    }

    @Override
    public String[] getItem(int index) {
        return this.scoreList.get(index);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ItemViewHolder viewHolder;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) this.getContext().
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.item_layout, parent, false);
            viewHolder = new ItemViewHolder();
            //viewHolder.no = (TextView) row.findViewById(R.id.no);
            viewHolder.name = (TextView) row.findViewById(R.id.name);
            viewHolder.molmass = (TextView) row.findViewById(R.id.score);
            viewHolder.symbol = (TextView) row.findViewById(R.id.symbol);
            row.setTag(viewHolder);
        } else {
            viewHolder = (ItemViewHolder)row.getTag();
        }
        String[] stat = getItem(position);
        //viewHolder.no.setText(stat[0]);
        viewHolder.symbol.setText(stat[0] + " " + stat[1]);
        viewHolder.molmass.setText(stat[2]);
        viewHolder.name.setText(stat[3]);


        return row;
    }
}

