package com.example.mysqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {

    public static final String TABLE_NAME = "RecordUsers";
    public static final String DATABASE_NAME = "SqLiteDatabase";
    public static final int Version = 1;
    public static final String Username ="Username";
    public static final String Password = "Password";
    public static final String ID ="id";

    public static final String query = " CREATE TABLE " + TABLE_NAME + "(" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + Username + " TEXT," + Password + " TEXT " + ")";


//    public static final String query = " CREATE TABLE " + TABLE_NAME + "("+ ID + "INTEGER PRIMARY KEY AUTOINCREMENT," + Username + "TEXT," + Password +
//            "TEXT"+ ")" ;
    public Database(@Nullable Context context) {
        super(context, DATABASE_NAME, null, Version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void saveData(Database db,String username,String password) {
        SQLiteDatabase dob =db.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(Username,username);
        cv.put(Password,password);

        double myvalue = dob.insert(TABLE_NAME,null,cv);
    }
}
