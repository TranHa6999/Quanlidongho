package com.poly.admin.quanlidongho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThemDanhSachSanPham extends AppCompatActivity {
    Button btnAdd;
    LoaiDongHoDAO loaiDongHoDAO;
    EditText edtMaLoaiDongHo,edtTenLoaiDongHo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_danh_sach_san_pham);
        edtMaLoaiDongHo = findViewById(R.id.edtMaLoaiDongHo);
        edtTenLoaiDongHo = findViewById(R.id.edtTenLoaiDongHo);
        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loaiDongHoDAO = new LoaiDongHoDAO(ThemDanhSachSanPham.this);
                LoaiDongHo loaiDongHo = new LoaiDongHo(edtMaLoaiDongHo.getText().toString(),edtMaLoaiDongHo.getText().toString());
                if (loaiDongHoDAO.insertLoaiDongHo(loaiDongHo)>0){
                    Toast.makeText(ThemDanhSachSanPham.this, "AAA", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), DanhSachSanPhamActivity.class));
                }
                else {
                    Toast.makeText(ThemDanhSachSanPham.this, "BBB", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}