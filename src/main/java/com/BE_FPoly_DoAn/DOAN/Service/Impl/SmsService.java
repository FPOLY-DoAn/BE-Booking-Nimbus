package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Client.SmsClient;
import com.BE_FPoly_DoAn.DOAN.Model.SmsModelRequest;
import com.BE_FPoly_DoAn.DOAN.Model.SmsModelRespone;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class SmsService {
    private final SmsClient smsClient;
    //Cấu hình gửi mã
    public SmsModelRespone sendCodeAuth(long soDienThoai){
        Random random = new Random();
        int code =  10000 + random.nextInt(90000);
        SmsModelRequest newSmsModelRequest = SmsModelRequest.builder()
                .ApiKey("2FAD564BAF90FA4AA41CF482A9E001")
                .SecretKey("3F1E11C2BCEB47BD15B2CD24660712")
                .IsUnicode("1")
                .Brandname("Bệnh Viện Nimbus")
                .SmsType("2")
                .Phone(String.valueOf(soDienThoai))
                .Content(code + ": Là mã kích hoạt Đăng kí xác thực Bệnh Viện Nimbus của Quý Khách. Trân Trọng!")
                .CallbackUrl("")
                .build();

        SmsModelRespone smsModelRespone = smsClient.smsModelRespone(newSmsModelRequest);
        System.out.println("sms" + smsModelRespone.getCodeResult());
        String rawResponse = smsClient.smsModelResponeRaw(newSmsModelRequest);
        System.out.println("Raw response: " + rawResponse);
        return smsModelRespone;
    }
}
