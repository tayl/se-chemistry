package com.example.daniel.chemistryhandbook;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import compounds.Compound;
import compounds.CompoundBuilder;
import compounds.CompoundList;
import elements.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Taylor Veith
 *         Created by Taylor on 4/2/2016.
 */
public class ResultsAdapter extends BaseAdapter implements Filterable {

    private Context context;
    private CompoundBuilder compoundBuilder;
    private CompoundList compoundList;
    private List<Compound> results;
    private boolean foundMatches;
    private Toast lastToast;

    public ResultsAdapter(Context context, CompoundBuilder compoundBuilder,
                          CompoundList compoundList) {
        this.context = context;
        this.compoundBuilder = compoundBuilder;
        this.compoundList = compoundList;
        this.results = compoundList.getCompounds();
    }

    @Override
    public int getCount() {
        return results.size();
    }

    @Override
    public Object getItem(int position) {
        return results.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        //try to recycle the convertView
        if (convertView != null) {
            viewHolder = (ViewHolder) convertView.getTag();
        } else {
            viewHolder = new ViewHolder();
        }

        //The Compound being represented in this View
        Compound compound = results.get(position);

        if (position == 0 && foundMatches) {
            //if the position is 0 (first result) and we've found matches, inflate a query card
            //that illustrates what the user is entering as they enter it.

            if (convertView == null || viewHolder.gridView == null) {
                convertView = View.inflate(context, R.layout.compound_list_query, null);
                viewHolder = new ViewHolder();
                viewHolder.name = (TextView) convertView.findViewById(R.id.compound_name);
                viewHolder.additional_names =
                        (TextView) convertView.findViewById(R.id.compound_additional_names);
                viewHolder.formula = (TextView) convertView.findViewById(R.id.compound_formula);
                viewHolder.mass = (TextView) convertView.findViewById(R.id.compound_mass);
                viewHolder.gridView = (GridView) convertView.findViewById(R.id.compound_elements);
            }

            // Create a new Adapter object to build off the Compound's Elements
            ArrayAdapter<String> adapter = new ArrayAdapter<>(context, R.layout.element,
                    R.id.textView, compound.getElementsCondensed());

            viewHolder.gridView.setAdapter(adapter);
            viewHolder.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    //if a Toast already exists (from a previous Element being clicked), cancel it
                    if (lastToast != null) {
                        lastToast.cancel();
                    }

                    //start building the new Toast
                    lastToast = Toast.makeText(context, "", Toast.LENGTH_SHORT);

                    //we want the Toast to show the full Element name. The entry in the GridView was
                    //downed to a String, so it holds no context as to what Element it was.
                    //compoundBuilder.getElement() could turn "H" or "Na" into "Hydrogen" or
                    //"Sodium" respectively, but not "H2" or "Na3", etc. This solution solves that
                    //but introduces overhead of parsing the formula. Not extreme, but a better
                    //solution probably exists
                    lastToast.setText(compoundBuilder.deriveElementsFromFormula(
                            (String) parent.getItemAtPosition(position)).get(0).getName());
                    lastToast.setDuration(Toast.LENGTH_SHORT);
                    lastToast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 100);
                    lastToast.show();
                }
            });
        } else {
            // if we're here, we're either not in the first result OR there were no matches.
            // so, inflate the normal list entry and fill it normally.

            if (convertView == null || viewHolder.gridView != null) {
                convertView = View.inflate(context, R.layout.compound_list_entry, null);
                viewHolder = new ViewHolder();
                viewHolder.name = (TextView) convertView.findViewById(R.id.compound_name);
                viewHolder.additional_names =
                        (TextView) convertView.findViewById(R.id.compound_additional_names);
                viewHolder.formula = (TextView) convertView.findViewById(R.id.compound_formula);
                viewHolder.mass = (TextView) convertView.findViewById(R.id.compound_mass);
            }
        }

        viewHolder.name.setText(compound.getName());

        String[] compoundNames = compound.getNames();
        if (compoundNames != null && compoundNames.length > 1) {
            StringBuilder additionalNames = new StringBuilder();
            for (int i = 1; i < compoundNames.length; i++) {
                additionalNames.append(compoundNames[i]);
                if (i != compoundNames.length - 1) {
                    additionalNames.append(", ");
                }
            }

            viewHolder.additional_names.setText("Also known as: " + additionalNames.toString());

            //by default, this view is set to GONE. make it VISIBLE
            viewHolder.additional_names.setVisibility(View.VISIBLE);
        } else {
            //but we're recycling, so make sure it's set back to GONE if need be
            viewHolder.additional_names.setVisibility(View.GONE);
        }

        viewHolder.formula.setText("Formula: " + compound.getFormula());
        viewHolder.mass.setText("Molar mass: " + String.format("%.4f", compound.getWeight()));

        convertView.setTag(viewHolder);

        return convertView;
    }

    @Override
    public int getItemViewType(int position) {
        return (position == 0 && foundMatches) ? 0 : 1;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public Filter getFilter() {
        return new Filter() {

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();
                List<Compound> resultList = new ArrayList<>();

                String query = constraint.toString();


                // the exactMatch logic handles "Unknown Compounds" to be put into the users query
                // card
                Compound exactMatch = compoundList.getCompoundByFormula(compoundBuilder, query);

                //if it's null, the query string was empty
                if (exactMatch != null) {
                    exactMatch.setExactMatch(true);
                    resultList.add(exactMatch);
                }

                // now, determine the Elements in the entered formula
                List<Element> elements = compoundBuilder.deriveElementsFromFormula(query);

                // if the formula contains some valid Elements, we've found matches. set this true
                // so we can build a user query result display card thing
                foundMatches = elements.size() > 0;

                if (!foundMatches && !query.isEmpty()) {
                    Compound noMatches = new Compound();
                    Element filler = compoundBuilder.getElement("O");
                    noMatches.setElements(new Element[]{filler, filler});
                    noMatches.setNames(new String[]{
                            "I couldn't find any elements in \"" + query + "\"\n\n" +
                                    "Remember, elements are case sensitive!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                    });
                    noMatches.setFormula("");
                    resultList.add(noMatches);

                    results.values = resultList;

                    return results;
                }

                // take those Elements from the formula and get all Compounds that contain any
                // combination of those Elements
                List<Compound> partialMatches = compoundList.getCompoundsByElements(elements);

                // add all the partial matches to the results List
                // if it was determined earlier that we found an exact match, do not add that same
                // result twice. Set any other Compounds that might have been marked as exact
                // matches to false, as they are not the exact match for this query
                for (Compound compound : partialMatches) {
                    if (exactMatch != null && compound.equals(exactMatch)) {
                        continue;
                    }
                    compound.setExactMatch(false);
                    resultList.add(compound);
                }

                results.values = resultList;

                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults filterResults) {
                results = (List<Compound>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    static class ViewHolder {
        TextView name;
        TextView additional_names;
        TextView formula;
        TextView mass;
        GridView gridView;
    }
}