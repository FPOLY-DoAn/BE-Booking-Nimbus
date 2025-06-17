package com.BE_FPoly_DoAn.DOAN.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceResponse<T> {
    private boolean success;
    private String code;
    private String message;
    private T data;

    public static <T> ServiceResponse<T> success(String code, String message, T data) {
        return new ServiceResponse<>(true, code, message, data);
    }

    public static <T> ServiceResponse<T> success() {
        return new ServiceResponse<>(true, null, null, null);
    }

    public static <T> ServiceResponse<T> error(String code, String message) {
        return new ServiceResponse<>(false, code, message, null);
    }
}