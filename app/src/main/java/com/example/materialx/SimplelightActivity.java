package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class SimplelightActivity extends AppCompatActivity {

    TextView forgot,signup;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplelight);

        forgot = findViewById(R.id.forgot);
        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.forgot),"Forgot Password",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.signup),"Sign Up",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

    }
}
