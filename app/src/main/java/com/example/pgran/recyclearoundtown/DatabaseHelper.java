package com.example.pgran.recyclearoundtown;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.SensorManager;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String RECYCLE_BIN="db";
    public static final String TITLE="title";
    public static final String LOCATION="location";
    public static final String SIZE="size";
    public static final String STATUS="status";

    public DatabaseHelper(Context context) {
        super(context, RECYCLE_BIN, null, 3);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE constants (_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, location TEXT, size INTEGER, status TEXT );");

        ContentValues cv=new ContentValues();

        cv.put(TITLE, "Kansas Convention Center");
        cv.put(LOCATION, "39.09875, -94.58723");
        cv.put(SIZE, 3);
        cv.put(STATUS, "public");
        db.insert("constants", TITLE, cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        android.util.Log.w("Constants", "Upgrading database, which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS constants");
        onCreate(db);
    }
}
