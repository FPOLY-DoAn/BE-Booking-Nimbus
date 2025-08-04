package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.LichLamViecResponseDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;

public class LichLamViecMapper {

    public static LichLamViecResponseDTO toDto(LichLamViecBacSi entity) {
        LichLamViecResponseDTO dto = new LichLamViecResponseDTO();
        dto.setLichlvId(entity.getLichlvId());
        dto.setNgay(entity.getNgay());
        dto.setCaTruc(entity.getCaTruc());
        dto.setLyDoNghi(entity.getLyDoNghi());

        if (entity.getBacSi() != null) {
            dto.setBacSiId(entity.getBacSi().getBacSiId());
            dto.setTenBacSi(entity.getBacSi().getNguoiDung().getHoTen());
        }

        return dto;
    }
}