package com.example.cg_dte.xmlgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] strArr = new String[45];
        for(int i=0;i<strArr.length;i++){
            strArr[i]= "Grid"+(i+1);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_gallery_item,strArr);

        GridView gridView = (GridView) findViewById(R.id.XmlGrid);
        gridView.setAdapter(adapter);
    }
}
