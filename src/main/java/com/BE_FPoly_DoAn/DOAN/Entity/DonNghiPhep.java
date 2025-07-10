package com.BE_FPoly_DoAn.DOAN.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "DON_NGHI_PHEP")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DonNghiPhep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "don_id", columnDefinition = "INT")
    private Integer donNghiPhepId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bacsi_id", referencedColumnName = "bacsi_id", columnDefinition = "INT")
    @NotNull(message = "Bác sĩ không được để trống")
    @JsonBackReference
    @Schema(hidden = true)
    private BacSi bacSi;

    @Column(name = "ngay_bat_dau", columnDefinition = "DATE")
    @NotNull(message = "Ngày bắt đầu không được để trống")
    private LocalDate ngayBatDau;

    @Column(name = "ngay_ket_thuc", columnDefinition = "DATE")
    @NotNull(message = "Ngày kết thúc không được để trống")
    private LocalDate ngayKetThuc;

    @Column(name = "ly_do", columnDefinition = "NVARCHAR(255)")
    private String lyDo;

    @CreationTimestamp
    @Column(name = "ngay_tao", columnDefinition = "DATETIME", updatable = false)
    private LocalDateTime ngayTao;

    @UpdateTimestamp
    @Column(name = "ngay_cap_nhat", columnDefinition = "DATETIME")
    private LocalDateTime ngayCapNhat;

    @Column(name = "ngay_gui", columnDefinition = "DATETIME", nullable = false)
    private LocalDateTime ngayGui;

    @Enumerated(EnumType.STRING)
    @Column(name = "trang_thai", length = 20, nullable = false)
    private TrangThai trangThai;

    @Column(name = "ly_do_tu_choi", columnDefinition = "NVARCHAR(255)")
    private String lyDoTuChoi;

    public enum TrangThai {
        CHO_DUYET, DUOC_DUYET, TU_CHOI
    }
}