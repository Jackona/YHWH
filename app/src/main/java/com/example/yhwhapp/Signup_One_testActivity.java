package com.example.yhwhapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
public class Signup_One_testActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_one_test);

        mAuth = FirebaseAuth.getInstance();

    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {

        }
    }

    public void signin(String email, String password) {
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    FirebaseUser user = mAuth.getCurrentUser();
                    Toast.makeText(Signup_One_testActivity.this,
                            "Authentication success.Use an intent to move to a new activity ",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Log.w("Signup_One_testActivity", "signInWithEmail:failure",
                            task.getException());
                    Toast.makeText(Signup_One_testActivity.this, "Authentication failed.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    public void signup(String email, String password) {
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult>
                                           task) {
                if (task.isSuccessful()) {
                    Log.d("Signup_One_testActivity",
                            "createUserWithEmail:success");
                    FirebaseUser user = mAuth.getCurrentUser();
                    Toast.makeText(Signup_One_testActivity.this,
                            "Authentication success. Use an intent to move to a new activity",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Log.w("SignUp_OneActivity",
                            "createUserWithEmail:failure", task.getException());
                    Toast.makeText(Signup_One_testActivity.this,
                            "Authentication failed.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void signupButtonClicked(View view) {
        EditText email = findViewById(R.id.editTextTextEmailAddress);
        EditText password = findViewById(R.id.editTextTextPassword);
        String sEmail = email.getText().toString();
        String sPassword = password.getText().toString();

        //signup(sEmail, sPassword);
        signin(sEmail, sPassword);
    }



}

