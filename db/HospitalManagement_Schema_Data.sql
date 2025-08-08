CREATE DATABASE BENH_VIEN_NIMBUS
GO
USE BENH_VIEN_NIMBUS
GO

-- VAI_TRO
INSERT INTO VAI_TRO (ten_vai_tro, mo_ta) VALUES
(N'Bác sĩ', N'Tài khoản của bác sĩ'),
(N'Bệnh nhân', N'Tài khoản của bệnh nhân'),
(N'Quản lý', N'Tài khoản có toàn quyền'),
(N'Lễ tân', N'Tài khoản của lễ tân');
GO

-- NGUOI_DUNG
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat) VALUES
(N'Nguyễn Văn Hùng', N'Nam', 'hung.nguyen@bvnim.com', '0901234567', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Trần Thị Mai', N'Nữ', 'mai.tran@bvnim.com', '0902345678', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Lê Hoàng Nam', N'Nam', 'nam.le@bvnim.com', '0903456789', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Phạm Ngọc Lan', N'Nữ', 'lan.pham@bvnim.com', '0904567890', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Đỗ Minh Quân', N'Nam', 'quan.do@bvnim.com', '0905678901', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Ngô Thị Hạnh', N'Nữ', 'hanh.ngo@bvnim.com', '0906789012', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Bùi Văn Thịnh', N'Nam', 'thinh.bui@bvnim.com', '0907890123', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Võ Thị Yến', N'Nữ', 'yen.vo@bvnim.com', '0908901234', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Trịnh Văn Long', N'Nam', 'long.trinh@bvnim.com', '0909010001', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Nguyễn Thị Nhung', N'Nữ', 'nhung.nguyen@bvnim.com', '0909010002', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Lý Văn Toàn', N'Nam', 'toan.ly@bvnim.com', '0909010003', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Hoàng Thị Hồng', N'Nữ', 'hong.hoang@bvnim.com', '0909010004', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Phan Văn Đức', N'Nam', 'duc.phan@bvnim.com', '0909010005', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Vũ Thị Hương', N'Nữ', 'huong.vu@bvnim.com', '0909010006', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Lâm Văn Hiếu', N'Nam', 'hieu.lam@bvnim.com', '0909010007', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Đặng Thị Hòa', N'Nữ', 'hoa.dang@bvnim.com', '0909010008', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Hồ Văn Tài', N'Nam', 'tai.ho@bvnim.com', '0909010009', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01'),
(N'Kiều Thị Thu', N'Nữ', 'thu.kieu@bvnim.com', '0909010010', '$2a$12$bfXvA5R8PqXFKQTsqdmDy.W9E8xoW384u0SR5ZZYRfn31dFYAvAdu', '2024-01-01', '2025-01-01')
GO

-- PHAN_QUYEN
INSERT INTO PHAN_QUYEN (vaitro_id, nguoidung_id) VALUES
(3, 1),
(1, 2),
(2, 3),
(4, 4),
(1, 5),
(1, 6),
(1, 7),
(1, 8),
(1, 9),
(1, 10),
(1, 11),
(1, 12),
(1, 13),
(1, 14),
(1, 15),
(1, 16),
(1, 17),
(1, 18)
GO

-- CHUYEN_KHOA
INSERT INTO CHUYEN_KHOA (ten_khoa, mo_ta) VALUES
(N'Nội tổng quát', N'Chẩn đoán và điều trị các bệnh nội khoa thông thường như huyết áp, tiểu đường'),
(N'Nhi khoa', N'Chẩn đoán và điều trị bệnh cho trẻ em'),
(N'Ngoại tổng quát', N'Phẫu thuật các bệnh lý ngoại khoa phổ biến'),
(N'Sản - Phụ khoa', N'Khám và điều trị các bệnh lý phụ nữ, thai sản'),
(N'Tai - Mũi - Họng', N'Khám và điều trị các bệnh về tai, mũi, họng'),
(N'Răng - Hàm - Mặt', N'Chăm sóc và điều trị răng miệng, hàm mặt'),
(N'Tim mạch', N'Khám và điều trị các bệnh lý về tim và mạch máu'),
(N'Nội tiết', N'Khám và điều trị các bệnh về tuyến giáp, tiểu đường, nội tiết tố'),
(N'Thần kinh', N'Chẩn đoán và điều trị các rối loạn thần kinh, não bộ, tủy sống'),
(N'Xương khớp', N'Điều trị các bệnh lý cơ xương khớp như viêm khớp, thoái hóa'),
(N'Mắt', N'Khám và điều trị các bệnh về mắt'),
(N'Da liễu', N'Điều trị các bệnh về da, tóc, móng'),
(N'Hô hấp', N'Khám và điều trị các bệnh về phổi, hen, viêm phế quản'),
(N'Tiêu hóa', N'Khám và điều trị dạ dày, ruột, gan, tụy'),
(N'Ung bướu', N'Chẩn đoán và điều trị các khối u, ung thư');
GO

-- PHONG_KHAM
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES
('101', N'Khám nội', N'Phòng khám chuyên về các bệnh lý nội khoa'),
('102', N'Khám ngoại', N'Phòng khám chuyên các bệnh lý ngoại khoa'),
('103', N'Nhi khoa', N'Phòng khám cho trẻ em'),
('104', N'Sản phụ khoa', N'Phòng khám dành cho phụ nữ mang thai và phụ khoa'),
('105', N'Tai Mũi Họng', N'Phòng khám các bệnh tai, mũi, họng'),
('106', N'Mắt', N'Phòng khám nhãn khoa, đo thị lực và điều trị các bệnh về mắt'),
('107', N'Răng Hàm Mặt', N'Phòng khám nha khoa và các vấn đề hàm mặt'),
('201', N'Chẩn đoán hình ảnh', N'Phòng siêu âm, X-quang, CT, MRI'),
('202', N'Xét nghiệm', N'Phòng lấy mẫu và xét nghiệm sinh hóa, huyết học'),
('203', N'Da liễu', N'Phòng khám điều trị các bệnh ngoài da, tóc và móng');
GO

-- BENH
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES
(N'Cảm cúm', 
 N'Sốt nhẹ, ho, chảy nước mũi, đau họng', 
 N'Virus cúm lây qua đường hô hấp', 
 N'Giữ ấm cơ thể, tránh tiếp xúc người bệnh, tiêm vắc-xin phòng cúm hàng năm', 
 N'Uống nhiều nước, nghỉ ngơi, dùng thuốc hạ sốt và giảm đau', 
 NULL),

(N'Tiểu đường tuýp 2', 
 N'Khát nước, tiểu nhiều, mệt mỏi, sụt cân không rõ nguyên nhân', 
 N'Rối loạn chuyển hóa glucose, thường do di truyền hoặc béo phì', 
 N'Chế độ ăn uống hợp lý, vận động thể lực, kiểm tra sức khỏe định kỳ', 
 N'Dùng thuốc hạ đường huyết, tiêm insulin nếu cần, kết hợp với thay đổi lối sống', 
 NULL),

(N'Viêm phổi', 
 N'Sốt cao, ho có đờm, khó thở, đau ngực', 
 N'Nhiễm trùng do vi khuẩn hoặc virus', 
 N'Giữ vệ sinh, tiêm vắc-xin phòng cúm & phế cầu, tránh khói thuốc', 
 N'Kháng sinh (nếu do vi khuẩn), điều trị triệu chứng và nghỉ ngơi', 
 NULL),

(N'Sốt xuất huyết', 
 N'Sốt cao đột ngột, đau đầu, đau mỏi người, xuất huyết dưới da', 
 N'Virus Dengue lây qua muỗi vằn', 
 N'Diệt muỗi, loại bỏ nơi muỗi sinh sản, mặc quần áo dài', 
 N'Không có thuốc đặc trị, điều trị triệu chứng và theo dõi sát sao', 
 N'Nguy hiểm nếu không phát hiện sớm'),

(N'Viêm dạ dày', 
 N'Đau bụng vùng thượng vị, buồn nôn, đầy hơi', 
 N'Nhiễm vi khuẩn HP, dùng thuốc NSAIDs kéo dài, stress', 
 N'Hạn chế rượu bia, thức ăn cay nóng, ăn đúng giờ', 
 N'Dùng thuốc ức chế acid, kháng sinh diệt HP nếu có', 
 NULL),

 (N'Tăng huyết áp',
 N'Chóng mặt, đau đầu, mệt mỏi, khó thở', 
 N'Di truyền, ăn mặn, căng thẳng, béo phì', 
 N'Ăn nhạt, tập thể dục đều đặn, kiểm tra huyết áp định kỳ', 
 N'Sử dụng thuốc hạ huyết áp và thay đổi lối sống', 
 NULL),

(N'Viêm gan B',
 N'Mệt mỏi, vàng da, nước tiểu sẫm màu, buồn nôn', 
 N'Virus HBV lây qua máu, quan hệ tình dục, mẹ sang con', 
 N'Tiêm vắc-xin, dùng kim tiêm riêng, tình dục an toàn', 
 N'Theo dõi định kỳ, dùng thuốc kháng virus nếu cần', 
 N'Nguy cơ tiến triển xơ gan, ung thư gan'),

(N'Sỏi thận',
 N'Đau lưng dữ dội, tiểu buốt, tiểu ra máu', 
 N'Ăn uống nhiều oxalat, ít nước, di truyền', 
 N'Uống đủ nước, hạn chế muối, tránh thực phẩm giàu oxalat', 
 N'Uống nhiều nước, thuốc tan sỏi hoặc phẫu thuật', 
 NULL),

(N'Viêm ruột thừa',
 N'Đau vùng hố chậu phải, buồn nôn, sốt nhẹ', 
 N'Tắc nghẽn ruột thừa gây viêm', 
 N'Không có biện pháp phòng ngừa cụ thể', 
 N'Phẫu thuật cắt ruột thừa', 
 N'Xử lý sớm để tránh vỡ ruột thừa'),

(N'Viêm da dị ứng',
 N'Ngứa, nổi mẩn đỏ, bong da, nứt nẻ', 
 N'Dị ứng môi trường, thực phẩm, di truyền', 
 N'Tránh tiếp xúc dị nguyên, giữ da ẩm', 
 N'Dùng thuốc kháng histamin, corticoid bôi ngoài da', 
 NULL),

(N'Rối loạn lo âu',
 N'Lo lắng kéo dài, mất ngủ, đánh trống ngực', 
 N'Áp lực cuộc sống, di truyền, mất cân bằng hóa học não', 
 N'Thư giãn, thiền, duy trì lối sống lành mạnh', 
 N'Tâm lý trị liệu, thuốc an thần hoặc chống trầm cảm', 
 N'Cần hỗ trợ tâm lý lâu dài'),

(N'Tai biến mạch máu não',
 N'Tê liệt, méo miệng, nói ngọng, mất ý thức đột ngột', 
 N'Vỡ hoặc tắc mạch máu não', 
 N'Kiểm soát huyết áp, tiểu đường, bỏ thuốc lá', 
 N'Can thiệp y tế khẩn cấp, phục hồi chức năng', 
 N'Cấp cứu trong "giờ vàng"'),

(N'Truyền nhiễm lao phổi',
 N'Ho kéo dài, ho ra máu, sút cân, sốt nhẹ về chiều', 
 N'Nhiễm vi khuẩn lao (Mycobacterium tuberculosis)', 
 N'Tiêm BCG, tránh tiếp xúc người bệnh, ăn uống đủ chất', 
 N'Uống kháng sinh điều trị đủ phác đồ 6 tháng', 
 N'Bệnh xã hội cần quản lý chặt'),

(N'Viêm xoang',
 N'Nghẹt mũi, đau đầu, chảy dịch mũi, giảm khứu giác', 
 N'Nhiễm khuẩn hoặc dị ứng gây viêm các hốc xoang', 
 N'Tránh bụi, giữ ấm cơ thể, rửa mũi bằng nước muối', 
 N'Kháng sinh, xịt mũi hoặc phẫu thuật nếu nặng', 
 NULL),

(N'Trào ngược dạ dày thực quản',
 N'Ợ nóng, buồn nôn, đau ngực, khó nuốt', 
 N'Yếu cơ vòng thực quản dưới, ăn uống thất thường', 
 N'Ăn chậm, không nằm ngay sau ăn, tránh thực phẩm kích ứng', 
 N'Dùng thuốc ức chế acid, thay đổi lối sống', 
 NULL)
GO

-- DICH_VU
INSERT INTO DICH_VU (ten_dich_vu, mo_ta, gia) VALUES
(N'Khám tổng quát',
 N'Kiểm tra sức khỏe toàn diện, đo huyết áp, nhịp tim, BMI...', 
 200000),

(N'Khám chuyên khoa nội',
 N'Khám và tư vấn chuyên sâu các bệnh nội khoa', 
 250000),

(N'Khám chuyên khoa ngoại',
 N'Tư vấn, chẩn đoán các bệnh lý ngoại khoa', 
 250000),

(N'Khám nhi',
 N'Khám bệnh cho trẻ em dưới 15 tuổi', 
 180000),

(N'Xét nghiệm máu tổng quát',
 N'Kiểm tra công thức máu, đường huyết, mỡ máu, men gan...', 
 350000),

(N'Xét nghiệm nước tiểu',
 N'Phân tích nước tiểu, kiểm tra chức năng thận', 
 150000),

(N'Chụp X-quang',
 N'Chụp và phân tích hình ảnh X-quang vùng cần thiết', 
 300000),

(N'Siêu âm ổ bụng',
 N'Siêu âm các cơ quan trong ổ bụng: gan, mật, thận, tụy...', 
 320000),

(N'Điện tâm đồ (ECG)',
 N'Đo hoạt động điện của tim, phát hiện rối loạn nhịp tim', 
 180000),

(N'Khám sức khỏe định kỳ',
 N'Dịch vụ khám sức khỏe theo yêu cầu cơ quan, công ty', 
 400000);
GO

-- LOAI_HINH_KHAM
INSERT INTO LOAI_HINH_KHAM (ten_loai, mo_ta, gia) VALUES
(N'Khám trực tiếp',
 N'Bệnh nhân đến trực tiếp tại cơ sở y tế để khám bệnh', 
 150000),

(N'Khám từ xa (Telemedicine)',
 N'Tư vấn & khám bệnh từ xa qua điện thoại hoặc video call', 
 120000),

(N'Khám cấp cứu',
 N'Dành cho các trường hợp cần xử lý y tế khẩn cấp', 
 300000),

(N'Khám theo yêu cầu',
 N'Khám theo lịch hẹn riêng với bác sĩ chuyên môn cao', 
 250000),

(N'Khám tái khám',
 N'Khám lại sau điều trị để theo dõi tiến triển bệnh', 
 100000),

(N'Khám thường',
 N'Khám bệnh cơ bản, không ưu tiên về thời gian hay bác sĩ', 
 80000),

(N'Khám VIP',
 N'Khám bệnh nhanh, ưu tiên chọn bác sĩ và phòng khám riêng', 
 500000),

(N'Khám theo bảo hiểm',
 N'Khám bệnh có sử dụng thẻ bảo hiểm y tế, được hỗ trợ chi phí', 
 30000);
GO

-- BAC_SI
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat, ngay_tuyen_dung, ghi_chu, trang_thai_hoat_dong) VALUES
(2, 1, N'CC001', N'Tiến sĩ', 12, '2024-01-01', '2025-01-01', '2022-01-01', N'Chuyên điều trị tăng huyết áp, tiểu đường với hơn 12 năm kinh nghiệm.', 1),
(5, 2, N'CC002', N'Thạc sĩ', 8, '2024-01-01', '2025-01-01', '2021-06-15', N'Bác sĩ nhi tận tâm, am hiểu tâm lý trẻ và tư vấn dinh dưỡng hiệu quả.', 1),
(6, 3, N'CC003', N'Bác sĩ CKI', 10, '2024-01-01', '2025-01-01', '2020-03-01', N'Kỹ năng phẫu thuật vững vàng, đặc biệt trong điều trị viêm ruột thừa và thoát vị.', 1),
(7, 4, N'CC004', N'Tiến sĩ', 6, '2024-01-01', '2025-01-01', '2022-09-10', N'Tận tình trong chăm sóc thai kỳ, chuyên môn cao về sản phụ khoa.', 1),
(8, 5, N'CC005', N'Thạc sĩ', 9, '2024-01-01', '2025-01-01', '2019-04-20', N'Giỏi trong điều trị viêm xoang, viêm tai giữa và phẫu thuật nội soi mũi xoang.', 1),
(9, 6, N'CC006', N'Tiến sĩ', 15, '2024-01-01', '2025-01-01', '2015-01-01', N'Giải pháp điều trị răng toàn diện – thẩm mỹ, chỉnh nha, phục hình.', 1),
(10, 7, N'CC007', N'Bác sĩ CKII', 7, '2024-01-01', '2025-01-01', '2020-08-08', N'Chuyên gia tim mạch can thiệp, tư vấn và theo dõi bệnh nhân lâu dài.', 1),
(11, 8, N'CC008', N'Thạc sĩ', 5, '2024-01-01', '2025-01-01', '2023-02-18', N'Tư vấn điều trị tiểu đường, tuyến giáp và rối loạn nội tiết hiệu quả.', 1),
(12, 9, N'CC009', N'Tiến sĩ', 11, '2024-01-01', '2025-01-01', '2018-11-05', N'Chẩn đoán và điều trị chuyên sâu các rối loạn thần kinh, đau đầu, mất ngủ.', 1),
(13, 10, N'CC010', N'Bác sĩ CKI', 6, '2024-01-01', '2025-01-01', '2021-01-12', N'Phục hồi chức năng và điều trị hiệu quả thoái hóa, viêm khớp.', 1),
(14, 11, N'CC011', N'Thạc sĩ', 9, '2024-01-01', '2025-01-01', '2019-07-01', N'Bác sĩ mắt tận tâm, thực hiện mổ đục thủy tinh thể bằng công nghệ cao.', 1),
(15, 12, N'CC012', N'Tiến sĩ', 13, '2024-01-01', '2025-01-01', '2010-03-20', N'Kinh nghiệm dày dặn trong điều trị mụn, viêm da, và liệu trình thẩm mỹ.', 1),
(16, 13, N'CC013', N'Thạc sĩ', 7, '2024-01-01', '2025-01-01', '2021-05-09', N'Điều trị viêm phổi, hen suyễn, tư vấn bỏ thuốc lá chuyên sâu.', 1),
(17, 14, N'CC014', N'Tiến sĩ', 14, '2024-01-01', '2025-01-01', '2012-10-30', N'Giỏi nội soi dạ dày, điều trị trào ngược và các bệnh lý gan mật.', 1),
(18, 15, N'CC015', N'Thạc sĩ', 8, '2024-01-01', '2025-01-01', '2019-02-14', N'Chuyên sâu trong điều trị và theo dõi bệnh ung thư theo phác đồ chuẩn.', 1);
GO

