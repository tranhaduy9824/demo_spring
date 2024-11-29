package com.haduy.service;

import com.haduy.model.*;
import com.haduy.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienService {
    @Autowired
    private SinhVienRepository sinhVienRepo;

    @Autowired
    private TruongRepository truongRepo;

    @Autowired
    private NganhRepository nganhRepo;

    @Autowired
    private TotNghiepRepository totNghiepRepo;

    @Autowired
    private CongViecRepository congViecRepo;

    public void addSinhVien(SinhVien sinhVien, TotNghiep totNghiep) {
        sinhVienRepo.save(sinhVien);
        totNghiepRepo.save(totNghiep);
    }

    public List<SinhVien> getAllSinhVien() {
        return sinhVienRepo.findAll();
    }

    public List<Truong> getAllTruong() {
        return truongRepo.findAll();
    }

    public List<Nganh> getAllNganh() {
        return nganhRepo.findAll();
    }

    public List<SinhVien> searchBasicInfo(String keyword) {
        return sinhVienRepo.findByKeyword(keyword);
    }

    public List<Object[]> searchGradEmploymentInfo(String keyword) {
        return sinhVienRepo.findGradEmploymentInfoByKeyword(keyword);
    }
}