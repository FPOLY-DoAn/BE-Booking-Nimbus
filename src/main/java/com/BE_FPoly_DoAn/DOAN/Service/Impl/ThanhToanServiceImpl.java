package com.BE_FPoly_DoAn.DOAN.Service.Impl;

import com.BE_FPoly_DoAn.DOAN.Dao.HoaDonRepository;
import com.BE_FPoly_DoAn.DOAN.Dao.ThanhToanRepository;
import com.BE_FPoly_DoAn.DOAN.DTO.ThanhToanDTO;
import com.BE_FPoly_DoAn.DOAN.Entity.*;
import com.BE_FPoly_DoAn.DOAN.Mapper.ThanhToanMapper;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ThanhToanServiceImpl {

    private final ThanhToanRepository thanhToanRepo;
    private final HoaDonRepository hoaDonRepo;
    private final MailConfig mailConfig;

    @Transactional
    public ServiceResponse<?> create(ThanhToanDTO dto) {
        try {
            HoaDon hoaDon = hoaDonRepo.findById(dto.getHoaDonId())
                    .orElseThrow(() -> new RuntimeException("Hóa đơn không tồn tại"));

            ThanhToan tt = ThanhToanMapper.toEntity(dto, hoaDon);
            thanhToanRepo.save(tt);

            BenhNhan benhNhan = hoaDon.getBenhNhan();

            List<LichKham> lichKhams = benhNhan.getLichKhams();
            LichKham lichKhamGanNhat = lichKhams.stream()
                    .filter(lk -> lk.getBenhAn() != null)
                    .max((a, b) -> a.getNgayTao().compareTo(b.getNgayTao()))
                    .orElse(null);

            if (lichKhamGanNhat != null) {
                BenhAn benhAn = lichKhamGanNhat.getBenhAn();

                if (benhAn == null) {
                    return ServiceResponse.error(NotificationCode.PAYMENT_FAIL, "Không tìm thấy bệnh án tương ứng để gửi email.");
                }

                String email = benhNhan.getNguoiDung().getEmail();
                String hoTen = benhNhan.getNguoiDung().getHoTen();

                String noiDung = """
        <div style="font-family: 'Segoe UI', sans-serif; background: #f9f9f9; padding: 30px;">
            <div style="max-width: 600px; margin: auto; background: #fff; padding: 30px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.05);">
                <h2 style="text-align: center; color: #1a73e8;">Nimbus - Xác nhận thanh toán thành công</h2>
                <p>Xin chào <strong>%s</strong>,</p>
                <p>Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi. Hóa đơn của bạn đã được thanh toán thành công.</p>

                <h3 style="color: #444;">Thông tin bệnh án</h3>
                <table style="width: 100%%; border-collapse: collapse; margin-top: 10px;">
                    <tr>
                        <td style="padding: 8px; font-weight: bold; color: #555;">Tóm tắt:</td>
                        <td style="padding: 8px;">%s</td>
                    </tr>
                    <tr>
                        <td style="padding: 8px; font-weight: bold; color: #555;">Kết luận:</td>
                        <td style="padding: 8px;">%s</td>
                    </tr>
                    <tr>
                        <td style="padding: 8px; font-weight: bold; color: #555;">Ghi chú:</td>
                        <td style="padding: 8px;">%s</td>
                    </tr>
                </table>

                <h3 style="color: #444; margin-top: 30px;">Chi tiết thanh toán</h3>
                <table style="width: 100%%; border-collapse: collapse;">
                    <tr>
                        <td style="padding: 8px; font-weight: bold; color: #555;">Mã giao dịch:</td>
                        <td style="padding: 8px;">%s</td>
                    </tr>
                </table>

                <p style="margin-top: 30px;">Nếu bạn có bất kỳ thắc mắc nào, xin vui lòng liên hệ bộ phận hỗ trợ khách hàng.</p>
                <p style="margin-top: 20px;">Trân trọng,<br><strong>Đội ngũ Nimbus</strong></p>
            </div>
        </div>
        """.formatted(
                        hoTen,
                        benhAn.getTomTat(),
                        benhAn.getKetLuan(),
                        benhAn.getGhiChu(),
                        tt.getMaGiaoDich() != null ? tt.getMaGiaoDich() : "Không có"
                );

                mailConfig.sendTo("noreply@nimbus.vn", email, "Thông tin bệnh án sau thanh toán", noiDung);
            }
            return ServiceResponse.success(NotificationCode.PAYMENT_SUCCESS, ThanhToanMapper.toDto(tt));
        } catch (Exception e) {
            e.printStackTrace();
            return ServiceResponse.error(NotificationCode.PAYMENT_FAIL, e.getMessage());
        }
    }

    public ServiceResponse<?> getAll() {
        List<ThanhToanDTO> result = thanhToanRepo.findAll()
                .stream().map(ThanhToanMapper::toDto).toList();
        return ServiceResponse.success(NotificationCode.PAYMENT_LIST, result);
    }

    public ServiceResponse<?> getById(Integer id) {
        return thanhToanRepo.findById(id)
                .map(tt -> ServiceResponse.success(NotificationCode.PAYMENT_DETAIL, ThanhToanMapper.toDto(tt)))
                .orElse(ServiceResponse.error(NotificationCode.PAYMENT_NOT_FOUND));
    }
}