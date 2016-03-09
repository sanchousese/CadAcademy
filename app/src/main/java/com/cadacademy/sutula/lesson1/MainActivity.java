package com.cadacademy.sutula.lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rlBackground;

    Button btnRed;
    Button btnYellow;
    Button btnGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rlBackground = (RelativeLayout) findViewById(R.id.rlBackground);
        btnRed = (Button) findViewById(R.id.btnRed);
        btnYellow = (Button) findViewById(R.id.btnYellow);
        btnGreen = (Button) findViewById(R.id.btnGreen);


        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rlBackground.setBackgroundResource(R.color.red);
            }
        });

        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rlBackground.setBackgroundResource(R.color.yellow);
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rlBackground.setBackgroundResource(R.color.green);
            }
        });
    }
}
