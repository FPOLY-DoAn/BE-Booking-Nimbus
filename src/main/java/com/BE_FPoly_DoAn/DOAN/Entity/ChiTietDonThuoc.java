package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CHI_TIET_DON_THUOC")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietDonThuoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ctdonthuoc_id", columnDefinition = "INT")
    private Integer ctDonThuocId;

    @ManyToOne
    @JoinColumn(name = "donthuoc_id", referencedColumnName = "donthuoc_id", nullable = false, columnDefinition = "INT")
    @NotNull(message = "Đơn thuốc không được để trống")
    private DonThuoc donThuoc;

    @Column(name = "ten_thuoc", length = 50, columnDefinition = "NVARCHAR(50)", nullable = false)
    @NotBlank(message = "Tên thuốc không được để trống")
    private String tenThuoc;

    @Column(name = "lieu_dung", columnDefinition = "INT", nullable = false)
    @NotNull(message = "Liều dùng không được để trống")
    @Positive(message = "Liều dùng phải là số nguyên dương")
    private Integer lieuDung;

    @Column(name = "tinh_thuong_xuyen", columnDefinition = "INT", nullable = false)
    @NotNull(message = "Tính thường xuyên không được để trống")
    @PositiveOrZero(message = "Tính thường xuyên phải là số nguyên không âm")
    private Integer tinhThuongXuyen;

    @Column(name = "khoan_thoi_gian", columnDefinition = "INT", nullable = false)
    @NotNull(message = "Khoảng thời gian không được để trống")
    @Positive(message = "Khoảng thời gian phải là số nguyên dương")
    private Integer khoanThoiGian;

    public Integer tinhTongSoLuongThuoc() {
        if (lieuDung != null && tinhThuongXuyen != null && khoanThoiGian != null) {
            return lieuDung * tinhThuongXuyen * khoanThoiGian;
        }
        return 0;
    }
}