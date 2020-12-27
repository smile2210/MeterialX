package com.example.materialx;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout button, cards, grid, list, snackbar, form, profile, shopping, verification, login, dashboard, article, about, chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);
        cards = findViewById(R.id.cards);
        grid = findViewById(R.id.grid);
        list = findViewById(R.id.list);
        snackbar = findViewById(R.id.snackbar);
        form = findViewById(R.id.form);
        profile = findViewById(R.id.profile);
        shopping = findViewById(R.id.shopping);
        verification = findViewById(R.id.verification);
        login = findViewById(R.id.Login);
        dashboard = findViewById(R.id.dashboard);
        article = findViewById(R.id.article);
        about = findViewById(R.id.about);
        chat = findViewById(R.id.chat);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });

        cards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cards2Activity.class);
                startActivity(intent);
            }
        });

        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Form2Activity.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login2Activity.class);
                startActivity(intent);
            }
        });

        article.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ArticalActivity.class);
                startActivity(intent);
            }
        });

        verification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,VerifyActivity.class);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });

        snackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SnackbarActivity.class);
                startActivity(intent);
            }
        });

        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DashBoardActivity.class);
                startActivity(intent);
            }
        });
        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GridActivity.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent);
            }
        });
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ShoppingActivity.class);
                startActivity(intent);
            }
        });
    }

}
