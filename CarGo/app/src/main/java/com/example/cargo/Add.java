package com.example.cargo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Button addperson = findViewById(R.id.addperson);
        addperson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDriving3();
            }
        });


    }

    private void goToDriving3() {
        Intent intent = new Intent(this, Driving3.class);
        startActivity(intent);
    }


}
