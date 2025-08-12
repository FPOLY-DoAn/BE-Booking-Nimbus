package com.BE_FPoly_DoAn.DOAN.Contronler.Admin;

import com.BE_FPoly_DoAn.DOAN.DTO.BacSiDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.LeTanDTO;
import com.BE_FPoly_DoAn.DOAN.DTO.QuanLyDTO;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.BacSi.BacSiServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.LeTan.LeTanServiceImpl;
import com.BE_FPoly_DoAn.DOAN.Service.Impl.QuanLy.QuanLyServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.BE_FPoly_DoAn.DOAN.Response.NotificationCode;
import com.BE_FPoly_DoAn.DOAN.Response.ServiceResponse;

import java.util.List;


@RestController
@RequestMapping("/quanly")
@Tag(name = "Phân vai trò", description = "APIS chỉ có quyền admin")
public class QuanLyRegisterController {
    private final LeTanServiceImpl leTanService;
    private final BacSiServiceImpl bacSiService;
    private final QuanLyServiceImpl quanLyService;


    public QuanLyRegisterController(LeTanServiceImpl leTanService, BacSiServiceImpl bacSiService, QuanLyServiceImpl quanLyService) {
        this.leTanService = leTanService;
        this.bacSiService = bacSiService;
        this.quanLyService = quanLyService;
    }

    @PostMapping("/dangki/letan")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> dangKiLeTan(@Valid @RequestBody LeTanDTO leTanDTO, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            List<String> errors = bindingResult.getFieldErrors().stream()
                    .map(err -> {
                        try {
                            NotificationCode code = NotificationCode.valueOf(err.getDefaultMessage());
                            return err.getField() + ": " + code.message();
                        } catch (IllegalArgumentException ex) {
                            return err.getField() + ": " + err.getDefaultMessage();
                        }
                    }).toList();
            return ResponseEntity.badRequest().body(
                    ServiceResponse.error(NotificationCode.VALIDATION_FAILED, errors)
            );
        }
        leTanService.createNguoiDungAndLeTan(leTanDTO);
        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.USER_REGISTER_SUCCESS));
    }

    @PostMapping("/dangki/bacsi")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> dangKiBacSi(@Valid @RequestBody BacSiDTO bacSiDTO, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            List<String> errors = bindingResult.getFieldErrors().stream()
                    .map(err -> {
                        try {
                            NotificationCode code = NotificationCode.valueOf(err.getDefaultMessage());
                            return err.getField() + ": " + code.message();
                        } catch (IllegalArgumentException ex) {
                            return err.getField() + ": " + err.getDefaultMessage();
                        }
                    }).toList();
            return ResponseEntity.badRequest().body(
                    ServiceResponse.error(NotificationCode.VALIDATION_FAILED, errors)
            );
        }
        bacSiService.createNguoiDungAndBacSi(bacSiDTO);
        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.USER_REGISTER_SUCCESS));
    }

    @PostMapping("/dangki/quanly")
    @PreAuthorize("hasAuthority('ROLE_QUANLY')")
    public ResponseEntity<?> dangKiQuanLy(@Valid @RequestBody QuanLyDTO quanLyDTO, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            List<String> errors = bindingResult.getFieldErrors().stream()
                    .map(err -> {
                        try {
                            NotificationCode code = NotificationCode.valueOf(err.getDefaultMessage());
                            return err.getField() + ": " + code.message();
                        } catch (IllegalArgumentException ex) {
                            return err.getField() + ": " + err.getDefaultMessage();
                        }
                    }).toList();
            return ResponseEntity.badRequest().body(
                    ServiceResponse.error(NotificationCode.VALIDATION_FAILED, errors)
            );
        }
        quanLyService.createNguoiDungAndQuanLy(quanLyDTO);
        return ResponseEntity.ok(ServiceResponse.success(NotificationCode.USER_REGISTER_SUCCESS));
    }
}
