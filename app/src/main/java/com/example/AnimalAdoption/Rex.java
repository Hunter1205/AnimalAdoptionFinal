package com.example.AnimalAdoption;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rex extends Activity {

    public Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rex);

        Next = (Button) findViewById(R.id.btn_next9);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextIntent9 = new Intent(Rex.this, AdoptionAddress.class);
                startActivity(nextIntent9);
            }
        });
    }
}
