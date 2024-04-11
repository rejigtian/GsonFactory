package com.hjq.gson.factory.demo;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.hjq.bar.OnTitleBarListener;
import com.hjq.bar.TitleBar;
import com.hjq.gson.factory.GsonFactory;
import com.test.rejig.SimpleData;
import com.test.rejig.SimpleData2;
import com.test.rejig.SimpleJavaData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TitleBar titleBar = findViewById(R.id.tb_main_bar);
        titleBar.setOnTitleBarListener(new OnTitleBarListener() {
            @Override
            public void onTitleClick(TitleBar titleBar) {
                Gson gson = GsonFactory.getSingletonGson();
                Log.e("test log", "onTitleClick: " + SimpleData.class.getName() );
                Log.e("test log", "onTitleClick: " + SimpleData2.class.getName() );
                Log.e("test log", "onTitleClick: " + SimpleJavaData.class.getName() );
                SimpleData simpleData = gson.fromJson("{}", SimpleData.class);
                Log.e("test log", "onTitleClick: " + SimpleData.class.getName() );
            }
        });
    }
}