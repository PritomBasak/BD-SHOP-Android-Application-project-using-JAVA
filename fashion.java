package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fashion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fashion);
    }



    public void fbuy1(View view) {
        Intent myIntent = new Intent(this, payment.class);
        startActivity(myIntent);
    }

    public void fbuy2(View view) {
        Intent myIntent = new Intent(this, payment.class);
        startActivity(myIntent);
    }

    public void fbuy3(View view) {
        Intent myIntent = new Intent(this, payment.class);
        startActivity(myIntent);
    }

    public void fbuy4(View view) {
        Intent myIntent = new Intent(this, payment.class);
        startActivity(myIntent);
    }
    public void mback(View view) {
        Intent myIntent = new Intent(this, option.class);
        startActivity(myIntent);
    }

}