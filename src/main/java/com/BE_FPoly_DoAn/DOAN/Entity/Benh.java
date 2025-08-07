package com.BE_FPoly_DoAn.DOAN.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "BENH")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Benh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "benh_id", columnDefinition = "INT")
    private Integer benhId;

    @Column(name = "ten_benh", length = 50, columnDefinition = "NVARCHAR(50)")
    @NotBlank(message = "Tên bệnh không được để trống")
    private String tenBenh;

    @Column(name = "trieu_chung", length = 225, columnDefinition = "NVARCHAR(225)")
    @NotBlank(message = "Triệu chứng không được để trống")
    private String trieuChung;

    @Column(name = "nguyen_nhan", length = 225, columnDefinition = "NVARCHAR(225)")
    @NotBlank(message = "Nguyên nhân không được để trống")
    private String nguyenNhan;

    @Column(name = "phong_ngua", length = 225, columnDefinition = "NVARCHAR(225)")
    @NotBlank(message = "Phòng ngừa không được để trống")
    private String phongNgua;

    @Column(name = "huong_dieu_tri", length = 225, columnDefinition = "NVARCHAR(225)")
    @NotBlank(message = "Hướng điều trị không được để trống")
    private String huongDieuTri;

    @Column(name = "ghi_chu", length = 225, columnDefinition = "NVARCHAR(225)")
    private String ghiChu;

    @OneToMany(mappedBy = "benh", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<HoSoBenhAn> hoSoBenhAns;
}