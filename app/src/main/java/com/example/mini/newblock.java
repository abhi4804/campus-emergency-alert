package com.example.mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newblock extends AppCompatActivity {
    Button btnfirenb,btnambnb,btnaccnb,btntheftnb,btnothernb,btnlift;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newblock);
        btnfirenb=(Button)findViewById(R.id.bn1);
        btnambnb=(Button)findViewById(R.id.bn2);
        btnaccnb=(Button)findViewById(R.id.bn3);
        btntheftnb=(Button)findViewById(R.id.bn4);
        btnlift=(Button)findViewById(R.id.bn5);
        btnothernb=(Button)findViewById(R.id.bn6);
        btnfirenb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(newblock.this,fire.class);
                startActivity(intent);
            }
        });
        btnambnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(newblock.this,ambulance.class);
                startActivity(intent);
            }
        });
        btnaccnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(newblock.this,accident.class);
                startActivity(intent);
            }
        });
        btntheftnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(newblock.this,theft.class);
                startActivity(intent);
            }
        });
        btnlift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(newblock.this,stucklift.class);
                startActivity(intent);
            }
        });
        btnothernb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(newblock.this,other.class);
                startActivity(intent);
            }
        });
    }
}