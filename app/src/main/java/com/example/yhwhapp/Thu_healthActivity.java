package com.example.yhwhapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Thu_healthActivity extends AppCompatActivity {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thu_health);

        ImageButton imageButton = findViewById(R.id.imageButton20); //home
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        ImageButton imageButton23 = findViewById(R.id.imageButton23); //right
        imageButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFri_healthActivity();
            }
        });

        ImageButton imageButton22 = findViewById(R.id.imageButton22); //left
        imageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwed_healthActivity2();
            }
        });

        ImageButton imageButton21 = findViewById(R.id.imageButton21); //fitness
        imageButton21.setOnClickListener(new View.OnClickListener() {
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

    public void openFri_healthActivity() {
        Intent intent = new Intent(this, Fri_healthActivity.class);
        startActivity(intent);
    }

    public void openwed_healthActivity2() {
        Intent intent = new Intent(this, wed_healthActivity2.class);
        startActivity(intent);
    }

    public void openFitnessActivity() {
        Intent intent = new Intent(this, FitnessActivity.class);
        startActivity(intent);
    }
}


