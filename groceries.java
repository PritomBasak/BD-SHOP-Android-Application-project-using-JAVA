package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class groceries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.groceries);
    }



    public void gbuy1(View view) {
        Intent myIntent = new Intent(this, payment.class);
        startActivity(myIntent);
    }

    public void gbuy2(View view) {
        Intent myIntent = new Intent(this, payment.class);
        startActivity(myIntent);
    }

    public void gbuy3(View view) {
        Intent myIntent = new Intent(this, payment.class);
        startActivity(myIntent);
    }

    public void gbuy4(View view) {
        Intent myIntent = new Intent(this, payment.class);
        startActivity(myIntent);
    }

    public void gback(View view) {
        Intent myIntent = new Intent(this, option.class);
        startActivity(myIntent);
    }
}