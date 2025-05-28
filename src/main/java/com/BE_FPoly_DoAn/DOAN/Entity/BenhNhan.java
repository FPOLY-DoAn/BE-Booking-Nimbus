package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "BENH_NHAN")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BenhNhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer benhnhan_id;

    @ManyToOne
    @JoinColumn(name = "nguoidung_id")
    private NguoiDung nguoiDung;

    @Column(length = 25)
    private String bao_hiem;

    @Column(length = 50)
    private String lien_he_khan_cap;

    private LocalDate ngay_tao;

    private LocalDate ngay_cap_nhat;
}