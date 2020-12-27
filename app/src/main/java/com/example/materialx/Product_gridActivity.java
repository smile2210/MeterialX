package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Product_gridActivity extends AppCompatActivity {

    ImageView back, search, menu;
    RecyclerView productgrid;

    String[] name = new String[]{"Fashion B07 Keara 933","Coup Hoodie Jacket","Gala Suede Jacket Flower","Qonnoq Checked Blouse","Java Seven Belladji 674","Kanvas Sneaker Shoes","Clerks ldamarie Faye Lea","Piero Rush Women"};
    String[] price = new String[]{"$ 48.90","$ 89.00","$ 66.80","$ 34.50","$ 44.90","$ 59.00","$ 78.20","$ 96.00",};
    int[] product = new int[]{R.drawable.bfashion,R.drawable.hoddie,R.drawable.galajacket,R.drawable.qono,R.drawable.java,R.drawable.kanvas,R.drawable.ladyshoes,R.drawable.sneekers};
    List<ModelClass> modelClassList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_grid);

        back = findViewById(R.id.back);
        search = findViewById(R.id.search);
        menu = findViewById(R.id.menu);
        productgrid = findViewById(R.id.productgrid);
        modelClassList = new ArrayList<>();

        for (int i=0; i<name.length; i++){
            ModelClass modelClass = new ModelClass();
            modelClass.setProduct(product[i]);
            modelClass.setName(name[i]);
            modelClass.setPrice(price[i]);
            modelClassList.add(modelClass);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Product_gridActivity.this, "Cart", Toast.LENGTH_SHORT).show();
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(Product_gridActivity.this, menu);
                popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.setting:
                                Toast.makeText(Product_gridActivity.this, "settings", Toast.LENGTH_SHORT).show();
                                break;

                        }

                        return false;
                    }
                });
                popupMenu.show();
            }
        });

        RecyclerView.LayoutManager manager = new GridLayoutManager(Product_gridActivity.this,2,RecyclerView.VERTICAL,false);
        ProductGridAdapter adapter = new ProductGridAdapter(Product_gridActivity.this,modelClassList);
        productgrid.setLayoutManager(manager);
        productgrid.setAdapter(adapter);
    }
}