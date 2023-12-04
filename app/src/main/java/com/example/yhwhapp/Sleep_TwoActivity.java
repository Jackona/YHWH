package com.example.yhwhapp;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Sleep_TwoActivity extends AppCompatActivity {

    private Button button;
    private ImageButton imageButton;
    private SoundPool soundPool;
    private  int sound7, sound8,sound9,sound10,sound11,sound12;
    private int sound3StreamId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_two);

        ConstraintLayout constraintLayout = findViewById(R.id.newnewlayoutmoving);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2222);
        animationDrawable.setExitFadeDuration(5555);
        animationDrawable.start();

        Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSleepActivity();
            }
        });

        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            AudioAttributes audioAttributes =new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(9)
                    .setAudioAttributes(audioAttributes)
                    .build();

        }else {
            soundPool = new SoundPool(9, AudioManager.STREAM_MUSIC, 0 );
        }

        sound7 = soundPool.load(this,R.raw.fouroneseven,1);
        sound8 = soundPool.load(this,R.raw.fourthreetwo,1);
        sound9 = soundPool.load(this,R.raw.fivetwoeight,1);
        sound10 = soundPool.load(this,R.raw.sixthreenine,1);
        sound11 = soundPool.load(this,R.raw.sevenfourone,1);
        sound12 = soundPool.load(this,R.raw.eightfivetwo,1);




    }
    public void  PlaySound(View v){

        switch (v.getId()){
            case R.id.button_417Hz:
                soundPool.play(sound7,1,1,0,0,1);
               // soundPool.autoPause();
                break;
            case R.id.button_432Hz:
                soundPool.play(sound8,1,1,0,0,1);
               // soundPool.autoPause();
                break;
            case R.id.button_528Hz:
                sound3StreamId= soundPool.play(sound9,1,1,0,0,1);
              //  soundPool.autoPause();
                break;
            case R.id.button_639Hz:
                soundPool.play(sound10,1,1,0,0,1);
              //  soundPool.autoPause();
                break;
            case R.id.button_741Hz:
                soundPool.play(sound11,1,1,0,0,1);
             //   soundPool.autoPause();
                break;
            case R.id.button_852Hz:
                soundPool.play(sound12,1,1,0,0,1);
             //   soundPool.autoPause();
                break;


        }


    }
    public void openSleepActivity() {
            Intent intent = new Intent(this,SleepActivity.class);
            startActivity(intent);
        }
    public void openHomeActivity(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
}
