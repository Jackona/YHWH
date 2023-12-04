package com.example.yhwhapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class wed_healthActivity2 extends AppCompatActivity {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wed_health2);

        ImageButton imageButton10 = findViewById(R.id.imageButton10); //home
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        ImageButton imageButton19 = findViewById(R.id.imageButton19); //right
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThu_healthActivity();
            }
        });

        ImageButton imageButton18 = findViewById(R.id.imageButton18); //left
        imageButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentue_healthActivity();
            }
        });

        ImageButton imageButton17 = findViewById(R.id.imageButton17); //fitness
        imageButton17.setOnClickListener(new View.OnClickListener() {
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

    public void openThu_healthActivity() {
        Intent intent = new Intent(this, Thu_healthActivity.class);
        startActivity(intent);
    }

    public void opentue_healthActivity() {
        Intent intent = new Intent(this, tue_healthActivity.class);
        startActivity(intent);
    }

    public void openFitnessActivity() {
        Intent intent = new Intent(this, FitnessActivity.class);
        startActivity(intent);
    }
}


