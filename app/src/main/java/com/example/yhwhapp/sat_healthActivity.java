package com.example.yhwhapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class sat_healthActivity extends AppCompatActivity {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sat_health);

        ImageButton imageButton28 = findViewById(R.id.imageButton28); //home
        imageButton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        ImageButton imageButton31 = findViewById(R.id.imageButton31); //right
        imageButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensun_healthActivity();
            }
        });

        ImageButton imageButton30 = findViewById(R.id.imageButton30); //left
        imageButton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFri_healthActivity();
            }
        });

        ImageButton imageButton29 = findViewById(R.id.imageButton29); //fitness
        imageButton29.setOnClickListener(new View.OnClickListener() {
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

    public void opensun_healthActivity() {
        Intent intent = new Intent(this, sun_healthActivity.class);
        startActivity(intent);
    }

    public void openFri_healthActivity() {
        Intent intent = new Intent(this, Fri_healthActivity.class);
        startActivity(intent);
    }

    public void openFitnessActivity() {
        Intent intent = new Intent(this, FitnessActivity.class);
        startActivity(intent);
    }
}


