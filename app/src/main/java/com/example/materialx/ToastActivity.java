package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class ToastActivity extends AppCompatActivity {
    ImageView back;
    LinearLayout cardlight,carddark,cardimage,iconerror,iconsuccess,iconinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        back = findViewById(R.id.back);
        cardlight = findViewById(R.id.cardlight);
        carddark = findViewById(R.id.carddark);
        cardimage = findViewById(R.id.cardimage);
        iconerror = findViewById(R.id.iconerror);
        iconsuccess = findViewById(R.id.iconsuccess);
        iconinfo = findViewById(R.id.iconinfo);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cardlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getApplicationContext());
                View view = LayoutInflater.from(ToastActivity.this).inflate(R.layout.card_light,null);
                toast.setView(view);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();

            }
        });

        carddark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getApplicationContext());
                View view = LayoutInflater.from(ToastActivity.this).inflate(R.layout.card_dark,null);
                toast.setView(view);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();

            }
        });

        cardimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getApplicationContext());
                View view = LayoutInflater.from(ToastActivity.this).inflate(R.layout.card_image,null);
                toast.setView(view);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        iconerror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(ToastActivity.this,"This is Error Message",Toast.LENGTH_SHORT).show();
            }
        });

        iconsuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(ToastActivity.this,"Success!",Toast.LENGTH_SHORT).show();
            }
        });

        iconinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.info(ToastActivity.this,"Some info Text Here",Toast.LENGTH_SHORT).show();
            }
        });


    }
}