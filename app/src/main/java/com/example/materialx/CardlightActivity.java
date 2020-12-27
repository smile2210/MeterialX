package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class CardlightActivity extends AppCompatActivity {
    TextView forgot,signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardlight);
        forgot = findViewById(R.id.forgot);
        signin = findViewById(R.id.signin);

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.forgot),"Forgot Password",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
