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

public class SleepActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private  int sound1, sound2,sound3,sound4,sound5,sound6;
    private int sound3StreamId;
    private ImageButton imageButton;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);


        ConstraintLayout constraintLayout = findViewById(R.id.newmovinglayout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2222);
        animationDrawable.setExitFadeDuration(5555);
        animationDrawable.start();

        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSleep_TwoActivity();
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

        sound1 = soundPool.load(this,R.raw.remsleep,1);
        sound2 = soundPool.load(this,R.raw.deepsleep,1);
        sound3 = soundPool.load(this,R.raw.littlenap,1);
        sound4 = soundPool.load(this,R.raw.moonbeach,1);
        sound5 = soundPool.load(this,R.raw.powernap,1);
        sound6 = soundPool.load(this,R.raw.sivandasleep,1);


    }
    public void  PlaySound(View v){

        switch (v.getId()){
            case R.id.button_remsleep:
            soundPool.play(sound1,1,1,0,0,1);
            //soundPool.autoPause();
            break;
            case R.id.button_deepsleep:
                soundPool.play(sound2,1,1,0,0,1);
               // soundPool.autoPause();
                break;
            case R.id.button_littlenap:
                sound3StreamId= soundPool.play(sound3,1,1,0,0,1);
               // soundPool.autoPause();
                break;
            case R.id.button_powernap:
                soundPool.play(sound4,1,1,0,0,1);
              //  soundPool.autoPause();
                break;
            case R.id.button_moonbeach:
                soundPool.play(sound5,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.button_sivandasleep:
                soundPool.play(sound6,1,1,0,0,1);
                //soundPool.autoPause();
                break;


        }


    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        soundPool.release();
        soundPool = null;


    }
    public void openHomeActivity(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
    public void openSleep_TwoActivity(){
        Intent intent = new Intent(this,Sleep_TwoActivity.class);
        startActivity(intent);
    }



}