package com.BE_FPoly_DoAn.DOAN.DTO;

import java.time.LocalTime;

public enum CaKham {
    SANG(LocalTime.of(8,0), LocalTime.of(11,0)),
    CHIEU(LocalTime.of(13,0), LocalTime.of(16,0)),
    TOI(LocalTime.of(17,0), LocalTime.of(20,0));

    private final LocalTime start;
    private final LocalTime end;

    CaKham(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    public LocalTime getStart() { return start; }
    public LocalTime getEnd() { return end; }

    public static CaKham fromViet(String caViet) {
        return switch(caViet.trim().toLowerCase()) {
            case "sáng" -> SANG;
            case "chiều" -> CHIEU;
            case "tối" -> TOI;
            default -> throw new IllegalArgumentException("Ca không hợp lệ: " + caViet);
        };
    }
}