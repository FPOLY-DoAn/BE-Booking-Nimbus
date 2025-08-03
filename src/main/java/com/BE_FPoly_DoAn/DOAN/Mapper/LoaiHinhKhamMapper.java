package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.LoaiHinhKham.LoaiHinhKhamDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.LoaiHinhKham;

public class LoaiHinhKhamMapper {

    public static LoaiHinhKhamDTO toDto(LoaiHinhKham entity) {
        LoaiHinhKhamDTO dto = new LoaiHinhKhamDTO();
        dto.setLoaiId(entity.getLoaiId());
        dto.setTenLoai(entity.getTenLoai());
        dto.setMoTa(entity.getMoTa());
        dto.setGia(entity.getGia());
        return dto;
    }

    public static LoaiHinhKham toEntity(LoaiHinhKhamDTO dto) {
        LoaiHinhKham entity = new LoaiHinhKham();
        entity.setTenLoai(dto.getTenLoai());
        entity.setMoTa(dto.getMoTa());
        entity.setGia(dto.getGia());
        return entity;
    }

    public static void updateEntity(LoaiHinhKham entity, LoaiHinhKhamDTO dto) {
        entity.setTenLoai(dto.getTenLoai());
        entity.setMoTa(dto.getMoTa());
        entity.setGia(dto.getGia());
    }
}