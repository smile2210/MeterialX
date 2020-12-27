package com.example.materialx;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BasicActivity extends AppCompatActivity {

    ImageView back,search,menu1;
    TextView share,explore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        back = findViewById(R.id.back);
        search = findViewById(R.id.search);
        menu1 = findViewById(R.id.menu1);
        share = findViewById(R.id.share);
        explore = findViewById(R.id.explore);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BasicActivity.this,"Share",Toast.LENGTH_SHORT).show();
            }
        });
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BasicActivity.this,"Explore",Toast.LENGTH_SHORT).show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BasicActivity.this,"Search",Toast.LENGTH_SHORT).show();
            }
        });

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu = new PopupMenu(BasicActivity.this,menu1);
                menu.getMenuInflater().inflate(R.menu.menu,menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.setting:
                                Toast.makeText(BasicActivity.this,"settings",Toast.LENGTH_SHORT).show();
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
