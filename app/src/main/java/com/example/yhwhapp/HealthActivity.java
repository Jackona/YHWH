package com.example.yhwhapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HealthActivity extends AppCompatActivity {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        ImageButton imageButton6 = findViewById(R.id.imageButton6); //home
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        ImageButton imageButton7 = findViewById(R.id.imageButton7); //right
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHealth_MondayActivity();
            }
        });
    }

    public void openHomeActivity(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
    public void openHealth_MondayActivity(){
        Intent intent = new Intent(this,Health_MondayActivity.class);
        startActivity(intent);
    }


}