package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "LICH_PHONG_KHAM")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LichPhongKham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lichphongkham_id", columnDefinition = "INT")
    private Integer lichPhongKhamId;

    @NotNull(message = "Lịch làm việc bác sĩ không được để trống")
    @ManyToOne
    @JoinColumn(name = "lichlv_id", referencedColumnName = "lichlv_id", nullable = false, columnDefinition = "INT")
    private LichLamViecBacSi lichLamViecBacSi;

    @NotNull(message = "Phòng khám không được để trống")
    @ManyToOne
    @JoinColumn(name = "phongkham_id", referencedColumnName = "phongkham_id", nullable = false, columnDefinition = "INT")
    private PhongKham phongKham;
}