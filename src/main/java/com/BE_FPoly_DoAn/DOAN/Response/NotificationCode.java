package com.BE_FPoly_DoAn.DOAN.Response;

public enum NotificationCode {

    // ===== USER =====
    USER_REGISTER_SUCCESS("USR_001", "Đăng ký thành công"),
    USER_REGISTER_FAIL("USR_002", "Đăng ký thất bại"),
    USER_REGISTER_NOT_ENGOUGH("USR_003", "Thông tin không đầy đủ"),
    USER_EMAIL_EXISTS("USR_004", "Email đã tồn tại"),
    USER_SODIENTHOAI_EXISTS("USR_006", "Số điện thoại đã tồn tại"),
    USER_NOT_FOUND("USR_007", "Người dùng không tồn tại"),
    USER_UPDATE_SUCCESS("USR_008", "Cập nhật thông tin người dùng thành công"),
    USER_UPDATE_FAIL("USR_009", "Cập nhật thông tin người dùng thất bại"),

    // ===== OTP =====
    OTP("OTP_000", "Mã OTP đã gửi tới email của bạn"),
    OTP_INVALID("OTP_001", "Mã OTP không hợp lệ"),
    OTP_EXPIRED("OTP_002", "Mã OTP đã hết hạn"),
    OTP_MISSING("OTP_003", "Chưa nhập mã OTP"),

    // ===== AUTH =====
    AUTH_LOGIN_SUCCESS("AUTH_001", "Đăng nhập thành công"),
    AUTH_LOGIN_FAIL("AUTH_002", "Sai tài khoản hoặc mật khẩu"),
    AUTH_UNAUTHORIZED("AUTH_003", "Chưa đăng nhập hoặc phiên đã hết hạn"),
    AUTH_ACCESS_DENIED("AUTH_004", "Không có quyền truy cập chức năng này"),
    AUTH_LOGOUT_SUCCESS("AUTH_005", "Đăng xuất thành công"),

    // ===== DOCTOR =====
    DOCTOR_DELETE_SUCCESS("DOC_001", "Xóa bác sĩ thành công"),
    DOCTOR_DELETE_FAIL("DOC_002", "Xóa bác sĩ thất bại"),
    DOCTOR_NOT_FOUND("DOC_003", "Không tìm thấy bác sĩ"),

    // ===== VALIDATION =====
    VALIDATION_FAILED("VAL_000", "Dữ liệu không hợp lệ"),
    VALIDATION_NAME_REQUIRED("VAL_001", "Họ tên không được để trống"),
    VALIDATION_NAME_TOO_LONG("VAL_002", "Họ tên không vượt quá 50 ký tự"),
    VALIDATION_GENDER_REQUIRED("VAL_003", "Giới tính không được để trống"),
    VALIDATION_EMAIL_REQUIRED("VAL_004", "Email không được để trống"),
    VALIDATION_EMAIL_INVALID("VAL_005", "Email không hợp lệ"),
    VALIDATION_PHONE_REQUIRED("VAL_006", "Số điện thoại không được để trống"),
    VALIDATION_PHONE_TOO_LONG("VAL_007", "Số điện thoại không vượt quá 15 ký tự"),
    VALIDATION_PHONE_INVALID("VAL_008", "Số điện thoại không hợp lệ"),
    VALIDATION_BAOHIEM_REQUIRED("VAL_009", "Bảo hiểm không được để trống"),
    VALIDATION_KHANCAP_REQUIRED("VAL_010", "Liên hệ khẩn cấp không được để trống"),
    VALIDATION_KHANCAP_INVALID("VAL_011", "Số điện thoại liên hệ khẩn cấp không hợp lệ"),
    VALIDATION_CHUCVU_REQUIRED("VAL_012", "Chức vụ không được để trống"),
    VALIDATION_NGAY_TUYEN_REQUIRED("VAL_013", "Ngày tuyển dụng không được để trống"),
    VALIDATION_NGAY_TUYEN_PAST("VAL_014", "Ngày tuyển dụng không được là ngày trong tương lai"),
    VALIDATION_GHICHU_TOO_LONG("VAL_015", "Ghi chú không được vượt quá 250 ký tự"),
    VALIDATION_TRANGTHAI_REQUIRED("VAL_016", "Trạng thái hoạt động không được để trống"),
    VALIDATION_CHUYENKHOA_REQUIRED("VAL_017", "ID chuyên khoa không được để trống"),
    VALIDATION_CHUNGCHI_REQUIRED("VAL_018", "Chứng chỉ không được để trống"),
    VALIDATION_TRINHDO_REQUIRED("VAL_019", "Trình độ không được để trống"),
    VALIDATION_KINHNGHIEM_REQUIRED("VAL_020", "Kinh nghiệm không được để trống"),
    VALIDATION_KINHNGHIEM_POSITIVE("VAL_021", "Kinh nghiệm phải là số dương"),
    VALIDATION_NGAYTUYEN_REQUIRED("VAL_022", "Ngày tuyển dụng không được để trống"),
    VALIDATION_NGAYTUYEN_PAST("VAL_023", "Ngày tuyển dụng không được là ngày trong tương lai"),
    VALIDATION_PASSWORD_REQUIRED("VAL_024", "Mật khẩu không được để trống"),
    VALIDATION_CHUCVU_TOO_LONG("VAL_025", "Chức vụ không được vượt quá số ký tự cho phép"),
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