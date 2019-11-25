package com.poly.admin.quanlidongho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ShowSanPham(View view) {
        Intent intent = new Intent(this, SanPhamActivity.class);
        startActivity(intent);
    }
    public void ShowDanhSach(View view) {
        Intent intent = new Intent(this, DanhSachSanPhamActivity.class);
        startActivity(intent);
    }
    public void ShowHoaDon(View view) {
        Intent intent = new Intent(this, HoaDonActivity.class);
        startActivity(intent);
    }
    public void ShowBanChay(View view) {
        Intent intent = new Intent(this, BanChayActivity.class);
        startActivity(intent);
    }
    public void ShowThongKe(View view) {
        Intent intent = new Intent(this, ThongKeActivity.class);
        startActivity(intent);
    }

}