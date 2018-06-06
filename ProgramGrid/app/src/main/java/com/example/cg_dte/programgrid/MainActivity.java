package com.example.cg_dte.programgrid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        GridView gridView = new GridView(this);
        gridView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
        gridView.setColumnWidth(MainActivity.dpToPx(this,100));
        gridView.setVerticalSpacing(MainActivity.dpToPx(this,40));
        gridView.setHorizontalSpacing(MainActivity.dpToPx(this,10));
        gridView.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
        gridView.setNumColumns(GridView.AUTO_FIT);
        gridView.setGravity(Gravity.CENTER);

        String[] dataset = new String[45];

        for(int i=0;i<dataset.length;i++){
            dataset[i] = "Grid"+i;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_gallery_item,dataset);
        gridView.setAdapter(adapter);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.addView(gridView);
        setContentView(linearLayout);

        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplication(),Integer.toString(position),Toast.LENGTH_SHORT).show();
            }
        };

        gridView.setOnItemClickListener(listener);
    }

    public static int dpToPx(Context context,float dp){
        float px = dp*context.getResources().getDisplayMetrics().density;
        return Math.round(px);
    }
}
