package com.BE_FPoly_DoAn.DOAN.Response;

public enum NotificationCode {

    // ===== USER =====
    USER_REGISTER_SUCCESS("USR_001", "Đăng ký thành công"),
    USER_REGISTER_FAIL("USR_002", "Đăng ký thất bại"),
    USER_EMAIL_EXISTS("USR_003", "Email đã tồn tại"),
    USER_NOT_FOUND("USR_004", "Người dùng không tồn tại"),
    USER_UPDATE_SUCCESS("USR_005", "Cập nhật thông tin người dùng thành công"),
    USER_UPDATE_FAIL("USR_006", "Cập nhật thông tin người dùng thất bại"),

    // ===== OTP =====
    OTP_INVALID("OTP_001", "Mã OTP không hợp lệ"),
    OTP_EXPIRED("OTP_002", "Mã OTP đã hết hạn"),
    OTP_MISSING("OTP_003", "Chưa nhập mã OTP"),

    // ===== AUTH =====
    AUTH_LOGIN_SUCCESS("AUTH_001", "Đăng nhập thành công"),
    AUTH_LOGIN_FAIL("AUTH_002", "Sai tài khoản hoặc mật khẩu"),
    AUTH_UNAUTHORIZED("AUTH_003", "Chưa đăng nhập hoặc phiên đã hết hạn"),
    AUTH_ACCESS_DENIED("AUTH_004", "Không có quyền truy cập chức năng này"),

    // ===== VALIDATION =====
    VALIDATION_FAILED("VAL_000", "Dữ liệu không hợp lệ"),
    VALIDATION_EMAIL_INVALID("VAL_001", "Email không đúng định dạng"),
    VALIDATION_PASSWORD_TOO_SHORT("VAL_002", "Mật khẩu phải có ít nhất 6 ký tự"),
    VALIDATION_PASSWORD_TOO_WEAK("VAL_003", "Mật khẩu phải chứa chữ hoa, số hoặc ký tự đặc biệt"),
    VALIDATION_PHONE_INVALID("VAL_004", "Số điện thoại không hợp lệ"),
    VALIDATION_NAME_REQUIRED("VAL_005", "Họ tên không được để trống"),
    VALIDATION_EMAIL_REQUIRED("VAL_006", "Email là bắt buộc"),
    VALIDATION_PASSWORD_REQUIRED("VAL_007", "Mật khẩu là bắt buộc"),
    VALIDATION_OTP_REQUIRED("VAL_008", "Vui lòng nhập mã OTP"),

    // ===== SYSTEM =====
    SERVER_ERROR("SYS_500", "Lỗi hệ thống, vui lòng thử lại sau"),
    SERVICE_UNAVAILABLE("SYS_503", "Dịch vụ tạm thời không khả dụng");

    private final String code;
    private final String message;

    NotificationCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String code() {
        return code;
    }

    public String message() {
        return message;
    }
}