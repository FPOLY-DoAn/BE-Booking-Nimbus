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
    private Integer thanhtoan_id;

    @ManyToOne
    @JoinColumn(name = "hoadon_id", referencedColumnName = "hoadon_id")
    private HoaDon hoaDon;

    @Column(name = "ngay_thanh_toan", columnDefinition = "DATE")
    private LocalDate ngay_thanh_toan;

    @Column(name = "so_tien_thanh_toan", columnDefinition = "DECIMAL(18,2)")
    private BigDecimal so_tien_thanh_toan;

    @Column(name = "phuong_thuc_thanh_toan", length = 1, columnDefinition = "CHAR(1)")
    private char phuong_thuc_thanh_toan;

    @Column(name = "trang_thai", length = 1, columnDefinition = "CHAR(1)")
    private char trang_thai;

    @Column(name = "ma_giao_dich", length = 100, columnDefinition = "NVARCHAR(100)")
    private String ma_giao_dich;

    @Column(name = "ghi_chu", length = 100, columnDefinition = "NVARCHAR(100)")
    private String ghi_chu;
}