package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "THANH_TOAN")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThanhToan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "thanhtoan_id", columnDefinition = "INT")
    private Integer thanhToanId;

    @ManyToOne
    @JoinColumn(name = "hoadon_id", referencedColumnName = "hoadon_id")
    private HoaDon hoaDon;

    @Column(name = "ngay_thanh_toan", columnDefinition = "DATE")
    private LocalDate ngayThanhToan;

    @Column(name = "so_tien_thanh_toan", columnDefinition = "DECIMAL(18,2)")
    private BigDecimal soTienThanhToan;

    @Column(name = "phuong_thuc_thanh_toan", length = 1, columnDefinition = "CHAR(1)")
    private char phuongThucThanhToan;

    @Column(name = "trang_thai", length = 1, columnDefinition = "CHAR(1)")
    private char trangThai;

    @Column(name = "ma_giao_dich", length = 100, columnDefinition = "NVARCHAR(100)")
    private String maGiaoDich;

    @Column(name = "ghi_chu", length = 100, columnDefinition = "NVARCHAR(100)")
    private String ghiChu;
}