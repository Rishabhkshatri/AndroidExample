package com.example.cg_dte.xmllist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[]stringArr=new String[20];
        for(int i=0;i<20;i++){
            stringArr[i]=Integer.toString(i);
        }

        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,stringArr);
        ListView listView=(ListView) findViewById(R.id.listV);
        listView.setAdapter(arrayAdapter);
        AdapterView.OnItemClickListener onItemClickListener=new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplication(),Integer.toString(position),Toast.LENGTH_SHORT).show();
            }
        };
        listView.setOnItemClickListener(onItemClickListener);
    }
}
