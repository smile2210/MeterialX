package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class SimplegreenActivity extends AppCompatActivity {
    Button signin;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplegreen);

        signin = findViewById(R.id.signin);
        signup = findViewById(R.id.signup);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.signup),"Sign up for an account",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
    }
}
