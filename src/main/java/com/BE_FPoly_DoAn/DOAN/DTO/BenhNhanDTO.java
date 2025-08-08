package com.BE_FPoly_DoAn.DOAN.DTO;

import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.HoaDonShortDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamShortDTO;
import lombok.*;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BenhNhanDTO {

    private Integer benhNhanId;
    private String hoTen;
    private String gioiTinh;
    private String email;
    private String soDienThoai;
    private String baoHiem;
    private String lienHeKhanCap;
    private String diaChi;
    private String canCuocCongDan;
    private String danToc;
    private LocalDate ngayTao;
    private LocalDate ngayCapNhat;
//    private List<LichKhamShortDTO> lichKhams;
//    private List<HoaDonShortDTO> hoaDons;
}