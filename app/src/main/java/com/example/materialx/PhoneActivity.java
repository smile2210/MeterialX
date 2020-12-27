package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PhoneActivity extends AppCompatActivity {

    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textview);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PhoneActivity.this,"Continue",Toast.LENGTH_SHORT).show();
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PhoneActivity.this,"No, other time",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
