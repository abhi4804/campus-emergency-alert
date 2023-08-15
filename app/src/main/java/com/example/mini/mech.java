package com.example.mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mech extends AppCompatActivity {
    Button btnfirem,btnambm,btnaccm,btntheftm,btnanm,btnothm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech);
        btnfirem=(Button)findViewById(R.id.bm1);
        btnambm=(Button)findViewById(R.id.bm2);
        btnaccm=(Button)findViewById(R.id.bm3);
        btntheftm=(Button)findViewById(R.id.bm4);
        btnanm=(Button)findViewById(R.id.bm5);
        btnothm=(Button)findViewById(R.id.bm6);
        btnfirem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mech.this,fire.class);
                startActivity(intent);
            }
        });
        btnambm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mech.this,ambulance.class);
                startActivity(intent);
            }
        });
        btnaccm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mech.this,accident.class);
                startActivity(intent);
            }
        });
        btntheftm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mech.this,theft.class);
                startActivity(intent);
            }
        });
        btnanm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mech.this,animalattack.class);
                startActivity(intent);
            }
        });
        btnothm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mech.this,other.class);
                startActivity(intent);
            }
        });
    }
    }
