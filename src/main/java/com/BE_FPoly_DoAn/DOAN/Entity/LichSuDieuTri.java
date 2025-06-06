package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "LICH_SU_DIEU_TRI")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LichSuDieuTri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lsdieutri_id", columnDefinition = "INT")
    private Integer lsdieuTriId;

    @ManyToOne
    @JoinColumn(name = "benhan_id", referencedColumnName = "benhan_id", nullable = false, columnDefinition = "INT")
    @NotNull(message = "Bệnh án không được để trống")
    private BenhAn benhAn;

    @Column(name = "ngay_dieu_tri", columnDefinition = "DATE")
    private LocalDate ngayDieuTri;

    @Column(name = "ghi_chu", length = 250, columnDefinition = "NVARCHAR(250)")
    @Size(max = 250, message = "Ghi chú không được vượt quá 250 ký tự")
    private String ghiChu;

    @OneToMany(mappedBy = "lichSuDieuTri", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<PhuongPhapDieuTri> phuongPhapDieuTris;
}