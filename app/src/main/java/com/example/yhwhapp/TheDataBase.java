package com.example.yhwhapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class TheDataBase extends  SQLiteOpenHelper{
    public TheDataBase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory,int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String qry1 = "create table Users(UserName text,Email text, Password text)";
        sqLiteDatabase.execSQL(qry1);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void register(String UserName, String Email, String Password){
        ContentValues cv = new ContentValues();
        cv.put("UserName", UserName);
        cv.put("Email", Email);
        cv.put("Password", Password);

        SQLiteDatabase db = getWritableDatabase();
        db.insert("User",null,cv);
        db.close();
    }

    public int login(String UserName,String Password){
        int result=0;
        String srt[] = new String[2];
        srt[0] = UserName;
        srt[1]= Password;
        SQLiteDatabase db= getReadableDatabase();
        Cursor c = db.rawQuery("Select * from Users where UserNAme=? and Password=?",srt);
        if (c.moveToFirst()){
            result =1;

        }
        return result;
    }
}
