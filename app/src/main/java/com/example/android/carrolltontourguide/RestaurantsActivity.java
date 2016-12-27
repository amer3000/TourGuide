package com.example.android.carrolltontourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poi_list);

        final ArrayList<PointOfInterest> pointOfInterests = new ArrayList<>();
        pointOfInterests.add(new PointOfInterest("Babe's Chicken", "Great Southern style chicken."));
        pointOfInterests.add(new PointOfInterest("Andy's Custard", "Probably the best ice cream ever."));
        pointOfInterests.add(new PointOfInterest("BBQ Tonight", "Awesomest Pakistani food in town."));
        pointOfInterests.add(new PointOfInterest("Boba Cafe", "So good and great atomsphere."));

        PointOfInterestAdaptor adaptor = new PointOfInterestAdaptor(this, pointOfInterests);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptor);
    }
}
