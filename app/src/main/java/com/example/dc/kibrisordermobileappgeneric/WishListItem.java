package com.example.dc.kibrisordermobileappgeneric;

public class WishListItem {
    private int mImage;
    private String mName;
    private String mPrice;

    public WishListItem(int Image, String Name, String Price) {
        this.mImage = Image;
        this.mName = Name;
        this.mPrice = Price;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmName() {
        return mName;
    }

    public String getmPrice() {
        return mPrice;
    }
}
