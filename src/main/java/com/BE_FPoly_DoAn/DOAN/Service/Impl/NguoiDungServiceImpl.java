package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.DTO.NguoiDungDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.NguoiDungRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.VaiTroRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.NguoiDung;
import com.BE_FPoly_DoAn.DOAN.Entity.PhanQuyen;
import com.BE_FPoly_DoAn.DOAN.Entity.VaiTro;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Security.RedisTemplateConfig;
import com.BE_FPoly_DoAn.DOAN.Service.NguoiDungService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class NguoiDungServiceImpl implements NguoiDungService {

    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    @Autowired
    private MailConfig mailConfig;

    @Autowired
    private RedisTemplateConfig redisTemplateConfig;

    @Autowired
    private PhanQuyenServiceImpl phanQuyenService;

    @Autowired
    private VaiTroRepository vaiTroRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public NguoiDung findBySoDienThoai(String soDienThoai) {
        return nguoiDungRepository.findByEmail(soDienThoai).get();
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<NguoiDung> nguoiDungOption = nguoiDungRepository.findByEmail(email);
        if (nguoiDungOption.isEmpty()) {
            throw new UsernameNotFoundException("tài khoản không được tìm thấy");
        }
        User user = new User(nguoiDungOption.get().getEmail(), nguoiDungOption.get().getMatKhau(), toRolesAuthories(nguoiDungOption.get().getPhanQuyens()));
        return user;
    }

    private Collection<? extends GrantedAuthority> toRolesAuthories(List<PhanQuyen> phanQuyens) {
        return phanQuyens.stream()
                .map(quyen -> new SimpleGrantedAuthority(quyen.getVaiTro().getTenVaiTro()))
                .collect(Collectors.toList());
    }

    @Override
    public List<NguoiDung> getAll() {
        return nguoiDungRepository.findAll();
    }

    @Override
    public Optional<NguoiDung> getById(Integer id) {
        return nguoiDungRepository.findById(id);
    }

    @Override
    public ServiceResponse<?> delete(Integer id) {
        nguoiDungRepository.findById(id).ifPresent(nguoiDungRepository::delete);
        return ServiceResponse.error(NotificationCode.USER_EMAIL_EXISTS.code(), NotificationCode.USER_EMAIL_EXISTS.message());
    }

    public Optional<NguoiDung> findByHoTen(String hoTen) {
        return nguoiDungRepository.findByHoTen(hoTen);
    }

    @Override
    public ServiceResponse<?> save(int otpCode) {
        try {
            //kiểm tra otp
            if (!redisTemplateConfig.redisTemplate().hasKey("nguoiDung:" + otpCode)) {
                return ServiceResponse.error(NotificationCode.OTP_INVALID.code(), NotificationCode.OTP_INVALID.message());
            }
            String nguoiDungJSON = redisTemplateConfig.redisTemplate().opsForValue().get("nguoiDung:" + otpCode);
            NguoiDung nguoiDung = objectMapper.readValue(nguoiDungJSON, NguoiDung.class);
            //mã hóa mật khẩu
            BCryptPasswordEncoder passwordEncoder= new BCryptPasswordEncoder();
            String enscryptPassword = passwordEncoder.encode(nguoiDung.getMatKhau());
            nguoiDung.setMatKhau(enscryptPassword);
            //set vai trò cho người dùng
            VaiTro vaiTro = vaiTroRepository.getById(2);
            PhanQuyen phanQuyen = new PhanQuyen(vaiTro, nguoiDung);
            nguoiDungRepository.save(nguoiDung);
            phanQuyenService.save(phanQuyen);
            redisTemplateConfig.redisTemplate().delete("nguoiDung:" + otpCode);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return ServiceResponse.success();
    }


    public boolean sendCodeConfirm(NguoiDungDTO nguoiDung) {
        try {
            String otpCode = generateOtpCode();
            String nguoiDungJson = objectMapper.writeValueAsString(nguoiDung);
            redisTemplateConfig.redisTemplate().opsForValue().set("nguoiDung:" + otpCode, nguoiDungJson, Duration.ofMinutes(5));
            String text = """
                    <div style="font-family: 'Segoe UI', sans-serif; padding: 20px; background: #f6f8fc; color: #333;">
                        <div style="max-width: 500px; margin: auto; background: white; padding: 30px; border-radius: 10px; box-shadow: 0 5px 15px rgba(0,0,0,0.1);">
                            <h2 style="text-align: center; color: #0a5bff;">Mimbus - Xác nhận tài khoản</h2>
                            <p>Xin chào <strong>%s</strong>,</p>
                            <p>Cảm ơn bạn đã đăng ký tài khoản tại <strong>Nimbus</strong> – hệ thống đặt lịch khám bệnh hiện đại.</p>
                            <p style="margin: 20px 0;">Mã xác nhận của bạn là:</p>
                            <div style="font-size: 24px; font-weight: bold; text-align: center; letter-spacing: 5px; background: #f0f3ff; padding: 15px; border-radius: 8px; color: #0a5bff;">
                                %s
                            </div>
                            <p style="margin-top: 30px;">Mã này sẽ hết hạn sau 5 phút. Vui lòng không chia sẻ mã này với bất kỳ ai.</p>
                            <p style="margin-top: 30px;">Trân trọng,<br><strong>Đội ngũ Mimbus</strong></p>
                        </div>
                    </div>
                    """.formatted(nguoiDung.getHoTen(), otpCode);
            mailConfig.sendTo("dai582005@gmail.com", nguoiDung.getEmail(), "Xác nhận tài khoản", text);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;}}

    private String generateOtpCode() {
        Random random = new Random();
        return String.valueOf(100000 + random.nextInt(99999));}

    public ServiceResponse<?> checkAccountRegister(NguoiDungDTO nguoiDung) {
        if (nguoiDung.getHoTen() == null || nguoiDung.getEmail() == null ||
                nguoiDung.getGioiTinh() == null || nguoiDung.getSoDienThoai() == null || nguoiDung.getMatKhau() == null) {
            return ServiceResponse.error(NotificationCode.USER_REGISTER_NOT_ENGOUGH.code(), NotificationCode.USER_REGISTER_NOT_ENGOUGH.message());
        } else if (nguoiDungRepository.existsByEmail(nguoiDung.getEmail())) {

            return ServiceResponse.error(NotificationCode.USER_EMAIL_EXISTS.code(), NotificationCode.USER_EMAIL_EXISTS.message());
        } else if (nguoiDungRepository.existsBySoDienThoai(nguoiDung.getSoDienThoai())) {

            return ServiceResponse.error(NotificationCode.USER_SODIENTHOAI_EXISTS.code(), NotificationCode.USER_SODIENTHOAI_EXISTS.message());
        }
        return ServiceResponse.success();
    }

}