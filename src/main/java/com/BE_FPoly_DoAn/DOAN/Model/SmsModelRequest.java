package com.BE_FPoly_DoAn.DOAN.Model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SmsModelRequest {
    private String ApiKey ;
    private String SecretKey;
    private String IsUnicode ;
    private String Brandname;
    private String SmsType;
    private String Content;
    private String Phone;
    private String CallbackUrl;
}
