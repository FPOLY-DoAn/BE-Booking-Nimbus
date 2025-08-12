package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Table(name = "QUAN_LY")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuanLy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quanly_id")
    private Integer quanLyId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nguoidung_id", referencedColumnName = "nguoidung_id", unique = true)
    private NguoiDung nguoiDung;

    @Column(name = "chuc_vu", length = 50,columnDefinition = "NVARCHAR(50)")
    @NotBlank(message = "Chức vụ không được để trống")
    private String chucVu;

    @Column(name = "ghi_chu", length = 255,columnDefinition = "NVARCHAR(225)")
    private String ghiChu;

    @CreationTimestamp
    @Column(name = "ngay_tao", columnDefinition = "DATE")
    private LocalDate ngayTao;

    @UpdateTimestamp
    @Column(name = "ngay_cap_nhat", columnDefinition = "DATE")
    private LocalDate ngayCapNhat;

    @Column(name = "trang_thai_hoat_dong")
    private Boolean trangThaiHoatDong;
}