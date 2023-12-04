package com.example.yhwhapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class testActivity extends AppCompatActivity {

    TextView textView142;
    Button button13;

    private String jokes[] = {"text1","text2","text3","text4","text5","text6","text7","text8","text9","text10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        textView142 = (TextView) findViewById(R.id.textView142);
        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View v) {
                Random random=new Random();
                int num = random.nextInt(jokes.length);
                textView142.setText(jokes[num]);    }
        });



    }
}
