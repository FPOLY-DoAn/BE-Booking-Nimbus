package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.OtpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

public class OtpClearning {
    @Autowired
    private OtpRepository otpRepository;

    @Scheduled(fixedRate = 3600000)
    public void deleteExpiredOtps() {
        otpRepository.deleteByExpireAtBefore(LocalDateTime.now());
    }
}
