package com.poly.admin.quanlidongho;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class LoaiDongHoDAO {
    public DBhelper dbHelper;
    public SQLiteDatabase database;

    public static final String SQL_LOAI_DONG_HO = "CREATE TABLE LoaiDongHo(" +
            "maLoaiDongHo TEXT PRIMARY KEY," +
            "tenLoaiDongHo TEXT" +
            ");";
    public static final String TABLE_NAME = "LoaiDongHo";

    public LoaiDongHoDAO(Context context) {
        dbHelper = new DBhelper(context);
        database = dbHelper.getWritableDatabase();
    }

    public int insertLoaiDongHo(LoaiDongHo loaiDongHo) {
        ContentValues values = new ContentValues();
        values.put("maLoaiDongHo", loaiDongHo.getMaLoaiDongHo());
        values.put("tenLoaiDongHo", loaiDongHo.getTenLoaiDongHo());
        try {
            if (database.insert(TABLE_NAME, null, values) == 1) {
                return -1;
            }
        } catch (Exception ex) {
            Log.e("LoaiDongHoDAO", ex.getMessage());
        }
        return 1;
    }
    public List<LoaiDongHo> getAllTheLoai() {
        List<LoaiDongHo> theLoaiList = new ArrayList<LoaiDongHo>();
        Cursor cursor = database.query(TABLE_NAME, null, null, null, null, null, null);
        cursor.moveToFirst();
        while (cursor.isAfterLast() == false) {
            LoaiDongHo loaiDongHo = new LoaiDongHo();
            loaiDongHo.setMaLoaiDongHo(cursor.getString(0));
            loaiDongHo.setTenLoaiDongHo(cursor.getString(1));
            theLoaiList.add(loaiDongHo);
            Log.d("//=====", loaiDongHo.toString());
            cursor.moveToNext();
        }
        cursor.close();
        return theLoaiList;
    }
}