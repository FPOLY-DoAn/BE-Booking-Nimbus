package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "HOA_DON")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hoadon_id", columnDefinition = "INT")
    private Integer hoaDonId;

    @ManyToOne
    @JoinColumn(name = "benhnhan_id", referencedColumnName = "benhnhan_id", columnDefinition = "INT", nullable = false)
    @NotNull(message = "Bệnh nhân không được để trống")
    private BenhNhan benhNhan;

    @ManyToOne
    @JoinColumn(name = "nguoidung_lap_hoadon_id", referencedColumnName = "nguoidung_id", columnDefinition = "INT", nullable = false)
    @NotNull(message = "Người dùng lập hóa đơn không được để trống")
    private NguoiDung nguoiDungLapHoaDon;

    @CreationTimestamp
    @Column(name = "ngay_tao", columnDefinition = "DATETIME", updatable = false)
    private LocalDateTime ngayTao;

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

    @Enumerated(EnumType.STRING)
    @Column(name = "trang_thai", length = 20, columnDefinition = "VARCHAR(20)")
    private TrangThaiHoaDon trangThai;

    public enum TrangThaiHoaDon {
        CHUA_THANH_TOAN, DA_THANH_TOAN, HUY
    }
}