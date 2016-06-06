package com.example.AnimalAdoption;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DogsCategory extends Activity {

    public Button Max;
    public Button Charlie;
    public Button Buddy;
    public Button Rex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs_category);

        Max = (Button) findViewById(R.id.btnDog1);
        Charlie = (Button) findViewById(R.id.btnDog2);
        Buddy = (Button) findViewById(R.id.btnDog3);
        Rex = (Button) findViewById(R.id.btnDog4);

        Max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sallyIntent = new Intent(DogsCategory.this, Max.class);
                startActivity(sallyIntent);
            }
        });

        Charlie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mistyIntent = new Intent(DogsCategory.this, Charlie.class);
                startActivity(mistyIntent);
            }
        });

        Buddy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent samIntent = new Intent(DogsCategory.this, Buddy.class);
                startActivity(samIntent);
            }
        });

        Rex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lucyIntent = new Intent(DogsCategory.this, Rex.class);
                startActivity(lucyIntent);
            }
        });
    }
}
