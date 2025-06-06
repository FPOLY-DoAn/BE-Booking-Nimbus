package com.BE_FPoly_DoAn.DOAN.Client;

import com.BE_FPoly_DoAn.DOAN.Model.SmsModelRequest;
import com.BE_FPoly_DoAn.DOAN.Model.SmsModelRespone;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "smsClient", url = "https://rest.esms.vn")
public interface SmsClient {
    @PostMapping(  value = "/MainService.svc/json/SendMultipleMessage_V4_post_json/",
            consumes = "application/json",
            produces = "application/json")
    SmsModelRespone smsModelRespone(@RequestBody SmsModelRequest smsModelRequest);
    @PostMapping(value = "/MainService.svc/json/SendMultipleMessage_V4_post_json/",
            consumes = "application/json",
            produces = "application/json")
    String smsModelResponeRaw(@RequestBody SmsModelRequest smsModelRequest);
}
