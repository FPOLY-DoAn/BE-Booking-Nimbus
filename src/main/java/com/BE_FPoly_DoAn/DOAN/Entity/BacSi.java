package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "BAC_SI")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BacSi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bacsi_id", columnDefinition = "INT")
    private Integer bacSiId;

    @ManyToOne
    @JoinColumn(name = "nguoidung_id", referencedColumnName = "nguoidung_id", columnDefinition = "INT")
    @NotNull(message = "Người dùng không được để trống")
    private NguoiDung nguoiDung;

    @ManyToOne
    @JoinColumn(name = "chuyenkhoa_id", referencedColumnName = "chuyenkhoa_id", columnDefinition = "INT")
    @NotNull(message = "Chuyên khoa không được để trống")
    private ChuyenKhoa chuyenKhoa;

    @Column(name = "chung_chi", length = 200, columnDefinition = "NVARCHAR(200)")
    @NotBlank(message = "Chứng chỉ không được để trống")
    private String chungChi;

    @Column(name = "trinh_do", length = 50, columnDefinition = "NVARCHAR(50)")
    @NotBlank(message = "Trình độ không được để trống")
    private String trinhDo;

    @Column(name = "kinh_nghiem", columnDefinition = "INT")
    @NotNull(message = "Kinh nghiệm không được để trống")
    @Positive(message = "Kinh nghiệm phải là số dương")
    private Integer kinhNghiem;

    @CreationTimestamp
    @Column(name = "ngay_tao", columnDefinition = "DATE", updatable = false)
    private LocalDate ngayTao;

    @UpdateTimestamp
    @Column(name = "ngay_cap_nhat", columnDefinition = "DATE")
    private LocalDate ngayCapNhat;

    @OneToMany(mappedBy = "bacSi", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichLamViecBacSi> lichLamViecs;

    @OneToMany(mappedBy = "bacSi", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichKham> lichKhams;

    @OneToMany(mappedBy = "bacSiKetLuan", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<BenhAn> benhAns;
}