package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class WalletActivity extends AppCompatActivity {

    ImageView back,refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);

        back = findViewById(R.id.back);
        refresh = findViewById(R.id.refresh);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WalletActivity.this, "Refresh", Toast.LENGTH_SHORT).show();
            }
        });
    }
}