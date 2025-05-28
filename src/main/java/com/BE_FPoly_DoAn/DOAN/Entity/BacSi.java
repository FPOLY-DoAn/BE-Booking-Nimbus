package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "BAC_SI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BacSi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bacsi_id;

    @ManyToOne
    @JoinColumn(name = "nguoidung_id")
    private NguoiDung nguoiDung;

    @ManyToOne
    @JoinColumn(name = "chuyenkhoa_id")
    private ChuyenKhoa chuyenKhoa;

    @Column(length = 25)
    private String chung_chi;

    @Column(length = 50)
    private String trinh_do;

    private Integer kinh_nghiem;

    private LocalDate ngay_tao;

    private LocalDate ngay_cap_nhat;
}