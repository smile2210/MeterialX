package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PolygonActivity extends AppCompatActivity {

    ImageView back,search,menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polygon);

        back = findViewById(R.id.back);
        search = findViewById(R.id.search);
        menu = findViewById(R.id.menu);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PolygonActivity.this,"Search",Toast.LENGTH_SHORT).show();
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(PolygonActivity.this,menu);
                popupMenu.getMenuInflater().inflate(R.menu.menu,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.setting:
                                Toast.makeText(PolygonActivity.this,"settings",Toast.LENGTH_SHORT).show();
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });
    }
}