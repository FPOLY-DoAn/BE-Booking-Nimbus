package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "CHI_TIET_HOA_DON")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietHoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cthoadon_id", columnDefinition = "INT")
    private Integer ctHoaDonId;

    @ManyToOne
    @JoinColumn(name = "hoadon_id", referencedColumnName = "hoadon_id", nullable = false, columnDefinition = "INT")
    @NotNull(message = "Hóa đơn không được để trống")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "dichvu_id", referencedColumnName = "dichvu_id", nullable = false, columnDefinition = "INT")
    @NotNull(message = "Dịch vụ không được để trống")
    private DichVu dichVu;

    @Column(name = "so_luong", columnDefinition = "INT", nullable = false)
    @NotNull(message = "Số lượng không được để trống")
    @Positive(message = "Số lượng phải là số nguyên dương")
    private Integer soLuong;

    @Column(name = "don_gia", precision = 18, scale = 2, columnDefinition = "DECIMAL(18,2)", nullable = false)
    @NotNull(message = "Đơn giá không được để trống")
    @DecimalMin(value = "0.0", inclusive = true, message = "Đơn giá phải lớn hơn hoặc bằng 0")
    private BigDecimal donGia;

    @Column(name = "tong_gia", precision = 18, scale = 2, columnDefinition = "DECIMAL(18,2)", nullable = false)
    @NotNull(message = "Tổng giá không được để trống")
    @DecimalMin(value = "0.0", inclusive = true, message = "Tổng giá phải lớn hơn hoặc bằng 0")
    private BigDecimal tongGia;

    public BigDecimal calculateTongGia() {
        if (donGia != null && soLuong != null) {
            return donGia.multiply(BigDecimal.valueOf(soLuong));
        }
        return BigDecimal.ZERO;
    }
}