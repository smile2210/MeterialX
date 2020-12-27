package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Cards2Activity extends AppCompatActivity {

    ImageView back;
    LinearLayout basic,overlap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards2);

        basic = findViewById(R.id.basic);
        overlap = findViewById(R.id.overlap);
        back = findViewById(R.id.back);

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cards2Activity.this,BasicActivity.class);
                startActivity(intent);

            }
        });

        overlap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cards2Activity.this,OverlapActivity.class);
                startActivity(intent);

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
