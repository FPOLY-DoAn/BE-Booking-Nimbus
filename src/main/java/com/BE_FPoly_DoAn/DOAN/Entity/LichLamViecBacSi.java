package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "LICH_LAM_VIEC_BAC_SI")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LichLamViecBacSi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lichlv_id", columnDefinition = "INT")
    private Integer lichlv_id;

    @ManyToOne
    @JoinColumn(name = "bacsi_id", referencedColumnName = "bacsi_id", columnDefinition = "INT")
    private BacSi bacSi;

    @Column(name = "ngay", columnDefinition = "DATE")
    private LocalDate ngay;

    @Column(name = "ngay_tao", columnDefinition = "DATE")
    private LocalDate ngay_tao;

    @Column(name = "ngay_cap_nhat", columnDefinition = "DATE")
    private LocalDate ngay_cap_nhat;

    @OneToMany(mappedBy = "lichLamViecBacSi", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichPhongKham> lichPhongKhams;
}