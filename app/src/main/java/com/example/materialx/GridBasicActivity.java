package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.Collections;

public class GridBasicActivity extends AppCompatActivity {

    ImageView back,search,menu1;
    GridView basicgrid;
    int[] city = new int[]{R.drawable.australia,R.drawable.france,R.drawable.thailand,R.drawable.canada,R.drawable.friend,R.drawable.germany,R.drawable.imageteal,R.drawable.nature,R.drawable.australia,R.drawable.france,R.drawable.thailand,R.drawable.canada,R.drawable.friend,R.drawable.germany,R.drawable.imageteal,R.drawable.nature,R.drawable.australia,R.drawable.france,R.drawable.thailand,R.drawable.canada,R.drawable.friend,R.drawable.germany,R.drawable.imageteal,R.drawable.nature,R.drawable.australia,R.drawable.france,R.drawable.thailand,R.drawable.canada,R.drawable.friend,R.drawable.germany,R.drawable.imageteal,R.drawable.nature,R.drawable.australia,R.drawable.france,R.drawable.thailand,R.drawable.canada,R.drawable.friend,R.drawable.germany,R.drawable.imageteal,R.drawable.nature,R.drawable.australia,R.drawable.france,R.drawable.thailand,R.drawable.canada,R.drawable.friend,R.drawable.germany,R.drawable.imageteal,R.drawable.nature,R.drawable.australia,R.drawable.france,R.drawable.thailand,R.drawable.canada,R.drawable.friend,R.drawable.germany,R.drawable.imageteal,R.drawable.nature,R.drawable.australia,R.drawable.france,R.drawable.thailand,R.drawable.canada,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_basic);

        back = findViewById(R.id.back);
        search = findViewById(R.id.search);
        menu1 = findViewById(R.id.menu);
        basicgrid = findViewById(R.id.basicgrid);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GridBasicActivity.this,"Search",Toast.LENGTH_SHORT).show();
            }
        });

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu = new PopupMenu(GridBasicActivity.this, menu1);
                menu.getMenuInflater().inflate(R.menu.menu, menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.setting:
                                Toast.makeText(GridBasicActivity.this, "settings", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return false;
                    }
                });
                menu.show();
            }
        });

        CustomAdapter customAdapter = new CustomAdapter(GridBasicActivity.this,city);
        basicgrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.imageview),"item"+" "+position+" "+"clicked",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
       basicgrid.setAdapter(customAdapter);
    }
}