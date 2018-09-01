package com.example.dc.kibrisordermobileappgeneric;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Addadress extends AppCompatActivity {

    ArrayList<String> info = new ArrayList<String>();
    EditText e1, e2, e3, e4;
    Button b;
    Spinner s1, s2;
    ArrayAdapter adapter,adap;
    String[] Atype = {"Home","Work","Campus","Other"}; //info for addresstype dropdown
    String[] City = {"Girne","Güzelyurt","Iskele","Lefke","Lefkoşa","Mağusa"}; //info for city drop down
    String atype, city, Info;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addadress);

        init();

    }

    private void init()
    {
        e1 = (EditText)findViewById(R.id.name);
        e2 = (EditText)findViewById(R.id.num);
        e3 = (EditText)findViewById(R.id.mail);
        e4 = (EditText)findViewById(R.id.desc);

        s1 = (Spinner)findViewById(R.id.addresstype);
        s2 = (Spinner)findViewById(R.id.city);

        b = (Button)findViewById(R.id.save);

        //adding addapter to dropdonn for addresstype
        adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Atype);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter);
        //adding adapter to dropdown for city
        adap = new ArrayAdapter(this,android.R.layout.simple_spinner_item,City);
        adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adap);

        //assigning selected item from Adresstype spinner(dropdown) to a String variable
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                atype = s1.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //assigning selected item from city spinner(dropdown) to a String variable
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                city = s2.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.add(e1.getText().toString());
                info.add(e2.getText().toString());
                info.add(e3.getText().toString());
                info.add(e4.getText().toString());
                info.add(atype);
                info.add(city);

                info.toString();
                Intent i = new Intent(Addadress.this, Selectaddress.class);
                i.putExtra("Address",info);
                startActivity(i);










            }
        });
    }
}
