package com.BE_FPoly_DoAn.DOAN.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceResponse<T> {
    private boolean success;
    private String code;
    private String message;
    private T data;

    public static <T> ServiceResponse<T> success(String code, String message, T data) {
        return new ServiceResponse<>(true, code, message, data);
    }

    public static <T> ServiceResponse<T> success(String code, String message) {
        return new ServiceResponse<>(true, code, message, null);
    }

    public static <T> ServiceResponse<T> success() {
        return new ServiceResponse<>(true, null, null, null);
    }

    public static <T> ServiceResponse<T> error(String code, String message) {
        return new ServiceResponse<>(false, code, message, null);
    }

    public static <T> ServiceResponse<T> success(NotificationCode codeEnum, T data) {
        return new ServiceResponse<>(true, codeEnum.code(), codeEnum.message(), data);
    }

    public static <T> ServiceResponse<T> success(NotificationCode codeEnum) {
        return new ServiceResponse<>(true, codeEnum.code(), codeEnum.message(), null);
    }

    public static <T> ServiceResponse<T> error(NotificationCode codeEnum) {
        return new ServiceResponse<>(false, codeEnum.code(), codeEnum.message(), null);
    }

    public static <T> ServiceResponse<T> error(NotificationCode codeEnum, T data) {
        return new ServiceResponse<>(false, codeEnum.code(), codeEnum.message(), data);
    }
}