package com.BE_FPoly_DoAn.DOAN.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "PHONG_KHAM")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhongKham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phongkham_id", columnDefinition = "INT")
    private Integer phongKhamId;

    @Column(name = "so_phong", length = 4, columnDefinition = "NVARCHAR(4)", nullable = false)
    @NotBlank(message = "Số phòng không được để trống")
    @Size(max = 4, message = "Số phòng không được vượt quá 4 ký tự")
    private String soPhong;

    @Column(name = "loai_phong", length = 1, columnDefinition = "CHAR(1)", nullable = false)
    @NotBlank(message = "Loại phòng không được để trống")
    @Size(min = 1, max = 1, message = "Loại phòng phải có 1 ký tự")
    private String loaiPhong;

    @Column(name = "mo_ta", length = 250, columnDefinition = "NVARCHAR(250)")
    @Size(max = 250, message = "Mô tả không được vượt quá 250 ký tự")
    private String moTa;

    @OneToMany(mappedBy = "phongKham", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<LichPhongKham> lichPhongKhams;
}