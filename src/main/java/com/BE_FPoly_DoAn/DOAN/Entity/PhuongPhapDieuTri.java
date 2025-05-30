package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "PHUONG_PHAP_DIEU_TRI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhuongPhapDieuTri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ppdieutri_id;

    @ManyToOne
    @JoinColumn(name = "lsdieutri_id")
    private LichSuDieuTri lichSuDieuTri;

    @Column(length = 100)
    private String ten_phuong_phap;

    @Column(length = 1)
    private String hieu_qua;

    @OneToMany(mappedBy = "phuongPhapDieuTri", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<DonThuoc> donThuocs;
}