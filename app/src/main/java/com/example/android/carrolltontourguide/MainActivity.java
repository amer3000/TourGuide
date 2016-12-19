package com.example.android.carrolltontourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);
        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantsActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the parks category
        TextView parks = (TextView) findViewById(R.id.parks);
        // Set a click listener on that View
        parks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ParksActivity}
                Intent parksIntent = new Intent(MainActivity.this, ParksActivity.class);

                // Start the new activity
                startActivity(parksIntent);
            }
        });

        // Find the View that shows the Shops category
        TextView shops = (TextView) findViewById(R.id.shops);
        // Set a click listener on that View
        shops.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShopsActivity}
                Intent shopsIntent = new Intent(MainActivity.this, ShopsActivity.class);

                // Start the new activity
                startActivity(shopsIntent);
            }
        });

        // Find the View that shows the historic category
        TextView historic = (TextView) findViewById(R.id.historic);
        // Set a click listener on that View
        historic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HistoricsActivity}
                Intent historicIntent = new Intent(MainActivity.this, HistoricActivity.class);

                // Start the new activity
                startActivity(historicIntent);
            }
        });

    }
}
