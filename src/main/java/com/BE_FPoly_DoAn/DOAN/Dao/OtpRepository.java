package com.BE_FPoly_DoAn.DOAN.Dao;

import com.BE_FPoly_DoAn.DOAN.Entity.OTP_NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDateTime;
import java.util.Optional;
@Repository
public interface OtpRepository extends JpaRepository<OTP_NguoiDung, Long > {
    Optional<OTP_NguoiDung> findByOtpCode(String otpCode);
    void deleteAllByOtpCode(String otpCode);
    void deleteByExpireAtBefore(LocalDateTime time);

    Optional<OTP_NguoiDung> findByEmail(String email);

    void deleteAllByEmail(String email);

    @Query("SELECT o FROM OTP_NguoiDung o WHERE o.email = :email AND o.verified = true AND o.expireAt > :now")
    Optional<OTP_NguoiDung> findVerifiedOtpByEmail(@Param("email") String email, @Param("now") LocalDateTime now);
}
