package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.NguoiDungDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;

public class NguoiDungMapper {

    public static NguoiDungDTO toDTO(NguoiDung entity) {
        NguoiDungDTO dto = new NguoiDungDTO();
        dto.setHoTen(entity.getHoTen());
        dto.setGioiTinh(entity.getGioiTinh());
        dto.setEmail(entity.getEmail());
        dto.setSoDienThoai(entity.getSoDienThoai());
        dto.setMatKhau(entity.getMatKhau());
        return dto;
    }

    public static void updateEntity(NguoiDung entity, NguoiDungDTO dto) {
        entity.setHoTen(dto.getHoTen());
        entity.setGioiTinh(dto.getGioiTinh());
        entity.setEmail(dto.getEmail());
        entity.setSoDienThoai(dto.getSoDienThoai());
    }
}