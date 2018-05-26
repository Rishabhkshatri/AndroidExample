package com.example.cg_dte.customlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Integer> imgArr;

    public CustomAdapter(Context context,ArrayList<Integer> imgArr){
        this.context = context;
        this.imgArr = imgArr;
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
        int count = imgArr.size();
        return count;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.viewforlist,parent,false);
        }

        ((ImageView) convertView.findViewById(R.id.view_img)).setImageResource(imgArr.get(position));
        return convertView;
    }
}
