package com.BE_FPoly_DoAn.DOAN.Contronler;

import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.LichKham.LichKhamFilterDTO;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LichKhamServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * Controller quản lý các API liên quan đến lịch khám bệnh.
 * Chỉ các tài khoản có vai trò 'LỄ TÂN' hoặc 'BÁC SĨ' mới được truy cập.
 */
@RestController
@RequestMapping("/lich-kham")
@RequiredArgsConstructor
@Tag(name = "Quản lý lịch khám", description = "CRUD lịch khám, đặt lịch cho bệnh nhân")
public class LichKhamController {

    private final LichKhamServiceImpl lichKhamService;

    /**
     * API tạo lịch khám mới.
     *
     * @param dto Dữ liệu lịch khám cần tạo
     * @return ResponseEntity chứa kết quả tạo lịch khám
     */
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI', 'ROLE_BENHNHAN', 'ROLE_QUANLY')")
    @PostMapping("/TaoLichKham")
    public ResponseEntity<ServiceResponse<?>> create(@Valid @RequestBody LichKhamDTO dto) {
        return ResponseEntity.ok(lichKhamService.create(dto));
    }

    /**
     * API lấy danh sách tất cả lịch khám trong hệ thống.
     *
     * @return ResponseEntity chứa danh sách lịch khám
     */
    @GetMapping("/LayDanhSachLichKham")
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<?>> getAll() {
        return ResponseEntity.ok(lichKhamService.getAll());
    }

    /**
     * API lấy chi tiết lịch khám theo ID.
     *
     * @param id ID của lịch khám
     * @return ResponseEntity chứa thông tin lịch khám nếu tìm thấy
     */
    @GetMapping("/LayLichKhamTheoId/{id}")
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI', 'ROLE_BENHNHAN', 'ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<?>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(lichKhamService.getById(id));
    }

    /**
     * API cập nhật thông tin lịch khám theo ID.
     *
     * @param id  ID của lịch khám cần cập nhật
     * @param dto Dữ liệu mới để cập nhật
     * @return ResponseEntity chứa kết quả cập nhật
     */
    @PutMapping("/CapNhatLichKham/{id}")
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI', 'ROLE_BENHNHAN', 'ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<?>> update(@PathVariable Integer id, @Valid @RequestBody LichKhamDTO dto) {
        return ResponseEntity.ok(lichKhamService.update(id, dto));
    }

    /**
     * API tìm kiếm lịch khám theo các tiêu chí lọc.
     *
     * @param filter Điều kiện tìm kiếm (theo ngày, bác sĩ, ca, trạng thái, ...)
     * @return ResponseEntity chứa danh sách lịch khám thỏa điều kiện
     */

    @PostMapping("/TimKiemLichKham")
    @PreAuthorize("hasAnyRole('ROLE_LETAN', 'ROLE_BACSI', 'ROLE_BENHNHAN', 'ROLE_QUANLY')")
    public ResponseEntity<ServiceResponse<?>> search(@RequestBody LichKhamFilterDTO filter) {
        return ResponseEntity.ok(lichKhamService.searchLichKham(filter));
    }
}