package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Switch;
import android.widget.Toast;

public class FabmenuActivity extends AppCompatActivity {
    ImageView back,menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabmenu);

        back = findViewById(R.id.back);
        menu = findViewById(R.id.menu);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(FabmenuActivity.this,menu);
                popupMenu.getMenuInflater().inflate(R.menu.menu,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.setting:
                                Toast.makeText(FabmenuActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });

    }
}