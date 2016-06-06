package com.example.AnimalAdoption;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdoptionAddress extends Activity {

    public TextView des;
    public TextView des2;
    public Button Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adoption_address);

        des = (TextView) findViewById(R.id.text_view);
        des2 = (TextView) findViewById(R.id.textView);
        Home = (Button) findViewById(R.id.home);

                Home.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent homeIntent = new Intent(AdoptionAddress.this, AnimalAdoption.class);
                        startActivity(homeIntent);
            }
        });
    }
}