-- BENH_NHAN
INSERT INTO BENH_NHAN (
    nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat, dia_chi, can_cuoc_cong_dan, dan_toc
) VALUES
(3, 'BHYT-987654321', N'Nguyễn Văn Hào', '2024-01-01', '2025-01-01', N'123 Nguyễn Trãi, Hà Nội', '092345678901', N'Kinh');
GO

-- LICH_LAM_VIEC_BAC_SI
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat, ca_truc, ly_do_nghi) VALUES
(1, '2025-08-10', '2025-08-01', '2025-08-01', N'Sáng', NULL),
(2, '2025-08-10', '2025-08-01', '2025-08-01', N'Chiều', NULL),
(3, '2025-08-10', '2025-08-01', '2025-08-01', N'Sáng', NULL),
(4, '2025-08-10', '2025-08-01', '2025-08-01', N'Chiều', NULL),
(5, '2025-08-11', '2025-08-01', '2025-08-01', N'Sáng', NULL),
(6, '2025-08-11', '2025-08-01', '2025-08-01', N'Chiều', NULL),
(7, '2025-08-11', '2025-08-01', '2025-08-01', N'Sáng', NULL),
(8, '2025-08-11', '2025-08-01', '2025-08-01', N'Chiều', NULL),
(9, '2025-08-12', '2025-08-01', '2025-08-01', N'Sáng', NULL),
(10, '2025-08-12', '2025-08-01', '2025-08-01', N'Chiều', NULL),
(11, '2025-08-12', '2025-08-01', '2025-08-01', N'Sáng', NULL),
(12, '2025-08-12', '2025-08-01', '2025-08-01', 'CHIEU', NULL),
(13, '2025-08-13', '2025-08-01', '2025-08-01', N'Sáng', NULL),
(14, '2025-08-13', '2025-08-01', '2025-08-01', N'Chiều', NULL),
(15, '2025-08-13', '2025-08-01', '2025-08-01', N'Sáng', N'Nghỉ khám vì tham gia hội thảo chuyên ngành');
GO

