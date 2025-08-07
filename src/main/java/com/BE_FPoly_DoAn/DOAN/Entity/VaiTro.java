package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "VAI_TRO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VaiTro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vaitro_id", columnDefinition = "INT")
    private Integer vaiTroId;

    @Column(name = "ten_vai_tro", nullable = false, length = 50, columnDefinition = "NVARCHAR(50)")
    @NotBlank(message = "Tên vai trò không được để trống")
    @Size(max = 50, message = "Tên vai trò không được vượt quá 50 ký tự")
    private String tenVaiTro;

    @Column(name = "mo_ta", length = 225, columnDefinition = "NVARCHAR(225)")
    @Size(max = 225, message = "Mô tả không được vượt quá 225 ký tự")
    private String moTa;

    @OneToMany(mappedBy = "vaiTro", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<PhanQuyen> phanQuyens;
}