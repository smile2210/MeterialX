package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class DashBoardActivity extends AppCompatActivity {

    ImageView back;
    LinearLayout statistic,paybill,flight,wallet,walletgreen,finance,crypto,travel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        back = findViewById(R.id.back);
        statistic = findViewById(R.id.statistic);
        paybill = findViewById(R.id.paybill);
        flight = findViewById(R.id.flight);
        wallet = findViewById(R.id.wallet);
        walletgreen = findViewById(R.id.walletgreen);
        finance = findViewById(R.id.finance);
        crypto = findViewById(R.id.crypto);
        travel = findViewById(R.id.travel);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        statistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoardActivity.this,StatisticActivity.class));
            }
        });
        paybill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoardActivity.this,PaybillActivity.class));
            }
        });
        flight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoardActivity.this,FlightActivity.class));
            }
        });
        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoardActivity.this,WalletActivity.class));
            }
        });
        walletgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoardActivity.this,WalletgreenActivity.class));
            }
        });
        finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoardActivity.this,FinanceActivity.class));
            }
        });
        crypto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoardActivity.this,CryptoActivity.class));
            }
        });
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoardActivity.this,TravelActivity.class));
            }
        });

    }
}