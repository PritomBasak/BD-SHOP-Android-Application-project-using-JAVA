package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class option extends AppCompatActivity {
    RadioGroup myRadioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option);
        myRadioGroup=findViewById(R.id.radiobtnId);
    }


    public void cnextID(View view) {
        if (myRadioGroup.getCheckedRadioButtonId() == R.id.groceId) {
            Intent myIntent = new Intent(this, groceries.class);
            startActivity(myIntent);
        }
        else if (myRadioGroup.getCheckedRadioButtonId() == R.id.mediId){
            Intent myIntent = new Intent(this, Medicine.class);
            startActivity(myIntent);
        }
        else
        {
            Intent myIntent = new Intent(this, fashion.class);
            startActivity(myIntent);
        }
    }

    public void cbackID(View view) {
        Intent myIntent = new Intent(this, login.class);
        startActivity(myIntent);
    }
}