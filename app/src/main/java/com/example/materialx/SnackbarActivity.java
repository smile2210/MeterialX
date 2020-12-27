package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SnackbarActivity extends AppCompatActivity {
    ImageView back;
    LinearLayout basic,toast,snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);

        back = findViewById(R.id.back);
        basic = findViewById(R.id.basic);
        toast = findViewById(R.id.toast);
        snackbar = findViewById(R.id.snackbar);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SnackbarActivity.this,Basic2Activity.class);
                startActivity(intent);
            }
        });

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SnackbarActivity.this,ToastActivity.class);
                startActivity(intent);
            }
        });

        snackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SnackbarActivity.this,CustomSnackbarActivity2.class);
                startActivity(intent);
            }
        });
    }
}