-- GIO_KHAM_CHI_TIET (cập nhật lại theo LICH_KHAM)
INSERT INTO GIO_KHAM_CHI_TIET (lichlv_id, thoi_gian, trang_thai)
VALUES
(1, '08:00', 0),
(1, '08:15', 0),
(1, '08:30', 1),
(1, '08:45', 1),
(2, '13:00', 0),
(2, '13:15', 0),
(2, '13:30', 1),
(2, '13:45', 1),
(3, '09:00', 0),
(3, '09:15', 0),
(3, '09:30', 1),
(3, '09:45', 1),
(4, '14:00', 0),
(4, '14:15', 0),
(4, '14:30', 1),
(4, '14:45', 1),
(5, '07:00', 0),
(5, '07:15', 0),
(5, '07:30', 1),
(5, '07:45', 1),
(6, '15:00', 0),
(6, '15:15', 0),
(6, '15:30', 1),
(6, '15:45', 1),
(7, '08:00', 1),
(7, '08:15', 1),
(7, '08:30', 1),
(7, '08:45', 1),
(8, '18:00', 0),
(8, '18:15', 0),
(8, '18:30', 1),
(8, '18:45', 1),
(9, '08:00', 1),
(9, '08:15', 1),
(9, '08:30', 1),
(9, '08:45', 1),
(10, '19:00', 0),
(10, '19:15', 0),
(10, '19:30', 1),
(10, '19:45', 1),
(11, '08:00', 1),
(11, '08:15', 1),
(11, '08:30', 1),
(11, '08:45', 1),
(12, '20:00', 0),
(12, '20:15', 0),
(12, '20:30', 1),
(12, '20:45', 1),
(13, '08:00', 1),
(13, '08:15', 1),
(13, '08:30', 1),
(13, '08:45', 1),
(14, '08:00', 1),
(14, '08:15', 1),
(14, '08:30', 1),
(14, '08:45', 1);
GO

