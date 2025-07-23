package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "LICH_LAM_VIEC_BAC_SI")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LichLamViecBacSi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lichlv_id", columnDefinition = "INT")
    private Integer lichlvId;

    @ManyToOne
    @JoinColumn(name = "bacsi_id", referencedColumnName = "bacsi_id", nullable = false, columnDefinition = "INT")
    @NotNull(message = "Bác sĩ không được để trống")
    private BacSi bacSi;

    @Column(name = "ngay", columnDefinition = "DATE", nullable = false)
    @NotNull(message = "Ngày làm việc không được để trống")
    private LocalDate ngay;

    @CreationTimestamp
    @Column(name = "ngay_tao", columnDefinition = "DATETIME", nullable = false, updatable = false)
    private LocalDateTime ngayTao;

    @UpdateTimestamp
    @PastOrPresent(message = "Ngày cập nhật không được lớn hơn ngày hiện tại")
    @Column(name = "ngay_cap_nhat", columnDefinition = "DATETIME")
    private LocalDateTime ngayCapNhat;

    @OneToMany(mappedBy = "lichLamViecBacSi", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichPhongKham> lichPhongKhams;

    @Column(name = "ca_truc", columnDefinition = "NVARCHAR(50)")
    private String caTruc;

    @Column(name = "ly_do_nghi", columnDefinition = "NVARCHAR(255)")
    private String lyDoNghi;

}