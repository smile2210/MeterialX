package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FoodreviewActivity extends AppCompatActivity {

    ImageView back,search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodreview);

        back = findViewById(R.id.back);
        search = findViewById(R.id.search);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoodreviewActivity.this,"search",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
