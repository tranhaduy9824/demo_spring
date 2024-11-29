package com.haduy.controller;

import com.haduy.model.SinhVien;
import com.haduy.model.TotNghiep;
import com.haduy.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SinhVienController {
    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("/addSinhVien")
    public String showForm(Model model) {
        model.addAttribute("sinhVien", new SinhVien());
        model.addAttribute("totNghiep", new TotNghiep());
        model.addAttribute("truongList", sinhVienService.getAllTruong());
        model.addAttribute("nganhList", sinhVienService.getAllNganh());
        return "addSinhVien";
    }

    @PostMapping("/addSinhVien")
    public String addSinhVien(@ModelAttribute SinhVien sinhVien, @ModelAttribute TotNghiep totNghiep) {
        totNghiep.setSoCMND(sinhVien.getSoCMND());
        sinhVienService.addSinhVien(sinhVien, totNghiep);
        return "redirect:/listSinhVien";
    }

    @GetMapping("/listSinhVien")
    public String listSinhVien(Model model) {
        model.addAttribute("sinhVienList", sinhVienService.getAllSinhVien());
        return "listSinhVien";
    }

    @GetMapping("/searchBasicInfo")
    public String searchBasicInfo(@RequestParam(value = "keyword", required = false) String keyword, Model model) {
        List<SinhVien> sinhVienList = sinhVienService.searchBasicInfo(keyword);
        model.addAttribute("sinhVienList", sinhVienList);
        return "searchBasicInfo";
    }

    @GetMapping("/searchGradEmploymentInfo")
    public String searchGradEmploymentInfo(@RequestParam(value = "keyword", required = false) String keyword, Model model) {
        List<Object[]> resultList = sinhVienService.searchGradEmploymentInfo(keyword);
        model.addAttribute("resultList", resultList);
        return "searchGradEmploymentInfo";
    }
}