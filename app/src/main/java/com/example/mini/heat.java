package com.example.mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class heat extends AppCompatActivity {
    Button btnfireh,btnambh,btnacch,btnthefth,btnrag,btnotherh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heat);
        btnfireh=(Button)findViewById(R.id.bh1);
        btnambh=(Button)findViewById(R.id.bh2);
        btnacch=(Button)findViewById(R.id.bh3);
        btnthefth=(Button)findViewById(R.id.bh4);
        btnrag=(Button)findViewById(R.id.bh5);
        btnotherh=(Button)findViewById(R.id.bh6);
        btnfireh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(heat.this,fire.class);
                startActivity(intent);
            }
        });
        btnambh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(heat.this,ambulance.class);
                startActivity(intent);
            }
        });
        btnacch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(heat.this,accident.class);
                startActivity(intent);
            }
        });
        btnthefth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(heat.this,theft.class);
                startActivity(intent);
            }
        });
        btnrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(heat.this,fire.class);
                startActivity(intent);
            }
        });
        btnotherh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(heat.this,other.class);
                startActivity(intent);
            }
        });
    }
}