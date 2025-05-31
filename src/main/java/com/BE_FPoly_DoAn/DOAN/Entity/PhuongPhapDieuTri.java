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
    @Column(name = "ppdieutri_id", columnDefinition = "INT")
    private Integer ppdieutriId;

    @ManyToOne
    @JoinColumn(name = "lsdieutri_id", referencedColumnName = "lsdieutri_id")
    private LichSuDieuTri lichSuDieuTri;

    @Column(name = "ten_phuong_phap", length = 100, columnDefinition = "NVARCHAR(100)")
    private String tenPhuongPhap;

    @Column(name = "hieu_qua", length = 1, columnDefinition = "CHAR(1)")
    private char hieuQua;

    @OneToMany(mappedBy = "phuongPhapDieuTri", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<DonThuoc> donThuocs;
}