package com.example.android.hw3_1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "waitlist.db";

    private static final int DATABASE_VERSION = 1;

    public TaskDbHelper(Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        final String SQL_CREATE_WAITLIST_TABLE = "CREATE TABLE " + TaskContract.WaitlistEntry.TABLE_NAME
                + "("+ TaskContract.WaitlistEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                TaskContract.WaitlistEntry.COLUMN_GUEST_NAME + " TEXT NOT NULL, "+
                TaskContract.WaitlistEntry.COLUMN_PARTY_SIZE + " INTEGER  NOT NULL, "+
                TaskContract.WaitlistEntry.COLUMN_PHONE + " TEXT NOT NULL, "+
                TaskContract.WaitlistEntry.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP"+
                ");";
        db.execSQL(SQL_CREATE_WAITLIST_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TaskContract.WaitlistEntry.TABLE_NAME);
        onCreate(db);
    }
}
