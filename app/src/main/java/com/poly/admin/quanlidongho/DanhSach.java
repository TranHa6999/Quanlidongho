package com.poly.admin.quanlidongho;

public class DanhSach {
    private long dsID = -1;
    private String maLoaiDongHo;
    private String tenLoaiDongHo;

    public DanhSach() {
    }

    public DanhSach(long dsID, String maLoaiDongHo, String tenLoaiDongHo) {
        this.dsID = dsID;
        this.maLoaiDongHo = maLoaiDongHo;
        this.tenLoaiDongHo = tenLoaiDongHo;
    }

    public long getDsID() {
        return dsID;
    }

    public void setDsID(long dsID) {
        this.dsID = dsID;
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
}
