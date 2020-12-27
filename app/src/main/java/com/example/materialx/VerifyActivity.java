package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class VerifyActivity extends AppCompatActivity {
    ImageView back;
    LinearLayout phone,code,image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        back = findViewById(R.id.back);
        phone = findViewById(R.id.phone);
        code = findViewById(R.id.code);
        image = findViewById(R.id.image);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyActivity.this,PhoneActivity.class);
                startActivity(intent);

            }
        });

        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyActivity.this,CodeActivity.class);
                startActivity(intent);

            }
        });

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyActivity.this,ImageActivity.class);
                startActivity(intent);
            }
        });
    }
}
