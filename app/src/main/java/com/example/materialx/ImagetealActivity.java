package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class ImagetealActivity extends AppCompatActivity {
    TextView signup1;
    ProgressBar progress_bar;
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageteal);

        fab = findViewById(R.id.fab);
        signup1 = findViewById(R.id.signup1);

        signup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.signup1),"Sign up for an account",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

       fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.fab),"Login data Submitted",Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });
    }
}
