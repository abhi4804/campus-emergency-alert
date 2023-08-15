package com.example.mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnh,btnnb,btncv,btnmb,btnbt,btnsc,btno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnh=(Button)findViewById(R.id.btn_eight);
        btnnb=(Button)findViewById(R.id.btn_nine);
        btncv=(Button)findViewById(R.id.btn_six);
        btnmb=(Button)findViewById(R.id.btn_seven);
        btnbt=(Button)findViewById(R.id.btn_three);
        btnsc=(Button)findViewById(R.id.btn_four);
        btno=(Button)findViewById(R.id.btn_one);
        btnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,heat.class);
                startActivity(intent);
            }
        });
        btnnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,newblock.class);
                startActivity(intent);
            }
        });
        btncv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,civil.class);
                startActivity(intent);
            }
        });
        btnmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,mech.class);
                startActivity(intent);
            }
        });
        btnbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,biotech.class);
                startActivity(intent);
            }
        });
        btnsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,science.class);
                startActivity(intent);
            }
        });
        btno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,otherblock.class);
                startActivity(intent);
            }
        });

    }


}