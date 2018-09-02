package com.example.dc.kibrisordermobileappgeneric;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shoppingcartempty extends AppCompatActivity {

    Button b;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingcartempty);

        init();
    }

    private void init()
    {
       b = (Button)findViewById(R.id.shopping);
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(Shoppingcartempty.this, Homepage.class);
               startActivity(i);
           }
       });
    }
}
