package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ProfileActivity extends AppCompatActivity {

    LinearLayout polygon,red,blueappbar,fabmenu,cardheader,cardeheaderimage,cardoverlap,wallet,dark;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        polygon = findViewById(R.id.polygon);
        red = findViewById(R.id.red);
        blueappbar = findViewById(R.id.blueappbar);
        fabmenu = findViewById(R.id.fabmenu);
        cardheader = findViewById(R.id.cardheader);
        cardeheaderimage = findViewById(R.id.cardheaderimage);
        cardoverlap = findViewById(R.id.cardoverlap);
        wallet = findViewById(R.id.wallet);
        dark = findViewById(R.id.dark);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        polygon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,PolygonActivity.class);
                startActivity(intent);
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,RedActivity.class);
                startActivity(intent);
            }
        });
        blueappbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,BlueAddapterActivity.class);
                startActivity(intent);
            }
        });
        fabmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,FabmenuActivity.class);
                startActivity(intent);
            }
        });
        cardheader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,CardHeaderActivity.class);
                startActivity(intent);
            }
        });
        cardeheaderimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,CardheaderImageActivity.class);
                startActivity(intent);
            }
        });
        cardoverlap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,OverlapActivity.class);
                startActivity(intent);
            }
        });
        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,Wallet_ProfileActivity.class);
                startActivity(intent);
            }
        });
        dark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,DarkActivity.class);
                startActivity(intent);
            }
        });
    }
}