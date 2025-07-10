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
    CERTIFICATE_APPROVED("DOC_004", "Phê duyệt chứng chỉ thành công"),
    CERTIFICATE_APPROVE_FAIL("DOC_005", "Phê duyệt chứng chỉ thất bại"),
    CERTIFICATE_REJECTED("DOC_006", "Từ chối cập nhật chứng chỉ thành công"),
    CERTIFICATE_REJECT_FAIL("DOC_007", "Từ chối cập nhật chứng chỉ thất bại"),
    CERTIFICATE_REQUEST_SUBMITTED("DOC_008", "Gửi yêu cầu cập nhật chứng chỉ thành công"),
    CERTIFICATE_REQUEST_FAIL("DOC_009", "Gửi yêu cầu cập nhật chứng chỉ thất bại"),
    WAITING_LIST("DOC_010", "Hiển thị danh sách chờ duyệt thành công"),

    // ===== SERVICE (DỊCH VỤ) =====
    SERVICE_CREATE_SUCCESS("SVC_001", "Tạo dịch vụ thành công"),
    SERVICE_CREATE_FAIL   ("SVC_002", "Tạo dịch vụ thất bại"),
    SERVICE_UPDATE_SUCCESS("SVC_003", "Cập nhật dịch vụ thành công"),
    SERVICE_UPDATE_FAIL   ("SVC_004", "Cập nhật dịch vụ thất bại"),
    SERVICE_DELETE_SUCCESS("SVC_005", "Xóa dịch vụ thành công"),
    SERVICE_DELETE_FAIL   ("SVC_006", "Xóa dịch vụ thất bại"),
    SERVICE_NOT_FOUND     ("SVC_007", "Không tìm thấy dịch vụ"),
    SERVICE_LIST("SVC_008", "Hiển thị danh sách dịch vụ thành công"),
    SERVICE_ID("SVC_009", "Hiển thị dịch vụ thành công"),

    // ===== DON NGHI PHEP =====
    DON_INVALID_DATE("DON_001", "Ngày bắt đầu không được sau ngày kết thúc"),
    DON_IN_PAST("DON_002", "Không thể đăng ký nghỉ với ngày bắt đầu trong quá khứ"),
    DON_CONFLICT("DON_003", "Lịch nghỉ bị trùng với lịch làm việc đã đăng ký"),
    DON_REGISTER_SUCCESS("DON_004", "Đăng ký nghỉ phép thành công"),
    DON_REGISTER_FAIL("DON_101", "Đăng ký nghỉ phép thất bại"),
    DON_OVERLAP("DON_102", "Lịch nghỉ bị trùng với lịch làm việc"),
    DON_NOT_FOUND("DON103", "Không tìm thấy bất kì đơn nghỉ phép nào"),
    DON_APPROVED_SUCCESS("DON104", "Duyệt đơn nghỉ phép thành công"),
    DON_ALREADY_PROCESSED("DON105", "Đơn đã được xử lý"),
    DON_REJECTED_SUCCESS("DON106", "Đơn đã bị từ chối"),
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
    VALIDATION_DOCTOR_ID_REQUIRED("VAL_026", "ID bác sĩ không được để trống"),
    VALIDATION_REJECT_REASON_REQUIRED("VAL_027", "Lý do từ chối không được để trống"),
    INVALID_TRANG_THAI("VAL_028", "Trạng thái không hợp lệ"),

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