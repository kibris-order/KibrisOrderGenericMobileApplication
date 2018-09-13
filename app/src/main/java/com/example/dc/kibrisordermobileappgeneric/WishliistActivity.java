package com.example.dc.kibrisordermobileappgeneric;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class WishliistActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishliist);
        //Declaring a list for the products
        ArrayList<WishListItem> wishlist = new ArrayList<>();
        wishlist.add(new WishListItem(R.drawable.necklace, "Long Necklace", "$25"));
        wishlist.add(new WishListItem(R.drawable.images, "Black Stilettos", "$75"));
        wishlist.add(new WishListItem(R.drawable.watch, "Fashion Bamboo Wood Watches with Soft Green Silicone Strap", "$19.21"));
        wishlist.add(new WishListItem(R.drawable.cap, "2018 New letter LA Baseball Caps Dodgers Embroidery ", "$7"));
        wishlist.add(new WishListItem(R.drawable.vans, "Original Vans New Arrival Low-Top Women's Slip-On ", "$90"));
        wishlist.add(new WishListItem(R.drawable.darkjeans,"SIMWOOD 2018 Autumn New Dark Wash Black Jeans ", "$34"));
        wishlist.add(new WishListItem(R.drawable.skinnyjeans, "Pioneer Camp skinny jeans men brand clothing new dark grey feet pants male top quality stretch autumn denim trousers", "$32"));
        wishlist.add(new WishListItem(R.drawable.boho, "Bohe Dress Suits Sexy Women Club Bodycon Party Dress Summer Casual Vestidos Printed dress", "$17"));
        wishlist.add(new WishListItem(R.drawable.crosses, "Round Neck Penciled Cross Drawstring Playsuit", "$11"));
        wishlist.add(new WishListItem(R.drawable.suit, "Formal 3 Piece Sets Women Business Suits", "$79.9"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mAdapter = new WishListAdapter(wishlist);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }





}
