package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class CompanycardActivity extends AppCompatActivity {
    ImageView menu1,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companycard);
        menu1 = findViewById(R.id.menu1);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu = new PopupMenu(CompanycardActivity.this,menu1);
                menu.getMenuInflater().inflate(R.menu.menu,menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.setting:
                                Toast.makeText(CompanycardActivity.this,"settings",Toast.LENGTH_SHORT).show();
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
