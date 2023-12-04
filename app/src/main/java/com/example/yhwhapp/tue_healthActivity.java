package com.example.yhwhapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class tue_healthActivity extends AppCompatActivity {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tue_health);

        ImageButton imageButton12 = findViewById(R.id.imageButton12); //home
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        ImageButton imageButton14 = findViewById(R.id.imageButton14); //right
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwed_healthActivity2();
            }
        });

        ImageButton imageButton15 = findViewById(R.id.imageButton15); //left
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHealth_MondayActivity();
            }
        });

        ImageButton imageButton13 = findViewById(R.id.imageButton13); //fitness
        imageButton13.setOnClickListener(new View.OnClickListener() {
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

    public void openwed_healthActivity2() {
        Intent intent = new Intent(this, wed_healthActivity2.class);
        startActivity(intent);
    }

    public void openHealth_MondayActivity() {
        Intent intent = new Intent(this, Health_MondayActivity.class);
        startActivity(intent);
    }

    public void openFitnessActivity() {
        Intent intent = new Intent(this, FitnessActivity.class);
        startActivity(intent);
    }
}


