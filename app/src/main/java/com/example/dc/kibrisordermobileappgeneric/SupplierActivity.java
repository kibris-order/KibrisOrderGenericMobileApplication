package com.example.dc.kibrisordermobileappgeneric;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SupplierActivity extends AppCompatActivity {
    List<SupplierList> supList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier);
        //Declaring new array for the products
        supList = new ArrayList<>();
        supList.add(new SupplierList(R.drawable.necklace, "Long Necklace", "$25"));
        supList.add(new SupplierList(R.drawable.images, "Black Stilettos", "$75"));
        supList.add(new SupplierList(R.drawable.watch, "Fashion Bamboo Wood Watches with Soft Green Silicone Strap", "$19.21"));
        supList.add(new SupplierList(R.drawable.cap, "2018 New letter LA Baseball Caps Dodgers Embroidery ", "$7"));
        supList.add(new SupplierList(R.drawable.vans, "Original Vans New Arrival Low-Top Women's Slip-On ", "$90"));
        supList.add(new SupplierList(R.drawable.darkjeans,"SIMWOOD 2018 Autumn New Dark Wash Black Jeans ", "$34"));
        supList.add(new SupplierList(R.drawable.skinnyjeans, "Pioneer Camp skinny jeans men brand clothing new dark grey feet pants male top quality stretch autumn denim trousers", "$32"));
        supList.add(new SupplierList(R.drawable.boho, "Bohe Dress Suits Sexy Women Club Bodycon Party Dress Summer Casual Vestidos Printed dress", "$17"));
        supList.add(new SupplierList(R.drawable.crosses, "Round Neck Penciled Cross Drawstring Playsuit", "$11"));
        supList.add(new SupplierList(R.drawable.suit, "Formal 3 Piece Sets Women Business Suits", "$79.9"));

        RecyclerView myrv = findViewById(R.id.recyclerview);
        SupplierAdapter myAdapter = new SupplierAdapter(this,supList);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);

    }

}
