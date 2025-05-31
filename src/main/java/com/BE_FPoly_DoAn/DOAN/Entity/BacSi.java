package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "BAC_SI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BacSi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bacsi_id", columnDefinition = "INT")
    private Integer bacsi_id;

    @ManyToOne
    @JoinColumn(name = "nguoidung_id", referencedColumnName = "nguoidung_id", columnDefinition = "INT")
    private NguoiDung nguoiDung;

    @ManyToOne
    @JoinColumn(name = "chuyenkhoa_id", referencedColumnName = "chuyenkhoa_id", columnDefinition = "INT")
    private ChuyenKhoa chuyenKhoa;

    @Column(name = "chung_chi", length = 25, columnDefinition = "VARCHAR(25)")
    private String chung_chi;

    @Column(name = "trinh_do", length = 50, columnDefinition = "NVARCHAR(50)")
    private String trinh_do;

    @Column(name = "kinh_nghiem", columnDefinition = "INT")
    private Integer kinh_nghiem;

    @Column(name = "ngay_tao", columnDefinition = "DATE")
    private LocalDate ngay_tao;

    @Column(name = "ngay_cap_nhat", columnDefinition = "DATE")
    private LocalDate ngay_cap_nhat;

    @OneToMany(mappedBy = "bacSi", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichLamViecBacSi> lichLamViecs;

    @OneToMany(mappedBy = "bacSi", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichKham> lichKhams;

    @OneToMany(mappedBy = "bacSiKetLuan", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<BenhAn> benhAns;
}