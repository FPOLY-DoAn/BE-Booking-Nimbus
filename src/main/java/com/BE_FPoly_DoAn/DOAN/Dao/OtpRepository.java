package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.OTP_NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;
@Repository
public interface OtpRepository extends JpaRepository<OTP_NguoiDung, Long > {
    Optional<OTP_NguoiDung> findByOtpCode(String otpCode);
    void deleteAllByOtpCode(String otpCode);
    void deleteByExpireAtBefore(LocalDateTime time);

}
