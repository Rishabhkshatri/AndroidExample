package com.example.cg_dte.customgrid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<Integer> dataSet;
    public CustomAdapter(Context context, ArrayList<Integer> dataSet){
        this.context = context;
        this.dataSet = dataSet;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.viewforgrid,parent,false);
        }

        ImageView gridimg = (ImageView) convertView.findViewById(R.id.gridimg);
        gridimg.setImageResource(dataSet.get(position));
        gridimg.setTag(dataSet.get(position));

        return convertView;
    }
}
