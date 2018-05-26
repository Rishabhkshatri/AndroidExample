package com.example.cg_dte.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CustomAdapter customAdapter;
    ArrayList<Integer> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList = new ArrayList<>();
        arrayList.add(R.drawable.instagram);
        arrayList.add(R.drawable.twitter);
        arrayList.add(R.drawable.fb);
        arrayList.add(R.drawable.whatsapp);
        customAdapter = new CustomAdapter(getApplicationContext(),arrayList);
        listView = (ListView) findViewById(R.id.listV);
        listView.setAdapter(customAdapter);
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Toast toast = Toast.makeText(getApplicationContext(),Integer.toString(position),Toast.LENGTH_SHORT);
               toast.show();
            }
        };
        listView.setOnItemClickListener(onItemClickListener);
    }

    @Override
    protected void onStart() {
        super.onStart();
        arrayList.add(R.drawable.quora);
        customAdapter.notifyDataSetChanged();
    }
}
