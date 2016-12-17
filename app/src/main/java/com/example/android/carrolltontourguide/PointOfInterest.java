package com.example.android.carrolltontourguide;

/**
 * Created by amer on 11/25/2016.
 */

public class PointOfInterest {


    private String mName;

    private String mAddress;

    private String mPhone;

    private String mWebsite;


    private int mImageResourceId;


    public PointOfInterest(String name) {
        mName = name;
    }


    public boolean hasImage() {
        return false;
    }

    public int getImageResourceId() {
        return 0;
    }
}