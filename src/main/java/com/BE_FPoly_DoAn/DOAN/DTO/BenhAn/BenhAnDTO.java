package com.BE_FPoly_DoAn.DOAN.DTO.BenhAn;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BenhAnDTO {

    private Integer benhAnId;

    @NotNull(message = "Lịch khám không được để trống")
    private Integer lichKhamId;

//    @NotNull(message = "Bác sĩ kết luận không được để trống")
//    private Integer bacSiKetLuanId;

    @NotBlank(message = "Tóm tắt không được để trống")
    private String tomTat;

    @NotBlank(message = "Kết luận không được để trống")
    private String ketLuan;

    @NotBlank(message = "Ghi chú không được để trống")
    private String ghiChu;

    @NotNull(message = "Thời gian không được để trống")
    private LocalDateTime thoiGian;

    @JsonIgnore
    @NotEmpty(message = "Danh sách bệnh không được để trống")
    private List<Integer> benhIds;

//    private List<BenhInfoDTO> benhInfoList;

    private List<String> benhTenList;
}