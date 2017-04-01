package com.example.pgran.recyclearoundtown;

import android.provider.BaseColumns;

/**
 * Created by pgran on 4/1/2017.
 */

public final class FeedReaderContract {
    private FeedReaderContract(){}

    public static class FeedEntry implements BaseColumns{
        public static final String TABLE_NAME="entry";
        public static final String COLUMN_NAME_TITLE="name";
        public static final String COLUMN_NAME_LOCATION="location";
        public static final String COLUMN_NAME_SIZE="size";
        public static final String COLUMN_NAME_STATUS="status";
    }

    private static final String SQL_CREATE_ENTRIES="CREATE TABLE"+ FeedEntry.TABLE_NAME+" ("+ FeedEntry.COLUMN_NAME_TITLE + "PRIMARY KEY,"+FeedEntry.COLUMN_NAME_LOCATION +"TEXT,"+ FeedEntry.COLUMN_NAME_SIZE+"INTEGER,"+FeedEntry.COLUMN_NAME_STATUS+"TEXT)";

    private static final String SQL_DELETE_ENTRIES="DROP TABLE IF EXISTS"+FeedEntry.TABLE_NAME;
}
