package com.example.AnimalAdoption;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Buddy extends Activity {

    public Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buddy);

        Next = (Button) findViewById(R.id.btn_next);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextIntent1 = new Intent(Buddy.this, AdoptionAddress.class);
                startActivity(nextIntent1);
            }
        });
    }
}
