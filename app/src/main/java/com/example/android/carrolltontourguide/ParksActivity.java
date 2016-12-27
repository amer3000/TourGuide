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
        pointOfInterests.add(new PointOfInterest("Branch Hollow Park", "Bike and running trails. Light traffic."));
        pointOfInterests.add(new PointOfInterest("Carrollton Greenbelt Park", "Only place to play disc golf in Carrollton"));
        pointOfInterests.add(new PointOfInterest("Harvest Run Park", "A little neighborhood park"));
        pointOfInterests.add(new PointOfInterest("Arbor Hills Trails", "Wilderness in middle of suburbs. Great hiking and biking trails."));

        PointOfInterest poi = new PointOfInterest("Arbor Hills Trails", "Wil");
        poi.setImage(R.drawable.test);

        pointOfInterests.add(poi);

        PointOfInterestAdaptor adaptor = new PointOfInterestAdaptor(this, pointOfInterests);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptor);
    }

}
