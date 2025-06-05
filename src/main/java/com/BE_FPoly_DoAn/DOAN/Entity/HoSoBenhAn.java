package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "HO_SO_BENH_AN")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HoSoBenhAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hoso_id", columnDefinition = "INT")
    private Integer hoSoId;

    @ManyToOne
    @JoinColumn(name = "benhan_id", nullable = false, referencedColumnName = "benhan_id", columnDefinition = "INT")
    @NotNull(message = "Bệnh án không được để trống")
    private BenhAn benhAn;

    @ManyToOne
    @JoinColumn(name = "benh_id", nullable = false, referencedColumnName = "benh_id", columnDefinition = "INT")
    @NotNull(message = "Bệnh không được để trống")
    private Benh benh;

    @CreationTimestamp
    @Column(name = "ngay_tao", columnDefinition = "DATETIME", updatable = false)
    private LocalDateTime ngayTao;
}