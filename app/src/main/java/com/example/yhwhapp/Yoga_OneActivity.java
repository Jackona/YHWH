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

public class Yoga_OneActivity extends AppCompatActivity {

    private Button button;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_one);


        VideoView videoView = findViewById(R.id.videoyoga);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.yogavideo;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        VideoView videoView2 = findViewById(R.id.whatisyogavid);
        String videoPath2 = "android.resource://" + getPackageName() + "/" + R.raw.whatisyoga;
        Uri uri2 = Uri.parse(videoPath2);
        videoView2.setVideoURI(uri2);
        MediaController mediaController2 = new MediaController(this);
        videoView2.setMediaController(mediaController2);
        mediaController2.setAnchorView(videoView2);







        ImageButton Ibtny2h = findViewById(R.id.Ibtny2h);
        Ibtny2h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        Button button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoga_threeActivity();
            }
        });


    }

    public void openYoga_threeActivity() {
        Intent intent = new Intent(this, Yoga_threeActivity.class);
        startActivity(intent);
    }

    public void openHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);


    }
}