package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    ImageView back, search, menu;
    Button clear, forcestop, uninstall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        back = findViewById(R.id.back);
        search = findViewById(R.id.search);
        menu = findViewById(R.id.menu);
        clear = findViewById(R.id.clear);
        forcestop = findViewById(R.id.forcestop);
        uninstall = findViewById(R.id.uninstall);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Search", Toast.LENGTH_SHORT).show();
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(ThirdActivity.this, menu);
                popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.setting:
                                Toast.makeText(ThirdActivity.this, "settings", Toast.LENGTH_SHORT).show();
                                break;

                        }

                        return false;
                    }
                });
                popupMenu.show();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "clear data", Toast.LENGTH_SHORT).show();
            }
        });

        forcestop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "force stop", Toast.LENGTH_SHORT).show();
            }
        });

        uninstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "uninstall", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
