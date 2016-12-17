package com.example.android.carrolltontourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        final ArrayList<PointOfInterest> pointOfInterests = new ArrayList<>();
        pointOfInterests.add(new PointOfInterest("Babe's Chicken"));
        pointOfInterests.add(new PointOfInterest("Andy's Custard"));
        pointOfInterests.add(new PointOfInterest("BBQ Tonight"));
        pointOfInterests.add(new PointOfInterest("Boba Cafe"));

    }
}
