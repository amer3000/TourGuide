package com.example.android.carrolltontourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poi_list);
        final ArrayList<PointOfInterest> pointOfInterests = new ArrayList<>();
        pointOfInterests.add(new PointOfInterest("Willowbend Mall", "Nothing fancy here, but it is quiet."));
        pointOfInterests.add(new PointOfInterest("Jack's Westerns", "Get some cowboy boots & hats."));
        pointOfInterests.add(new PointOfInterest("Judy's", "Hidden little nook in downtown. You can find awesome antiques here."));

        PointOfInterestAdaptor adaptor = new PointOfInterestAdaptor(this, pointOfInterests);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptor);
    }
}
