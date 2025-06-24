package com.BE_FPoly_DoAn.DOAN.DTO;

import com.BE_FPoly_DoAn.DOAN.Entity.HoaDon;
import com.BE_FPoly_DoAn.DOAN.Entity.LichKham;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BenhNhanDTO {
    private String hoTen;
    private String gioiTinh;
    private String email;
    private String soDienThoai;
    private String baoHiem;
    private String lienHeKhanCap;
    private LocalDate ngayTao;
    private LocalDate ngayCapNhat;
    private List<LichKham> lichKhams;
    private List<HoaDon> hoaDons;

}
