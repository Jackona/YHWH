package com.example.yhwhapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Profile_twoActivity extends AppCompatActivity {

    private Button button;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_two);

        ImageButton homebtnprofile = findViewById(R.id.homebtnprofile); //home nav
        homebtnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });
        ImageButton calendarbtnprofile = findViewById(R.id.calendarbtnprofile); //calendar nav
        calendarbtnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalendarActivity();
            }
        });


    }
    public void openHomeActivity(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
    public void openCalendarActivity(){
        Intent intent = new Intent(this, Calendar_calActivity.class);
        startActivity(intent);
    }
}