package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.ChuyenKhoa.ChuyenKhoaDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.ChuyenKhoa;

public class ChuyenKhoaMapper {

    public static ChuyenKhoaDTO toDto(ChuyenKhoa entity) {
        ChuyenKhoaDTO dto = new ChuyenKhoaDTO();
        dto.setChuyenKhoaId(entity.getChuyenKhoaId());
        dto.setTenKhoa(entity.getTenKhoa());
        dto.setMoTa(entity.getMoTa());
        return dto;
    }

    public static ChuyenKhoa toEntity(ChuyenKhoaDTO dto) {
        return ChuyenKhoa.builder()
                .chuyenKhoaId(dto.getChuyenKhoaId())
                .tenKhoa(dto.getTenKhoa())
                .moTa(dto.getMoTa())
                .build();
    }

    public static void updateEntity(ChuyenKhoa entity, ChuyenKhoaDTO dto) {
        entity.setTenKhoa(dto.getTenKhoa());
        entity.setMoTa(dto.getMoTa());
    }
}