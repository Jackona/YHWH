package com.example.yhwhapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Yoga_threeActivity extends AppCompatActivity {

    private Button button;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_three);

        VideoView videoView = findViewById(R.id.tenminyoga);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.tenminyoga;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);



        ImageButton ibtny2h2 = findViewById(R.id.ibtny2h2);
        ibtny2h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            } //to home
        });

        Button button15 = findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoga_TwoActivity();
            }//to second yoga page
        });
        Button button16 = findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoga_OneActivity();
            } //to the new yoga 1 page
        });


    }

    public void openYoga_OneActivity() {
        Intent intent = new Intent(this, Yoga_OneActivity.class);
        startActivity(intent);
    }

    public void openHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);


    }
    public void openYoga_TwoActivity() {
        Intent intent = new Intent(this, Yoga_TwoActivity.class);
        startActivity(intent);


    }
}