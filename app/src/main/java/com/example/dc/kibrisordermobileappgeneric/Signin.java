package com.example.dc.kibrisordermobileappgeneric;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Signin extends AppCompatActivity {

    Button b1, b2, b3;
    EditText e1, e2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        init();
    }

    private void init()
    {
    e1 = (EditText)findViewById(R.id.editText);
    e2 = (EditText)findViewById(R.id.editText2);
    b1 = (Button)findViewById(R.id.button);
    b2= (Button)findViewById(R.id.button2);

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });

    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Signin.this, Register.class);
            startActivity(i);

        }
    });

    }
}
