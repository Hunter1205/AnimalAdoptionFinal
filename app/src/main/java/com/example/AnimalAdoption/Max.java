package com.example.AnimalAdoption;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Max extends Activity {

    public Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_max);

        Next = (Button) findViewById(R.id.btn_next7);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextIntent7 = new Intent(Max.this, AdoptionAddress.class);
                startActivity(nextIntent7);
            }
        });
    }
}
