package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.DichVuDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.DichVu;

public class DichVuMapper {

    public static DichVuDTO toDto(DichVu entity) {
        DichVuDTO dto = new DichVuDTO();
        dto.setDichVuId(entity.getDichVuId());
        dto.setTenDichVu(entity.getTenDichVu());
        dto.setMoTa(entity.getMoTa());
        dto.setGia(entity.getGia());
        return dto;
    }

    public static DichVu toEntity(DichVuDTO dto) {
        DichVu entity = new DichVu();
        entity.setTenDichVu(dto.getTenDichVu());
        entity.setMoTa(dto.getMoTa());
        entity.setGia(dto.getGia());
        return entity;
    }

    public static void updateEntity(DichVu entity, DichVuDTO dto) {
        entity.setTenDichVu(dto.getTenDichVu());
        entity.setMoTa(dto.getMoTa());
        entity.setGia(dto.getGia());
    }
}
