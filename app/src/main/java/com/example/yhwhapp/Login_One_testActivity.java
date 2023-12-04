package com.example.yhwhapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Login_One_testActivity extends AppCompatActivity {

    private Button button;
    private ImageButton imageButton;

    EditText edUserName, edPassword;
    Button btn;
    Button btn2;
    TextView tv;

    FirebaseAuth firebaseAuth;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_one);


       edUserName = findViewById(R.id.UserName);
        edPassword = findViewById(R.id.Password);
        btn = findViewById(R.id.Button); //login button
        tv = findViewById(R.id.Register);
        //btn2 = findViewById(R.id.button18); //signup button

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UserName = edUserName.getText().toString();
                String Password = edPassword.getText().toString();
                if(UserName.length()==0 || Password.length()==0){

                    Toast.makeText(getApplicationContext(), "Enter details",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "You have Logged in!",Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_One_testActivity.this, HomeActivity.class));
            }
        });
        /*btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_One_testActivity.this, Signup_One_testActivity.class)); //this crashes the app
            }
        });*/
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_One_testActivity.this, Signup_One_testActivity.class));
            }
        });




    }

}