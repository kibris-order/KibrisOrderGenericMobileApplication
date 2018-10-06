package com.example.dc.kibrisordermobileappgeneric;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WishListAdapter extends RecyclerView.Adapter<WishListAdapter.WishListViewHolder> {
    private ArrayList<WishListItem> mWishList;

    //ViewHolder class
    public static class WishListViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mProductName;
        public TextView mProductPrice;

        public WishListViewHolder(View itemView) {
            super(itemView);
            mImageView= itemView.findViewById(R.id.imageView);
            mProductName= itemView.findViewById(R.id.productName);
            mProductPrice= itemView.findViewById(R.id.price);
        }
    }

    //passes the list to the adapter
    public WishListAdapter(ArrayList<WishListItem> wishlist){
        mWishList = wishlist;
    }

    @NonNull
    @Override
    public WishListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.wish_layout, parent,false);
        WishListViewHolder wvh = new WishListViewHolder(v);
        return wvh;
    }

    @Override
    public void onBindViewHolder(@NonNull WishListViewHolder holder, int position) {
        WishListItem currentItem = mWishList.get(position);

        holder.mImageView.setImageResource(currentItem.getmImage());
        holder.mProductName.setText(currentItem.getmName());
        holder.mProductPrice.setText(currentItem.getmPrice());

    }

    @Override
    public int getItemCount() {
        return mWishList.size();
    }
}
