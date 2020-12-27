package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class CryptoActivity extends AppCompatActivity {

    ImageView back,refresh,menu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto);

        back = findViewById(R.id.back);
        refresh = findViewById(R.id.search);
        menu1 = findViewById(R.id.menu1);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CryptoActivity.this, "Refresh", Toast.LENGTH_SHORT).show();
            }
        });

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu = new PopupMenu(CryptoActivity.this,menu1);
                menu.getMenuInflater().inflate(R.menu.menu,menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.setting:
                                Toast.makeText(CryptoActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return false;
                    }
                });
                menu.show();

            }
        });
    }
}