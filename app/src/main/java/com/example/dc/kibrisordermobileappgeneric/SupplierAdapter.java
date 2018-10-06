package com.example.dc.kibrisordermobileappgeneric;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SupplierAdapter extends RecyclerView.Adapter<SupplierAdapter.SupplierViewHolder> {

    private Context mContext;
    private List<SupplierList> mData;

    public SupplierAdapter(Context mContext, List<SupplierList> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public SupplierViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.supp_card_layout, parent,false);
        return new SupplierViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SupplierViewHolder holder, int position) {

        holder.mProductImage.setImageResource(mData.get(position).getmImage());
        holder.mProductName.setText(mData.get(position).getmName());
        holder.mProductPrice.setText(mData.get(position).getmPrice());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class SupplierViewHolder extends RecyclerView.ViewHolder{
        ImageView mProductImage;
        TextView mProductName;
        TextView mProductPrice;
        public SupplierViewHolder(View itemView) {
            super(itemView);
            mProductImage = itemView.findViewById(R.id.productImage);
            mProductName = itemView.findViewById(R.id.productName);
            mProductPrice = itemView.findViewById(R.id.productPrice);
        }
    }
}
