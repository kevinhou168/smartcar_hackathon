package com.example.cargo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class namesetup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namesetup);

        Button begintrip = findViewById(R.id.begintrip);
        begintrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDriving();
            }
        });

        Button back2 = findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBackToSetup();
            }
        });

    }

    private void goToDriving() {
        Intent intent = new Intent(this, Driving.class);
        startActivity(intent);
    }


    private void goBackToSetup() {
        Intent intent = new Intent(this, Setup.class);
        startActivity(intent);
    }
}
