package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "DON_THUOC")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonThuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer donthuoc_id;

    @ManyToOne
    @JoinColumn(name = "ppdieutri_id")
    private PhuongPhapDieuTri phuongPhapDieuTri;

    private LocalDateTime ngay_phat_hanh;
}