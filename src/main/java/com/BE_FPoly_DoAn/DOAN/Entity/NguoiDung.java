package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "NGUOI_DUNG")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NguoiDung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nguoidung_id", columnDefinition = "INT")
    private Integer nguoiDungId;

    @Column(name = "hoten", nullable = false, length = 50, columnDefinition = "NVARCHAR(50)")
    private String hoTen;

    @Column(name = "gioi_tinh", length = 1, columnDefinition = "CHAR(1)")
    private char gioiTinh;

    @Column(name = "email", length = 50, columnDefinition = "NVARCHAR(50)")
    private String email;

    @Column(name = "so_dien_thoai", length = 15, columnDefinition = "VARCHAR(15)")
    private String soDienThoai;

    @Column(name = "mat_khau", nullable = false, length = 255, columnDefinition = "NVARCHAR(255)")
    private String matKhau;

    @Column(name = "ngay_tao", columnDefinition = "DATETIME")
    private LocalDateTime ngayTao;

    @Column(name = "ngay_cap_nhat", columnDefinition = "DATETIME")
    private LocalDateTime ngayCapNhat;

    @OneToMany(mappedBy = "nguoiDung", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<PhanQuyen> phanQuyens;

    @OneToMany(mappedBy = "nguoiDung", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<BacSi> bacSis;

    @OneToMany(mappedBy = "nguoiDung", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<BenhNhan> benhNhans;

    @OneToMany(mappedBy = "nguoiDungLapHoaDon", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<HoaDon> hoaDonsLap;
}