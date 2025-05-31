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
    @Column(name = "hoadon_id", columnDefinition = "INT")
    private Integer hoaDonId;

    @ManyToOne
    @JoinColumn(name = "benhnhan_id", referencedColumnName = "benhnhan_id", columnDefinition = "INT")
    private BenhNhan benhNhan;

    @ManyToOne
    @JoinColumn(name = "nguoidung_lap_hoadon_id", referencedColumnName = "nguoidung_id", columnDefinition = "INT")
    private NguoiDung nguoiDungLapHoaDon;

    @Column(name = "ngay_tao", columnDefinition = "DATE")
    private LocalDate ngayTao;

    @Column(name = "tong_tien", precision = 18, scale = 2, columnDefinition = "DECIMAL(18,2)")
    private BigDecimal tongTien;

    @Column(name = "tong_tien_thanh_toan", precision = 18, scale = 2, columnDefinition = "DECIMAL(18,2)")
    private BigDecimal tongTienThanhToan;

    @Column(name = "tong_tien_con_no", precision = 18, scale = 2, columnDefinition = "DECIMAL(18,2)")
    private BigDecimal tongTienConNo;

    @OneToMany(mappedBy = "hoaDon", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<ChiTietHoaDon> chiTietHoaDons;

    @OneToMany(mappedBy = "hoaDon", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<ThanhToan> thanhToans;
}