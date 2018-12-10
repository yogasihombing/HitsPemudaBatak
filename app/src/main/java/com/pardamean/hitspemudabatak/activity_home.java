package com.pardamean.hitspemudabatak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_home extends AppCompatActivity {
    Button jenis,marga,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        jenis = (Button) findViewById(R.id.jenis);
        jenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jenis =new Intent(activity_home.this,jenisbatak.class);
                startActivity(jenis);
            }
        });
        marga =(Button) findViewById(R.id.marga);
        marga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent marga =new Intent(activity_home.this,marga.class);
                startActivity(marga);
            }
        });
        about =(Button) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about =new Intent(activity_home.this,about.class);
                startActivity(about);
            }
        });
    }
}
