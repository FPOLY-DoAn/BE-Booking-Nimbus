package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "LE_TAN")
@Getter
@Setter
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

    @Column(name = "chuc_vu", columnDefinition = "NVARCHAR(50)")
    @NotBlank(message = "Chức vụ không được để trống")
    private String chucVu;

    @Column(name = "ghi_chu", columnDefinition = "NVARCHAR(250)")
    private String ghiChu;

    @Column(name = "ngay_tao")
    private LocalDate ngayTao;

    @Column(name = "ngay_cap_nhat")
    private LocalDate ngayCapNhat;

    @OneToMany(mappedBy = "leTan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LichLamViecLeTan> lichLamViecs;
}