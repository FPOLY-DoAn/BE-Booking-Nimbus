package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "LOAI_HINH_KHAM")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoaiHinhKham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loai_id", columnDefinition = "INT")
    private Integer loaiId;

    @Column(name = "ten_loai", length = 100, columnDefinition = "NVARCHAR(100)")
    @NotBlank(message = "Tên loại hình khám không được để trống")
    private String tenLoai;

    @Column(name = "mo_ta", length = 250, columnDefinition = "NVARCHAR(250)")
    @NotBlank(message = "Mô tả không được để trống")
    private String moTa;

    @Column(name = "gia", precision = 18, scale = 2, columnDefinition = "DECIMAL(18,2)")
    @NotNull(message = "Giá không được để trống")
    @DecimalMin(value = "0.0", inclusive = true, message = "Giá phải lớn hơn hoặc bằng 0")
    private BigDecimal gia;
}