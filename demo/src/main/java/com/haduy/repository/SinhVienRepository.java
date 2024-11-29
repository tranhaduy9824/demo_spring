package com.haduy.repository;

import com.haduy.model.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, String> {

    @Query("SELECT sv FROM SinhVien sv WHERE sv.soCMND LIKE %?1% OR sv.hoTen LIKE %?1% OR sv.email LIKE %?1% OR sv.soDT LIKE %?1% OR sv.diaChi LIKE %?1%")
    List<SinhVien> findByKeyword(String keyword);

//    @Query("SELECT sv.soCMND, sv.hoTen, tn.maNganh, tn.maTruong, cv.maNganh, cv.tenCongTy, cv.thoiGianLamViec " +
//            "FROM SinhVien sv " +
//            "JOIN TotNghiep tn ON sv.soCMND = tn.soCMND " +
//            "JOIN CongViec cv ON sv.soCMND = cv.soCMND " +
//            "WHERE sv.soCMND LIKE %?1% OR sv.hoTen LIKE %?1%")
//    List<Object[]> findGradEmploymentInfoByKeyword(String keyword);

    @Query("SELECT sv.soCMND, sv.hoTen, tn.maNganh, tn.maTruong, cv.maNganh, cv.tenCongTy, cv.thoiGianLamViec " +
            "FROM SinhVien sv " +
            "LEFT JOIN TotNghiep tn ON sv.soCMND = tn.soCMND " +
            "LEFT JOIN CongViec cv ON sv.soCMND = cv.soCMND " +
            "WHERE sv.soCMND LIKE %?1% OR sv.hoTen LIKE %?1%")
    List<Object[]> findGradEmploymentInfoByKeyword(String keyword);
}
