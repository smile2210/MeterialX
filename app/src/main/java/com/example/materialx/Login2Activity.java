package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Login2Activity extends AppCompatActivity {
    ImageView back;
    LinearLayout simplelight,simplegreen,imageteal,cardlight,cardoverlap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        back = findViewById(R.id.back);
        simplelight = findViewById(R.id.simplelight);
        simplegreen = findViewById(R.id.simplegreen);
        imageteal = findViewById(R.id.imageteal);
        cardlight = findViewById(R.id.cardlight);
        cardoverlap = findViewById(R.id.cardoverlap);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        simplelight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login2Activity.this,SimplelightActivity.class);
                startActivity(intent);
            }
        });
        simplegreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login2Activity.this,SimplegreenActivity.class);
                startActivity(intent);
            }
        });
        imageteal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login2Activity.this,ImagetealActivity.class);
                startActivity(intent);
            }
        });
        cardlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login2Activity.this,CardlightActivity.class);
                startActivity(intent);

            }
        });
        cardoverlap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login2Activity.this,CardoverlapActivity.class);
                startActivity(intent);

            }
        });
    }
}
