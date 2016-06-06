package com.example.AnimalAdoption;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lucy extends Activity {

    public Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucy);

        Next = (Button) findViewById(R.id.btn_next6);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextIntent6 = new Intent(Lucy.this, AdoptionAddress.class);
                startActivity(nextIntent6);
            }
        });
    }
}
