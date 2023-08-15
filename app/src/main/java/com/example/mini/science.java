package com.example.mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class science extends AppCompatActivity {
    Button btnfires,btnambs,btnaccs,btnthefts,btnots,btnchem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        btnfires=(Button)findViewById(R.id.bs1);
        btnambs=(Button)findViewById(R.id.bs2);
        btnaccs=(Button)findViewById(R.id.bs3);
        btnthefts=(Button)findViewById(R.id.bs4);
        btnots=(Button)findViewById(R.id.bs6);
        btnchem=(Button)findViewById(R.id.bs5);
        btnfires.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(science.this,fire.class);
                startActivity(intent);
            }
        });
        btnambs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(science.this,ambulance.class);
                startActivity(intent);
            }
        });
        btnaccs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(science.this,accident.class);
                startActivity(intent);
            }
        });
        btnthefts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(science.this,theft.class);
                startActivity(intent);
            }
        });
        btnots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(science.this,other.class);
                startActivity(intent);
            }
        });
        btnchem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(science.this,chemical.class);
                startActivity(intent);
            }
        });
    }
    }
