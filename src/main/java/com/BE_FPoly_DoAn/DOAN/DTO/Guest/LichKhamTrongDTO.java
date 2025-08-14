package com.BE_FPoly_DoAn.DOAN.DTO.Guest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LichKhamTrongDTO {
    private LocalDate ngay;
    private String caTruc;
    private Integer soGioTrong;
}