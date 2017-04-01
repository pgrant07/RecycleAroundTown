package com.example.pgran.recyclearoundtown;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.SensorManager;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="db";
    public static final String TITLE="title";
    public static final String VALUE="value";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        android.util.Log.w("Constants", "Upgrading database, which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS constants");
        onCreate(db);
    }
}
