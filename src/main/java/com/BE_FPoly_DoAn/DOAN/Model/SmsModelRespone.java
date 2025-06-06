package com.BE_FPoly_DoAn.DOAN.Model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SmsModelRespone {
    //Request được gửi đến ESMS thành công.
    private String CodeResult;
    //ID tin nhắn do esms trả về.
    private String CountRegenerate;
    //Thông tin lỗi trả về (nếu có lỗi).
    private String ErrorMessage;

}
