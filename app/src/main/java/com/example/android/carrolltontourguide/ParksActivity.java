package com.example.android.carrolltontourguide;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);
        final ArrayList<PointOfInterest> pointOfInterests = new ArrayList<>();
        pointOfInterests.add(new PointOfInterest("Babe's Chicken"));
        pointOfInterests.add(new PointOfInterest("Andy's Custard"));
        pointOfInterests.add(new PointOfInterest("BBQ Tonight"));
        pointOfInterests.add(new PointOfInterest("Boba Cafe"));
    }

}
