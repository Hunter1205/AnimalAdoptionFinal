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

public class CatsCategory extends Activity {

    public Button Sally;
    public Button Misty;
    public Button Lucy;
    public Button Sam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cats_category);

        Sally = (Button) findViewById(R.id.btnCat1);
        Misty = (Button) findViewById(R.id.btnCat2);
        Sam = (Button) findViewById(R.id.btnCat3);
        Lucy = (Button) findViewById(R.id.btnCat4);

        Sally.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sallyIntent = new Intent(CatsCategory.this, Sally.class);
                startActivity(sallyIntent);
            }
        });

        Misty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mistyIntent = new Intent(CatsCategory.this, Misty.class);
                startActivity(mistyIntent);
            }
        });

        Sam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent samIntent = new Intent(CatsCategory.this, Sam.class);
                startActivity(samIntent);
            }
        });

        Lucy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lucyIntent = new Intent(CatsCategory.this, Lucy.class);
                startActivity(lucyIntent);
            }
        });
    }
}
