package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.DTO.BenhNhanDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.NguoiDungDTO;
import com.BE_FPoly_DoAn.DOAN.Dao.BenhNhanRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.NguoiDungRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.OtpRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.VaiTroRepository;
import com.BE_FPoly_DoAn.DOAN.Entity.*;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.InterfaceService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class NguoiDungServiceImpl implements InterfaceService<NguoiDung>, UserDetailsService {


    private final NguoiDungRepository nguoiDungRepository;
    private final MailConfig mailConfig;
    private final PhanQuyenServiceImpl phanQuyenService;
    private final VaiTroRepository vaiTroRepository;
    private final BenhNhanRepository benhNhanRepository;
    private final OtpRepository otpRepository;

    public NguoiDungServiceImpl(NguoiDungRepository nguoiDungRepository, MailConfig mailConfig, PhanQuyenServiceImpl phanQuyenService, VaiTroRepository vaiTroRepository, BenhNhanRepository benhNhanRepository, OtpRepository otpRepository) {
        this.nguoiDungRepository = nguoiDungRepository;
        this.mailConfig = mailConfig;
        this.phanQuyenService = phanQuyenService;
        this.vaiTroRepository = vaiTroRepository;
        this.benhNhanRepository = benhNhanRepository;
        this.otpRepository = otpRepository;
    }

    public NguoiDung findByEmail(String email) {
        return nguoiDungRepository.findByEmail(email).get();
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
                .map(quyen -> {
                    String vaiTroGoc = quyen.getVaiTro().getTenVaiTro();
                    String role = switch (vaiTroGoc) {
                        case "bác sĩ" -> "ROLE_BACSI";
                        case "bệnh nhân" -> "ROLE_BENHNHAN";
                        case "quản lý" -> "ROLE_QUANLY";
                        case "lễ tân" -> "ROLE_LETAN";
                        default -> "ROLE_UNKNOWN";
                    };
                    return new SimpleGrantedAuthority(role);

                }).collect(Collectors.toList());
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
    public NguoiDung save(NguoiDung thanhToan) {
        return null;
    }

    @Override
    public void delete(NguoiDung id) {

    }

    public Optional<NguoiDung> updateNguoiDung_BenhNhan(BenhNhanDTO benhNhanDTO) {
        try {
            Optional<NguoiDung> optionalNguoiDung = nguoiDungRepository.findByEmail(benhNhanDTO.getEmail());

            if (optionalNguoiDung.isEmpty()) {
                return Optional.empty();
            }

            NguoiDung nguoiDung = optionalNguoiDung.get();
            Optional<BenhNhan> optionalBenhNhan = benhNhanRepository.getByNguoiDung(nguoiDung);

            if (optionalBenhNhan.isEmpty()) {
                return Optional.empty();
            }

            BenhNhan benhNhan = optionalBenhNhan.get();

            if (benhNhanDTO.getEmail() != null) {
                nguoiDung.setEmail(benhNhanDTO.getEmail());
            }

            if (benhNhanDTO.getHoTen() != null) {
                nguoiDung.setHoTen(benhNhanDTO.getHoTen());
            }

            if (benhNhanDTO.getSoDienThoai() != null) {
                nguoiDung.setSoDienThoai(benhNhanDTO.getSoDienThoai());
            }

            if (benhNhanDTO.getGioiTinh() != null && !benhNhanDTO.getGioiTinh().isEmpty()) {
                nguoiDung.setGioiTinh(benhNhanDTO.getGioiTinh().charAt(0));
            }

            nguoiDungRepository.save(nguoiDung);

            benhNhan.setBaoHiem(benhNhanDTO.getBaoHiem());
            benhNhan.setLienHeKhanCap(benhNhanDTO.getLienHeKhanCap());
            benhNhan.setNgayCapNhat(LocalDate.now());

            benhNhanRepository.save(benhNhan);

            return Optional.of(nguoiDung);

        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    public Optional<NguoiDung> findByHoTen(String hoTen) {
        return nguoiDungRepository.findByHoTen(hoTen);
    }

    @Transactional
    public int save(String otpCode) {
        try {
            Optional<OTP_NguoiDung> otpNguoiDungOpt = otpRepository.findByOtpCode(otpCode);
            if (otpNguoiDungOpt.isEmpty()) return -1;

            OTP_NguoiDung otpNguoiDung = otpNguoiDungOpt.get();

            if (otpNguoiDung.getExpireAt().isBefore(LocalDateTime.now())) return -2;

            NguoiDung nguoiDung = NguoiDung.builder()
                    .hoTen(otpNguoiDung.getHoTen())
                    .gioiTinh(otpNguoiDung.getGioiTinh())
                    .email(otpNguoiDung.getEmail())
                    .soDienThoai(otpNguoiDung.getSoDienThoai())
                    .matKhau(new BCryptPasswordEncoder().encode(otpNguoiDung.getMatKhau()))
                    .build();
            nguoiDungRepository.save(nguoiDung);

            VaiTro vaiTro = vaiTroRepository.findById(2)
                    .orElseThrow(() -> new RuntimeException("Vai trò không tồn tại"));

            phanQuyenService.save(new PhanQuyen(vaiTro, nguoiDung));

            otpRepository.deleteAllByOtpCode(otpCode);

            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public boolean sendCodeConfirm(NguoiDungDTO nguoiDung) {
        try {
            String otpCode = generateOtpCode();
            OTP_NguoiDung otpNguoiDung = new OTP_NguoiDung(otpCode,
                    nguoiDung.getEmail(), nguoiDung.getHoTen()
                    , nguoiDung.getGioiTinh(), nguoiDung.getSoDienThoai(), nguoiDung.getMatKhau());
            otpRepository.save(otpNguoiDung);
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
            return false;
        }
    }

    private String generateOtpCode() {
        Random random = new Random();
        return String.valueOf(100000 + random.nextInt(99999));
    }

    public ServiceResponse<?> checkAccountRegister(NguoiDungDTO nguoiDung) {
        if (nguoiDung.getHoTen() == null || nguoiDung.getEmail() == null ||
                nguoiDung.getGioiTinh() == ' ' || nguoiDung.getSoDienThoai() == null || nguoiDung.getMatKhau() == null) {
            return ServiceResponse.error(NotificationCode.USER_REGISTER_NOT_ENGOUGH.code(), NotificationCode.USER_REGISTER_NOT_ENGOUGH.message());
        } else if (nguoiDungRepository.existsByEmail(nguoiDung.getEmail())) {

            return ServiceResponse.error(NotificationCode.USER_EMAIL_EXISTS.code(), NotificationCode.USER_EMAIL_EXISTS.message());
        } else if (nguoiDungRepository.existsBySoDienThoai(nguoiDung.getSoDienThoai())) {

            return ServiceResponse.error(NotificationCode.USER_SODIENTHOAI_EXISTS.code(), NotificationCode.USER_SODIENTHOAI_EXISTS.message());
        }
        return ServiceResponse.success();
    }

    public ServiceResponse<?> getCurrentUserInfo(Integer nguoiDungId) {
        return nguoiDungRepository.findById(nguoiDungId)
                .map(user -> {
                    NguoiDungDTO dto = new NguoiDungDTO(
                            user.getHoTen(),
                            user.getGioiTinh(),
                            user.getEmail(),
                            user.getSoDienThoai(),
                            user.getMatKhau()
//                            ,
//                            null,
//                            null
                    );
                    return ServiceResponse.success(NotificationCode.USER_INFO, dto);
                })
                .orElse(ServiceResponse.error(NotificationCode.USER_NOT_FOUND));
    }

    @Transactional
    public ServiceResponse<?> updateCurrentUserInfo(Integer nguoiDungId, NguoiDungDTO dto) {
        Optional<NguoiDung> optional = nguoiDungRepository.findById(nguoiDungId);
        if (optional.isEmpty()) {
            return ServiceResponse.error(NotificationCode.USER_NOT_FOUND);
        }

        NguoiDung user = optional.get();
        user.setHoTen(dto.getHoTen());
        user.setGioiTinh(dto.getGioiTinh());
        user.setSoDienThoai(dto.getSoDienThoai());
        user.setEmail(dto.getEmail());
        nguoiDungRepository.save(user);

        return ServiceResponse.success(NotificationCode.USER_UPDATE_SUCCESS);
    }

    @Transactional
    public ServiceResponse<?> changePassword(Integer nguoiDungId, String oldPassword, String newPassword) {
        Optional<NguoiDung> optional = nguoiDungRepository.findById(nguoiDungId);
        if (optional.isEmpty()) {
            return ServiceResponse.error(NotificationCode.USER_NOT_FOUND);
        }

        NguoiDung user = optional.get();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        if (!encoder.matches(oldPassword, user.getMatKhau())) {
            return ServiceResponse.error(NotificationCode.PASSWORD_INCORRECT);
        }

        user.setMatKhau(encoder.encode(newPassword));
        nguoiDungRepository.save(user);
        return ServiceResponse.success(NotificationCode.PASSWORD_CHANGE_SUCCESS);
    }


    public Optional<NguoiDung> getByEmailOptional(String email) {
        return nguoiDungRepository.findByEmail(email);
    }
}