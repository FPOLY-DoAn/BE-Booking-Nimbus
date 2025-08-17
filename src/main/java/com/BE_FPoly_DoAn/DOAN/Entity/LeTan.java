package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nguoidung_id", referencedColumnName = "nguoidung_id", unique = true)
    private NguoiDung nguoiDung;

    @Column(name = "ngay_tuyen_dung")
    @NotNull(message = "Ngày tuyển dụng không được để trống")
    @PastOrPresent(message = "Ngày tuyển dụng không được là ngày trong tương lai")
    private LocalDate ngayTuyenDung;

    @CreationTimestamp
    @Column(name = "ngay_tao", columnDefinition = "DATE")
    private LocalDate ngayTao;

    @UpdateTimestamp
    @Column(name = "ngay_cap_nhat", columnDefinition = "DATE")
    private LocalDate ngayCapNhat;

    @Column(name = "chuc_vu", length = 50,columnDefinition = "NVARCHAR(50)")
    private String chucVu;

    @Column(name = "ghi_chu", length = 225,columnDefinition = "NVARCHAR(225)")
    private String ghiChu;

    @Column(name = "trang_thai_hoat_dong")
    private Boolean trangThaiHoatDong;

    @OneToMany(mappedBy = "leTan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LichLamViecLeTan> lichLamViecs;
}