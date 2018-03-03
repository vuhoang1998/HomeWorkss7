package com.example.hoang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.DatabaseMetaData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list_category);

        DatabaseManager.getInstance(this).getListTopic();
    }
}
