package com.example.yhwhapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    EditText edUserName, edPassword;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button Button = findViewById(R.id.Button);
        Button.setOnClickListener((View.OnClickListener) this);

        edUserName = findViewById(R.id.UserName);
        edPassword = findViewById(R.id.Password);
        btn = findViewById(R.id.Button);
        tv = findViewById(R.id.Register);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UserName = edUserName.getText().toString();
                String Password = edPassword.getText().toString();
                TheDataBase db = new TheDataBase(getApplicationContext(),"SOUL",null,1);
                if(UserName.length()==0 || Password.length()==0){

                    Toast.makeText(getApplicationContext(), "Enter details",Toast.LENGTH_SHORT).show();
                }else{
                    if (db.login(UserName,Password)==1){
                        Toast.makeText(getApplicationContext(), "You have Logged in!",Toast.LENGTH_SHORT).show();
                        SharedPreferences sharedPreferences =getSharedPreferences("Shared", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("UserName",UserName);
                        editor.apply();


                        startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                    }else {
                        Toast.makeText(getApplicationContext(),"Incorrect Username or Password!",Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });


    }
    public void onClick(View v) {
        openHomeActivity();

        switch (v.getId()){
            case R.id.button:
                Toast.makeText(this, "Home Button", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void openHomeActivity(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }



}