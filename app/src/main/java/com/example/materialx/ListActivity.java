package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ListActivity extends AppCompatActivity {

    ImageView back;
    LinearLayout basic,basichorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        basic = findViewById(R.id.basic);
        basichorizontal = findViewById(R.id.basichorizontal);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this,List_BasicActivity.class);
                startActivity(intent);

            }
        });
        basichorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this,List_HorizontalActivity.class);
                startActivity(intent);

            }
        });
    }
}