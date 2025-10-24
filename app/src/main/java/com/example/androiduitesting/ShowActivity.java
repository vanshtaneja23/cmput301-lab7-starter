package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_CITY_NAME = "CITY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameText = findViewById(R.id.text_city_name);
        Button backButton = findViewById(R.id.button_back);

        // Get the city name from the intent
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(EXTRA_CITY_NAME)) {
            String cityName = intent.getStringExtra(EXTRA_CITY_NAME);
            cityNameText.setText(cityName);
        }

        // Back button goes back to MainActivity
        backButton.setOnClickListener(v -> finish());
    }
}
