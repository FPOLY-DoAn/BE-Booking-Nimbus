package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "HOA_DON")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hoadon_id;

    @ManyToOne
    @JoinColumn(name = "benhnhan_id")
    private BenhNhan benhNhan;

    @ManyToOne
    @JoinColumn(name = "nguoidung_lap_hoadon_id")
    private NguoiDung nguoiDungLapHoaDon;

    private LocalDate ngay_tao;

    private BigDecimal tong_tien;

    private BigDecimal tong_tien_thanh_toan;

    private BigDecimal tong_tien_con_no;

    @OneToMany(mappedBy = "hoaDon",cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<ChiTietHoaDon> chiTietHoaDons;

    @OneToMany(mappedBy = "hoaDon",cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<ThanhToan> thanhToans;
}