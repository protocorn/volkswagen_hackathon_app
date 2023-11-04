package com.example.myvolkswagenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NavigationActivity extends AppCompatActivity {

    ImageView home_ic, profile_ic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        getSupportActionBar().hide();

        home_ic = findViewById(R.id.home_icon);
        profile_ic = findViewById(R.id.profile_icon);

        home_ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this, MainActivity.class));
                finish();
            }
        });
        profile_ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavigationActivity.this, ProfileActivity.class));
                finish();
            }
        });
    }
}