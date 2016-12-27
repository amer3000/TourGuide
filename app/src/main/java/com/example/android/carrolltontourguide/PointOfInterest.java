package com.example.android.carrolltontourguide;

/**
 * Created by amer on 11/25/2016.
 */

public class PointOfInterest {

    private String mName;

    private String mDescription;

    private int mImageResourceId;


    public PointOfInterest(String name, String description) {
        mName = name;
        mDescription = description;
    }


    public boolean hasImage() {
        return false;
    }

    public int getImageResourceId() {
        return 0;
    }

    public String toString() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }
}