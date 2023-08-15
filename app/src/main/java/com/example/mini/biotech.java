package com.example.mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class biotech extends AppCompatActivity {
    Button btnfire1,btnamb1,btnacc1,btntheft1,btnauto,btnother;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biotech);
        btnfire1=(Button)findViewById(R.id.bb1);
        btnamb1=(Button)findViewById(R.id.bb2);
        btnacc1=(Button)findViewById(R.id.bb3);
        btntheft1=(Button)findViewById(R.id.bb4);
        btnauto=(Button)findViewById(R.id.bb5);
        btnother=(Button)findViewById(R.id.bb6);
        btnfire1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(biotech.this,fire.class);
                startActivity(intent);
            }
        });
        btnamb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(biotech.this,ambulance.class);
                startActivity(intent);
            }
        });
        btnacc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(biotech.this,accident.class);
                startActivity(intent);
            }
        });
        btntheft1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(biotech.this,theft.class);
                startActivity(intent);
            }
        });
        btnauto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(biotech.this,fire.class);
                startActivity(intent);
            }
        });
        btnother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(biotech.this,other.class);
                startActivity(intent);
            }
        });
    }


}
