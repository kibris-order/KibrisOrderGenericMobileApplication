package com.example.dc.kibrisordermobileappgeneric;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Selectaddress extends AppCompatActivity {

    ListView addres;
    Button b;
    ArrayAdapter adapter;
    String Address[] ={"No address yet"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectaddress);

        init();

    }
    private  void init()
    {
        b = (Button)findViewById(R.id.button4);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Selectaddress.this, Addadress.class);
                startActivity(i);
            }
        });

        addres = (ListView) findViewById(R.id.address);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Address);

        addres.setAdapter(adapter);
        addres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        startActivity(new Intent(Selectaddress.this,Selectaddress.class));break;

                }

            }
        });
    }
}
