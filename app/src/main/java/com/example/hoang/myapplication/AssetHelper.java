package com.example.hoang.myapplication;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by hoang on 3/1/2018.
 */

public class AssetHelper extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "toeic_600.db";
    private static final int DATABASE_VERSION = 1;

    public AssetHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}