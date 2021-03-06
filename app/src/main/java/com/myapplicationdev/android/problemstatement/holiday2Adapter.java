package com.myapplicationdev.android.problemstatement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class holiday2Adapter extends ArrayAdapter<String> {
    private ArrayList<String> type;
    private Context context;
    private TextView tvhol;

    public holiday2Adapter(Context context, int resources, ArrayList<String> objects) {
        super(context, resources, objects);
        type = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.courserow, parent, false);

        tvhol = (TextView) rowView.findViewById(R.id.tvholiday);

        String currYear = type.get(position) != null ? type.get(position) : "none";
        tvhol.setText(currYear);

        return rowView;
    }
}
