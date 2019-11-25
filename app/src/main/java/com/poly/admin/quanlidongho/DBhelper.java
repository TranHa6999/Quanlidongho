package com.poly.admin.quanlidongho;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBhelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Quanlidongho.db";
    public static final int VERSIONS = 1;

    public DBhelper(Context context) {
        super(context, DATABASE_NAME, null, VERSIONS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(LoaiDongHoDAO.SQL_LOAI_DONG_HO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(LoaiDongHoDAO.TABLE_NAME);

    }
}