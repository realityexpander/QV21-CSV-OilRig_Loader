package com.realityexpander.qv21;

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
        TextView owner;
        TextView leaseName;
        TextView tankName;
        TextView tankNum;
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
    public void clear() {
        scoreList.clear();
        super.clear();
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
            viewHolder.owner = (TextView) row.findViewById(R.id.owner);
            viewHolder.leaseName = (TextView) row.findViewById(R.id.leaseName);
            viewHolder.tankName = (TextView) row.findViewById(R.id.tankName);
            viewHolder.tankNum = (TextView) row.findViewById(R.id.tankNum);
            row.setTag(viewHolder);
		} else {
            viewHolder = (ItemViewHolder)row.getTag();
        }
        String[] stat = getItem(position);
        viewHolder.owner.setText(stat[0]);
        viewHolder.leaseName.setText(stat[5]);
        viewHolder.tankName.setText(stat[7]);
        viewHolder.tankNum.setText(stat[8]);
		return row;
	}
}
