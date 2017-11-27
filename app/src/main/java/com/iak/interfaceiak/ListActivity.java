package com.iak.interfaceiak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView ListBahasa;
    String kodeArray[] = {"Kotlin","Java","Android","dll"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListBahasa = (ListView) findViewById(R.id.ListBahasa);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, R.layout.activity_listview, R.id.textView, kodeArray);

        ListBahasa.setAdapter(arrayAdapter);

        ListBahasa.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
                String selection = kodeArray[arg2];

                Intent lemparan = new Intent(ListActivity.this, InfoActivity.class);
                lemparan.putExtra("nama",selection);
                startActivity(lemparan);
            }
        });

    }
}
