package com.iak.interfaceiak;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String parameter;
        parameter = getIntent().getStringExtra("nama");

        ImageView logo = (ImageView) findViewById(R.id.logo);
        TextView title = (TextView) findViewById(R.id.title);
        TextView description = (TextView) findViewById(R.id.description);

        if(parameter.equals("Kotlin")){
            title.setText("Kotlin");
            logo.setImageResource(R.drawable.kotlin);
        }
        if(parameter.equals("Java")){
            title.setText("Java");
//            logo.setImageResource(R.drawable.android);
        }
        if(parameter.equals("Android")){
            title.setText("Android");

            String uri = "@drawable/android";
            int imgRes = getResources().getIdentifier(uri,null,getPackageName());
            Drawable res = getResources().getDrawable(imgRes);
            logo.setImageDrawable(res);
        }
        if(parameter.equals("dll")){
            title.setText("dll");
        }

    } // End Void onCreate
}
