package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class TowLineActivity extends AppCompatActivity {
    ImageView back,search,menu1;
    GridView twogrid;

    String[] t2 = new String[]{"01 Jan 2016","05 Dec 2015","23 Jun 2015","20 Jul 2015","10 Nov 2015","11 Feb 2015","29 Aug 2014","22 Apr 2013","09 Mar 2015","01 Jan 2016","05 Dec 2015","23 Jun 2015","20 Jul 2015","10 Nov 2015","11 Feb 2015","29 Aug 2014","22 Apr 2013","09 Mar 2015",};
    String[] t1 = new String[]{"Nature","City Building","Street","Friends","Hanging Clothes","Mountain","City Night","Park","quots","Nature","City Building","Street","Friends","Hanging Clothes","Mountain","City Night","Park","quots",};
    int[] i1 = new int[]{R.drawable.nature,R.drawable.imageteal,R.drawable.germany,R.drawable.friend,R.drawable.canada,R.drawable.thailand,R.drawable.france,R.drawable.australia,R.drawable.basic1,R.drawable.nature,R.drawable.imageteal,R.drawable.germany,R.drawable.friend,R.drawable.canada,R.drawable.thailand,R.drawable.france,R.drawable.australia,R.drawable.basic1,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tow_line);

        back = findViewById(R.id.back);
        search = findViewById(R.id.search);
        menu1 = findViewById(R.id.menu);
        twogrid = findViewById(R.id.twogrid);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TowLineActivity.this,"Search",Toast.LENGTH_SHORT).show();
            }
        });

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu = new PopupMenu(TowLineActivity.this, menu1);
                menu.getMenuInflater().inflate(R.menu.menu, menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.setting:
                                Toast.makeText(TowLineActivity.this, "settings", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return false;
                    }
                });
                menu.show();
            }
        });

        final TwoAdapter twoAdapter = new TwoAdapter(TowLineActivity.this,i1,t1,t2);
        twogrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Snackbar snackbar = Snackbar.make(view,t1[position]+" "+"clicked",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
        twogrid.setAdapter(twoAdapter);


    }
}