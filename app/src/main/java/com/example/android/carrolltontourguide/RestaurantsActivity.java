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
        pointOfInterests.add(new PointOfInterest("Babe's Chicken", "23 Main Street"));
        pointOfInterests.add(new PointOfInterest("Andy's Custard", "4067 Hebron Parkway"));
        pointOfInterests.add(new PointOfInterest("BBQ Tonight", "1507 Old Denton Hwy"));
        pointOfInterests.add(new PointOfInterest("Boba Cafe", "102 State Hwy 121"));

        PointOfInterestAdaptor adaptor = new PointOfInterestAdaptor(this, pointOfInterests);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptor);
    }
}
