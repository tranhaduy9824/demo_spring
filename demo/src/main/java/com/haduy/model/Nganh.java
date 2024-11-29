package com.haduy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "NGANH")
public class Nganh {
    @Id
    @Column(name = "MaNganh")
    private String maNganh;

    @Column(name = "TenNganh")
    private String tenNganh;

    @Column(name = "LoaiNganh")
    private String loaiNganh;

    // Getter, Setter
    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public String getTenNganh() {
        return tenNganh;
    }

    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }

    public String getLoaiNganh() {
        return loaiNganh;
    }

    public void setLoaiNganh(String loaiNganh) {
        this.loaiNganh = loaiNganh;
    }
}
