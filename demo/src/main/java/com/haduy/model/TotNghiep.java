package com.haduy.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "TOT_NGHIEP")
public class TotNghiep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SoCMND")
    private String soCMND;

    @Column(name = "MaTruong")
    private String maTruong;

    @Column(name = "MaNganh")
    private String maNganh;

    @Column(name = "HeDT")
    private String heDT;

    @Column(name = "NgayTN")
    @Temporal(TemporalType.DATE)
    private LocalDate ngayTN;

    @Column(name = "LoaiTN")
    private String loaiTN;

    // Getters and Setters
    public String setSoCMND(String soCMND) {
        this.soCMND = soCMND;
        return soCMND;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public String setMaTruong(String maTruong) {
        this.maTruong = maTruong;
        return maTruong;
    }

    public String getMaTruong() {
        return maTruong;
    }

    public String setMaNganh(String maNganh) {
        this.maNganh = maNganh;
        return maNganh;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public String setHeDT(String heDT) {
        this.heDT = heDT;
        return heDT;
    }

    public String getHeDT() {
        return heDT;
    }

    public LocalDate setNgayTN(LocalDate ngayTN) {
        this.ngayTN = ngayTN;
        return ngayTN;
    }

    public LocalDate getNgayTN() {
        return ngayTN;
    }

    public String setLoaiTN(String loaiTN) {
        this.loaiTN = loaiTN;
        return loaiTN;
    }

    public String getLoaiTN() {
        return loaiTN;
    }
}