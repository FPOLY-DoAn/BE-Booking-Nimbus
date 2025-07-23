package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "THANH_TOAN")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ThanhToan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "thanhtoan_id", columnDefinition = "INT")
    private Integer thanhToanId;

    @ManyToOne
    @JoinColumn(name = "hoadon_id", referencedColumnName = "hoadon_id", nullable = false)
    @NotNull(message = "Hóa đơn không được để trống")
    private HoaDon hoaDon;

    @Column(name = "ngay_thanh_toan", columnDefinition = "DATE")
    @NotNull(message = "Ngày thanh toán không được để trống")
    private LocalDate ngayThanhToan;

    @Column(name = "so_tien_thanh_toan", columnDefinition = "DECIMAL(18,2)")
    @NotNull(message = "Số tiền thanh toán không được để trống")
    @DecimalMin(value = "0.01", inclusive = true, message = "Số tiền thanh toán phải lớn hơn 0")
    private BigDecimal soTienThanhToan;

    @Column(name = "phuong_thuc_thanh_toan", length = 1, columnDefinition = "CHAR(1)")
    @NotBlank(message = "Phương thức thanh toán không được để trống")
    @Size(min = 1, max = 1, message = "Phương thức thanh toán chỉ được 1 ký tự")
    private String phuongThucThanhToan;

    @Column(name = "trang_thai", length = 1, columnDefinition = "CHAR(1)")
    @NotBlank(message = "Trạng thái không được để trống")
    @Size(min = 1, max = 1, message = "Trạng thái chỉ được 1 ký tự")
    private String trangThai;

    @Column(name = "ma_giao_dich", length = 100, columnDefinition = "NVARCHAR(100)")
    @Size(max = 100, message = "Mã giao dịch không được vượt quá 100 ký tự")
    private String maGiaoDich;

    @Column(name = "ghi_chu", length = 100, columnDefinition = "NVARCHAR(100)")
    @Size(max = 100, message = "Ghi chú không được vượt quá 100 ký tự")
    private String ghiChu;

    public enum PhuongThucThanhToan {
        T, // Tiền mặt
        M  // MoMo
    }
}