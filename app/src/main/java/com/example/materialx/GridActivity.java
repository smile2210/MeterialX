package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class GridActivity extends AppCompatActivity {

    ImageView back;
    LinearLayout basic,towline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        back = findViewById(R.id.back);
        basic = findViewById(R.id.basic);
        towline = findViewById(R.id.towline);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GridActivity.this,GridBasicActivity.class);
                startActivity(intent);
            }
        });

        towline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GridActivity.this,TowLineActivity.class);
                startActivity(intent);
            }
        });
    }
}