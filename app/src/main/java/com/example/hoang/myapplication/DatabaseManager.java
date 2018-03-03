package com.example.hoang.myapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.sql.SQLData;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hoang on 3/1/2018.
 */

public class DatabaseManager {

    private static final String TABLE_TOPIC = "tbl_topic";
    private static final String TABLE_WORD = "tbl_word";
    private static final String TAG = "DatabaseManager";

    private static SQLiteDatabase sqLiteDatabase;
    private static AssetHelper assetHelper;

    private static DatabaseManager databaseManager;
    public static DatabaseManager getInstance(Context context){
        if ( databaseManager == null) {
            databaseManager = new DatabaseManager(context);
        }
        return databaseManager;
    }

    public DatabaseManager(Context context) {
        assetHelper = new AssetHelper(context);
    }

    public List<TopicModel> getListTopic(){
        sqLiteDatabase = assetHelper.getReadableDatabase();

        List<TopicModel> topicModelsList = new ArrayList<>();
        Cursor cursor = sqLiteDatabase.rawQuery("select * from " + TABLE_TOPIC,null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()){
            //read data
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String imageUrl = cursor.getString(3);
            String category = cursor.getString(4);
            String color = cursor.getString(5);
            String lastTime = cursor.getString(6);
            //next

            TopicModel topicModel = new TopicModel(id, name, imageUrl, category, color, lastTime);
            topicModelsList.add(topicModel);
            cursor.moveToNext();
        }

        Log.d(TAG, "getListTopic:" + topicModelsList);

        return topicModelsList;
    }
}
