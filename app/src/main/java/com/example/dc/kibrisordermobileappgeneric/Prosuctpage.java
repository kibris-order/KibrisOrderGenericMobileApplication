package com.example.dc.kibrisordermobileappgeneric;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Prosuctpage extends AppCompatActivity {

    Button b1, b2, b3, b4;
    TextView t1, t2, t3, t4, t5, t6;
    ListView reviews;
    ArrayAdapter list;
    ImageView image;
    RatingBar bar;
    int num;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prosuctpage);
        init();

    }
    public void init(){
        b1 = (Button)findViewById(R.id.plus);
        b2 = (Button)findViewById(R.id.minus);
        b3 = (Button)findViewById(R.id.add);
        b4 = (Button)findViewById(R.id.buy);

        t1 = (TextView)findViewById(R.id.productdescription);
        t2 = (TextView)findViewById(R.id.price);
        t3 = (TextView)findViewById(R.id.quantity);
        t4 = (TextView)findViewById(R.id.rate);
        t5 = (TextView)findViewById(R.id.order);
        t6 = (TextView)findViewById(R.id.wishlist);

        bar = (RatingBar)findViewById(R.id.ratingBar);

        bar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                t4.setText(String.valueOf(rating));
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(t3.getText().toString());
                num +=1;
                t3.setText(""+num);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(t3.getText().toString());
                num -=1;
                t3.setText(""+num);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
