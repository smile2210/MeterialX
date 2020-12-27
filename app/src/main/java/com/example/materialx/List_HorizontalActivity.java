package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class List_HorizontalActivity extends AppCompatActivity {

    ImageView back, search, menu1;
    ListView horizontal;
    int[] news = new int[]{R.string.xyz, R.string.abc, R.string.company1, R.string.company2, R.string.xyz, R.string.abc, R.string.company1, R.string.company2,};
    int[] pic = new int[]{R.drawable.australia, R.drawable.france, R.drawable.thailand, R.drawable.canada, R.drawable.friend, R.drawable.germany, R.drawable.imageteal, R.drawable.nature,};
    String[] text1 = new String[]{"Business", "politics", "entertainment", "science", "sport", "politics", "entertainment", "science"};
    String[] text2 = new String[]{"Mon, 22 Apr 13, 06:12PM", "Tue, 12 Mar 13, 08:24PM", "Wed, 02 May 13, 11:12AM", "Thr, 15 Jun 13, 08:12PM", "Fri, 22 Apr 13, 06:12PM", "Sat, 22 Oct 15, 07:12AM", "Sun, 02 May 13, 11:12AM", "Thr, 15 Jun 13, 08:12PM",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__horizontal);

        back = findViewById(R.id.back);
        search = findViewById(R.id.search);
        menu1 = findViewById(R.id.menu1);
        horizontal = findViewById(R.id.horizontal);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(List_HorizontalActivity.this, "Search", Toast.LENGTH_SHORT).show();
            }
        });

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu = new PopupMenu(List_HorizontalActivity.this, menu1);
                menu.getMenuInflater().inflate(R.menu.menu, menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.setting:
                                Toast.makeText(List_HorizontalActivity.this, "settings", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return false;
                    }
                });
                menu.show();
            }
        });

        List_hori_Adapter list_hori_adapter = new List_hori_Adapter(List_HorizontalActivity.this,news,pic,text1,text2);
        horizontal.setAdapter(list_hori_adapter);

        horizontal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.horizontal), "item" + " " +news[position]+ " " + "clicked", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });

    }
}