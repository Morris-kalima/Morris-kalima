package com.FirstApp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {


    EditText username, password;
    Button loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username= findViewById(R.id.username);
        password= findViewById(R.id.password);
        loginbtn= findViewById(R.id.loginbtn);

    }
}