package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Category_ImageActivity extends AppCompatActivity {

    ImageView back, search, menu;
    RecyclerView categoryimage;

    String[] name = new String[]{"Gadgets and Computers", "Fashionn", "Beauty and Health", "Babies and Kids", "Home and Garden", "Sports and Hobby", "Ticket and Voucher", "Service and Food"};
    String[] item = new String[]{"100K Items", "655K Items", "221K Items", "85K Items", "725K Items", "932K Items", "475K Items", "362K Items",};
    int[] background = new int[]{R.drawable.gadgets,R.drawable.fashion,R.drawable.beauty,R.drawable.baies,R.drawable.garden,R.drawable.sports,R.drawable.tickets,R.drawable.food,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category__image);

        back = findViewById(R.id.back);
        search = findViewById(R.id.search);
        menu = findViewById(R.id.menu);
        categoryimage = findViewById(R.id.categoryimage);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Category_ImageActivity.this, "Cart", Toast.LENGTH_SHORT).show();
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(Category_ImageActivity.this, menu);
                popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.setting:
                                Toast.makeText(Category_ImageActivity.this, "settings", Toast.LENGTH_SHORT).show();
                                break;

                        }

                        return false;
                    }
                });
                popupMenu.show();
            }
        });

        RecyclerView.LayoutManager manager = new LinearLayoutManager(Category_ImageActivity.this,RecyclerView.VERTICAL,false);
        ImageAdapter imageAdapter = new ImageAdapter(Category_ImageActivity.this,name,item,background);

        categoryimage.setLayoutManager(manager);
        categoryimage.setAdapter(imageAdapter);
    }
}