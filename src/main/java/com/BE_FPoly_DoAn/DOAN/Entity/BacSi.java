package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;

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
    private Integer bacSiId;

    @ManyToOne
    @JoinColumn(name = "nguoidung_id", referencedColumnName = "nguoidung_id", columnDefinition = "INT")
    private NguoiDung nguoiDung;

    @ManyToOne
    @JoinColumn(name = "chuyenkhoa_id", referencedColumnName = "chuyenkhoa_id", columnDefinition = "INT")
    private ChuyenKhoa chuyenKhoa;

    @Column(name = "chung_chi", length = 200, columnDefinition = "NVARCHAR(200)")
    @NotBlank
    private String chungChi;

    @Column(name = "trinh_do", length = 50, columnDefinition = "NVARCHAR(50)")
    @NotBlank
    @Positive
    private String trinhDo;

    @Column(name = "kinh_nghiem", columnDefinition = "INT")
    @NotBlank
    private Integer kinhNghiem;

    @Column(name = "ngay_tao", columnDefinition = "DATE")
    @NotBlank
    private LocalDate ngayTao;

    @Column(name = "ngay_cap_nhat", columnDefinition = "DATE")
    @NotBlank
    private LocalDate ngayCapNhat;

    @OneToMany(mappedBy = "bacSi", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichLamViecBacSi> lichLamViecs;

    @OneToMany(mappedBy = "bacSi", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichKham> lichKhams;

    @OneToMany(mappedBy = "bacSiKetLuan", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<BenhAn> benhAns;
}