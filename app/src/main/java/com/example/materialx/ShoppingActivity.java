package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ShoppingActivity extends AppCompatActivity {
    ImageView back;
    LinearLayout list,image,grid,details,checkout,onepage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        back = findViewById(R.id.back);
        list = findViewById(R.id.list);
        image = findViewById(R.id.image);
        grid = findViewById(R.id.grid);
        details = findViewById(R.id.details);
        checkout = findViewById(R.id.checkout);
        onepage = findViewById(R.id.onepage);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,Category_ListActivity.class);
                startActivity(intent);
            }
        });
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,Category_ImageActivity.class);
                startActivity(intent);
            }
        });
        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,Product_gridActivity.class);
                startActivity(intent);
            }
        });
    }
}