-- LICH_PHONG_KHAM
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES
(1, 1),
(2, 3),
(3, 2),
(4, 4),
(5, 5),
(6, 7),
(7, 1),
(8, 1),
(9, 1),
(10, 2),
(11, 6),
(12,10),
(13, 1),
(14, 1),
(15, 2);
GO

-- LICH_KHAM
INSERT INTO LICH_KHAM (
    bacsi_id, benhnhan_id, thoi_gian_tu, thoi_gian_den, 
    ngay_kham, ca_kham, loai_id, trang_thai, ghi_chu, 
    ngay_tao, ngay_cap_nhat
)
VALUES 
(1, 1, '08:00', '08:15', DATEADD(DAY, 1, GETDATE()), N'Sáng', 1, N'Đang chờ', N'Khám định kỳ', GETDATE(), GETDATE()),
(2, 1, '08:30', '08:45', DATEADD(DAY, 2, GETDATE()), N'Sáng', 2, N'Đang chờ', N'Khám tai mũi họng', GETDATE(), GETDATE()),
(3, 1, '09:00', '09:15', DATEADD(DAY, 3, GETDATE()), N'Sáng', 3, N'Đang chờ', N'Khám da liễu', GETDATE(), GETDATE()),
(4, 1, '13:00', '13:15', DATEADD(DAY, 4, GETDATE()), N'Chiều', 1, N'Đang chờ', N'Khám mắt', GETDATE(), GETDATE()),
(5, 1, '14:00', '14:15', DATEADD(DAY, 5, GETDATE()), N'Chiều', 2, N'Đang chờ', N'Khám tổng quát', GETDATE(), GETDATE()),
(1, 1, '15:00', '15:15', DATEADD(DAY, 6, GETDATE()), N'Chiều', 3, N'Đang chờ', N'Khám nội', GETDATE(), GETDATE()),
(2, 1, '18:00', '18:15', DATEADD(DAY, 7, GETDATE()), N'Tối', 1, N'Đang chờ', N'Khám tiêu hóa', GETDATE(), GETDATE()),
(3, 1, '19:00', '19:15', DATEADD(DAY, 8, GETDATE()), N'Tối', 2, N'Đang chờ', N'Khám phụ khoa', GETDATE(), GETDATE()),
(4, 1, '20:00', '20:15', DATEADD(DAY, 9, GETDATE()), N'Tối', 3, N'Đang chờ', N'Khám ngoại', GETDATE(), GETDATE()),
(5, 1, '07:00', '07:15', DATEADD(DAY, 10, GETDATE()), N'Sáng', 1, N'Đang chờ', N'Khám lại', GETDATE(), GETDATE());
GO

