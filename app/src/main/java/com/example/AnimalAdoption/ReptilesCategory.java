package com.example.AnimalAdoption;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class ReptilesCategory extends Activity {

        public Button Karl;
        public Button Earl;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_reptiles_category);

            Karl = (Button) findViewById(R.id.btnReptile1);
            Earl = (Button) findViewById(R.id.btnReptile2);

            Karl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent karlIntent = new Intent(ReptilesCategory.this, Karl.class);
                    startActivity(karlIntent);
                }
            });

            Earl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent earlIntent = new Intent(ReptilesCategory.this, Earl.class);
                    startActivity(earlIntent);
                }
            });
     }
}
