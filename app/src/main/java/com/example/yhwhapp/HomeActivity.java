package com.example.yhwhapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;



public class HomeActivity extends AppCompatActivity {

    private Button button;
    private ImageButton imageButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        ImageButton imageButton38 = findViewById(R.id.imageButton38); //profile nav
        imageButton38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile_twoActivity();
            }
        });

        ImageButton imageButton37 = findViewById(R.id.imageButton37); //calendar nav
        imageButton37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalendarActivity();
            }
        });

        Button button = (Button)findViewById(R.id.button); //Meditation
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMediationActivity();
            }
        });




        Button button2 = findViewById(R.id.button2); //Fitness
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFitnessActivity();
            }
        });

        Button button3 = findViewById(R.id.button3); //yoga
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoga_OneActivity();
            } //Yoga_OneActivity
        });

        Button button4 = findViewById(R.id.button4); //Motivation
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMotivationActivity();
            }
        });

        Button button5 = findViewById(R.id.button5); // Spirituality
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpiritualityActivity();
            }
        });

        Button button6 = findViewById(R.id.button6); // Sleep
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSleepActivity();
            }
        });

        Button button7 = findViewById(R.id.button7); // Philosophy
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhilosophyActivity();
            }
        });

        Button button8 = findViewById(R.id.button8); // Health
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHealthActivity();
            }
        });



    }

    public void openMediationActivity(){
        Intent intent = new Intent(this,MeditationActivity.class);
        startActivity(intent);
    }
    public void openFitnessActivity(){
        Intent intent = new Intent(this,FitnessActivity.class);
        startActivity(intent);
    }

    public void openYoga_OneActivity(){
        Intent intent = new Intent(this,Yoga_OneActivity.class);//Yoga_TwoActivity openYogaActivity
        startActivity(intent);
    }
    public void openMotivationActivity(){
        Intent intent = new Intent(this,MotivationActivity.class);
        startActivity(intent);
    }
    public void openSpiritualityActivity(){
        Intent intent = new Intent(this,SpiritualityActivity.class);
        startActivity(intent);
    }
    public void openSleepActivity(){
        Intent intent = new Intent(this,SleepActivity.class);
        startActivity(intent);
    }
    public void openPhilosophyActivity(){
        Intent intent = new Intent(this,PhilosophyActivity.class);
        startActivity(intent);
    }
    public void openHealthActivity(){
        Intent intent = new Intent(this,HealthActivity.class);
        startActivity(intent);
    }
    public void openProfile_twoActivity(){
        Intent intent = new Intent(this,Profile_twoActivity.class);
        startActivity(intent);
    }
    public void openCalendarActivity(){
        Intent intent = new Intent(this, Calendar_calActivity.class);
        startActivity(intent);
    }



}

