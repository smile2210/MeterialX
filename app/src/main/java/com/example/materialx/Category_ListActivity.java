package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class Category_ListActivity extends AppCompatActivity {
    ImageView back, search, menu;
    RecyclerView grid;
    ListView categorylist;

    int[] icon = new int[]{R.drawable.accessibility, R.drawable.face, R.drawable.child_friendly, R.drawable.king_bed, R.drawable.phonelink, R.drawable.pool, R.drawable.restaurant};
    int[] listicon = new int[]{R.drawable.gray_phonelink, R.drawable.gray_accessibility, R.drawable.gray_face, R.drawable.gray_child_friendly, R.drawable.gray_king_bed, R.drawable.gray_pool, R.drawable.ticket_voucher, R.drawable.gray_restaurant};
    String[] name = new String[]{"Gadgets and Computers", "Fashionn", "Beauty and Health", "Babies and Kids", "Home and Garden", "Sports and Hobby", "Ticket and Voucher", "Service and Food"};
    String[] item = new String[]{"100K Items", "655K Items", "221K Items", "85K Items", "725K Items", "932K Items", "475K Items", "362K Items",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category__list);

        back = findViewById(R.id.back);
        search = findViewById(R.id.search);
        menu = findViewById(R.id.menu);
        grid = findViewById(R.id.grid);
        categorylist = findViewById(R.id.categorylist);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Category_ListActivity.this, "Cart", Toast.LENGTH_SHORT).show();
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(Category_ListActivity.this, menu);
                popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.setting:
                                Toast.makeText(Category_ListActivity.this, "settings", Toast.LENGTH_SHORT).show();
                                break;

                        }

                        return false;
                    }
                });
                popupMenu.show();
            }
        });

        RecyclerView.LayoutManager manager = new GridLayoutManager(Category_ListActivity.this, 1, RecyclerView.HORIZONTAL, false);
        IconAdapter iconAdapter = new IconAdapter(Category_ListActivity.this, icon);
        grid.setLayoutManager(manager);
        grid.setAdapter(iconAdapter);

        CategoryList_Adapter categoryList_adapter = new CategoryList_Adapter(Category_ListActivity.this,listicon,name,item);
        categorylist.setAdapter(categoryList_adapter);
        categorylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Snackbar snackbar = Snackbar.make(view,"item"+" "+name[position]+" "+"clicked",Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });
    }
}