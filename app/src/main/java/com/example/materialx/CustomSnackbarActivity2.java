package com.example.materialx;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class CustomSnackbarActivity2 extends AppCompatActivity {

    ImageView back;
    LinearLayout primarycolor,accentaction,cardlight,carddark,cardimage,textmiddle,iconerror,iconsuccess,iconinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_snackbar2);

        back = findViewById(R.id.back);
        primarycolor = findViewById(R.id.primarycolor);
        accentaction = findViewById(R.id.accentaction);
        cardlight = findViewById(R.id.cardlight);
        carddark = findViewById(R.id.carddark);
        cardimage = findViewById(R.id.cardimage);
        textmiddle = findViewById(R.id.textmiddle);
        iconerror = findViewById(R.id.iconerror);
        iconsuccess = findViewById(R.id.iconsuccess);
        iconinfo = findViewById(R.id.iconinfo);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        primarycolor.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.primarycolor),"Snackbar Primary",Snackbar.LENGTH_SHORT);
                 snackbar.setBackgroundTint(getColor(R.color.colorPrimary));
                snackbar.show();

            }
        });

        accentaction.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.accentaction),"Snackbar Primary Action",Snackbar.LENGTH_LONG);
                snackbar.setBackgroundTint(getColor(R.color.pink));
                snackbar.setActionTextColor(getColor(R.color.white));
                snackbar.setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar snackbar1 = Snackbar.make(findViewById(R.id.accentaction),"UNDO CLICKED!",Snackbar.LENGTH_SHORT);
                        snackbar1.setBackgroundTint(getColor(R.color.pink));
                        snackbar1.show();
                    }
                });
                snackbar.show();
            }
        });

        cardlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Snackbar snackbar = Snackbar.make(findViewById(R.id.cardlight),"",Snackbar.LENGTH_LONG);
                View custom = getLayoutInflater().inflate(R.layout.snack_light,null);

                snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
                Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
                snackbarLayout.setPadding(0,0,0,0);

                (custom.findViewById(R.id.undo)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"UNDO Clicked!",Toast.LENGTH_SHORT).show();
                        snackbar.dismiss();
                    }
                });

                snackbarLayout.addView(custom,0);
                snackbar.show();

            }
        });

        carddark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Snackbar snackbar = Snackbar.make(findViewById(R.id.cardlight),"",Snackbar.LENGTH_LONG);
                View custom = getLayoutInflater().inflate(R.layout.snack_dark,null);

                snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
                Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
                snackbarLayout.setPadding(0,0,0,0);

                (custom.findViewById(R.id.undo)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"UNDO Clicked!",Toast.LENGTH_SHORT).show();
                        snackbar.dismiss();
                    }
                });

                snackbarLayout.addView(custom,0);
                snackbar.show();
            }
        });

        cardimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Snackbar snackbar = Snackbar.make(findViewById(R.id.cardlight),"",Snackbar.LENGTH_LONG);
                View custom = getLayoutInflater().inflate(R.layout.snack_image,null);

                snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
                Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
                snackbarLayout.setPadding(0,0,0,0);

                (custom.findViewById(R.id.undo)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"UNDO Clicked!",Toast.LENGTH_SHORT).show();
                        snackbar.dismiss();
                    }
                });

                snackbarLayout.addView(custom,0);
                snackbar.show();
            }
        });

        textmiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.textmiddle),"Snackbar Text Center",Snackbar.LENGTH_LONG);
                Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
                snackbarLayout.setPadding(185,0,0,0);
                snackbar.show();
            }
        });
    }
}