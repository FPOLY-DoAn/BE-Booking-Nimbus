package com.BE_FPoly_DoAn.DOAN.Mapper;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSi.LichLamViecResponseDto;
import com.BE_FPoly_DoAn.DOAN.Entity.LichLamViecBacSi;

public class LichLamViecMapper {
    public static LichLamViecResponseDto toDto(LichLamViecBacSi entity) {
        return LichLamViecResponseDto.builder()
                .lichId(entity.getLichlvId())
                .ngay(entity.getNgay())
                .caTruc(entity.getCaTruc())
                .lyDoNghi(entity.getLyDoNghi())
                .build();
    }
}