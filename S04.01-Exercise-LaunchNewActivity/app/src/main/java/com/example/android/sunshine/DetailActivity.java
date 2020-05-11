package com.example.android.sunshine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView mWeatherDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherDetail = findViewById(R.id.tv_weather_detail);

        Intent sourceIntent = getIntent();

        if(sourceIntent.hasExtra("weatherData")){
            String weatherData = sourceIntent.getStringExtra("weatherData");
            mWeatherDetail.setText(weatherData);

        }
    }
}
