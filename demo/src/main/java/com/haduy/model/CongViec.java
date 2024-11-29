package com.haduy.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "CONG_VIEC")
public class CongViec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SoCMND")
    private String soCMND;

    @Column(name = "MaNganh")
    private String maNganh;

    @Column(name = "NgayVaoCongTy")
    private Date ngayVaoCongTy;

    @Column(name = "TenCongTy")
    private String tenCongTy;

    @Column(name = "DiaChiCongTy")
    private String diaChiCongTy;

    @Column(name = "ThoiGianLamViec")
    private Integer thoiGianLamViec;

    // Getter, Setter
    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public Date getNgayVaoCongTy() {
        return ngayVaoCongTy;
    }

    public void setNgayVaoCongTy(Date ngayVaoCongTy) {
        this.ngayVaoCongTy = ngayVaoCongTy;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getDiaChiCongTy() {
        return diaChiCongTy;
    }

    public void setDiaChiCongTy(String diaChiCongTy) {
        this.diaChiCongTy = diaChiCongTy;
    }

    public Integer getThoiGianLamViec() {
        return thoiGianLamViec;
    }

    public void setThoiGianLamViec(Integer thoiGianLamViec) {
        this.thoiGianLamViec = thoiGianLamViec;
    }
}