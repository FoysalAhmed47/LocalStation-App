package com.example.cardview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView schoolCardView, hospitalCardView, restaurantCardView, airportCardView, libraryCardView ,stationCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schoolCardView = findViewById(R.id.schoolCardViewId);
        hospitalCardView = findViewById(R.id.hospitalCardViewId);
        restaurantCardView = findViewById(R.id.restaurantCardViewId);
        airportCardView = findViewById(R.id.airportCardViewId);
        stationCardView = findViewById(R.id.stationCardViewId);
        libraryCardView = findViewById(R.id.libraryCardViewId);

        schoolCardView.setOnClickListener(this);
        hospitalCardView.setOnClickListener(this);
        restaurantCardView.setOnClickListener(this);
        airportCardView.setOnClickListener(this);
        stationCardView.setOnClickListener(this);
        libraryCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.schoolCardViewId) {
            //Intent intent=new Intent(MainActivity.this,SchoolActivity.class);
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://daffodilvarsity.edu.bd/"));
            startActivity(intent);
        }
        else if (v.getId() == R.id.hospitalCardViewId) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.squarehospital.com/"));
            startActivity(intent);
        }
        else if (v.getId() == R.id.restaurantCardViewId) {

            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ihg.com/intercontinental/hotels/us/en/dhaka/dachb/hoteldetail"));
            startActivity(intent);
        }
       else if (v.getId() == R.id.airportCardViewId) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cheapflights.ca/horizon/sem/flights/general?lang=en&skipapp=true&gclid=EAIaIQobChMI2orP-L6o4wIVUSQrCh0zzg0BEAAYASAAEgI2yPD_BwE&aid=61534278441"));
            startActivity(intent);
        }

      else   if (v.getId() == R.id.libraryCardViewId) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wdl.org/en/"));
            startActivity(intent);
        }
        else   if (v.getId() == R.id.stationCardViewId) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.police.gov.bd/en/highway_police"));
            startActivity(intent);
        }



    }
}
