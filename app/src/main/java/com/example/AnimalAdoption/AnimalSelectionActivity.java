package com.example.AnimalAdoption;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.AnimalAdoption.R;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.Random;

public class AnimalSelectionActivity extends AppCompatActivity {

    public Button Cats;
    public Button Dogs;
    public Button Reptiles;
    public Button Birds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Cats = (Button) findViewById(R.id.btnCat);
        Dogs = (Button) findViewById(R.id.btnDog);
        Reptiles = (Button) findViewById(R.id.btnReptile);
        Birds = (Button) findViewById(R.id.btnBird);

        Cats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent catIntent = new Intent(AnimalSelectionActivity.this, CatsCategory.class);
                startActivity(catIntent);
            }
        });

        Dogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dogIntent = new Intent(AnimalSelectionActivity.this, DogsCategory.class);
                startActivity(dogIntent);
            }
        });

        Reptiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reptileIntent = new Intent(AnimalSelectionActivity.this, ReptilesCategory.class);
                startActivity(reptileIntent);
            }
        });

        Birds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent birdIntent = new Intent(AnimalSelectionActivity.this, BirdsCategory.class);
                startActivity(birdIntent);
            }
        });
    }

}