-- BENH_AN
INSERT INTO BENH_AN (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
VALUES
(1, 1, N'Tái khám định kỳ', N'Tình trạng ổn định', N'Hẹn tái khám sau 1 tháng', GETDATE()),
(2, 2, N'Đau mũi, nghẹt mũi', N'Viêm xoang cấp', N'Đề nghị dùng thuốc xịt mũi', GETDATE()),
(3, 3, N'Nổi mẩn ngứa', N'Dị ứng thời tiết', N'Tiếp tục theo dõi', GETDATE()),
(4, 1, N'Suy giảm thị lực nhẹ', N'Cần đo kính và kiểm tra mắt định kỳ', N'Tái khám sau 2 tuần', GETDATE()),
(5, 2, N'Khám tổng quát không phát hiện bất thường', N'Sức khỏe tốt', N'Hẹn kiểm tra lại sau 6 tháng', GETDATE()),
(6, 3, N'Đau bụng nhẹ, khó tiêu', N'Nghi ngờ rối loạn tiêu hóa', N'Dùng men tiêu hóa', GETDATE()),
(7, 1, N'Táo bón lâu ngày', N'Thay đổi chế độ ăn uống', N'Ăn nhiều chất xơ', GETDATE()),
(8, 2, N'Khám sản phụ khoa định kỳ', N'Không có dấu hiệu bất thường', N'Lịch hẹn khám tiếp theo 3 tháng', GETDATE()),
(9, 3, N'Đau vùng vai, căng cơ', N'Chỉ định tập vật lý trị liệu', N'Tập thể dục nhẹ nhàng tại nhà', GETDATE()),
(10, 1, N'Tái khám sau đợt cảm cúm', N'Đã khỏi bệnh', N'Không cần điều trị thêm', GETDATE());
GO

-- HO_SO_BENH_AN
INSERT INTO HO_SO_BENH_AN (benhan_id, benh_id, ngay_tao)
VALUES
(1, 1, GETDATE()),
(2, 2, GETDATE()),
(3, 3, GETDATE()),
(4, 4, GETDATE()),
(5, 5, GETDATE()),
(6, 1, GETDATE()),
(7, 2, GETDATE()),
(8, 3, GETDATE()),
(9, 4, GETDATE()),
(10, 5, GETDATE());
GO

-- LICH_SU_DIEU_TRI
INSERT INTO LICH_SU_DIEU_TRI (benhan_id, ngay_dieu_tri, ghi_chu)
VALUES
(1, DATEADD(DAY, 1, GETDATE()), N'Theo dõi chỉ số huyết áp và nhịp tim'),
(2, DATEADD(DAY, 2, GETDATE()), N'Điều trị viêm xoang bằng thuốc xịt mũi'),
(3, DATEADD(DAY, 3, GETDATE()), N'Bôi thuốc mỡ trị viêm da dị ứng'),
(4, DATEADD(DAY, 4, GETDATE()), N'Khám soi đáy mắt kiểm tra võng mạc'),
(5, DATEADD(DAY, 5, GETDATE()), N'Làm xét nghiệm công thức máu'),
(6, DATEADD(DAY, 6, GETDATE()), N'Chẩn đoán nội khoa tổng quát'),
(7, DATEADD(DAY, 7, GETDATE()), N'Nội soi dạ dày kiểm tra loét'),
(8, DATEADD(DAY, 8, GETDATE()), N'Tư vấn sức khỏe phụ khoa định kỳ'),
(9, DATEADD(DAY, 9, GETDATE()), N'Chụp X-quang phổi do ho kéo dài'),
(10, DATEADD(DAY, 10, GETDATE()), N'Tái khám sau điều trị bằng kháng sinh');
GO

-- PHUONG_PHAP_DIEU_TRI
INSERT INTO PHUONG_PHAP_DIEU_TRI (lsdieutri_id, ten_phuong_phap, hieu_qua)
VALUES
(1, N'Uống thuốc hạ huyết áp hàng ngày', N'Hiệu quả tốt'),
(2, N'Rửa mũi bằng nước muối sinh lý', N'Khá hiệu quả'),
(3, N'Dùng kem bôi ngoài da chứa corticoid', N'Đỡ ngứa'),
(4, N'D nhỏ mắt chống khô và chống viêm', N'Ổn định'),
(5, N'Xét nghiệm máu thường quy', N'Đang chờ kết quả'),
(6, N'Tư vấn chế độ ăn uống và nghỉ ngơi', N'Cải thiện tốt'),
(7, N'Dùng thuốc dạ dày omeprazole', N'Hiệu quả rõ rệt'),
(8, N'Siêu âm vùng bụng dưới', N'Không phát hiện bất thường'),
(9, N'X-quang ngực để kiểm tra viêm phổi', N'Trong giới hạn bình thường'),
(10, N'Uống kháng sinh cefuroxim 7 ngày', N'Đỡ rõ rệt');
GO

-- DON_THUOC
INSERT INTO DON_THUOC (ppdieutri_id, ngay_phat_hanh)
VALUES 
(1, DATEADD(DAY, -10, GETDATE())),
(2, DATEADD(DAY, -9, GETDATE())),
(3, DATEADD(DAY, -8, GETDATE())),
(4, DATEADD(DAY, -7, GETDATE())),
(5, DATEADD(DAY, -6, GETDATE())),
(6, DATEADD(DAY, -5, GETDATE())),
(7, DATEADD(DAY, -4, GETDATE())),
(8, DATEADD(DAY, -3, GETDATE())),
(9, DATEADD(DAY, -2, GETDATE())),
(10, DATEADD(DAY, -1, GETDATE()));
GO

-- CHI_TIET_DON_THUOC
INSERT INTO CHI_TIET_DON_THUOC (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
VALUES 
(1, N'Paracetamol', 2, 1, 5),
(1, N'Amoxicillin', 3, 0, 7),
(2, N'Ibuprofen', 2, 1, 3),
(2, N'Cefixime', 2, 0, 5),
(3, N'Loratadin', 1, 1, 10),
(3, N'Vitamin C', 1, 1, 15),
(4, N'Oresol', 3, 0, 2),
(4, N'Panadol', 2, 1, 5),
(5, N'Clorpheniramin', 1, 0, 3),
(5, N'Zinnat', 2, 0, 7),
(6, N'Thuốc ho Prospan', 2, 1, 5),
(6, N'Cephalexin', 3, 0, 6),
(7, N'Metoprolol', 1, 1, 30),
(7, N'Amlodipin', 1, 1, 30),
(8, N'Azithromycin', 2, 0, 5),
(8, N'Magnesium B6', 2, 1, 10),
(9, N'Nifedipine', 1, 1, 20),
(9, N'Folic Acid', 1, 1, 30),
(10, N'Omeprazole', 1, 1, 10),
(10, N'Prednisolon', 2, 0, 5);
GO

-- HOA_DON
INSERT INTO HOA_DON (
    benhnhan_id,
    nguoidung_lap_hoadon_id,
    ngay_tao,
    tong_tien,
    tong_tien_thanh_toan,
    tong_tien_con_no,
    trang_thai
) VALUES
(1, 1, GETDATE(), 500000.00, 500000.00, 0.00, N'CHUA_THANH_TOAN'),
(1, 2, DATEADD(DAY, -1, GETDATE()), 1200000.00, 1000000.00, 200000.00, N'DA_THANH_TOAN'),
(1, 3, DATEADD(DAY, -5, GETDATE()), 750000.00, 750000.00, 0.00, N'CHUA_THANH_TOAN'),
(1, 4, DATEADD(DAY, -10, GETDATE()), 900000.00, 900000.00, 0.00, N'HUY'),
(1, 1, DATEADD(DAY, -3, GETDATE()), 300000.00, 300000.00, 0.00, N'DA_THANH_TOAN');
GO

-- CHI_TIET_HOA_DON
INSERT INTO CHI_TIET_HOA_DON (
    hoadon_id, dichvu_id, so_luong, don_gia, tong_gia
) VALUES
(1, 1, 1, 150000.00, 150000.00),
(1, 2, 1, 120000.00, 120000.00),
(1, 6, 1, 80000.00, 80000.00),
(1, 5, 1, 100000.00, 100000.00),
(1, 8, 1, 50000.00, 50000.00),
(2, 3, 2, 300000.00, 600000.00),
(2, 4, 2, 250000.00, 500000.00),
(2, 6, 1, 80000.00, 80000.00),
(2, 8, 1, 30000.00, 30000.00),
(3, 7, 1, 500000.00, 500000.00),
(3, 2, 1, 120000.00, 120000.00),
(3, 5, 1, 100000.00, 100000.00),
(3, 8, 1, 30000.00, 30000.00),
(4, 4, 3, 250000.00, 750000.00),
(4, 2, 1, 120000.00, 120000.00),
(4, 8, 1, 30000.00, 30000.00),
(5, 5, 3, 100000.00, 300000.00);
GO

-- THANH_TOAN
INSERT INTO THANH_TOAN (
    hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, 
    phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu
) VALUES
(1, GETDATE(), 500000.00, N'Tiền mặt', N'Đã thanh toán', 'GD001', N'Thanh toán tại quầy'),
(2, DATEADD(DAY, -1, GETDATE()), 1000000.00, N'Chuyển khoản', N'Đã thanh toán', 'GD002', N'Thanh toán qua ngân hàng'),
(3, DATEADD(DAY, -5, GETDATE()), 750000.00, N'Thẻ tín dụng', N'Đã thanh toán', 'GD003', N'Thanh toán bằng thẻ'),
(5, DATEADD(DAY, -3, GETDATE()), 300000.00, N'QR Code', N'Đã thanh toán', 'GD004', N'Mã QR momo');
GO

-- QUAN_LY
INSERT INTO QUAN_LY (nguoidung_id, chuc_vu, ghi_chu)
VALUES 
(1, N'Quản trị hệ thống', N'Quản lý toàn bộ hệ thống, phân quyền người dùng');
GO

-- LE_TAN
INSERT INTO LE_TAN (
    nguoidung_id,
    chuc_vu,
    ghi_chu,
    ngay_tao,
    ngay_cap_nhat,
    ngay_tuyen_dung,
    trang_thai_hoat_dong
)
VALUES
(4, N'Lễ tân tiếp nhận', N'Lễ tân ca sáng', GETDATE(), GETDATE(), '2023-05-01', 1)
GO

-- LICH_LAM_VIEC_LE_TAN
INSERT INTO LICH_LAM_VIEC_LE_TAN (letan_id, ngay, ca_lam, ghi_chu)
VALUES 
(1, DATEADD(DAY, 1, GETDATE()), N'Sáng', N'Trực quầy lễ tân'),
(1, DATEADD(DAY, 2, GETDATE()), N'Sáng', N'Trực tiếp bệnh nhân mới'),
(1, DATEADD(DAY, 1, GETDATE()), N'Chiều', N'Thu ngân & báo cáo thu chi'),
(1, DATEADD(DAY, 3, GETDATE()), N'Chiều', N'Trực tiếp bệnh nhân nội trú'),
(1, DATEADD(DAY, 2, GETDATE()), N'Tối', N'Trực lễ tân cuối tuần'),
(1, DATEADD(DAY, 4, GETDATE()), N'Tối', N'Kiểm kê thông tin bệnh nhân');
GO