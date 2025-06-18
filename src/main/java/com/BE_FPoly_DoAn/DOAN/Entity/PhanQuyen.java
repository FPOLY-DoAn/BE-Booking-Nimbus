package com.BE_FPoly_DoAn.DOAN.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "PHAN_QUYEN")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PhanQuyen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phanquyen_id", columnDefinition = "INT")
    private Integer phanQuyenId;

    @ManyToOne
    @JoinColumn(name = "vaitro_id", referencedColumnName = "vaitro_id", nullable = false)
    @NotNull(message = "Vai trò không được để trống")
    @JsonIgnore
    @ToString.Exclude
    private VaiTro vaiTro;

    @ManyToOne
    @JoinColumn(name = "nguoidung_id", referencedColumnName = "nguoidung_id", nullable = false)
    @NotNull(message = "Người dùng không được để trống")
    @JsonIgnore
    @ToString.Exclude
    private NguoiDung nguoiDung;

    public PhanQuyen(VaiTro vaiTro, NguoiDung nguoiDung) {
        this.vaiTro = vaiTro;
        this.nguoiDung = nguoiDung;
    }
}