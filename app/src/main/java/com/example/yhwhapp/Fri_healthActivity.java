package com.example.yhwhapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Fri_healthActivity extends AppCompatActivity {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fri_health);

        ImageButton imageButton24 = findViewById(R.id.imageButton24); //home
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        ImageButton imageButton27 = findViewById(R.id.imageButton27); //right
        imageButton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensat_healthActivity();
            }
        });

        ImageButton imageButton26 = findViewById(R.id.imageButton26); //left
        imageButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThu_healthActivity();
            }
        });

        ImageButton imageButton25 = findViewById(R.id.imageButton25); //fitness
        imageButton25.setOnClickListener(new View.OnClickListener() {
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

    public void opensat_healthActivity() {
        Intent intent = new Intent(this, sat_healthActivity.class);
        startActivity(intent);
    }

    public void openThu_healthActivity() {
        Intent intent = new Intent(this, Thu_healthActivity.class);
        startActivity(intent);
    }

    public void openFitnessActivity() {
        Intent intent = new Intent(this, FitnessActivity.class);
        startActivity(intent);
    }
}


