package com.example.dc.kibrisordermobileappgeneric;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class debug extends AppCompatActivity {
    private static final String TAG = "debugActivity";
    ListView listViewDebug;
    ArrayAdapter adapter;
    String Activities[] ={"No activities yet"};
    //new comment
String JustAComment = "Just a comment";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);


        Log.d(TAG, "onCreate: ");

        listViewDebug = (ListView) findViewById(R.id.listViewDebug);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Activities);

        listViewDebug.setAdapter(adapter);
        listViewDebug.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        startActivity(new Intent(debug.this,debug.class));break;

                }

            }
        });

    }
}
