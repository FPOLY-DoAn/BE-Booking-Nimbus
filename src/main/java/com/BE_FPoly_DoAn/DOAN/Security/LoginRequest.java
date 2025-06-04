package com.BE_FPoly_DoAn.DOAN.Security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginRequest {
    private String soDienThoai;
    private String matKhau;
}
