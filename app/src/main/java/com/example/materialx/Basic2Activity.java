package com.example.materialx;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import es.dmoral.toasty.Toasty;


public class Basic2Activity extends AppCompatActivity {
    ImageView back, search, menu;
    Button simple1,layout,colored,simple2,action,indefinite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic2);

        back = findViewById(R.id.back);
        search = findViewById(R.id.search);
        menu = findViewById(R.id.menu);
        simple1 = findViewById(R.id.simple1);
        layout = findViewById(R.id.layout);
        colored = findViewById(R.id.colored);
        simple2 = findViewById(R.id.simple2);
        action = findViewById(R.id.action);
        indefinite = findViewById(R.id.indefinite);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Basic2Activity.this, "Search", Toast.LENGTH_SHORT).show();
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(Basic2Activity.this, menu);
                popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.setting:
                                Toast.makeText(Basic2Activity.this, "settings", Toast.LENGTH_SHORT).show();
                                break;

                        }

                        return false;
                    }
                });
                popupMenu.show();
            }
        });

        simple1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Basic2Activity.this,"Simple Toast",Toast.LENGTH_SHORT).show();
            }
        });

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getApplicationContext());
                View view = LayoutInflater.from(Basic2Activity.this).inflate(R.layout.custom_toast,null);
                TextView tostTextview = view.findViewById(R.id.custom);
                tostTextview.setText("Custom Toast!");
                toast.setView(view);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        colored.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getApplicationContext());
                View view = LayoutInflater.from(Basic2Activity.this).inflate(R.layout.custom_toast2,null);
                TextView tostTextview = view.findViewById(R.id.custom1);
                tostTextview.setText("Custom Toast!");
                toast.setView(view);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        simple2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.simple2),"Simple Snackbar",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.action),"Snackbar with action",Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Snackbar snackbar1 = Snackbar.make(findViewById(R.id.action), "UNDO CLICKED!",Snackbar.LENGTH_LONG);
                                snackbar1.show();
                            }
                        });
                snackbar.show();
            }
        });

        indefinite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.indefinite),"Snackbar with Action INDEFINITE",Snackbar.LENGTH_INDEFINITE)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Snackbar snackbar1 = Snackbar.make(findViewById(R.id.indefinite), "UNDO CLICKED!",Snackbar.LENGTH_LONG);
                                snackbar1.show();
                            }
                        });
                snackbar.show();
            }
        });
    }
}
