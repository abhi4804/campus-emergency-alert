package com.example.mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class civil extends AppCompatActivity {
    Button btnfirec,btnambc,btnaccc,btntheftc,btnequ,btnotc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);
        btnfirec=(Button)findViewById(R.id.bc1);
        btnambc=(Button)findViewById(R.id.bc2);
        btnaccc=(Button)findViewById(R.id.bc3);
        btntheftc=(Button)findViewById(R.id.bc4);
        btnequ=(Button)findViewById(R.id.bc5);
        btnotc=(Button)findViewById(R.id.bc6);
        btnfirec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(civil.this,fire.class);
                startActivity(intent);
            }
        });
        btnambc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(civil.this,ambulance.class);
                startActivity(intent);
            }
        });
        btnaccc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(civil.this,accident.class);
                startActivity(intent);
            }
        });
        btntheftc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(civil.this,theft.class);
                startActivity(intent);
            }
        });
        btnequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(civil.this,equipmentdamage.class);
                startActivity(intent);
            }
        });
        btnotc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(civil.this,other.class);
                startActivity(intent);
            }
        });
    }
}