package com.example.materialx;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Form3Activity extends AppCompatActivity {

    ImageView back,notification,menu,done;
    EditText age,gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form3);

        back = findViewById(R.id.back);
        notification = findViewById(R.id.notification);
        menu = findViewById(R.id.menu);
        done = findViewById(R.id.done);
        age = findViewById(R.id.age);
        gender = findViewById(R.id.gender);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Form3Activity.this,"Notification",Toast.LENGTH_SHORT).show();
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(Form3Activity.this,menu);
                popupMenu.getMenuInflater().inflate(R.menu.menu,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.setting:
                                Toast.makeText(Form3Activity.this,"settings",Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Form3Activity.this,"Done",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
