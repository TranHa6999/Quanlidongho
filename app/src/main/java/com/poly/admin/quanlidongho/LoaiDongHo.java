package com.poly.admin.quanlidongho;

public class LoaiDongHo {
    private String maLoaiDongHo;
    private String tenLoaiDongHo;

    public LoaiDongHo() {
    }

    public LoaiDongHo(String maLoaiDongHo, String tenLoaiDongHo) {
        this.maLoaiDongHo = maLoaiDongHo;
        this.tenLoaiDongHo = tenLoaiDongHo;
    }

    public String getMaLoaiDongHo() {
        return maLoaiDongHo;
    }

    public void setMaLoaiDongHo(String maLoaiDongHo) {
        this.maLoaiDongHo = maLoaiDongHo;
    }

    public String getTenLoaiDongHo() {
        return tenLoaiDongHo;
    }

    public void setTenLoaiDongHo(String tenLoaiDongHo) {
        this.tenLoaiDongHo = tenLoaiDongHo;
    }

    @Override
    public String toString() {
        return "LoaiDongHo{" +
                "maLoaiDongHo='" + maLoaiDongHo + '\'' +
                ", tenLoaiDongHo='" + tenLoaiDongHo + '\'' +
                '}';
    }
}