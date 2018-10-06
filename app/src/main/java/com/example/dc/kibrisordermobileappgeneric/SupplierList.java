package com.example.dc.kibrisordermobileappgeneric;

public class SupplierList {
    private int mImage;
    private String mName;
    private String mPrice;

    public SupplierList(int Image, String Name, String Price) {
        this.mImage = Image;
        this.mName = Name;
        this.mPrice = Price;
    }

    public SupplierList() {

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

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmPrice(String mPrice) {
        this.mPrice = mPrice;
    }
}
