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

public class List_BasicActivity extends AppCompatActivity {

    ImageView back,search,menu1;
    ListView list;

    String[] name = new String[]{"Betty L","Roberts Turner","Andarson Thomas","Roberts","Kevin John","Elizabeth","Susan Lee","Evnas Collins","Garcia Lewis","Laura Michelle","Betty C","Adams Green","Mary Jackson","Sarah Scott","Betty L","Roberts Turner","Andarson Thomas","Roberts","Kevin John","Elizabeth","Susan Lee","Evnas Collins","Garcia Lewis","Laura Michelle","Betty C","Adams Green","Mary Jackson","Sarah Scott",};
    int[] pic = new int[]{R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,R.drawable.pic7,R.drawable.pic8,R.drawable.pic9,R.drawable.pic10,R.drawable.pic11,R.drawable.pic12,R.drawable.blue,R.drawable.card,R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,R.drawable.pic7,R.drawable.pic8,R.drawable.pic9,R.drawable.pic10,R.drawable.pic11,R.drawable.pic12,R.drawable.blue,R.drawable.card,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__basic);

        back = findViewById(R.id.back);
        search = findViewById(R.id.search);
        menu1 = findViewById(R.id.menu1);
        list = findViewById(R.id.list);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(List_BasicActivity.this,"Search",Toast.LENGTH_SHORT).show();
            }
        });

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu menu = new PopupMenu(List_BasicActivity.this,menu1);
                menu.getMenuInflater().inflate(R.menu.menu,menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.setting:
                                Toast.makeText(List_BasicActivity.this,"settings",Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return false;
                    }
                });
                menu.show();

            }
        });

        ListAdapter listAdapter = new ListAdapter(List_BasicActivity.this,name,pic);
        list.setAdapter(listAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.list),"item"+" "+name[position]+" "+"clicked",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
    }
}