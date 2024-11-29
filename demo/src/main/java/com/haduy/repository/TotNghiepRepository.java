package com.haduy.repository;

import com.haduy.model.TotNghiep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotNghiepRepository extends JpaRepository<TotNghiep, Long> {}
