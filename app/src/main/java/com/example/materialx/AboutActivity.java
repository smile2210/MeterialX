package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AboutActivity extends AppCompatActivity {

    ImageView back;
    LinearLayout app,company,companycard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        back = findViewById(R.id.back);
        app = findViewById(R.id.app);
        company = findViewById(R.id.company);
        companycard = findViewById(R.id.companycard);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this,AppActivity.class);
                startActivity(intent);
            }
        });

        company.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this,CompanyActivity.class);
                startActivity(intent);
            }
        });

        companycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this,CompanycardActivity.class);
                startActivity(intent);
            }
        });
    }
}
