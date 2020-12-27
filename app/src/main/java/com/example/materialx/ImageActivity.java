package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;

public class ImageActivity extends AppCompatActivity {
    Button continue1;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        continue1 = findViewById(R.id.continue1);
        back = findViewById(R.id.back);

        continue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.continue1),"Continue",Snackbar.LENGTH_LONG);
                snackbar.show();
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
