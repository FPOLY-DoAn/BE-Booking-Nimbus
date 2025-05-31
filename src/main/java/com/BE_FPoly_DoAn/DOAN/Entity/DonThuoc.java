package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "DON_THUOC")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonThuoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "donthuoc_id", columnDefinition = "INT")
    private Integer donThuocId;

    @ManyToOne
    @JoinColumn(name = "ppdieutri_id", referencedColumnName = "ppdieutri_id", columnDefinition = "INT")
    private PhuongPhapDieuTri phuongPhapDieuTri;

    @Column(name = "ngay_phat_hanh", columnDefinition = "DATETIME")
    private LocalDateTime ngayPhatHanh;

    @OneToMany(mappedBy = "donThuoc", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<ChiTietDonThuoc> chiTietDonThuocs;
}