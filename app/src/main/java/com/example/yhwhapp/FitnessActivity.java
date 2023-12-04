package com.example.yhwhapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class FitnessActivity extends AppCompatActivity {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);


        ImageButton imageButtonfitness = findViewById(R.id.imageButtonfitness);
        imageButtonfitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

    }

        public void openHomeActivity(){
            Intent intent = new Intent(this,HomeActivity.class);
            startActivity(intent);
        }


    }