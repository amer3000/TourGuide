package com.example.android.carrolltontourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poi_list);

        final ArrayList<PointOfInterest> pointOfInterests = new ArrayList<>();
        pointOfInterests.add(new PointOfInterest("Branch Hollow Park", "409 Hebron Parkway"));
        pointOfInterests.add(new PointOfInterest("Carrollton Greenbelt Park", "20 N josey Ln"));
        pointOfInterests.add(new PointOfInterest("BBQ Tonight", "Great park"));
        pointOfInterests.add(new PointOfInterest("Boba Cafe", "Awesomeness"));

        PointOfInterestAdaptor adaptor = new PointOfInterestAdaptor(this, pointOfInterests);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptor);
    }

}
