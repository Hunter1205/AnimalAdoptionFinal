package com.example.AnimalAdoption;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sam extends Activity {

    public Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sam);

        Next = (Button) findViewById(R.id.btn_next11);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextIntent11 = new Intent(Sam.this, AdoptionAddress.class);
                startActivity(nextIntent11);
            }
        });
    }
}
