package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "DON_THUOC")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DonThuoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "donthuoc_id", columnDefinition = "INT")
    private Integer donThuocId;

    @ManyToOne
    @JoinColumn(name = "ppdieutri_id", referencedColumnName = "ppdieutri_id", columnDefinition = "INT", nullable = false)
    @NotNull(message = "Phương pháp điều trị không được để trống")
    private PhuongPhapDieuTri phuongPhapDieuTri;

    @CreationTimestamp
    @Column(name = "ngay_phat_hanh", columnDefinition = "DATETIME", updatable = false)
    private LocalDateTime ngayPhatHanh;

    @OneToMany(mappedBy = "donThuoc", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<ChiTietDonThuoc> chiTietDonThuocs;
}