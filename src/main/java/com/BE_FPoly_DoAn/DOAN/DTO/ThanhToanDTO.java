package com.BE_FPoly_DoAn.DOAN.DTO;

import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ThanhToanDTO {

    private Integer thanhToanId;

    @NotNull(message = "Hóa đơn không được để trống")
    private Integer hoaDonId;

    @NotNull(message = "Ngày thanh toán không được để trống")
    private LocalDate ngayThanhToan;

    @NotNull(message = "Số tiền thanh toán không được để trống")
    @DecimalMin(value = "0.01", inclusive = true, message = "Số tiền phải lớn hơn 0")
    private BigDecimal soTienThanhToan;

    @NotBlank(message = "Phương thức thanh toán không được để trống")
    @Size(min = 1, max = 1)
    private String phuongThucThanhToan;

    @NotBlank(message = "Trạng thái không được để trống")
    @Size(min = 1, max = 1)
    private String trangThai;

    @Size(max = 100)
    private String maGiaoDich;

    @Size(max = 100)
    private String ghiChu;
}