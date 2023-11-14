package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
         username= findViewById(R.id.usernameId);
         password= findViewById(R.id.passId);


    }

    public void SInID(View view) {

        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
        {
            Toast.makeText(login.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(login.this, "LOGIN UNSUCCESSFUL", Toast.LENGTH_SHORT).show();

        Intent myIntent= new Intent(this,option.class);
        startActivity(myIntent);


    }

}

