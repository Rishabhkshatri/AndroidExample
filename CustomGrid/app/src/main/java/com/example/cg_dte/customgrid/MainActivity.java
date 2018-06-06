package com.example.cg_dte.customgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> imgset = new ArrayList<>();
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgset.add(R.drawable.fb);
        imgset.add(R.drawable.hike);
        imgset.add(R.drawable.instagram);
        imgset.add(R.drawable.linkedin);
        imgset.add(R.drawable.pinterest);
        imgset.add(R.drawable.quora);
        imgset.add(R.drawable.snapchat);

        customAdapter = new CustomAdapter(this,imgset);
        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(customAdapter);

        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Toast toast = Toast.makeText(getApplication(),Integer.toString(position),Toast.LENGTH_SHORT);
               toast.show();
            }
        };

        gridView.setOnItemClickListener(listener);

        imgset.add(R.drawable.tinder);
        imgset.add(R.drawable.twitter);
        imgset.add(R.drawable.wechat);
        imgset.add(R.drawable.whatsapp);
        imgset.add(R.drawable.youtube);
        customAdapter.notifyDataSetChanged();
    }
}
