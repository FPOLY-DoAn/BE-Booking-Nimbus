package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "DICH_VU")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DichVu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dichvu_id", columnDefinition = "INT")
    private Integer dichVuId;

    @ManyToOne
    @JoinColumn(name = "benhan_id", referencedColumnName = "benhan_id", columnDefinition = "INT", nullable = false)
    private BenhAn benhAn;

    @Column(name = "ten_dich_vu", length = 100, columnDefinition = "NVARCHAR(100)")
    @NotBlank(message = "Tên dịch vụ không được để trống")
    private String tenDichVu;

    @Column(name = "mo_ta", length = 250, columnDefinition = "NVARCHAR(250)")
    @NotBlank(message = "Mô tả không được để trống")
    private String moTa;

    @Column(name = "gia", precision = 18, scale = 2, columnDefinition = "DECIMAL(18,2)")
    @NotNull(message = "Giá không được để trống")
    @DecimalMin(value = "0.0", inclusive = true, message = "Giá phải lớn hơn hoặc bằng 0")
    private BigDecimal gia;

    @OneToMany(mappedBy = "dichVu", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<ChiTietHoaDon> chiTietHoaDons;
}