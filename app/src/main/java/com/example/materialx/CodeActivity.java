package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CodeActivity extends AppCompatActivity {
    ImageView back;
    TextView verify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);
        back = findViewById(R.id.back);
        verify = findViewById(R.id.verify);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CodeActivity.this,"Verify",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
