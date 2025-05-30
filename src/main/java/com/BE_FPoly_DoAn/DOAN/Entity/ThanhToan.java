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
    private Integer thanhtoan_id;

    @ManyToOne
    @JoinColumn(name = "hoadon_id")
    private HoaDon hoaDon;

    private LocalDate ngay_thanh_toan;

    private BigDecimal so_tien_thanh_toan;

    @Column(length = 1)
    private String phuong_thuc_thanh_toan;

    @Column(length = 1)
    private String trang_thai;

    @Column(length = 100)
    private String ma_giao_dich;

    @Column(length = 100)
    private String ghi_chu;
}