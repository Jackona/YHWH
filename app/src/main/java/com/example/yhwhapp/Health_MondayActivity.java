package com.example.yhwhapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Health_MondayActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_monday);

        ImageButton imageButton11 = findViewById(R.id.imageButton11); //home
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        ImageButton imageButton8 = findViewById(R.id.imageButton8); //right
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentue_healthActivity();
            }
        });

        ImageButton imageButton9 = findViewById(R.id.imageButton9); //left
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHealthActivity();
            }
        });

        ImageButton imageButton16 = findViewById(R.id.imageButton16); //fitness
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFitnessActivity();
            }
        });
    }

    public void openHomeActivity(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
    public void opentue_healthActivity(){
        Intent intent = new Intent(this,tue_healthActivity.class);
        startActivity(intent);
    }
    public void openHealthActivity(){
        Intent intent = new Intent(this,HealthActivity.class);
        startActivity(intent);
    }
    public void openFitnessActivity(){
        Intent intent = new Intent(this,FitnessActivity.class);
        startActivity(intent);
    }


}