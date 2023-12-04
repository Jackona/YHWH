package com.example.yhwhapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MotivationActivity extends AppCompatActivity {

    TextView tv;
    Button Motivation_button;

    private String jokes[] = {"Everything you've ever wanted is sitting on the other side of fear - George Addair",
            "The question isn't who is going to let me; it's who is going to stop me - Ayn Rand",
            "Every strike brings me closer to the next home run - Babe Ruth ",
            "I have not failed. I've just found 10,000 ways that won't work - Thomas A. Edison ",
            "Don’t worry about failure; you only have to be right once - Drew Houston ",
            "You carry the passport to your own happiness -  Diane von Furstenberg ",
            "We can see through others only when we can see through ourselves - Bruce Lee",
            "The battles that count aren't the ones for gold medals. The struggles within yourself—the invisible, inevitable battles inside all of us—that's where it's at - Jesse Owens",
            "Strength does not come from physical capacity. It comes from an indomitable will - Mahatma Gandhi ",
            "The best way to predict the future is to create it - Abraham Lincoln",
            "I don’t count my sit-ups. I only start counting when it starts hurting because they’re the only ones that count - Muhammad Ali ",
            "When you hit failure, your workout has just begun - Ronnie Coleman "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);

        ImageButton imageButtonmotivation = findViewById(R.id.imageButtonmotivation);
        imageButtonmotivation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        tv = (TextView) findViewById(R.id.tv);
        Motivation_button = (Button) findViewById(R.id.Motivation_button);
        Motivation_button.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View v) {
                Random random=new Random();
                int num = random.nextInt(jokes.length);
                tv.setText(jokes[num]);    }
        });



    }
    public void openHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);


    }
}