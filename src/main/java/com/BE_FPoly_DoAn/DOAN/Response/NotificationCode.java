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
    PASSWORD_INCORRECT("USR_010", "Mật khẩu không chính xác"),
    PASSWORD_CHANGE_SUCCESS("USR_011", "Thay đổi mật khẩu thành công"),
    USER_INFO("USR_012", "Hiển thị thông tin người dùng thành công"),
    USER_OLD_PASSWORD_INVALID("USR_013", "Mật khẩu cũ không đúng"),
    USER_PASSWORD_CHANGE_SUCCESS("USR_014", "Thay đổi mật khẩu thành công"),
    USER_LIST_SUCCESS("USR_015", "Lấy danh sách người dùng thành công"),

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

    // ===== BACSI =====
    DOCTOR_DELETE_SUCCESS("DOC_001", "Xóa bác sĩ thành công"),
    DOCTOR_DELETE_FAIL("DOC_002", "Xóa bác sĩ thất bại"),
    DOCTOR_NOT_FOUND("DOC_003", "Không tìm thấy bác sĩ"),
    CERTIFICATE_APPROVED("DOC_004", "Phê duyệt chứng chỉ thành công"),
    CERTIFICATE_APPROVE_FAIL("DOC_005", "Phê duyệt chứng chỉ thất bại"),
    CERTIFICATE_REJECTED("DOC_006", "Từ chối phê duệt chứng chỉ thành công"),
    CERTIFICATE_REJECT_FAIL("DOC_007", "Từ chối phê duệt chứng chỉ thất bại"),
    CERTIFICATE_REQUEST_SUBMITTED("DOC_008", "Gửi yêu cầu phê duệt chứng chỉ thành công"),
    CERTIFICATE_REQUEST_FAIL("DOC_009", "Gửi yêu cầu phê duệt chứng chỉ thất bại"),
    WAITING_LIST("DOC_010", "Hiển thị danh sách chờ duyệt thành công"),
    NO_PENDING_REQUESTS("DOC_011", "Không có yêu cầu chứng chỉ nào đang chờ duyệt"),
    CERTIFICATE_REQUEST_DUPLICATE("DOC_012", "Bạn đã gửi yêu cầu chứng chỉ rồi, vui lòng chờ xử lý"),
    CERTIFICATE_REQUEST_NOT_FOUND_OR_PROCESSED("DOC_013", "Yêu cầu không tồn tại hoặc đã được xử lý"),
    DOCTOR_CREATE_SUCCESS("DOC_014", "Tạo bác sĩ thành công"),
    DOCTOR_UPDATE_SUCCESS("DOC_015", "Cập nhật bác sĩ thành công"),
    DOCTOR_FOUND("DOC_016", "Lấy chi tiết bác sĩ thành công"),
    DOCTOR_LIST_SUCCESS("DOC_017", "Lấy danh sách bác sĩ thành công"),

    // ===== DỊCH VỤ =====
    SERVICE_CREATE_SUCCESS("SVC_001", "Tạo dịch vụ thành công"),
    SERVICE_CREATE_FAIL   ("SVC_002", "Tạo dịch vụ thất bại"),
    SERVICE_UPDATE_SUCCESS("SVC_003", "Cập nhật dịch vụ thành công"),
    SERVICE_UPDATE_FAIL   ("SVC_004", "Cập nhật dịch vụ thất bại"),
    SERVICE_DELETE_SUCCESS("SVC_005", "Xóa dịch vụ thành công"),
    SERVICE_DELETE_FAIL   ("SVC_006", "Xóa dịch vụ thất bại"),
    SERVICE_NOT_FOUND     ("SVC_007", "Không tìm thấy dịch vụ"),
    SERVICE_LIST("SVC_008", "Hiển thị danh sách dịch vụ thành công"),
    SERVICE_ID("SVC_009", "Hiển thị dịch vụ thành công"),
    SERVICE_DUPLICATE("SVC_010", "Tên dịch vụ đã tồn tại"),

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

    // ==== CHUYÊN KHOA ====
    SPECIALTY_CREATE_SUCCESS("SPC_001", "Tạo chuyên khoa thành công"),
    SPECIALTY_CREATE_FAIL("SPC_002", "Tạo chuyên khoa thất bại"),
    SPECIALTY_UPDATE_SUCCESS("SPC_003", "Cập nhật chuyên khoa thành công"),
    SPECIALTY_UPDATE_FAIL("SPC_004", "Cập nhật chuyên khoa thất bại"),
    SPECIALTY_DELETE_SUCCESS("SPC_005", "Xóa chuyên khoa thành công"),
    SPECIALTY_DELETE_FAIL("SPC_006", "Xóa chuyên khoa thất bại"),
    SPECIALTY_NOT_FOUND("SPC_007", "Không tìm thấy chuyên khoa"),
    SPECIALTY_LIST("SPC_008", "Hiển thị danh sách chuyên khoa thành công"),
    SPECIALTY_DETAIL("SPC_009", "Hiển thị chi tiết chuyên khoa thành công"),
    SPECIALTY_DUPLICATE("SPC_010", "Tên chuyên khoa đã tồn tại"),

    // ===== BỆNH NHÂN =====
    PATIENT_CREATE_SUCCESS("PAT_001", "Tạo bệnh nhân thành công"),
    PATIENT_CREATE_FAIL("PAT_002", "Tạo bệnh nhân thất bại"),
    PATIENT_UPDATE_SUCCESS("PAT_003", "Cập nhật bệnh nhân thành công"),
    PATIENT_UPDATE_FAIL("PAT_004", "Cập nhật bệnh nhân thất bại"),
    PATIENT_DELETE_SUCCESS("PAT_005", "Xóa bệnh nhân thành công"),
    PATIENT_DELETE_FAIL("PAT_006", "Xóa bệnh nhân thất bại"),
    PATIENT_LIST_SUCCESS("PAT_007", "Lấy danh sách bệnh nhân thành công"),
    PATIENT_DETAIL_SUCCESS("PAT_008", "Lấy chi tiết bệnh nhân thành công"),
    PATIENT_NOT_FOUND("PAT_009", "Không tìm thấy bệnh nhân"),

    // ===== BỆNH ÁN =====
    MEDICAL_RECORD_CREATE_SUCCESS("MED_001", "Tạo bệnh án thành công"),
    MEDICAL_RECORD_UPDATE_SUCCESS("MED_002", "Cập nhật bệnh án thành công"),
    MEDICAL_RECORD_UPDATE_FAIL("MED_003", "Cập nhật bệnh án thất bại"),
    MEDICAL_RECORD_LIST("MED_004", "Lấy danh sách bệnh án thành công"),
    MEDICAL_RECORD_DETAIL("MED_005", "Chi tiết bệnh án"),
    MEDICAL_RECORD_NOT_FOUND("MED_006", "Không tìm thấy bệnh án"),
    MEDICAL_RECORD_DELETE_SUCCESS("MED_007", "Xóa bệnh án thành công"),
    MEDICAL_RECORD_DELETE_FAIL("MED_008", "Xóa bệnh án thất bại"),
    MEDICAL_RECORD_DETAIL_SUCCESS("MR_009", "Hiển thị chi tiết hồ sơ bệnh án thành công"),
    MEDICAL_RECORD_CREATE_FAIL("MEO_010", "Tạo bệnh án thất bại"),
    MEDICAL_RECORD_ALREADY_EXISTS("MED_010", "Lịch khám này đã có bệnh án, không thể tạo thêm"),

    // ==== THANH TOAN =====
    PAYMENT_SUCCESS("PAY_001", "Thanh toán thành công"),
    PAYMENT_FAIL("PAY_002", "Thanh toán thất bại"),
    PAYMENT_LIST("PAY_003", "Hiển thị danh sách thanh toán thành công"),
    PAYMENT_DETAIL("PAY_004", "Hiển thị chi tiết thanh toán thành công"),
    PAYMENT_NOT_FOUND("PAY_005", "Không tìm thấy thông tin thanh toán"),
    PAYMENT_INVALID("PAY_006", "Thông tin thanh toán không hợp lệ"),
    PAYMENT_UNAUTHORIZED("PAY_007", "Không có quyền thanh toán"),
    PAYMENT_DUPLICATE("PAY_008", "Giao dịch đã được thanh toán"),
    PAYMENT_EMAIL_SENT("PAY_009", "Đã gửi email xác nhận thanh toán thành công"),
    PAYMENT_EMAIL_FAIL("PAY_010", "Gửi email xác nhận thanh toán thất bại"),

    // ===== LỊCH KHÁM =====
    APPOINTMENT_CREATE_SUCCESS("APP_001", "Tạo lịch khám thành công"),
    APPOINTMENT_CREATE_FAIL("APP_002", "Tạo lịch khám thất bại"),
    APPOINTMENT_UPDATE_SUCCESS("APP_003", "Cập nhật lịch khám thành công"),
    APPOINTMENT_UPDATE_FAIL("APP_004", "Cập nhật lịch khám thất bại"),
    APPOINTMENT_DELETE_SUCCESS("APP_005", "Xóa lịch khám thành công"),
    APPOINTMENT_DELETE_FAIL("APP_006", "Xóa lịch khám thất bại"),
    APPOINTMENT_LIST_SUCCESS("APP_007", "Lấy danh sách lịch khám thành công"),
    APPOINTMENT_DETAIL_SUCCESS("APP_008", "Lấy chi tiết lịch khám thành công"),
    APPOINTMENT_NOT_FOUND("APP_009", "Không tìm thấy lịch khám"),
    APPOINTMENT_DUPLICATE("APP_010", "Lịch khám bị trùng"),
    APPOINTMENT_STATUS_INVALID("APP_011", "Trạng thái lịch khám không hợp lệ"),
    APPOINTMENT_CONFLICT("APP_012", "Lịch khám trùng giờ với bác sĩ khác"),
    APPOINTMENT_INVALID_TIME("APP_013", "Thời gian khám không hợp lệ"),
    APPOINTMENT_NO_AVAILABLE_SLOTS("APP_014", "Không còn khung giờ trống trong ca này"),


    // === LỊCH LÀM VIỆC BÁC SĨ
    WORK_SCHEDULE_DETAILS_CUSSCESS("SCE_001", "Hiển thị chi tiết ngày làm việc của bác sĩ thành công"),
    WORK_SCHEDULE_DETAILS_FAIL("SCE_002", "Hiển thị chi tiết ngày làm việc của bác sĩ thất bại"),
    WORK_SCHEDULE_CREATE_SUCCESS("SEC_003", "Tạo lịch làm việc cho bác sĩ thành công"),
    WORK_SCHEDULE_CREATE_FAIL("SEC_004", "Tạo lịch làm việc cho bác sĩ thất bại"),
    CREATED_SUCCESS("SEC_005", "Tạo giờ khám chi tiết thành công"),
    CREATE_FAIL("SEC_006", "Tạo giờ khám chi tiết không thành công"),
    NOT_FOUND("SEC_007", "Không tìm thấy lịch làm việc"),

    // === THỐNG KÊ ====
    STATISTICS_MONTHLY("STAT_001", "Thống kê theo tháng thành công"),
    STATISTICS_DOCTOR("STAT_002", "Thống kê theo bác sĩ thành công"),
    STATISTICS_EMPTY("STAT_003", "Không có dữ liệu thống kê trong khoảng thời gian này"),
    STATISTICS_BY_GENDER("STAT_004", "Thống kê bệnh nhân theo giới tính thành công"),
    STATISTICS_REVENUE_BY_MONTH("STAT_005", "Thống kê doanh thu theo tháng thành công"),
    STATISTICS_PRESCRIPTIONS_BY_MONTH("STAT_006", "Thống kê đơn thuốc theo tháng thành công"),
    STATISTICS_DISEASES("STAT_007", "Thống kê số lượng bệnh theo tên thành công"),
    STATISTICS_SERVICE_REVENUE("STAT_008", "Thống kê doanh thu theo dịch vụ thành công"),

    // ==== GUEST ====
    SPECIALTY_LIST_SUCCESS("SP01", "Lấy danh sách chuyên khoa thành công"),
    DOCTOR_LISTS_SUCCESS("BS01", "Lấy danh sách bác sĩ thành công"),
    WORKING_DAYS_FETCH_SUCCESS("WK01", "Lấy danh sách ngày làm việc thành công"),
    SHIFT_FETCH_SUCCESS("CA01", "Lấy danh sách ca trực thành công"),
    AVAILABLE_TIME_FETCH_SUCCESS("GT01", "Lấy giờ trống thành công"),
    AVAILABLE_TIME_NOT_FOUND("DO_001", "Không có giờ trống trong ca làm việc này"),
    SHIFT_NOT_FOUND("DO_002", "Bác sĩ không có ca làm việc vào ngày này"),

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
    VALIDATION_BENHAN_THOI_GIAN_REQUIRED("VAL_BA_001", "Thời gian khám không được để trống"),
    VALIDATION_BENHAN_TOMTAT_REQUIRED("VAL_BA_002", "Tóm tắt bệnh án không được để trống"),
    VALIDATION_BENHAN_KETLUAN_REQUIRED("VAL_BA_003", "Kết luận không được để trống"),
    VALIDATION_BENHAN_LICHKHAM_REQUIRED("VAL_BA_004", "ID lịch khám không được để trống"),
    VALIDATION_BENHAN_BACSI_REQUIRED("VAL_BA_005", "ID bác sĩ kết luận không được để trống"),
    VALIDATION_BENHAN_DICHVU_REQUIRED("VAL_BA_006", "ID dịch vụ không được để trống"),
    VALIDATION_BENHAN_BENHIDS_REQUIRED("VAL_BA_007", "Danh sách bệnh không được để trống"),
    VALIDATION_BENHAN_BENHIDS_EMPTY("VAL_BA_008", "Danh sách bệnh không được rỗng"),
    AUTH_INVALID_TOKEN("VAL_TOKEN_001", "Token không khả dụng"),

    // ===== SYSTEM =====
    ACCESS_DENIED("SYS_403", "Bạn không có quyền truy cập"),
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