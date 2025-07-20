package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.LoaiHinhKham.LoaiHinhKhamDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.DichVu;

public class DichVuMapper {

    public static LoaiHinhKhamDTO toDto(DichVu entity) {
        LoaiHinhKhamDTO dto = new LoaiHinhKhamDTO();
        dto.setDichVuId(entity.getDichVuId());
        dto.setTenDichVu(entity.getTenDichVu());
        dto.setMoTa(entity.getMoTa());
        dto.setGia(entity.getGia());
        return dto;
    }

    public static DichVu toEntity(LoaiHinhKhamDTO dto) {
        DichVu entity = new DichVu();
        entity.setTenDichVu(dto.getTenDichVu());
        entity.setMoTa(dto.getMoTa());
        entity.setGia(dto.getGia());
        return entity;
    }

    public static void updateEntity(DichVu entity, LoaiHinhKhamDTO dto) {
        entity.setTenDichVu(dto.getTenDichVu());
        entity.setMoTa(dto.getMoTa());
        entity.setGia(dto.getGia());
    }
}
