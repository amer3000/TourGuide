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

    public void setImage(int id) {
        mImageResourceId = id;
    }

    public boolean hasImage() {
        return mImageResourceId != 0;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String toString() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }
}