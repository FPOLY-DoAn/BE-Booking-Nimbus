package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.DonNghiPhepDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.BacSi;
import com.BE_FPoly_DoAn.DOAN.Entity.DonNghiPhep;

import java.time.LocalDateTime;

public class DonNghiPhepMapper {

    public static DonNghiPhep toEntity(DonNghiPhepDTO dto, BacSi bacSi) {
        return DonNghiPhep.builder()
                .bacSi(bacSi)
                .ngayBatDau(dto.getNgayBatDau())
                .ngayKetThuc(dto.getNgayKetThuc())
                .lyDo(dto.getLyDo())
                .ngayGui(LocalDateTime.now())
                .trangThai(DonNghiPhep.TrangThai.CHO_DUYET)
                .build();
    }

    public static DonNghiPhepDTO toDto(DonNghiPhep entity) {
        return DonNghiPhepDTO.builder()
                .bacSiId(entity.getBacSi() != null ? entity.getBacSi().getBacSiId() : null)
                .ngayBatDau(entity.getNgayBatDau())
                .ngayKetThuc(entity.getNgayKetThuc())
                .lyDo(entity.getLyDo())
                .build();
    }
}