package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "NGUOI_DUNG")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nguoidung_id;

    @Column(nullable = false, length = 50)
    private String hoten;

    @Column(length = 1)
    private String gioi_tinh;

    @Column(length = 50)
    private String email;

    @Column(length = 15)
    private String so_dien_thoai;

    @Column(nullable = false, length = 255)
    private String mat_khau;

    private LocalDateTime ngay_tao;

    private LocalDateTime ngay_cap_nhat;
}