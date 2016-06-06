package com.example.AnimalAdoption;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BirdsCategory extends Activity {

    public Button Sunny;
    public Button Tweety;
    public Button Tiki;
    public Button Coco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds_category);

        Sunny = (Button) findViewById(R.id.btnBird1);
        Tweety = (Button) findViewById(R.id.btnBird2);
        Tiki = (Button) findViewById(R.id.btnBird3);
        Coco = (Button) findViewById(R.id.btnBird4);

        Sunny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sallyIntent = new Intent(BirdsCategory.this, Sunny.class);
                startActivity(sallyIntent);
            }
        });

        Tweety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mistyIntent = new Intent(BirdsCategory.this, Tweety.class);
                startActivity(mistyIntent);
            }
        });

        Tiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent samIntent = new Intent(BirdsCategory.this, Tiki.class);
                startActivity(samIntent);
            }
        });

        Coco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lucyIntent = new Intent(BirdsCategory.this, Coco.class);
                startActivity(lucyIntent);
            }
        });
    }
}
