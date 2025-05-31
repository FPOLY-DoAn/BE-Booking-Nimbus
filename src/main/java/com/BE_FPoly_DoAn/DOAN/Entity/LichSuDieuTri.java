package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "LICH_SU_DIEU_TRI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LichSuDieuTri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lsdieutri_id", columnDefinition = "INT")
    private Integer lsdieuTriId;

    @ManyToOne
    @JoinColumn(name = "benhan_id", referencedColumnName = "benhan_id")
    private BenhAn benhAn;

    @Column(name = "ngay_dieu_tri", columnDefinition = "DATE")
    private LocalDate ngayDieuTri;

    @Column(name = "ghi_chu", length = 250, columnDefinition = "NVARCHAR(250)")
    private String ghiChu;

    @OneToMany(mappedBy = "lichSuDieuTri", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<PhuongPhapDieuTri> phuongPhapDieuTris;
}