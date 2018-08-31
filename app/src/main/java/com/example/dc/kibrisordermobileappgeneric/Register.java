package com.example.dc.kibrisordermobileappgeneric;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText e1, e2, e3, e4, e5;
    Button b1, b2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        init();
    }

    private void init()
    {
        e1 = (EditText)findViewById(R.id.email);
        e2 = (EditText)findViewById(R.id.firstname);
        e3 = (EditText)findViewById(R.id.lastname);
        e4 = (EditText)findViewById(R.id.pass);
        e5 = (EditText)findViewById(R.id.repass);

        b1= (Button)findViewById(R.id.register);
        b2=(Button)findViewById(R.id.signin);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register.this, Signin.class);
                startActivity(i);
            }
        });
    }
}
