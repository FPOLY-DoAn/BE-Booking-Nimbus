package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSiDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.*;

public class BacSiMapper {

    public static BacSiDTO toDto(BacSi entity) {
        BacSiDTO dto = new BacSiDTO();

        NguoiDung nd = entity.getNguoiDung();
        if (nd != null) {
            dto.setHoTen(nd.getHoTen());
            dto.setGioiTinh(nd.getGioiTinh());
            dto.setEmail(nd.getEmail());
            dto.setSoDienThoai(nd.getSoDienThoai());
            dto.setMatKhau(nd.getMatKhau());
        }

        dto.setChuyenKhoaId(entity.getChuyenKhoa() != null
                ? entity.getChuyenKhoa().getChuyenKhoaId() : null);
        dto.setChungChi(entity.getChungChi());
        dto.setTrinhDo(entity.getTrinhDo());
        dto.setKinhNghiem(entity.getKinhNghiem());
        dto.setNgayTuyenDung(entity.getNgayTuyenDung());
        dto.setGhiChu(entity.getGhiChu());
        dto.setTrangThaiHoatDong(entity.getTrangThaiHoatDong());

        return dto;
    }

    public static BacSi toEntity(BacSiDTO dto, ChuyenKhoa ck) {

        NguoiDung nd = NguoiDung.builder()
                .hoTen(dto.getHoTen())
                .gioiTinh(dto.getGioiTinh())
                .email(dto.getEmail())
                .soDienThoai(dto.getSoDienThoai())
                .matKhau(dto.getMatKhau())
                .build();

        return BacSi.builder()
                .nguoiDung(nd)
                .chuyenKhoa(ck)
                .chungChi(dto.getChungChi())
                .trinhDo(dto.getTrinhDo())
                .kinhNghiem(dto.getKinhNghiem())
                .ngayTuyenDung(dto.getNgayTuyenDung())
                .ghiChu(dto.getGhiChu())
                .trangThaiHoatDong(dto.getTrangThaiHoatDong())
                .build();
    }

    public static void updateEntity(BacSi entity, BacSiDTO dto, ChuyenKhoa ck) {

        NguoiDung nd = entity.getNguoiDung();
        nd.setHoTen(dto.getHoTen());
        nd.setGioiTinh(dto.getGioiTinh());
        nd.setEmail(dto.getEmail());
        nd.setSoDienThoai(dto.getSoDienThoai());
        nd.setMatKhau(dto.getMatKhau());

        entity.setChuyenKhoa(ck);
        entity.setChungChi(dto.getChungChi());
        entity.setTrinhDo(dto.getTrinhDo());
        entity.setKinhNghiem(dto.getKinhNghiem());
        entity.setNgayTuyenDung(dto.getNgayTuyenDung());
        entity.setGhiChu(dto.getGhiChu());
        entity.setTrangThaiHoatDong(dto.getTrangThaiHoatDong());
    }
}