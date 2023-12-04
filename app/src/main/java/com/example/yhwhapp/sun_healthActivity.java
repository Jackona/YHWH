package com.example.yhwhapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class sun_healthActivity extends AppCompatActivity {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun_health);

        ImageButton imageButton32 = findViewById(R.id.imageButton32); //home
        imageButton32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        ImageButton imageButton35 = findViewById(R.id.imageButton35); //right
        imageButton35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHealthActivity();
            }
        });

        ImageButton imageButton34 = findViewById(R.id.imageButton34); //left
        imageButton34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensat_healthActivity();
            }
        });

        ImageButton imageButton33 = findViewById(R.id.imageButton33); //fitness
        imageButton33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFitnessActivity();
            }
        });


    }

    public void openHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void openHealthActivity() {
        Intent intent = new Intent(this, HealthActivity.class);
        startActivity(intent);
    }

    public void opensat_healthActivity() {
        Intent intent = new Intent(this, sat_healthActivity.class);
        startActivity(intent);
    }

    public void openFitnessActivity() {
        Intent intent = new Intent(this, FitnessActivity.class);
        startActivity(intent);
    }
}


