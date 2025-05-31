-- 1. Quản lý người dùng và phân quyền
-- Lấy danh sách tất cả người dùng kèm theo tên vai trò tương ứng
SELECT ND.*, VT.ten_vai_tro
FROM NGUOI_DUNG ND
JOIN PHAN_QUYEN PQ ON ND.nguoidung_id = PQ.nguoidung_id    -- Nối với bảng phân quyền theo id người dùng
JOIN VAI_TRO VT ON PQ.vaitro_id = VT.vaitro_id;             -- Nối lấy tên vai trò dựa trên id vai trò

-- 2. Quản lý bác sĩ, chuyên khoa và lịch làm việc
-- Lấy thông tin bác sĩ, tên bác sĩ và tên chuyên khoa làm việc
SELECT BS.*, ND.hoten, CK.ten_khoa
FROM BAC_SI BS
JOIN NGUOI_DUNG ND ON BS.nguoidung_id = ND.nguoidung_id    -- Nối lấy họ tên bác sĩ từ bảng người dùng
JOIN CHUYEN_KHOA CK ON BS.chuyenkhoa_id = CK.chuyenkhoa_id; -- Nối lấy tên chuyên khoa của bác sĩ

-- 3. Lập lịch khám và quản lý bệnh nhân
DECLARE @bacsi_id INT = 1;  -- Biến lưu id bác sĩ cần lấy lịch khám trong ngày

-- Lấy danh sách lịch khám của bác sĩ có id = 1 trong ngày hôm nay
-- Kèm theo thông tin bệnh nhân và tên bệnh nhân
SELECT LK.*, BN.benhnhan_id, ND.hoten AS ten_benh_nhan
FROM LICH_KHAM LK
JOIN BENH_NHAN BN ON LK.benhnhan_id = BN.benhnhan_id       -- Nối lấy id bệnh nhân trong lịch khám
JOIN NGUOI_DUNG ND ON BN.nguoidung_id = ND.nguoidung_id    -- Lấy tên bệnh nhân từ bảng người dùng
WHERE LK.bacsi_id = @bacsi_id AND CAST(LK.thoi_gian_hen AS DATE) = CAST(GETDATE() AS DATE);
-- Lọc lịch khám theo bác sĩ và ngày hẹn là ngày hôm nay

-- 4. Quản lý bệnh án và điều trị
DECLARE @benhan_id INT = 1; -- Biến lưu id bệnh án cần xem chi tiết

-- Lấy thông tin bệnh án, lịch sử điều trị, phương pháp điều trị và đơn thuốc theo bệnh án đó
SELECT BA.*, LSD.*, PPD.*, DT.*
FROM BENH_AN BA
LEFT JOIN LICH_SU_DIEU_TRI LSD ON BA.benhan_id = LSD.benhan_id            -- Nối lấy lịch sử điều trị nếu có
LEFT JOIN PHUONG_PHAP_DIEU_TRI PPD ON LSD.lsdieutri_id = PPD.lsdieutri_id -- Nối lấy phương pháp điều trị nếu có
LEFT JOIN DON_THUOC DT ON PPD.ppdieutri_id = DT.ppdieutri_id              -- Nối lấy đơn thuốc nếu có
WHERE BA.benhan_id = @benhan_id;                                         -- Lọc theo bệnh án cụ thể

-- 5. Dịch vụ và thanh toán
-- Lấy danh sách hóa đơn và trạng thái thanh toán, số tiền thanh toán theo bệnh nhân
SELECT HD.*, TT.trang_thai, TT.so_tien_thanh_toan
FROM HOA_DON HD
LEFT JOIN THANH_TOAN TT ON HD.hoadon_id = TT.hoadon_id
WHERE HD.benhnhan_id = benhnhan_id;  -- Lọc theo id bệnh nhân (chưa khai báo biến)

-- 6. Truy vấn thống kê

-- Tổng số bệnh nhân đã khám trong ngày hôm nay
SELECT COUNT(*) AS so_benh_nhan
FROM LICH_KHAM
WHERE CAST(thoi_gian_hen AS DATE) = CAST(GETDATE() AS DATE);

-- Tổng doanh thu theo từng ngày, sắp xếp từ ngày gần nhất về trước
SELECT ngay_thanh_toan, SUM(so_tien_thanh_toan) AS tong_doanh_thu
FROM THANH_TOAN
GROUP BY ngay_thanh_toan
ORDER BY ngay_thanh_toan DESC;