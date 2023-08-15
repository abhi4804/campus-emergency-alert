package com.example.mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class otherblock extends AppCompatActivity {
    Button btnfire,btnamb,btnacc,btntheft,btnot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otherblock);
        btnfire=(Button)findViewById(R.id.b1);
        btnamb=(Button)findViewById(R.id.b2);
        btnacc=(Button)findViewById(R.id.b3);
        btntheft=(Button)findViewById(R.id.b4);
        btnot=(Button)findViewById(R.id.b5);
        btnfire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(otherblock.this,fire.class);
                startActivity(intent);
            }
        });
        btnamb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(otherblock.this,ambulance.class);
                startActivity(intent);
            }
        });
        btnacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(otherblock.this,accident.class);
                startActivity(intent);
            }
        });
        btntheft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(otherblock.this,theft.class);
                startActivity(intent);
            }
        });
        btnot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(otherblock.this,other.class);
                startActivity(intent);
            }
        });
    }
}