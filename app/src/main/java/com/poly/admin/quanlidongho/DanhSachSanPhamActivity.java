package com.poly.admin.quanlidongho;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class DanhSachSanPhamActivity extends AppCompatActivity {

    androidx.recyclerview.widget.RecyclerView recyclerView;
    List<LoaiDongHo> loaiDongHoList = new ArrayList<>();
    LoaiDongHoDAO loaiDongHoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach_san_pham);

        recyclerView = findViewById(R.id.recyclerview);
        loaiDongHoDAO = new LoaiDongHoDAO(DanhSachSanPhamActivity.this);
        loaiDongHoList = loaiDongHoDAO.getAllTheLoai();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        LoaiDongHoAdapter loaiDongHoAdapter = new LoaiDongHoAdapter(DanhSachSanPhamActivity.this,loaiDongHoList);
        recyclerView.setAdapter(loaiDongHoAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_danh_sach_san_pham,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                Intent intent = new Intent(this,ThemDanhSachSanPham.class);
                startActivity(intent);
                break;
            case  R.id.search:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private class RecyclerView {
    }
}