package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Entity
@Table(name = "GIO_KHAM_CHI_TIET")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GioKhamChiTiet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gio_kham_id", columnDefinition = "INT")
    private Integer gioKhamId;

    @ManyToOne
    @JoinColumn(name = "lichlv_id", nullable = false, columnDefinition = "INT")
    private LichLamViecBacSi lichLamViecBacSi;

    @Column(name = "thoi_gian", nullable = false, columnDefinition = "TIME")
    private LocalTime thoiGian;

    @Column(name = "trang_thai", columnDefinition = "BIT")
    private Boolean trangThai;

}