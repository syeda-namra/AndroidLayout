package com.example.namra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("0066","On Create Calling");
        setContentView(R.layout.activity_main);


        Button btnLinearLayout = findViewById(R.id.btn1);
        Button btnRelativeLayout = findViewById(R.id.btn2);
        Button btnAbsoluteLayout = findViewById(R.id.btn3);
        Button btnTableLayout = findViewById(R.id.btn4);
        Button btnFrameLayout = findViewById(R.id.btn5);

        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(i);
            }
        });

        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(i);
            }
        });

        btnAbsoluteLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AbsoluteLayoutActivity.class);
                startActivity(i);
            }
        });


        btnTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TableLayoutActivity.class);
                startActivity(i);
            }
        });


        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FrameLayoutActivity.class);
                startActivity(i);
            }
        });
    }



}