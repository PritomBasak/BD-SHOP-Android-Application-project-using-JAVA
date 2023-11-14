package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Medicine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicine);
    }



    public void mbuy1(View view) {
        Intent myIntent = new Intent(this, payment.class);
        startActivity(myIntent);
    }

    public void mbuy2(View view) {
        Intent myIntent = new Intent(this, payment.class);
        startActivity(myIntent);
    }

    public void mbuy3(View view) {
        Intent myIntent = new Intent(this, payment.class);
        startActivity(myIntent);
    }

    public void mbuy4(View view) {
        Intent myIntent = new Intent(this, payment.class);
        startActivity(myIntent);
    }

    public void meback(View view) {
        Intent myIntent = new Intent(this, option.class);
        startActivity(myIntent);
    }
}