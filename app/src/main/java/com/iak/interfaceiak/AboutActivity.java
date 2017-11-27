package com.iak.interfaceiak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void lanjut(View view) {
        Intent pindah = new Intent(this, ListActivity.class);
        startActivity(pindah);
    }
}
