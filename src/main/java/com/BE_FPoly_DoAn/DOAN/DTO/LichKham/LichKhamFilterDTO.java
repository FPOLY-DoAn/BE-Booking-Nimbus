package com.BE_FPoly_DoAn.DOAN.DTO.LichKham;

import com.BE_FPoly_DoAn.DOAN.Entity.LichKham;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LichKhamFilterDTO {
    private LocalDate ngayKham;
    private Integer bacSiId;
    private LichKham.TrangThaiLichKham trangThai;
}