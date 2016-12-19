package com.example.android.carrolltontourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by amer on 11/25/2016.
 */

public class PointOfInterestAdaptor extends ArrayAdapter<PointOfInterest> {


    public PointOfInterestAdaptor(Context context, ArrayList<PointOfInterest> pointOfInterests) {
        super(context, 0, pointOfInterests);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        PointOfInterest pointOfInterest = getItem(position);

        TextView poiTextview = (TextView) listItemView.findViewById(R.id.poi_text_view);
        poiTextview.setText(pointOfInterest.toString());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(pointOfInterest.toString());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (pointOfInterest.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(pointOfInterest.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }



        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
