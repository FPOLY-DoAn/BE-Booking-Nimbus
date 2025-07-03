package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.*;


import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "LE_TAN")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeTan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "letan_id")
    private Integer leTanId;

    @OneToOne
    @JoinColumn(name = "nguoidung_id", referencedColumnName = "nguoidung_id", unique = true)
    private NguoiDung nguoiDung;

    @Column(name = "ngay_tuyen_dung")
    @NotNull(message = "Ngày tuyển dụng không được để trống")
    @PastOrPresent(message = "Ngày tuyển dụng không được là ngày trong tương lai")
    private LocalDate ngayTuyenDung;

    @Column(name = "chuc_vu", columnDefinition = "NVARCHAR(50)")
    private String chucVu;

    @Column(name = "ghi_chu", columnDefinition = "NVARCHAR(250)")
    private String ghiChu;

    @Column(name = "trang_thai_hoat_dong")
    @NotNull(message = "Trạng thái hoạt động không được để trống")
    private boolean trangThaiHoatDong;

    @OneToMany(mappedBy = "leTan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LichLamViecLeTan> lichLamViecs;
}