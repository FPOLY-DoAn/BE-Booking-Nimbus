package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "BENH_AN")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BenhAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "benhan_id", columnDefinition = "INT")
    private Integer benhan_id;

    @ManyToOne
    @JoinColumn(name = "lichkham_id", referencedColumnName = "lichkham_id", columnDefinition = "INT")
    private LichKham lichKham;

    @ManyToOne
    @JoinColumn(name = "bacsi_ket_luan_id", referencedColumnName = "bacsi_id", columnDefinition = "INT")
    private BacSi bacSiKetLuan;

    @Column(name = "tom_tat", length = 100, columnDefinition = "NVARCHAR(100)")
    private String tom_tat;

    @Column(name = "ket_luan", length = 250, columnDefinition = "NVARCHAR(250)")
    private String ket_luan;

    @Column(name = "ghi_chu", length = 250, columnDefinition = "NVARCHAR(250)")
    private String ghi_chu;

    @Column(name = "thoi_gian", columnDefinition = "DATETIME")
    private LocalDateTime thoi_gian;

    @OneToMany(mappedBy = "benhAn", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<HoSoBenhAn> hoSoBenhAns;

    @OneToMany(mappedBy = "benhAn", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichSuDieuTri> lichSuDieuTris;
}