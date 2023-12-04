package com.example.yhwhapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private Button button;

    EditText edUserName, edEmail, edPassword, edConfirmPassword;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        Button ButtonReg = findViewById(R.id.ButtonReg);
        ButtonReg.setOnClickListener((View.OnClickListener) this);

        edUserName = findViewById(R.id.UserNameReg);
        edEmail = findViewById(R.id.EmailReg);
        edPassword = findViewById(R.id.PasswordReg);
        edConfirmPassword  = findViewById(R.id.ConfirmPassword);
        btn = findViewById(R.id.ButtonReg);
        tv = findViewById(R.id.AccountMade);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String UserName = edUserName.getText().toString();
                    String Email = edEmail.getText().toString();
                    String Password = edPassword.getText().toString();
                    String ConfirmPassword = edConfirmPassword.getText().toString();
                    TheDataBase db = new TheDataBase(getApplicationContext(),"SOUL",null,1);
                    if(UserName.length()==0 || Email.length()==0 || Password.length()==0 || ConfirmPassword.length()==0) {
                        Toast.makeText(getApplicationContext(), "Enter details",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        if(Password.compareTo(ConfirmPassword)==0){
                            if(isVaild(Password)){
                            db.register(UserName,Email,Password);


                            }else {
                                Toast.makeText(getApplicationContext(),"Password must have at least 10 characters",Toast.LENGTH_SHORT).show();
                            }


                        }else{
                            Toast.makeText(getApplicationContext(),"Password didn't match",Toast.LENGTH_SHORT).show();
                        }

                    }
                }

            });

}
    public static boolean isVaild(String passwordenter){
        int p1=0,p2=0,p3=0;
        if(passwordenter.length()<10){
            return false;
        }else {
            for (int p = 0; p < passwordenter.length(); p++) {
                if (Character.isLetter(passwordenter.charAt(p))) {
                    p1 = 1;
                }
            }
            for (int q = 0; q < passwordenter.length(); q++) {
                if (Character.isDigit(passwordenter.charAt(q))) {
                    p2 = 1;
                }
            }
            for (int w = 0; w < passwordenter.length(); w++) {
                char c = passwordenter.charAt(w);
                if (c>= 40&& c<= 60||c== 70) {
                    p3 = 1;
                }
            }
            if (p1 == 1 && p2 == 1 && p3 == 1)
                return true;
            return false;
        }
    }





}