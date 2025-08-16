package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamShortDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.*;

public class LichKhamMapper {

    public static LichKham toEntity(LichKhamDTO dto, BacSi bacSi, BenhNhan benhNhan, LoaiHinhKham loaiHinhKham) {
        LichKham entity = new LichKham();
        entity.setLichkhamId(dto.getLichkhamId());
        entity.setBacSi(bacSi);
        entity.setBenhNhan(benhNhan);
        entity.setThoiGianTu(dto.getThoiGianTu());
        entity.setThoiGianDen(dto.getThoiGianDen());
        entity.setLoaiHinhKham(loaiHinhKham);
        entity.setTrangThai(dto.getTrangThai());
        entity.setGhiChu(dto.getGhiChu());
        entity.setNgayKham(dto.getNgayKham());
        entity.setCaKham(dto.getCaKham());
        return entity;
    }

    public static LichKhamDTO toDTO(LichKham entity) {
        LichKhamDTO dto = new LichKhamDTO();
        dto.setLichkhamId(entity.getLichkhamId());
        dto.setBacSiId(entity.getBacSi() != null ? entity.getBacSi().getBacSiId() : null);
        dto.setBenhNhanId(entity.getBenhNhan() != null ? entity.getBenhNhan().getBenhNhanId() : null);
        dto.setThoiGianTu(entity.getThoiGianTu());
        dto.setThoiGianDen(entity.getThoiGianDen());
        dto.setLoaiHinhKham(entity.getLoaiHinhKham() != null ? entity.getLoaiHinhKham().getTenLoai() : null);
        dto.setTrangThai(entity.getTrangThai());
        dto.setGhiChu(entity.getGhiChu());
        dto.setNgayKham(entity.getNgayKham());
        dto.setCaKham(entity.getCaKham());
        dto.setNgayCapNhat(entity.getNgayCapNhat());
        return dto;
    }

    public static LichKhamShortDTO toShortDTO(LichKham entity) {
        if (entity == null) return null;

        return LichKhamShortDTO.builder()
                .lichkhamId(entity.getLichkhamId())
                .bacSiId(entity.getBacSi().getBacSiId())
                .thoiGianHen(entity.getThoiGianTu())
                .trangThai(entity.getTrangThai())
                .ngayKham(entity.getNgayKham())
                .build();
    }
}