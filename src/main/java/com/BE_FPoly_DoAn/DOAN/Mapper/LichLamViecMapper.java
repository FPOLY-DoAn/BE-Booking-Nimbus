package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.LichLamViecResponseDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;

public class LichLamViecMapper {
    public static LichLamViecResponseDTO toDto(LichLamViecBacSi entity) {
        return LichLamViecResponseDTO.builder()
                .lichId(entity.getLichlvId())
                .ngay(entity.getNgay())
                .caTruc(entity.getCaTruc())
                .lyDoNghi(entity.getLyDoNghi())
                .build();
    }
}