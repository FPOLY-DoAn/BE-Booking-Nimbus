USE BENH_VIEN_NIMBUS;
GO

-- 1. VAI_TRO
INSERT INTO VAI_TRO (ten_vai_tro, mo_ta)
VALUES 
    (N'Bác sĩ', N'Người chịu trách nhiệm khám và điều trị cho bệnh nhân'),
    (N'Bệnh nhân', N'Người đến bệnh viện để được khám và điều trị'),
    (N'Quản lý', N'Người điều hành và quản trị hệ thống bệnh viện'),
    (N'Lễ tân', N'Người tiếp nhận bệnh nhân và hỗ trợ đăng ký khám bệnh');
GO

-- 2. NGUOI_DUNG
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Kim Thị Vũ', 'F', 'ybui@example.com', '059382421', 'lsA4RcMw)X', '2023-06-24 18:29:17', '2025-04-08 11:09:48');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Hương Bùi', 'F', 'hoangjane@example.com', '(05)13933287', 'z@A91CuqlK', '2024-04-05 11:17:37', '2024-10-27 07:17:56');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Nhiên Hải Vũ', 'M', 'johnle@example.org', '+84-47-112201', 'o+Q538nm8V', '2024-01-14 13:55:59', '2025-01-30 13:09:33');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Trung Hải Nguyễn', 'F', 'john35@example.org', '0601230989', '_1UAFy#dx1', '2024-05-29 11:11:08', '2025-02-18 15:44:06');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Vân Bùi', 'F', 'vujohn@example.org', '+84456208709', 'E6otGix%@o', '2024-01-18 08:29:57', '2025-05-23 16:00:07');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Anh Nam Dương', 'F', 'ghoang@example.com', '+84-56-4280715', '+0NXbVRp)i', '2023-08-14 06:27:18', '2025-02-26 03:01:22');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Phúc Hải Phạm', 'F', 'tbui@example.net', '+84-60-696027', 'L4tW!#fn@m', '2024-04-20 19:35:06', '2025-03-08 14:25:01');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Cô Kim Bùi', 'F', 'john30@example.net', '(00)891-3193', '*%4&Wfkp)Q', '2024-04-26 04:07:47', '2024-06-07 00:53:08');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Ngọc Phạm', 'F', 'jane59@example.org', '(09)776-5823', '_89F&Ja7&V', '2023-09-22 12:45:06', '2024-07-14 10:40:20');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Anh Hưng Vũ', 'M', 'johnvu@example.com', '(05)461-1877', '^5#Dc+pTlz', '2023-06-03 15:10:37', '2024-07-07 21:53:58');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Phương Thế Dương', 'M', 'thoang@example.net', '(06)15349263', '#^h1O6CwlY', '2023-10-19 00:44:56', '2024-12-29 00:29:45');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Cô Khoa Dương', 'F', 'janebui@example.net', '057738930', '^5KbG9eMlQ', '2023-06-16 08:43:05', '2024-09-24 12:08:28');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Vi Dương', 'M', 'john27@example.com', '+84-68-809189', '@sYxgxW56@', '2024-01-08 01:16:14', '2024-09-06 15:29:37');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Vũ Mai Bảo Vũ', 'M', 'jane66@example.org', '(02)34500762', 'bc9IXW$M+*', '2024-02-27 11:12:57', '2024-12-30 02:09:04');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Trung Hữu Dương', 'F', 'nguyenjane@example.net', '+84-51-9426418', 'KmLZ^$vN$0', '2024-02-26 20:30:53', '2024-12-20 05:06:20');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Phương Thế Trần', 'M', 'janehoang@example.com', '+84161162076', 'u_6^^A#D!p', '2023-08-20 08:29:46', '2024-06-01 01:53:08');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Cô Yến Nguyễn', 'F', 'jane09@example.org', '(02)271-7542', 'N93LZkz*!+', '2023-09-02 21:25:15', '2024-08-30 17:33:54');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Bà Thành Bùi', 'M', 'lejohn@example.com', '+84126486296', 'K%5%CIfh39', '2023-07-14 03:23:43', '2025-01-02 14:23:23');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quý cô Kim Lê', 'M', 'lbui@example.org', '058257173', 'X!A0WSoe%c', '2024-02-01 01:16:43', '2024-06-08 05:16:03');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Hạnh Nguyễn', 'F', 'vujane@example.net', '+84-67-145439', '70(Crizp@)', '2024-02-02 00:50:42', '2024-12-27 22:13:45');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Nhật Đức Vũ', 'F', 'kdang@example.net', '(02)11669728', '_INLBu%Ah4', '2023-11-30 16:58:04', '2024-10-29 15:49:40');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Ánh Mai', 'M', 'tranjane@example.org', '0019044329', 'MC%Js3DnQ)', '2023-11-13 12:38:01', '2025-04-09 04:06:36');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quý ông Quang Phạm', 'F', 'lpham@example.net', '+84603125023', 'eP9q4LTcw)', '2024-02-29 00:50:40', '2024-12-01 13:09:45');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Bà Thảo Nguyễn', 'F', 'nguyenjohn@example.com', '+84402163968', 'XW&7Gk6Q$^', '2024-02-16 19:43:09', '2025-03-09 22:46:30');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Khoa Mai', 'F', 'evu@example.com', '(03)048-1077', '7OB&5nzr+X', '2023-09-05 13:38:08', '2024-12-07 03:01:00');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Chị Ánh Vũ', 'M', 'jane61@example.net', '0983478978', '_4e0I4hz!R', '2023-07-16 12:07:01', '2025-03-13 03:44:21');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quang Thế Phạm', 'F', 'johnmai@example.com', '+84-53-5749220', 'V@8KyPlij(', '2023-10-15 20:30:31', '2025-01-22 03:22:58');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quý cô Hà Hoàng', 'F', 'maijane@example.com', '040382778', 'Wem^1I#exD', '2024-02-16 09:37:29', '2024-08-01 20:48:21');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Nam Đặng', 'F', 'lejane@example.org', '000300351', '5uL_Vafn!!', '2024-01-05 21:39:03', '2025-05-23 16:50:08');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Kim Bùi', 'M', 'johnmai@example.org', '+84-82-153230', '#8WXLFWwlg', '2023-09-22 06:29:02', '2025-02-15 15:56:58');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quý cô Lâm Mai', 'M', 'john65@example.com', '(07)604-8487', '7cLSrO@g!8', '2023-12-18 01:54:06', '2024-10-09 23:24:11');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Hạnh Hoàng Trần', 'M', 'john98@example.net', '0225090925', 'BjW4U_$ju^', '2023-06-27 20:44:27', '2024-12-29 23:40:01');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Hạnh Xuân Mai', 'F', 'johnle@example.net', '+84889664440', 'RBDeJ4Irk&', '2023-06-14 16:59:07', '2025-01-03 22:14:20');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Hải Hải Nguyễn', 'M', 'john35@example.net', '+84-70-3934261', 'epsl7Hx%J)', '2023-10-05 20:57:49', '2024-07-05 00:29:09');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Nam Dương', 'F', 'vujohn@example.com', '066097592', ')u4&qKafbM', '2024-03-23 13:48:49', '2025-02-01 15:43:01');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Huy Lê', 'F', 'janevu@example.net', '+84222708086', '5^Z7lCes#L', '2024-02-01 05:44:19', '2025-01-13 05:02:28');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Cô Thành Trần', 'M', 'janehoang@example.org', '(07)825-2780', '(jQWUkFEo1', '2023-08-14 16:05:11', '2024-06-16 23:10:13');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Hải Thị Vũ', 'F', 'mnguyen@example.net', '(05)16075994', '_1L7wS*z4H', '2024-03-16 07:19:53', '2025-05-04 08:14:53');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quý ông Vũ Nguyễn', 'M', 'bvu@example.net', '+84-11-551702', '(+S40uBarY', '2023-09-01 21:40:11', '2025-02-01 16:39:02');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Dũng Lê', 'M', 'janepham@example.org', '075926902', ')0V@B!muU0', '2024-05-20 10:15:00', '2025-02-21 09:45:44');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quang Trí Đặng', 'M', 'janetran@example.org', '095166376', '$u^6HuSWj6', '2024-05-02 10:07:48', '2025-04-05 18:19:26');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Hải Đức Mai', 'M', 'lejane@example.org', '(06)661-7972', '#t5PnF_EMQ', '2024-03-07 13:06:12', '2025-01-12 12:03:47');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Khoa Hữu Nguyễn', 'M', 'jane06@example.com', '035221952', 'MZ6^JS_m0!', '2024-03-12 08:52:58', '2024-09-19 16:28:58');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Tú Bảo Vũ', 'F', 'janemai@example.com', '+84-26-843656', 'zncJ!Wev*8', '2023-09-12 03:37:52', '2025-02-22 05:26:54');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quý cô Hà Nguyễn', 'M', 'tranjane@example.net', '051759473', '#Pr@R0cIa8', '2023-07-22 17:27:37', '2025-05-22 23:36:20');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Bảo Mai Hoàng', 'M', 'buijohn@example.net', '+84-65-387079', 'SH75EAQp@4', '2023-07-06 09:45:09', '2024-09-10 22:38:50');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Anh Tú Vũ', 'F', 'janetran@example.org', '+84-02-9830068', '+uT9DP!woB', '2023-12-15 06:01:23', '2025-05-25 15:31:18');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Vũ Quang Vũ', 'F', 'vpham@example.com', '023437546', 'H)2aYtJdHi', '2023-10-12 04:27:27', '2025-05-28 02:50:47');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Chị Xuân Đặng', 'M', 'hpham@example.net', '067879936', 'B(&4PhxyU#', '2023-08-08 22:24:29', '2024-07-13 18:00:18');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Bà An Phạm', 'F', 'nguyenjane@example.net', '+84219931730', '(u4INN3c$9', '2024-02-04 10:11:45', '2024-07-22 00:15:31');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Hạnh Trần', 'F', 'vujohn@example.net', '(09)26395368', 'dNP(11Rd^P', '2023-06-09 20:54:37', '2024-11-20 10:05:21');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Vân Bùi', 'M', 'bpham@example.org', '0772374579', '1v#8%DVc+s', '2023-10-30 09:23:39', '2024-06-18 03:04:31');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Minh Hoàng Đặng', 'F', 'janele@example.net', '+84-97-9397037', '2$))5RcxiJ', '2023-08-02 23:14:22', '2024-10-22 13:00:01');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Bảo Hữu Dương', 'M', 'jane12@example.org', '(01)267-8350', 'p6qI3!G_!c', '2024-03-10 06:34:45', '2024-12-08 04:24:05');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Mai Bùi', 'F', 'jane10@example.org', '+84-09-852741', 'Ghu4V7Ih)N', '2023-10-28 07:24:48', '2025-03-10 00:02:47');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Hương Bùi', 'F', 'johnnguyen@example.org', '+84-63-0446154', '29SDSZO@^u', '2023-11-09 18:48:53', '2025-04-02 21:12:54');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Hạnh Hoàng', 'M', 'maijohn@example.net', '(07)08351832', '3hM7gDzp+n', '2023-07-02 22:14:41', '2025-02-11 06:04:53');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Khoa Tấn Nguyễn', 'F', 'hoangjohn@example.com', '(01)243-8857', '@6VMQrYb9@', '2023-10-01 15:56:55', '2024-12-29 14:03:18');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Hưng Phạm', 'F', 'janehoang@example.org', '(06)649-3458', '*0$eNW&d7)', '2023-11-08 07:52:15', '2024-07-18 04:44:39');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quý cô Thảo Vũ', 'M', 'ebui@example.net', '+84285332342', '#58Irv6T#V', '2024-04-05 17:31:04', '2025-05-02 19:20:17');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Yến Dương', 'F', 'johnbui@example.org', '086368871', 's#1hRHbyya', '2023-09-02 19:51:14', '2025-03-14 12:14:02');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Cô Vi Nguyễn', 'M', 'duongjohn@example.com', '+84-29-8409255', 'c)Ng4QuNK^', '2023-11-01 07:42:00', '2025-01-10 14:07:11');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Nhật Thế Hoàng', 'M', 'johnbui@example.org', '0828298887', '^aNjxL^2*4', '2023-08-06 23:56:35', '2025-05-18 03:36:37');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Trọng Đức Nguyễn', 'M', 'nguyenjohn@example.com', '(03)675-5196', '@REYu2f1@0', '2024-05-17 09:55:19', '2024-05-31 21:22:52');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Hồng Hoàng', 'M', 'lejohn@example.com', '0593052547', 's*9+*7KWJi', '2024-03-26 22:11:02', '2024-07-13 02:25:53');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quý cô Hạnh Trần', 'F', 'rvu@example.org', '+84-58-8100902', '@rMm&Hzy$6', '2024-01-04 04:04:51', '2025-03-10 18:30:17');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Huy Bùi', 'F', 'duongjohn@example.net', '(03)92197444', '$6Vjqa+_i)', '2023-10-06 20:17:34', '2025-01-10 10:28:23');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Hà Đặng', 'M', 'janeduong@example.com', '+84-77-8811576', 'Jr4ZPP_^&8', '2024-01-06 02:53:28', '2024-09-25 09:12:09');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Châu Hữu Hoàng', 'M', 'jane85@example.org', '(08)065-5803', ')i61PyPdFD', '2024-02-09 16:59:29', '2025-02-08 23:58:18');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Bác Phúc Nguyễn', 'M', 'qmai@example.org', '(06)497-3079', 'BCJTo_J5)2', '2024-05-01 20:29:21', '2025-05-26 03:12:30');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Bảo Hải Hoàng', 'M', 'john53@example.org', '(04)828-9177', '$eTl3GPEI2', '2024-04-24 11:41:48', '2025-01-02 05:24:56');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Ông Anh Mai', 'M', 'jane65@example.net', '+84-60-1052498', 'pn4cfRk&*4', '2024-05-15 13:07:53', '2025-01-04 16:04:43');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Cô Ngọc Trần', 'M', 'john96@example.net', '(09)98344229', '$k_X3EoIh2', '2024-02-11 07:34:37', '2024-12-03 03:17:01');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Bà Hà Hoàng', 'F', 'john02@example.org', '+84-90-6227808', 'LbKVf8e*^3', '2023-10-31 00:02:48', '2024-06-25 06:02:48');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quý cô Hà Hoàng', 'F', 'maijohn@example.net', '(07)264-8321', 'PDpgG)Km%7', '2023-08-21 04:35:46', '2024-11-28 20:28:16');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quý cô Hương Trần', 'M', 'gtran@example.net', '020333196', 'Q4&u1)RgZ&', '2024-04-01 21:01:33', '2024-06-11 00:54:35');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quang Hoàng Nguyễn', 'M', 'janepham@example.net', '+84-30-2377194', '_v4MbXkFX&', '2023-12-05 21:47:04', '2024-09-17 16:41:46');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Bà Nhật Lê', 'F', 'maijane@example.com', '+84-15-3348666', '9a2nO+Oc!3', '2024-05-29 10:37:03', '2024-08-08 12:34:37');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Thảo Dương', 'F', 'dangjohn@example.org', '038009174', '+FIwmwj+O9', '2024-02-17 15:42:52', '2025-03-24 15:53:41');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Chị Khoa Hoàng', 'F', 'johntran@example.com', '+84497949601', '#ZG79Bjl_q', '2024-03-23 18:20:01', '2024-09-05 02:24:35');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Khoa Trí Đặng', 'F', 'tpham@example.org', '043441527', '$!96UXoQ+!', '2023-12-05 20:38:09', '2025-05-07 15:55:42');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Bác Minh Bùi', 'F', 'janevu@example.org', '+84-03-5410645', 'jnZ6i3KcE)', '2023-07-04 16:19:40', '2025-01-02 09:18:56');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Anh Tú Nguyễn', 'M', 'pduong@example.com', '+84-16-0492448', '@x8DCoVvU7', '2023-07-10 16:23:47', '2024-06-01 15:53:36');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Thành Phạm', 'F', 'john84@example.org', '+84894031272', '0eU7@)IwG#', '2023-12-13 13:56:52', '2025-01-03 04:59:04');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Phúc Bảo Nguyễn', 'M', 'ohoang@example.com', '0857745422', '@NkebKuf$7', '2023-07-22 04:40:56', '2024-06-12 14:37:07');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quý ông Bảo Dương', 'F', 'john39@example.org', '+84721886943', '@6g!ArqiIe', '2023-10-25 17:44:48', '2025-02-04 16:16:13');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Kim Hải Vũ', 'F', 'jbui@example.org', '+84-64-7266699', '%mVRDJlAc7', '2023-10-10 04:22:53', '2024-07-30 09:42:11');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quý cô Hà Trần', 'M', 'johnpham@example.net', '(00)86624674', '(0aNFgApV7', '2023-08-24 22:16:27', '2025-05-27 00:15:51');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Bác Tùng Phạm', 'M', 'btran@example.org', '+84150440009', 'M2_wTkTf!(', '2024-03-08 23:21:15', '2025-05-10 16:23:43');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Cô Bảo Đặng', 'M', 'imai@example.org', '+84-80-8316585', '(59RmjE8EF', '2024-02-08 23:34:36', '2025-05-16 14:26:52');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Chị Hà Dương', 'F', 'rle@example.com', '(02)025-5318', '*YX2EUi8uG', '2023-06-13 16:33:08', '2025-03-20 21:32:00');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Phương Đức Lê', 'M', 'john41@example.com', '+84-60-4324581', 's^9G$!l+#7', '2024-02-05 06:37:52', '2024-12-27 17:48:37');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Quý cô Xuân Mai', 'M', 'nhoang@example.com', '(05)510-6527', '@$6YtH+Jzn', '2024-05-18 10:16:22', '2025-01-06 14:51:56');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Thảo Lê', 'F', 'lejane@example.org', '048658677', '@kFQOZT34a', '2024-04-05 15:01:52', '2024-09-15 21:15:36');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Ngọc Dương', 'M', 'wmai@example.net', '087879290', 'J40W5GOj)y', '2024-03-07 12:22:55', '2025-04-06 16:56:24');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Cô Linh Mai', 'F', 'jane89@example.org', '0282215300', 'Q*M_7Curts', '2023-08-09 16:19:05', '2025-03-26 01:33:23');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Dương Dương', 'F', 'obui@example.org', '+84647676263', 'l3IlL6M)&c', '2024-01-21 08:44:54', '2024-11-19 13:03:57');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Phúc Quang Đặng', 'M', 'janedang@example.net', '+84-11-6554503', '_4U5essfG&', '2023-07-29 07:13:38', '2025-01-31 07:57:04');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Kim Hoàng', 'M', 'vujohn@example.net', '+84-13-462874', 'H21+fUzs^g', '2024-04-05 02:58:29', '2025-04-02 03:07:10');
INSERT INTO NGUOI_DUNG (hoten, gioi_tinh, email, so_dien_thoai, mat_khau, ngay_tao, ngay_cap_nhat)
VALUES (N'Bảo Nguyễn', 'M', 'janele@example.com', '(03)12761531', '^BGDhpsyq2', '2023-08-15 14:09:07', '2024-12-11 04:35:37');

-- 3. PHAN_QUYEN
DECLARE @j INT = 1;
WHILE @j <= 100
BEGIN
    DECLARE @role_id INT;

    IF @j <= 5
        SET @role_id = 3;
    ELSE IF @j <= 20
        SET @role_id = 4;
    ELSE IF @j <= 60
        SET @role_id = 1;
    ELSE
        SET @role_id = 2;

    INSERT INTO PHAN_QUYEN (vaitro_id, nguoidung_id)
    VALUES (@role_id, @j);

    SET @j = @j + 1;
END

-- 4. CHUYEN_KHOA
INSERT INTO CHUYEN_KHOA (ten_khoa, mo_ta) VALUES
(N'Nội tổng quát', N'Chuyên điều trị các bệnh lý nội khoa tổng quát'),
(N'Ngoại tổng quát', N'Chuyên phẫu thuật và điều trị bệnh lý ngoại khoa'),
(N'Tim mạch', N'Chẩn đoán và điều trị các bệnh về tim và mạch máu'),
(N'Nhi khoa', N'Chăm sóc và điều trị bệnh cho trẻ em'),
(N'Sản phụ khoa', N'Chuyên về sản khoa và phụ khoa'),
(N'Da liễu', N'Chẩn đoán và điều trị các bệnh về da'),
(N'Tai mũi họng', N'Chuyên điều trị các bệnh về tai, mũi, họng'),
(N'Răng hàm mặt', N'Chăm sóc và điều trị các bệnh về răng và hàm mặt'),
(N'Mắt', N'Chẩn đoán và điều trị các bệnh về mắt'),
(N'Thần kinh', N'Chuyên điều trị các bệnh về hệ thần kinh'),
(N'Hô hấp', N'Chẩn đoán và điều trị các bệnh về hệ hô hấp'),
(N'Tiêu hóa', N'Chuyên điều trị các bệnh về hệ tiêu hóa'),
(N'Tai biến mạch máu não', N'Điều trị các bệnh liên quan đến tai biến mạch máu não'),
(N'Chấn thương chỉnh hình', N'Chẩn đoán và điều trị các bệnh về xương, khớp, cơ'),
(N'Y học cổ truyền', N'Điều trị bệnh bằng các phương pháp y học cổ truyền'),
(N'Di truyền', N'Chuyên tư vấn và điều trị các bệnh di truyền');

-- 5. PHONG_KHAM
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'G297', 'H', N'Phòng khám chuyên khoa Nội tổng quát');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'A232', 'H', N'Phòng khám chuyên khoa Ngoại tổng quát');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'D570', 'H', N'Phòng khám chuyên khoa Tim mạch');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'D283', 'C', N'Phòng khám chuyên khoa Nhi khoa');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'E171', 'H', N'Phòng khám chuyên khoa Sản phụ khoa');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'B486', 'C', N'Phòng khám chuyên khoa Da liễu');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'E509', 'H', N'Phòng khám chuyên khoa Tai mũi họng');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'E461', 'C', N'Phòng khám chuyên khoa Răng hàm mặt');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'C150', 'C', N'Phòng khám chuyên khoa Mắt');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'G450', 'H', N'Phòng khám chuyên khoa Thần kinh');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'D386', 'C', N'Phòng khám Hồi sức cấp cứu');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'C322', 'H', N'Phòng khám Hồi sức tích cực');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'E427', 'C', N'Phòng khám Chấn thương chỉnh hình');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'E344', 'H', N'Phòng khám Y học cổ truyền');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'G366', 'H', N'Phòng khám Vật lý trị liệu');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'A512', 'C', N'Phòng khám Dinh dưỡng');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'A468', 'H', N'Phòng khám Tâm lý');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'F522', 'C', N'Phòng khám Ung bướu');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'E352', 'H', N'Phòng khám Tiêu hóa');
INSERT INTO PHONG_KHAM (so_phong, loai_phong, mo_ta) VALUES (N'B473', 'H', N'Phòng khám Hô hấp');

-- 6. BENH
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 1', N'đau', N'dị ứng', N'tập thể dục đều đặn', N'phẫu thuật', N'dễ tái phát');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 2', N'buồn nôn', N'môi trường ô nhiễm', N'tiêm vaccine', N'kiểm soát đường huyết', N'cần phối hợp đa chuyên khoa');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 3', N'đau', N'nhiễm khuẩn', N'tập thể dục đều đặn', N'phẫu thuật', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 4', N'đau đầu', N'chấn thương', N'khám sức khỏe định kỳ', N'điều chỉnh chế độ ăn', N'cần theo dõi định kỳ');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 5', N'mất ngủ, khó thở', N'nhiễm virus', N'ăn uống hợp lý', N'điều chỉnh chế độ ăn', N'điều trị lâu dài');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 6', N'sốt, mệt mỏi', N'stress', N'tiêm vaccine', N'dùng thuốc giảm đau', N'cần phối hợp đa chuyên khoa');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 7', N'ho', N'stress', N'bổ sung dinh dưỡng', N'vật lý trị liệu', N'bệnh có thể tự khỏi');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 8', N'đau đầu, sưng', N'tuổi già', N'tiêm vaccine', N'bù nước điện giải', N'nguy cơ biến chứng cao');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 9', N'mất ngủ, mệt mỏi', N'nhiễm khuẩn', N'giữ vệ sinh', N'phẫu thuật', N'nguy cơ biến chứng cao');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 10', N'mệt mỏi', N'nhiễm khuẩn', N'hạn chế rượu bia', N'vật lý trị liệu', N'phòng ngừa bằng tiêm vaccine');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 11', N'sốt, ho', N'stress', N'tập thể dục đều đặn', N'vật lý trị liệu', N'cần điều trị sớm');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 12', N'đau đầu', N'chấn thương', N'ăn uống hợp lý', N'điều trị hỗ trợ', N'cần phối hợp đa chuyên khoa');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 13', N'buồn nôn, chóng mặt', N'môi trường ô nhiễm', N'tập thể dục đều đặn', N'tư vấn tâm lý', N'bệnh có thể tự khỏi');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 14', N'đau', N'stress', N'hạn chế rượu bia', N'vật lý trị liệu', N'cần điều trị sớm');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 15', N'mất ngủ', N'stress', N'tập thể dục đều đặn', N'điều trị hỗ trợ', N'cần phối hợp đa chuyên khoa');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 16', N'sốt, khó thở', N'di truyền', N'tập thể dục đều đặn', N'bù nước điện giải', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 17', N'chóng mặt, mất ngủ', N'tuổi già', N'bổ sung dinh dưỡng', N'điều chỉnh chế độ ăn', N'điều trị lâu dài');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 18', N'sốt', N'môi trường ô nhiễm', N'tránh stress', N'dùng thuốc giảm đau', N'bệnh có thể tự khỏi');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 19', N'sốt', N'lạm dụng thuốc', N'ăn uống hợp lý', N'điều chỉnh chế độ ăn', N'thường gặp ở trẻ nhỏ');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 20', N'tiêu chảy', N'tuổi già', N'bổ sung dinh dưỡng', N'điều trị hỗ trợ', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 21', N'đau đầu, đau', N'lạm dụng thuốc', N'tiêm vaccine', N'bù nước điện giải', N'nguy cơ biến chứng cao');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 22', N'sưng, khó thở', N'tuổi già', N'ăn uống hợp lý', N'điều trị hỗ trợ', N'bệnh có thể tự khỏi');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 23', N'đau đầu, sốt', N'môi trường ô nhiễm', N'tiêm vaccine', N'vật lý trị liệu', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 24', N'sốt', N'stress', N'ăn uống hợp lý', N'bù nước điện giải', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 25', N'mất ngủ', N'stress', N'tránh stress', N'dùng thuốc kháng sinh', N'cần điều trị sớm');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 26', N'rối loạn, khó thở', N'chấn thương', N'giữ vệ sinh', N'phẫu thuật', N'thường gặp ở trẻ nhỏ');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 27', N'sưng', N'chế độ ăn không hợp lý', N'tiêm vaccine', N'bù nước điện giải', N'dễ tái phát');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 28', N'buồn nôn', N'chế độ ăn không hợp lý', N'khám sức khỏe định kỳ', N'nghỉ ngơi hợp lý', N'nguy cơ biến chứng cao');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 29', N'mệt mỏi, đau đầu', N'chấn thương', N'tránh tiếp xúc với dị nguyên', N'điều chỉnh chế độ ăn', N'điều trị lâu dài');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 30', N'đau đầu, nôn', N'nhiễm khuẩn', N'tập thể dục đều đặn', N'phẫu thuật', N'cần điều trị sớm');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 31', N'đau, mất ngủ', N'môi trường ô nhiễm', N'tập thể dục đều đặn', N'kiểm soát đường huyết', N'cần theo dõi định kỳ');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 32', N'sưng', N'lạm dụng thuốc', N'giữ vệ sinh', N'phẫu thuật', N'cần điều trị sớm');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 33', N'ho', N'nhiễm khuẩn', N'khám sức khỏe định kỳ', N'phẫu thuật', N'nguy cơ biến chứng cao');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 34', N'mệt mỏi, đau đầu', N'di truyền', N'bổ sung dinh dưỡng', N'kiểm soát đường huyết', N'phòng ngừa bằng tiêm vaccine');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 35', N'rối loạn', N'chế độ ăn không hợp lý', N'hạn chế rượu bia', N'phẫu thuật', N'cần điều trị sớm');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 36', N'buồn nôn', N'tuổi già', N'giữ ấm', N'điều chỉnh chế độ ăn', N'cần phối hợp đa chuyên khoa');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 37', N'chóng mặt, đau', N'lạm dụng thuốc', N'tiêm vaccine', N'dùng thuốc kháng sinh', N'cần phối hợp đa chuyên khoa');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 38', N'rối loạn, sưng', N'chấn thương', N'tập thể dục đều đặn', N'phẫu thuật', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 39', N'sốt, tiêu chảy', N'di truyền', N'tránh tiếp xúc với dị nguyên', N'điều trị hỗ trợ', N'cần theo dõi định kỳ');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 40', N'nôn', N'môi trường ô nhiễm', N'tiêm vaccine', N'dùng thuốc kháng sinh', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 41', N'sưng', N'chấn thương', N'ăn uống hợp lý', N'điều chỉnh chế độ ăn', N'phòng ngừa bằng tiêm vaccine');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 42', N'mệt mỏi, tiêu chảy', N'nhiễm virus', N'ăn uống hợp lý', N'điều chỉnh chế độ ăn', N'bệnh có thể tự khỏi');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 43', N'khó thở, nôn', N'dị ứng', N'hạn chế rượu bia', N'bù nước điện giải', N'phòng ngừa bằng tiêm vaccine');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 44', N'mệt mỏi', N'dị ứng', N'tập thể dục đều đặn', N'dùng thuốc kháng sinh', N'thường gặp ở trẻ nhỏ');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 45', N'chóng mặt', N'stress', N'giữ vệ sinh', N'dùng thuốc kháng sinh', N'thường gặp ở trẻ nhỏ');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 46', N'đau đầu, rối loạn', N'di truyền', N'giữ vệ sinh', N'bù nước điện giải', N'cần điều trị sớm');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 47', N'sưng', N'rối loạn miễn dịch', N'tiêm vaccine', N'phẫu thuật', N'cần phối hợp đa chuyên khoa');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 48', N'mất ngủ', N'chấn thương', N'bổ sung dinh dưỡng', N'kiểm soát đường huyết', N'bệnh có thể tự khỏi');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 49', N'tiêu chảy', N'lạm dụng thuốc', N'bổ sung dinh dưỡng', N'kiểm soát đường huyết', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 50', N'khó thở, mệt mỏi', N'lạm dụng thuốc', N'giữ ấm', N'phẫu thuật', N'nguy cơ biến chứng cao');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 51', N'sốt, buồn nôn', N'lạm dụng thuốc', N'tránh tiếp xúc với dị nguyên', N'điều trị hỗ trợ', N'điều trị lâu dài');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 52', N'đau', N'chế độ ăn không hợp lý', N'bổ sung dinh dưỡng', N'kiểm soát đường huyết', N'cần điều trị sớm');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 53', N'đau đầu', N'chấn thương', N'khám sức khỏe định kỳ', N'vật lý trị liệu', N'dễ tái phát');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 54', N'sưng, mệt mỏi', N'stress', N'tránh tiếp xúc với dị nguyên', N'nghỉ ngơi hợp lý', N'phòng ngừa bằng tiêm vaccine');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 55', N'mất ngủ, buồn nôn', N'môi trường ô nhiễm', N'giữ vệ sinh', N'bù nước điện giải', N'nguy cơ biến chứng cao');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 56', N'sốt', N'dị ứng', N'tiêm vaccine', N'dùng thuốc giảm đau', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 57', N'khó thở', N'dị ứng', N'bổ sung dinh dưỡng', N'phẫu thuật', N'điều trị lâu dài');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 58', N'buồn nôn', N'lạm dụng thuốc', N'tránh tiếp xúc với dị nguyên', N'bù nước điện giải', N'phòng ngừa bằng tiêm vaccine');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 59', N'đau, sưng', N'lạm dụng thuốc', N'hạn chế rượu bia', N'vật lý trị liệu', N'bệnh có thể tự khỏi');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 60', N'ho', N'di truyền', N'tránh tiếp xúc với dị nguyên', N'nghỉ ngơi hợp lý', N'phòng ngừa bằng tiêm vaccine');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 61', N'đau đầu, đau', N'nhiễm khuẩn', N'tiêm vaccine', N'nghỉ ngơi hợp lý', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 62', N'ho', N'rối loạn miễn dịch', N'khám sức khỏe định kỳ', N'nghỉ ngơi hợp lý', N'cần phối hợp đa chuyên khoa');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 63', N'đau', N'dị ứng', N'giữ ấm', N'dùng thuốc kháng sinh', N'điều trị lâu dài');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 64', N'buồn nôn', N'chấn thương', N'tiêm vaccine', N'tư vấn tâm lý', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 65', N'mất ngủ, chóng mặt', N'di truyền', N'tập thể dục đều đặn', N'nghỉ ngơi hợp lý', N'dễ tái phát');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 66', N'đau, sốt', N'stress', N'hạn chế rượu bia', N'phẫu thuật', N'nguy cơ biến chứng cao');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 67', N'rối loạn', N'nhiễm khuẩn', N'hạn chế rượu bia', N'dùng thuốc kháng sinh', N'phòng ngừa bằng tiêm vaccine');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 68', N'mệt mỏi', N'chế độ ăn không hợp lý', N'giữ ấm', N'vật lý trị liệu', N'cần theo dõi định kỳ');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 69', N'đau', N'lạm dụng thuốc', N'tập thể dục đều đặn', N'điều chỉnh chế độ ăn', N'điều trị lâu dài');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 70', N'sưng, khó thở', N'stress', N'khám sức khỏe định kỳ', N'điều chỉnh chế độ ăn', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 71', N'đau, sưng', N'dị ứng', N'ăn uống hợp lý', N'kiểm soát đường huyết', N'nguy cơ biến chứng cao');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 72', N'sưng', N'rối loạn miễn dịch', N'hạn chế rượu bia', N'tư vấn tâm lý', N'điều trị lâu dài');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 73', N'mất ngủ, đau đầu', N'nhiễm khuẩn', N'hạn chế rượu bia', N'kiểm soát đường huyết', N'cần theo dõi định kỳ');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 74', N'đau, chóng mặt', N'tuổi già', N'giữ vệ sinh', N'bù nước điện giải', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 75', N'ho', N'tuổi già', N'tiêm vaccine', N'tư vấn tâm lý', N'thường gặp ở trẻ nhỏ');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 76', N'buồn nôn, sưng', N'dị ứng', N'khám sức khỏe định kỳ', N'vật lý trị liệu', N'cần phối hợp đa chuyên khoa');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 77', N'tiêu chảy, chóng mặt', N'dị ứng', N'khám sức khỏe định kỳ', N'nghỉ ngơi hợp lý', N'cần theo dõi định kỳ');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 78', N'buồn nôn, tiêu chảy', N'lạm dụng thuốc', N'ăn uống hợp lý', N'kiểm soát đường huyết', N'thường gặp ở trẻ nhỏ');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 79', N'tiêu chảy, đau đầu', N'nhiễm virus', N'tránh tiếp xúc với dị nguyên', N'vật lý trị liệu', N'cần theo dõi định kỳ');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 80', N'rối loạn, mất ngủ', N'rối loạn miễn dịch', N'giữ ấm', N'điều trị hỗ trợ', N'phòng ngừa bằng tiêm vaccine');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 81', N'buồn nôn, mệt mỏi', N'môi trường ô nhiễm', N'tránh stress', N'nghỉ ngơi hợp lý', N'cần điều trị sớm');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 82', N'đau đầu, buồn nôn', N'lạm dụng thuốc', N'bổ sung dinh dưỡng', N'tư vấn tâm lý', N'cần điều trị sớm');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 83', N'buồn nôn', N'dị ứng', N'tập thể dục đều đặn', N'phẫu thuật', N'dễ tái phát');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 84', N'đau', N'chấn thương', N'tránh stress', N'kiểm soát đường huyết', N'cần điều trị sớm');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 85', N'tiêu chảy, buồn nôn', N'rối loạn miễn dịch', N'tập thể dục đều đặn', N'điều chỉnh chế độ ăn', N'phòng ngừa bằng tiêm vaccine');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 86', N'mệt mỏi, sốt', N'lạm dụng thuốc', N'giữ vệ sinh', N'dùng thuốc giảm đau', N'cần phối hợp đa chuyên khoa');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 87', N'sốt', N'môi trường ô nhiễm', N'tránh stress', N'dùng thuốc kháng sinh', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 88', N'sưng', N'chế độ ăn không hợp lý', N'ăn uống hợp lý', N'điều trị hỗ trợ', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 89', N'rối loạn, nôn', N'rối loạn miễn dịch', N'khám sức khỏe định kỳ', N'điều chỉnh chế độ ăn', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 90', N'sốt, chóng mặt', N'chế độ ăn không hợp lý', N'tránh stress', N'vật lý trị liệu', N'cần theo dõi định kỳ');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 91', N'rối loạn, đau đầu', N'chế độ ăn không hợp lý', N'tập thể dục đều đặn', N'vật lý trị liệu', N'phòng ngừa bằng tiêm vaccine');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 92', N'chóng mặt', N'dị ứng', N'tập thể dục đều đặn', N'vật lý trị liệu', N'điều trị lâu dài');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 93', N'đau đầu, sưng', N'di truyền', N'ăn uống hợp lý', N'phẫu thuật', N'cần phối hợp đa chuyên khoa');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 94', N'chóng mặt', N'chấn thương', N'tiêm vaccine', N'điều chỉnh chế độ ăn', N'cần phối hợp đa chuyên khoa');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 95', N'đau đầu, nôn', N'tuổi già', N'giữ vệ sinh', N'phẫu thuật', N'cần phối hợp đa chuyên khoa');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 96', N'rối loạn, mất ngủ', N'nhiễm virus', N'bổ sung dinh dưỡng', N'điều chỉnh chế độ ăn', N'phòng ngừa bằng tiêm vaccine');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 97', N'ho', N'dị ứng', N'hạn chế rượu bia', N'điều chỉnh chế độ ăn', N'thường gặp ở người già');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 98', N'nôn', N'chấn thương', N'tránh tiếp xúc với dị nguyên', N'điều chỉnh chế độ ăn', N'phòng ngừa bằng tiêm vaccine');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 99', N'tiêu chảy', N'stress', N'hạn chế rượu bia', N'nghỉ ngơi hợp lý', N'phòng ngừa bằng tiêm vaccine');
INSERT INTO BENH (ten_benh, trieu_chung, nguyen_nhan, phong_ngua, huong_dieu_tri, ghi_chu) VALUES (N'Bệnh giả lập 100', N'mất ngủ', N'môi trường ô nhiễm', N'giữ vệ sinh', N'điều chỉnh chế độ ăn', N'thường gặp ở trẻ nhỏ');

-- 7. BAC_SI
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (21, 7, N'Chứng chỉ Phẫu thuật', N'Bác sĩ đa khoa', 9, '2024-01-01', '2024-10-26');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (22, 9, N'Chứng chỉ Phẫu thuật', N'Tiến sĩ y học', 30, '2023-08-20', '2024-07-11');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (23, 5, N'Chứng chỉ Phẫu thuật', N'Thạc sĩ y học', 19, '2020-07-31', '2022-10-13');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (24, 4, N'Chứng chỉ Tim mạch', N'Bác sĩ chuyên khoa', 10, '2022-08-02', '2024-08-25');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (25, 3, N'Chứng chỉ chuyên khoa I', N'Thạc sĩ y học', 30, '2022-02-18', '2023-06-04');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (26, 9, N'Chứng chỉ Tim mạch', N'Bác sĩ chuyên khoa', 10, '2022-06-09', '2023-12-17');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (27, 2, N'Chứng chỉ chuyên khoa I', N'Thạc sĩ y học', 16, '2022-11-22', '2023-10-27');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (28, 9, N'Chứng chỉ chuyên khoa I', N'Thạc sĩ y học', 14, '2022-07-23', '2023-02-24');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (29, 6, N'Chứng chỉ Tim mạch', N'Bác sĩ chuyên khoa', 18, '2021-08-10', '2022-03-15');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (30, 8, N'Chứng chỉ Phẫu thuật', N'Thạc sĩ y học', 2, '2023-08-17', '2023-10-29');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (31, 9, N'Chứng chỉ chuyên khoa I', N'Bác sĩ đa khoa', 24, '2023-01-15', '2024-02-08');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (32, 7, N'Chứng chỉ chuyên khoa I', N'Tiến sĩ y học', 27, '2024-04-12', '2025-05-30');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (33, 6, N'Chứng chỉ chuyên khoa II', N'Thạc sĩ y học', 23, '2023-05-30', '2025-02-17');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (34, 2, N'Chứng chỉ chuyên khoa II', N'Bác sĩ chuyên khoa', 8, '2022-12-21', '2023-08-06');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (35, 3, N'Chứng chỉ Tim mạch', N'Tiến sĩ y học', 3, '2021-09-23', '2022-02-23');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (36, 2, N'Chứng chỉ Y học cổ truyền', N'Tiến sĩ y học', 4, '2023-07-07', '2023-09-02');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (37, 5, N'Chứng chỉ Tim mạch', N'Thạc sĩ y học', 23, '2024-03-26', '2024-12-07');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (38, 2, N'Chứng chỉ Tim mạch', N'Thạc sĩ y học', 27, '2022-06-02', '2024-10-18');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (39, 9, N'Chứng chỉ chuyên khoa II', N'Thạc sĩ y học', 15, '2020-11-02', '2023-11-06');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (40, 2, N'Chứng chỉ Tim mạch', N'Tiến sĩ y học', 11, '2022-04-04', '2023-08-08');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (41, 10, N'Chứng chỉ chuyên khoa II', N'Thạc sĩ y học', 6, '2023-01-03', '2023-11-16');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (42, 4, N'Chứng chỉ chuyên khoa II', N'Bác sĩ đa khoa', 20, '2022-10-05', '2024-10-15');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (43, 5, N'Chứng chỉ Phẫu thuật', N'Bác sĩ đa khoa', 3, '2022-04-17', '2024-07-04');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (44, 3, N'Chứng chỉ chuyên khoa II', N'Bác sĩ đa khoa', 27, '2021-07-08', '2021-10-12');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (45, 2, N'Chứng chỉ Tim mạch', N'Tiến sĩ y học', 27, '2023-11-01', '2024-12-31');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (46, 9, N'Chứng chỉ Y học cổ truyền', N'Bác sĩ chuyên khoa', 28, '2024-04-21', '2024-05-01');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (47, 4, N'Chứng chỉ Tim mạch', N'Tiến sĩ y học', 19, '2020-10-21', '2024-03-13');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (48, 5, N'Chứng chỉ Phẫu thuật', N'Tiến sĩ y học', 22, '2023-06-07', '2025-03-08');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (49, 6, N'Chứng chỉ chuyên khoa I', N'Thạc sĩ y học', 20, '2023-10-01', '2025-03-02');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (50, 2, N'Chứng chỉ Phẫu thuật', N'Thạc sĩ y học', 28, '2023-01-26', '2023-01-27');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (51, 4, N'Chứng chỉ chuyên khoa II', N'Bác sĩ đa khoa', 24, '2023-01-05', '2025-02-09');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (52, 5, N'Chứng chỉ chuyên khoa I', N'Bác sĩ chuyên khoa', 12, '2023-12-07', '2024-08-21');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (53, 3, N'Chứng chỉ Y học cổ truyền', N'Tiến sĩ y học', 27, '2021-06-12', '2024-07-20');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (54, 1, N'Chứng chỉ chuyên khoa I', N'Bác sĩ chuyên khoa', 28, '2021-10-17', '2024-10-14');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (55, 4, N'Chứng chỉ chuyên khoa I', N'Bác sĩ đa khoa', 1, '2024-02-11', '2024-03-30');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (56, 2, N'Chứng chỉ chuyên khoa II', N'Bác sĩ đa khoa', 13, '2021-03-22', '2025-02-13');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (57, 2, N'Chứng chỉ Y học cổ truyền', N'Bác sĩ đa khoa', 2, '2022-10-28', '2023-10-07');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (58, 10, N'Chứng chỉ chuyên khoa I', N'Bác sĩ chuyên khoa', 6, '2021-06-04', '2024-11-02');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (59, 2, N'Chứng chỉ Phẫu thuật', N'Bác sĩ chuyên khoa', 24, '2021-01-06', '2024-10-28');
INSERT INTO BAC_SI (nguoidung_id, chuyenkhoa_id, chung_chi, trinh_do, kinh_nghiem, ngay_tao, ngay_cap_nhat) VALUES (60, 1, N'Chứng chỉ chuyên khoa I', N'Tiến sĩ y học', 20, '2020-10-18', '2021-06-24');

-- 8. BENH_NHAN
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (61, 'BH6604876', N'Châu Đặng', '2025-05-14', '2025-05-26');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (62, 'BH9382421', N'Tùng Hoàng', '2025-02-15', '2025-04-09');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (63, 'BH2411578', N'Thành Bùi', '2023-02-11', '2023-11-03');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (64, 'BH5938778', N'Hưng Mai', '2024-06-07', '2025-02-10');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (65, 'BH0160975', N'Bà Yến Trần', '2024-02-19', '2025-03-26');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (66, 'BH3933287', N'Hà Đặng', '2025-04-29', '2025-05-18');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (67, 'BH8714841', N'Tùng Hoàng Hoàng', '2024-05-03', '2024-11-02');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (68, 'BH8947196', N'Nhiên Hải Vũ', '2024-08-20', '2024-12-09');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (69, 'BH2320947', N'Hà Lê', '2024-05-31', '2024-08-10');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (70, 'BH2018684', N'Chị Xuân Hoàng', '2023-10-16', '2024-03-07');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (71, 'BH6947751', N'Trọng Đức Dương', '2025-02-12', '2025-02-24');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (72, 'BH9533041', N'Bà Vi Lê', '2024-09-25', '2025-04-17');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (73, 'BH5601230', N'An Trần', '2023-09-14', '2025-03-12');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (74, 'BH3991615', N'An Hoàng', '2024-12-23', '2025-05-26');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (75, 'BH0321730', N'Vân Bùi', '2023-05-31', '2024-04-12');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (76, 'BH9141314', N'Huy Xuân Nguyễn', '2023-04-12', '2025-04-28');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (77, 'BH8709163', N'Quang Dương', '2023-03-17', '2025-02-14');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (78, 'BH9230225', N'Tú Hoàng', '2023-12-05', '2025-04-01');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (79, 'BH7207698', N'Quang Bùi', '2024-07-27', '2024-09-16');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (80, 'BH4280715', N'Vân Vũ', '2023-12-29', '2025-03-17');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (81, 'BH2375945', N'Bà Kim Bùi', '2023-11-20', '2024-06-16');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (82, 'BH1093523', N'Quý cô Hồng Hoàng', '2024-07-19', '2025-03-20');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (83, 'BH6069602', N'Ông Anh Lê', '2024-03-29', '2024-12-20');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (84, 'BH7878900', N'Bác Khoa Dương', '2023-09-24', '2023-11-26');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (85, 'BH0638120', N'Hải Bảo Đặng', '2025-04-04', '2025-05-09');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (86, 'BH0300891', N'Cô Duyên Phạm', '2023-01-15', '2023-04-20');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (87, 'BH4421761', N'Thảo Dương', '2025-01-06', '2025-04-18');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (88, 'BH1428512', N'Nam Nguyễn', '2024-12-28', '2024-12-28');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (89, 'BH0348559', N'Ánh Hoàng', '2024-09-18', '2025-05-28');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (90, 'BH7765823', N'Khoa Thế Nguyễn', '2025-04-27', '2025-05-18');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (91, 'BH2245551', N'Trọng Thị Nguyễn', '2023-09-07', '2024-08-05');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (92, 'BH4229456', N'Bà Hà Dương', '2024-12-21', '2025-01-06');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (93, 'BH3042814', N'Thành Thế Bùi', '2023-07-15', '2025-02-15');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (94, 'BH1187755', N'Nhật Trần', '2023-08-16', '2024-04-16');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (95, 'BH7604522', N'Hải Quang Trần', '2025-04-02', '2025-04-11');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (96, 'BH1330601', N'Phương Thế Dương', '2025-04-02', '2025-05-06');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (97, 'BH7936153', N'Nhiên Lê', '2024-04-03', '2024-05-19');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (98, 'BH6351108', N'Anh Tú Dương', '2023-03-24', '2024-02-14');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (99, 'BH6430392', N'Lâm Dương', '2024-06-04', '2025-02-09');
INSERT INTO BENH_NHAN (nguoidung_id, bao_hiem, lien_he_khan_cap, ngay_tao, ngay_cap_nhat)
VALUES (100, 'BH6582197', N'Quý cô Hải Bùi', '2023-04-22', '2024-02-24');

-- 9. LICH_LAM_VIEC_BAC_SI
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (1, '2024-02-11', '2024-02-07', '2025-05-08');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (1, '2024-09-22', '2024-04-21', '2025-01-04');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (1, '2024-11-06', '2024-03-12', '2024-08-03');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (1, '2025-01-01', '2024-03-12', '2025-04-02');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (1, '2025-02-18', '2024-02-18', '2024-12-30');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (1, '2025-03-06', '2025-02-13', '2025-03-17');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (1, '2025-05-03', '2025-04-10', '2025-05-14');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (1, '2025-05-12', '2024-12-27', '2025-05-30');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (2, '2024-03-16', '2024-02-15', '2024-09-24');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (2, '2024-04-11', '2024-02-10', '2024-12-18');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (2, '2024-04-13', '2024-03-22', '2024-07-04');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (2, '2024-11-13', '2024-10-09', '2025-02-08');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (2, '2024-12-04', '2024-08-14', '2025-05-07');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (2, '2025-04-28', '2024-05-13', '2024-06-13');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (3, '2024-01-02', '2024-01-01', '2024-08-15');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (3, '2024-01-15', '2024-01-04', '2024-05-28');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (3, '2024-03-05', '2024-02-27', '2024-04-13');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (3, '2024-04-05', '2024-01-11', '2024-06-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (3, '2024-09-06', '2024-08-12', '2025-04-29');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (3, '2024-11-29', '2024-09-07', '2024-11-01');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (3, '2024-12-07', '2024-06-03', '2025-03-12');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (3, '2025-02-12', '2024-05-29', '2025-05-25');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (3, '2025-05-20', '2024-03-04', '2024-12-09');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (4, '2024-04-03', '2024-02-07', '2024-05-11');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (4, '2024-07-27', '2024-02-18', '2025-04-13');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (4, '2024-09-04', '2024-02-17', '2024-03-04');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (4, '2024-10-21', '2024-05-13', '2025-01-11');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (4, '2024-11-20', '2024-02-05', '2024-03-21');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (4, '2025-01-29', '2024-12-13', '2025-01-15');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (4, '2025-03-31', '2025-03-24', '2025-04-12');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (5, '2024-03-23', '2024-03-16', '2025-05-12');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (5, '2024-08-08', '2024-04-17', '2025-02-07');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (5, '2024-08-29', '2024-03-11', '2024-10-27');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (5, '2024-10-09', '2024-09-09', '2025-03-10');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (5, '2025-02-04', '2024-02-12', '2024-07-27');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (6, '2024-01-17', '2024-01-12', '2025-02-21');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (6, '2024-04-28', '2024-01-22', '2024-07-10');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (6, '2024-04-29', '2024-02-24', '2025-04-16');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (6, '2024-07-13', '2024-01-16', '2024-03-07');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (6, '2024-08-13', '2024-07-19', '2024-10-01');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (6, '2024-09-05', '2024-08-06', '2024-11-26');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (6, '2024-10-04', '2024-01-24', '2025-03-17');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (6, '2024-12-09', '2024-10-20', '2025-03-31');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (6, '2025-05-13', '2025-04-10', '2025-05-14');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (7, '2024-01-28', '2024-01-02', '2024-01-24');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (7, '2024-03-16', '2024-01-25', '2025-05-31');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (7, '2024-04-03', '2024-01-24', '2025-01-25');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (7, '2024-04-28', '2024-01-16', '2024-09-17');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (7, '2024-05-02', '2024-01-27', '2025-02-02');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (7, '2024-05-07', '2024-01-16', '2025-05-09');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (7, '2024-07-12', '2024-06-22', '2024-07-03');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (7, '2025-01-14', '2024-10-05', '2025-01-21');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (7, '2025-02-04', '2024-11-13', '2024-12-08');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (8, '2024-03-12', '2024-01-08', '2024-09-21');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (8, '2024-03-14', '2024-02-29', '2024-03-20');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (8, '2024-07-03', '2024-06-01', '2024-07-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (8, '2024-08-14', '2024-06-28', '2025-01-14');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (8, '2024-11-04', '2024-04-12', '2024-08-23');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (8, '2024-12-24', '2024-07-02', '2025-02-27');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (8, '2025-03-22', '2025-03-05', '2025-05-16');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (9, '2024-02-29', '2024-01-08', '2024-11-08');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (9, '2024-06-11', '2024-04-23', '2025-03-29');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (9, '2024-06-14', '2024-02-14', '2024-02-20');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (9, '2024-07-27', '2024-04-30', '2025-04-13');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (9, '2024-09-13', '2024-07-28', '2025-05-15');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (9, '2024-12-16', '2024-09-17', '2025-02-23');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (10, '2024-01-13', '2024-01-03', '2024-09-04');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (10, '2024-02-16', '2024-01-31', '2024-07-29');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (10, '2024-03-21', '2024-03-19', '2024-08-13');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (10, '2024-06-06', '2024-04-01', '2025-01-28');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (10, '2024-09-13', '2024-03-08', '2025-03-09');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (10, '2024-10-14', '2024-06-07', '2024-12-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (10, '2024-12-09', '2024-07-31', '2024-09-10');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (10, '2024-12-31', '2024-01-01', '2024-07-15');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (10, '2025-02-01', '2024-12-23', '2025-03-18');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (10, '2025-04-13', '2024-03-22', '2024-07-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (11, '2024-02-02', '2024-01-03', '2024-06-20');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (11, '2025-01-22', '2024-08-16', '2024-09-17');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (11, '2025-02-15', '2024-05-12', '2025-05-06');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (11, '2025-02-28', '2024-03-21', '2024-11-04');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (11, '2025-03-04', '2024-09-27', '2025-05-11');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (11, '2025-04-03', '2024-09-06', '2024-09-06');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (12, '2024-02-21', '2024-02-21', '2025-04-17');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (12, '2024-11-15', '2024-07-31', '2024-11-04');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (12, '2024-11-29', '2024-10-07', '2025-03-18');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (12, '2025-04-23', '2024-02-12', '2025-04-15');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (12, '2025-05-21', '2025-01-06', '2025-02-08');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (13, '2024-01-04', '2024-01-01', '2024-01-03');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (13, '2024-08-06', '2024-07-29', '2025-04-25');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (13, '2024-11-19', '2024-11-09', '2024-12-04');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (13, '2025-02-15', '2024-04-07', '2024-06-06');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (13, '2025-03-03', '2024-11-07', '2025-04-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (14, '2024-04-12', '2024-03-21', '2024-05-01');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (14, '2024-07-05', '2024-01-06', '2024-10-13');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (14, '2024-10-13', '2024-08-19', '2024-10-17');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (14, '2024-11-05', '2024-05-11', '2024-07-18');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (14, '2025-02-10', '2024-11-30', '2025-04-12');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (14, '2025-05-02', '2025-02-22', '2025-05-16');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (15, '2024-01-20', '2024-01-12', '2025-05-06');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (15, '2024-02-11', '2024-02-06', '2025-05-16');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (15, '2024-02-13', '2024-01-03', '2025-05-23');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (15, '2024-04-27', '2024-04-01', '2025-02-24');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (15, '2024-06-07', '2024-04-27', '2025-03-20');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (15, '2024-07-29', '2024-04-21', '2024-10-28');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (15, '2024-09-22', '2024-04-01', '2024-07-16');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (15, '2024-10-12', '2024-07-11', '2025-05-07');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (15, '2024-11-18', '2024-05-29', '2024-06-02');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (15, '2024-12-21', '2024-03-11', '2024-05-27');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (16, '2024-02-06', '2024-01-18', '2024-04-10');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (16, '2024-02-12', '2024-01-10', '2025-05-26');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (16, '2024-04-05', '2024-03-15', '2024-08-10');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (16, '2024-12-07', '2024-07-03', '2025-01-21');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (16, '2024-12-11', '2024-10-07', '2024-11-09');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (16, '2024-12-12', '2024-05-30', '2024-07-27');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (16, '2025-01-11', '2024-09-01', '2025-01-01');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (17, '2024-03-13', '2024-02-12', '2024-07-14');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (17, '2024-07-02', '2024-04-16', '2024-06-10');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (17, '2024-11-05', '2024-02-20', '2024-12-03');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (17, '2024-11-11', '2024-09-03', '2025-05-03');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (17, '2025-02-16', '2024-06-21', '2024-12-13');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (18, '2024-02-08', '2024-01-20', '2024-07-09');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (18, '2024-04-28', '2024-04-04', '2025-03-21');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (18, '2025-03-12', '2024-03-20', '2024-06-13');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (18, '2025-05-05', '2024-11-16', '2025-04-09');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (18, '2025-05-24', '2024-07-11', '2024-08-24');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (19, '2024-03-03', '2024-01-01', '2024-04-10');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (19, '2024-03-27', '2024-02-20', '2024-11-30');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (19, '2024-07-21', '2024-05-12', '2024-10-07');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (19, '2024-08-14', '2024-04-24', '2024-12-30');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (19, '2025-01-29', '2024-10-26', '2025-04-26');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (20, '2024-03-26', '2024-01-15', '2024-02-16');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (20, '2024-06-19', '2024-01-08', '2025-04-14');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (20, '2024-07-15', '2024-05-14', '2024-12-31');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (20, '2024-08-10', '2024-07-11', '2024-10-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (20, '2024-08-13', '2024-01-31', '2024-10-11');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (20, '2024-09-24', '2024-07-22', '2024-11-30');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (20, '2025-01-02', '2024-04-16', '2025-03-10');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (20, '2025-01-12', '2024-01-22', '2025-05-21');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (20, '2025-03-09', '2025-02-12', '2025-03-11');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (20, '2025-03-17', '2024-11-15', '2024-12-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (21, '2024-06-03', '2024-01-27', '2024-11-27');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (21, '2024-07-21', '2024-05-04', '2024-07-18');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (21, '2025-01-05', '2024-10-15', '2025-01-26');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (21, '2025-01-22', '2024-11-22', '2025-05-15');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (21, '2025-04-14', '2024-08-04', '2025-04-27');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (22, '2024-01-10', '2024-01-01', '2024-05-31');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (22, '2024-07-25', '2024-03-06', '2025-01-08');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (22, '2024-08-12', '2024-07-19', '2024-10-06');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (22, '2024-11-21', '2024-07-13', '2025-05-07');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (22, '2024-11-25', '2024-05-30', '2025-05-26');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (22, '2024-11-26', '2024-08-28', '2024-09-30');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (22, '2024-12-14', '2024-02-13', '2024-11-03');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (22, '2025-05-25', '2025-03-20', '2025-03-25');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (23, '2024-01-16', '2024-01-15', '2024-07-02');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (23, '2024-02-11', '2024-01-11', '2025-02-23');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (23, '2024-05-13', '2024-02-08', '2025-04-27');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (23, '2024-08-18', '2024-06-16', '2025-02-06');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (23, '2024-11-03', '2024-07-09', '2025-03-24');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (24, '2024-02-04', '2024-01-31', '2025-04-07');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (24, '2024-03-19', '2024-02-19', '2024-12-26');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (24, '2024-04-02', '2024-03-16', '2024-07-13');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (24, '2024-07-30', '2024-07-23', '2024-08-02');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (24, '2024-10-23', '2024-01-01', '2024-07-05');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (24, '2025-03-03', '2024-06-03', '2025-02-17');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (24, '2025-03-12', '2024-10-18', '2024-12-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (24, '2025-05-29', '2024-12-06', '2024-12-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (25, '2024-03-04', '2024-01-31', '2024-06-25');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (25, '2024-05-10', '2024-03-26', '2024-04-23');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (25, '2024-06-16', '2024-01-10', '2024-09-12');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (25, '2024-09-25', '2024-08-01', '2024-10-12');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (25, '2024-11-06', '2024-09-08', '2024-10-19');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (25, '2025-01-27', '2024-12-10', '2025-01-17');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (25, '2025-01-28', '2024-06-29', '2025-01-25');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (25, '2025-02-21', '2024-01-19', '2024-11-27');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (26, '2024-01-21', '2024-01-20', '2024-12-01');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (26, '2024-02-03', '2024-01-09', '2024-11-26');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (26, '2024-02-18', '2024-01-21', '2024-03-14');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (26, '2024-04-13', '2024-03-30', '2025-01-05');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (26, '2024-06-04', '2024-03-29', '2024-07-06');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (26, '2025-01-30', '2024-07-15', '2025-03-23');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (26, '2025-04-14', '2024-02-26', '2025-05-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (26, '2025-04-27', '2024-01-31', '2024-12-08');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (27, '2024-02-09', '2024-01-26', '2024-09-09');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (27, '2024-05-04', '2024-02-17', '2025-03-10');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (27, '2024-05-07', '2024-02-18', '2024-10-08');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (27, '2024-05-10', '2024-04-01', '2025-05-10');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (27, '2024-07-12', '2024-06-10', '2024-07-18');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (27, '2024-10-27', '2024-01-23', '2025-04-28');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (27, '2024-10-30', '2024-01-21', '2024-09-25');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (27, '2024-12-11', '2024-05-10', '2024-05-23');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (27, '2025-01-31', '2024-09-23', '2025-03-12');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (27, '2025-04-23', '2024-10-18', '2025-03-13');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (28, '2024-04-05', '2024-01-19', '2024-08-24');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (28, '2024-04-26', '2024-04-24', '2025-02-07');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (28, '2024-08-23', '2024-04-18', '2024-05-31');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (28, '2024-11-08', '2024-02-23', '2024-09-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (28, '2025-03-06', '2024-02-02', '2024-03-23');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (28, '2025-05-29', '2025-03-01', '2025-03-20');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (29, '2024-01-31', '2024-01-03', '2024-05-06');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (29, '2024-02-01', '2024-01-23', '2025-01-11');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (29, '2024-03-21', '2024-01-04', '2024-12-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (29, '2024-09-15', '2024-06-27', '2024-09-26');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (29, '2024-11-28', '2024-01-06', '2024-08-29');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (29, '2024-12-26', '2024-07-06', '2024-08-11');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (29, '2025-03-03', '2024-11-01', '2024-12-07');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (29, '2025-03-17', '2024-04-16', '2024-04-17');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (29, '2025-04-02', '2024-04-14', '2025-03-17');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (29, '2025-05-23', '2024-12-10', '2025-01-10');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (30, '2024-01-08', '2024-01-06', '2024-09-26');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (30, '2024-01-26', '2024-01-05', '2024-02-02');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (30, '2024-04-25', '2024-01-27', '2024-07-30');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (30, '2024-05-25', '2024-03-26', '2024-11-23');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (30, '2024-07-10', '2024-03-15', '2024-08-13');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (30, '2024-08-26', '2024-08-12', '2025-05-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (30, '2024-10-27', '2024-06-16', '2024-09-18');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (30, '2025-01-12', '2024-10-30', '2024-11-19');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (30, '2025-04-09', '2024-02-22', '2024-11-21');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (30, '2025-05-03', '2024-10-24', '2025-01-10');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (31, '2024-05-08', '2024-03-01', '2025-03-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (31, '2024-05-30', '2024-02-17', '2024-07-15');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (31, '2024-08-16', '2024-04-05', '2024-11-05');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (31, '2024-09-05', '2024-06-18', '2024-07-11');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (31, '2024-11-19', '2024-03-08', '2025-01-09');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (31, '2025-01-20', '2024-01-11', '2024-07-30');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (32, '2024-03-15', '2024-01-19', '2024-11-16');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (32, '2024-05-15', '2024-04-18', '2024-09-17');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (32, '2024-11-02', '2024-06-30', '2024-08-12');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (32, '2025-03-02', '2024-05-07', '2024-12-20');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (32, '2025-03-06', '2024-11-19', '2025-02-21');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (33, '2024-01-09', '2024-01-08', '2024-02-23');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (33, '2024-02-29', '2024-01-12', '2025-02-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (33, '2024-07-27', '2024-01-28', '2024-06-17');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (33, '2024-10-27', '2024-02-27', '2024-12-08');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (33, '2024-11-24', '2024-11-06', '2025-05-01');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (33, '2025-01-15', '2024-03-19', '2025-04-30');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (33, '2025-01-20', '2024-12-25', '2025-04-18');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (33, '2025-02-22', '2024-07-23', '2024-10-25');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (33, '2025-03-03', '2025-01-28', '2025-03-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (33, '2025-03-27', '2024-08-09', '2024-11-06');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (34, '2024-03-29', '2024-03-02', '2025-03-23');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (34, '2024-05-25', '2024-02-22', '2024-07-21');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (34, '2024-12-14', '2024-01-01', '2025-04-04');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (34, '2024-12-29', '2024-11-12', '2025-03-10');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (34, '2025-04-09', '2024-01-04', '2024-08-14');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (34, '2025-04-18', '2024-06-01', '2024-07-29');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (35, '2024-01-23', '2024-01-04', '2024-10-06');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (35, '2024-04-04', '2024-03-26', '2024-04-15');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (35, '2024-06-08', '2024-01-01', '2024-09-19');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (35, '2024-08-25', '2024-04-11', '2025-01-05');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (35, '2024-10-13', '2024-07-21', '2025-03-05');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (35, '2024-11-04', '2024-02-22', '2025-03-10');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (35, '2025-02-19', '2024-05-09', '2024-11-06');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (35, '2025-03-10', '2024-05-25', '2025-05-04');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (35, '2025-04-27', '2025-04-10', '2025-04-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (35, '2025-05-24', '2024-10-31', '2024-11-21');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (36, '2024-03-13', '2024-03-08', '2025-05-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (36, '2024-05-01', '2024-02-01', '2025-05-02');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (36, '2024-09-25', '2024-03-24', '2024-04-27');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (36, '2024-11-08', '2024-07-31', '2024-12-26');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (36, '2024-12-14', '2024-05-24', '2025-02-14');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (37, '2024-04-17', '2024-02-26', '2024-09-03');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (37, '2024-08-03', '2024-05-25', '2025-04-11');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (37, '2024-10-12', '2024-03-11', '2024-05-30');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (37, '2024-10-26', '2024-03-04', '2025-02-23');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (37, '2025-02-17', '2024-03-02', '2024-09-13');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (37, '2025-02-24', '2024-07-24', '2025-05-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (38, '2024-05-22', '2024-05-08', '2024-10-17');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (38, '2024-08-11', '2024-05-06', '2025-04-04');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (38, '2024-11-02', '2024-01-31', '2024-09-14');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (38, '2024-12-28', '2024-06-02', '2024-08-14');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (38, '2025-03-01', '2025-01-16', '2025-05-22');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (38, '2025-04-29', '2024-01-27', '2025-04-25');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (38, '2025-05-03', '2024-11-14', '2025-01-08');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (38, '2025-05-15', '2024-01-14', '2024-07-13');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (39, '2024-01-07', '2024-01-01', '2024-01-04');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (39, '2024-01-11', '2024-01-05', '2024-10-30');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (39, '2024-02-12', '2024-01-15', '2024-03-27');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (39, '2024-03-09', '2024-02-06', '2024-05-13');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (39, '2024-03-24', '2024-01-14', '2024-08-23');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (39, '2025-01-04', '2024-08-23', '2025-02-08');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (39, '2025-02-04', '2024-07-15', '2024-10-09');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (39, '2025-02-08', '2024-06-18', '2025-01-19');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (40, '2024-05-12', '2024-04-19', '2024-12-26');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (40, '2024-05-31', '2024-04-09', '2025-04-17');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (40, '2024-07-10', '2024-02-26', '2025-04-08');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (40, '2024-08-01', '2024-02-20', '2024-10-01');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (40, '2024-11-19', '2024-04-14', '2025-02-08');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (40, '2024-12-23', '2024-01-26', '2025-05-03');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (40, '2025-02-02', '2024-07-17', '2024-08-03');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (40, '2025-03-21', '2024-04-29', '2025-03-19');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (40, '2025-03-30', '2024-02-13', '2025-05-03');
INSERT INTO LICH_LAM_VIEC_BAC_SI (bacsi_id, ngay, ngay_tao, ngay_cap_nhat) 
VALUES (40, '2025-04-03', '2024-04-05', '2024-10-08');

-- 10. LICH_PHONG_KHAM
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (71, 4);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (24, 11);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (90, 2);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (97, 9);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (63, 1);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (100, 12);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (74, 12);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (55, 16);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (75, 6);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (84, 17);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (11, 2);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (79, 5);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (28, 13);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (66, 14);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (86, 6);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (47, 10);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (30, 6);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (18, 3);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (35, 2);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (94, 9);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (5, 11);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (91, 12);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (9, 2);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (4, 16);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (94, 10);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (47, 14);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (27, 16);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (53, 20);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (77, 18);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (24, 12);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (36, 18);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (34, 3);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (73, 2);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (15, 10);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (57, 15);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (86, 17);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (92, 18);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (44, 19);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (56, 18);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (91, 2);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (67, 1);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (42, 15);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (40, 3);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (4, 13);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (64, 20);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (55, 10);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (46, 11);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (6, 14);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (72, 8);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (15, 13);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (40, 7);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (82, 16);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (12, 7);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (9, 9);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (58, 14);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (99, 15);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (43, 15);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (18, 4);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (83, 19);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (58, 13);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (43, 10);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (69, 5);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (97, 7);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (13, 11);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (56, 4);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (37, 5);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (93, 2);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (31, 1);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (7, 16);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (96, 17);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (44, 1);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (10, 8);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (45, 13);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (40, 14);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (79, 17);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (17, 12);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (48, 9);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (89, 1);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (20, 6);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (29, 4);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (93, 5);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (56, 7);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (66, 5);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (28, 19);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (1, 2);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (7, 14);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (54, 16);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (17, 13);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (32, 11);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (67, 6);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (63, 9);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (100, 13);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (31, 6);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (38, 12);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (89, 3);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (78, 10);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (20, 12);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (55, 14);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (76, 7);
INSERT INTO LICH_PHONG_KHAM (lichlv_id, phongkham_id) VALUES (58, 17);

-- 11. LICH_KHAM
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (25, 27, '2025-06-07 12:15:52', '2025-06-07 12:15:52', 
    'T', 'X', N'Và nhiều tại các như nhiều thì thay đã.', '2025-04-07 20:50:37', '2025-05-25 01:08:13');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (26, 20, '2025-05-28 11:18:28', '2025-05-28 11:33:28', 
    'T', 'X', N'Giống vẫn theo như gần mỗi.', '2025-04-08 05:48:01', '2025-04-29 10:48:31');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (33, 9, '2025-05-31 05:16:27', '2025-05-31 05:26:27', 
    'H', 'P', N'Hơn như điều tại để.', '2025-04-22 04:25:29', '2025-05-22 04:52:36');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (17, 35, '2025-05-31 19:22:11', '2025-05-31 19:52:11', 
    'D', 'P', N'Dưới không từ vì giữa có các các để bên chỉ.', '2025-04-01 03:54:34', '2025-05-01 06:36:20');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (7, 5, '2025-06-29 12:24:05', '2025-06-29 12:54:05', 
    'T', 'C', N'Như được hơn hoặc có các đã của trong.', '2025-04-27 11:12:25', '2025-05-24 15:26:13');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (7, 23, '2025-06-13 14:25:22', '2025-06-13 14:40:22', 
    'T', 'X', N'Một bạn để tự cũng.', '2025-04-27 20:51:03', '2025-05-28 22:59:53');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (14, 36, '2025-05-29 08:52:06', '2025-05-29 09:07:06', 
    'T', 'X', N'Cách mỗi cách nhiều hơn có.', '2025-04-22 17:01:40', '2025-05-05 08:31:23');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (4, 36, '2025-05-10 00:05:46', '2025-05-10 00:05:46', 
    'H', 'X', N'Của bạn này người như là gần làm như vậy.', '2025-04-07 10:18:01', '2025-05-16 03:37:35');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (1, 32, '2025-05-15 15:03:20', '2025-05-15 15:13:20', 
    'H', 'X', N'Bên như tự cách cũng.', '2025-04-26 13:45:03', '2025-05-12 08:38:28');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (5, 13, '2025-05-27 20:51:07', '2025-05-27 21:11:07', 
    'H', 'P', N'Mỗi để thay vài từng có rất đến từ các.', '2025-04-18 10:56:29', '2025-05-27 10:54:22');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (10, 35, '2025-05-09 02:31:15', '2025-05-09 02:46:15', 
    'H', 'P', N'Hơn tại dưới bên này khiến với đã.', '2025-04-09 09:12:13', '2025-05-10 10:59:05');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (33, 32, '2025-06-02 09:26:36', '2025-06-02 09:26:36', 
    'T', 'X', N'Mỗi để trong hoặc và lớn như với điều.', '2025-04-02 09:40:55', '2025-04-30 15:58:20');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (8, 36, '2025-05-13 04:33:10', '2025-05-13 04:43:10', 
    'D', 'P', N'Hơn lớn cũng về gần là.', '2025-04-02 03:47:11', '2025-05-30 17:18:38');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (36, 38, '2025-05-20 00:00:28', '2025-05-20 00:10:28', 
    'T', 'P', N'Hơn tại hơn có vậy cách.', '2025-04-06 00:50:03', '2025-05-13 09:43:07');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (21, 37, '2025-05-26 08:14:07', '2025-05-26 08:19:07', 
    'T', 'P', N'Đã đi thì người để.', '2025-04-03 00:27:27', '2025-04-21 09:46:16');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (12, 3, '2025-06-28 00:29:19', '2025-06-28 00:49:19', 
    'D', 'C', N'Hoặc cũng làm như tại.', '2025-04-28 18:24:23', '2025-05-21 21:36:18');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (5, 6, '2025-05-17 13:21:57', '2025-05-17 13:51:57', 
    'H', 'P', N'Nhiều có vậy bên khi theo.', '2025-04-30 01:53:25', '2025-05-01 22:54:39');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (6, 35, '2025-06-13 01:14:40', '2025-06-13 01:44:40', 
    'T', 'X', N'Đó điều như như các đi.', '2025-04-19 23:22:44', '2025-05-15 10:33:06');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (18, 34, '2025-05-25 11:17:36', '2025-05-25 11:22:36', 
    'H', 'X', N'Từ cái khiến khi và nơi.', '2025-04-12 18:21:00', '2025-05-11 09:31:05');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (27, 38, '2025-06-16 21:18:59', '2025-06-16 21:28:59', 
    'T', 'C', N'Hơn vậy vài thay để cho bạn giống.', '2025-04-05 00:37:38', '2025-05-09 17:21:14');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (6, 21, '2025-05-01 06:07:47', '2025-05-01 06:27:47', 
    'H', 'C', N'Không khi này dưới mà như lớn của nào hoặc.', '2025-04-21 09:50:50', '2025-05-19 21:50:19');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (22, 13, '2025-05-05 15:34:57', '2025-05-05 15:39:57', 
    'H', 'X', N'Vì làm tôi với thế từ.', '2025-04-01 02:39:31', '2025-04-27 10:13:22');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (8, 15, '2025-05-04 21:14:43', '2025-05-04 21:24:43', 
    'H', 'C', N'Được bên và như nhiều của cách nhiều gần.', '2025-04-07 10:38:48', '2025-05-18 19:36:15');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (4, 7, '2025-05-02 12:53:59', '2025-05-02 12:58:59', 
    'D', 'P', N'Từng của cái đó giống gần vậy hơn.', '2025-04-10 08:28:47', '2025-04-14 17:52:57');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (37, 35, '2025-05-12 15:38:39', '2025-05-12 15:58:39', 
    'D', 'P', N'Đi như nơi gần để để cũng một nơi rất.', '2025-04-06 17:28:14', '2025-04-09 07:40:42');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (8, 13, '2025-05-26 00:14:24', '2025-05-26 00:34:24', 
    'D', 'P', N'Đi mỗi đi cũng tôi để.', '2025-04-03 03:51:30', '2025-05-11 03:26:32');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (6, 24, '2025-05-05 01:19:49', '2025-05-05 01:19:49', 
    'H', 'X', N'Điều từ số số như và.', '2025-04-25 02:41:44', '2025-04-26 03:54:14');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (13, 12, '2025-06-14 15:20:36', '2025-06-14 15:50:36', 
    'H', 'C', N'Mà với sẽ có cái trong khi đúng hơn.', '2025-04-17 12:40:29', '2025-04-27 18:00:50');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (4, 2, '2025-05-04 13:41:04', '2025-05-04 14:01:04', 
    'T', 'X', N'Nơi trong có về từ.', '2025-04-07 09:37:14', '2025-04-17 06:07:59');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (17, 5, '2025-05-29 14:15:57', '2025-05-29 14:20:57', 
    'H', 'X', N'Tại này và người giữa.', '2025-04-04 13:08:21', '2025-05-03 18:39:48');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (23, 28, '2025-05-30 11:51:06', '2025-05-30 11:56:06', 
    'H', 'X', N'Bên nếu cũng từ tại khi của mỗi.', '2025-04-07 03:25:37', '2025-05-22 11:55:17');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (3, 39, '2025-06-16 14:55:50', '2025-06-16 14:55:50', 
    'D', 'C', N'Hoặc nhưng nếu khiến thay.', '2025-04-09 04:37:48', '2025-04-28 13:09:45');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (17, 23, '2025-06-24 21:55:44', '2025-06-24 22:25:44', 
    'T', 'X', N'Của từ một mỗi không đã cũng để.', '2025-04-28 02:55:04', '2025-05-06 08:18:42');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (14, 4, '2025-06-20 11:56:39', '2025-06-20 12:26:39', 
    'H', 'P', N'Vì thế có vậy của về từ.', '2025-04-13 18:34:04', '2025-04-30 09:23:26');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (34, 17, '2025-06-26 22:15:29', '2025-06-26 22:15:29', 
    'D', 'C', N'Nhưng thì có chưa hoặc như.', '2025-04-23 00:44:38', '2025-05-25 08:13:51');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (12, 1, '2025-05-20 16:32:41', '2025-05-20 16:47:41', 
    'D', 'C', N'Thế làm dưới từ của vẫn.', '2025-04-06 04:28:49', '2025-05-25 13:36:16');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (20, 23, '2025-05-20 07:52:54', '2025-05-20 08:07:54', 
    'D', 'C', N'Mà cách trong từ gần trong nào điều như.', '2025-04-25 03:46:04', '2025-05-02 14:30:23');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (36, 1, '2025-06-01 09:57:54', '2025-06-01 10:12:54', 
    'D', 'P', N'Từ dưới như cách tự cái chỉ giống bạn.', '2025-04-16 17:31:52', '2025-05-03 00:54:08');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (3, 35, '2025-05-04 13:13:30', '2025-05-04 13:23:30', 
    'H', 'P', N'Trong làm đúng bên có hơn của như một chưa.', '2025-04-03 00:30:02', '2025-05-19 19:14:20');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (23, 19, '2025-05-07 13:11:44', '2025-05-07 13:41:44', 
    'T', 'X', N'Cho nếu sau vì chưa của chưa.', '2025-04-23 11:22:24', '2025-05-24 05:44:35');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (9, 20, '2025-06-06 03:49:14', '2025-06-06 04:04:14', 
    'D', 'C', N'Mà với là để đúng giữa vài như nhưng.', '2025-04-11 02:42:27', '2025-04-18 22:48:21');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (1, 39, '2025-05-29 05:32:39', '2025-05-29 05:37:39', 
    'D', 'C', N'Như của nhiều bên nhiều hơn này chưa đó thay.', '2025-04-09 22:35:13', '2025-04-25 11:35:59');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (16, 15, '2025-05-30 11:19:08', '2025-05-30 11:49:08', 
    'T', 'C', N'Lớn được thế làm như trong mà mà tôi.', '2025-04-07 06:55:03', '2025-05-17 12:33:15');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (3, 26, '2025-05-24 07:22:33', '2025-05-24 07:52:33', 
    'D', 'C', N'Hơn khi số tại cho thay vài.', '2025-04-05 01:40:18', '2025-04-09 14:40:34');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (11, 29, '2025-05-15 19:18:16', '2025-05-15 19:18:16', 
    'T', 'X', N'Của hơn cũng và tại trong là vẫn.', '2025-04-16 19:57:43', '2025-04-24 11:40:48');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (29, 34, '2025-05-11 07:55:41', '2025-05-11 08:10:41', 
    'D', 'X', N'Đi không đúng trong cũng có hoặc hơn tự đi.', '2025-04-15 11:53:35', '2025-05-22 04:05:47');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (1, 3, '2025-05-13 10:45:49', '2025-05-13 11:00:49', 
    'T', 'C', N'Của các như điều mỗi giữa đúng người.', '2025-04-20 03:19:18', '2025-05-30 19:21:20');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (30, 4, '2025-06-13 06:31:25', '2025-06-13 06:46:25', 
    'H', 'X', N'Sau rất đúng như và tự tại như.', '2025-04-26 08:29:44', '2025-05-27 02:05:50');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (6, 9, '2025-06-25 09:02:32', '2025-06-25 09:02:32', 
    'T', 'X', N'Như đã trong thay vẫn để giữa để số trong.', '2025-04-28 14:01:51', '2025-05-18 20:26:10');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (21, 1, '2025-06-11 02:02:27', '2025-06-11 02:07:27', 
    'H', 'X', N'Tự của để trong khiến.', '2025-04-02 14:20:49', '2025-04-02 19:50:25');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (34, 7, '2025-06-13 11:30:28', '2025-06-13 11:35:28', 
    'H', 'X', N'Điều là các nhiều hơn một như về là.', '2025-04-17 23:53:05', '2025-05-19 12:20:01');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (13, 20, '2025-05-18 09:07:58', '2025-05-18 09:17:58', 
    'D', 'P', N'Như đã về vài.', '2025-04-08 01:31:27', '2025-04-17 18:57:43');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (31, 26, '2025-05-21 07:12:07', '2025-05-21 07:42:07', 
    'H', 'P', N'Không vậy số với.', '2025-04-01 10:56:55', '2025-04-28 03:04:41');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (29, 8, '2025-05-29 13:55:48', '2025-05-29 14:05:48', 
    'H', 'X', N'Điều tự này trong rất tại chỉ làm.', '2025-04-02 11:07:34', '2025-05-23 00:49:50');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (23, 8, '2025-05-21 07:31:59', '2025-05-21 07:36:59', 
    'T', 'P', N'Khi từng nếu như từ được vài một.', '2025-04-26 23:50:00', '2025-04-29 01:06:49');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (3, 14, '2025-06-26 12:03:18', '2025-06-26 12:33:18', 
    'T', 'X', N'Tôi như số của bạn này giống.', '2025-04-15 05:41:13', '2025-04-30 12:21:15');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (24, 37, '2025-06-06 06:28:38', '2025-06-06 06:28:38', 
    'D', 'X', N'Đến chưa vài cũng hoặc cho nếu của tự.', '2025-04-29 19:13:55', '2025-05-29 07:07:59');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (32, 30, '2025-06-11 02:20:56', '2025-06-11 02:50:56', 
    'T', 'C', N'Dưới một vì về từng có nào.', '2025-04-21 08:40:51', '2025-05-17 11:24:47');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (12, 14, '2025-06-01 05:47:44', '2025-06-01 06:02:44', 
    'D', 'C', N'Không đang tại từng của nơi từ điều của.', '2025-04-22 18:23:50', '2025-04-23 04:45:47');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (9, 10, '2025-06-08 19:47:44', '2025-06-08 19:57:44', 
    'T', 'C', N'Sau nhưng theo rất số trong.', '2025-04-23 13:21:15', '2025-05-11 09:10:29');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (6, 22, '2025-05-09 12:08:10', '2025-05-09 12:28:10', 
    'H', 'P', N'Giống đang như rất tại đã cũng gần nếu.', '2025-04-08 16:35:19', '2025-05-04 20:51:13');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (11, 10, '2025-06-11 07:03:24', '2025-06-11 07:23:24', 
    'T', 'C', N'Để thế từng cách nào dưới đó nơi vậy.', '2025-04-01 02:52:23', '2025-05-09 10:48:18');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (36, 9, '2025-05-26 00:26:34', '2025-05-26 00:36:34', 
    'H', 'C', N'Với có cũng để theo đang giống như.', '2025-04-30 00:16:51', '2025-05-11 15:33:31');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (4, 20, '2025-05-09 09:14:47', '2025-05-09 09:19:47', 
    'D', 'X', N'Như làm với với chưa.', '2025-04-09 01:07:59', '2025-04-15 22:15:19');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (20, 26, '2025-05-07 17:14:46', '2025-05-07 17:24:46', 
    'T', 'C', N'Chưa đang cho giữa sẽ cũng từng cách khiến.', '2025-04-14 15:11:15', '2025-04-19 21:46:32');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (7, 36, '2025-05-29 11:34:46', '2025-05-29 11:49:46', 
    'T', 'C', N'Mà dưới tôi hoặc mà vài cho vậy thì.', '2025-04-24 01:16:24', '2025-05-10 17:39:23');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (8, 31, '2025-06-10 09:50:54', '2025-06-10 09:50:54', 
    'D', 'C', N'Tại hoặc bạn đi có nếu.', '2025-04-25 03:54:15', '2025-05-15 20:51:13');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (3, 20, '2025-05-06 04:41:33', '2025-05-06 04:51:33', 
    'D', 'X', N'Sẽ thì cũng từ để gần điều một từng tự cũng.', '2025-04-18 15:29:52', '2025-04-26 04:51:34');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (11, 37, '2025-05-05 02:31:45', '2025-05-05 02:46:45', 
    'D', 'P', N'Vẫn từ như hoặc hơn.', '2025-04-12 02:41:15', '2025-04-18 12:05:36');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (6, 13, '2025-05-14 18:23:08', '2025-05-14 18:53:08', 
    'H', 'P', N'Đang cũng rất được của của thay nhưng vì chỉ.', '2025-04-26 13:16:15', '2025-05-15 05:36:33');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (1, 7, '2025-05-31 19:04:42', '2025-05-31 19:19:42', 
    'D', 'X', N'Sẽ người thì gần nhưng thế.', '2025-04-11 19:04:56', '2025-05-09 22:24:49');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (29, 32, '2025-05-20 03:44:41', '2025-05-20 04:04:41', 
    'D', 'X', N'Số có và cũng này một người có dưới.', '2025-04-09 12:34:23', '2025-04-30 14:48:37');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (28, 6, '2025-05-23 17:39:24', '2025-05-23 17:49:24', 
    'H', 'C', N'Nếu một chưa giống trong như của có hoặc đến đi.', '2025-04-27 16:05:27', '2025-05-26 01:55:51');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (11, 28, '2025-06-11 21:57:33', '2025-06-11 22:02:33', 
    'T', 'P', N'Rất theo tại khi và có thì đang cái có.', '2025-04-21 20:56:11', '2025-04-24 23:20:10');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (2, 34, '2025-05-22 16:15:48', '2025-05-22 16:30:48', 
    'D', 'P', N'Cũng các rất khi để như đúng được rất được.', '2025-04-02 12:09:59', '2025-04-14 01:14:50');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (32, 26, '2025-06-20 18:54:13', '2025-06-20 19:04:13', 
    'H', 'X', N'Người một chưa khi bên.', '2025-04-13 07:20:13', '2025-04-15 08:23:19');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (14, 10, '2025-05-30 08:42:27', '2025-05-30 08:42:27', 
    'H', 'C', N'Giữa cũng tại như này nếu từ.', '2025-04-01 13:18:24', '2025-05-08 06:11:05');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (24, 35, '2025-06-14 20:37:30', '2025-06-14 20:42:30', 
    'H', 'X', N'Hơn và mỗi gần rất với một để sau.', '2025-04-21 04:56:16', '2025-05-14 21:23:02');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (10, 37, '2025-05-21 19:59:28', '2025-05-21 20:14:28', 
    'D', 'X', N'Hơn mỗi từ thay cũng từng theo đã bên.', '2025-04-14 15:37:55', '2025-05-05 04:44:27');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (34, 32, '2025-06-04 07:02:19', '2025-06-04 07:32:19', 
    'T', 'C', N'Từ cũng như hơn đúng chỉ trong giữa.', '2025-04-23 12:56:14', '2025-05-17 17:54:09');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (13, 35, '2025-06-22 03:55:59', '2025-06-22 04:15:59', 
    'H', 'P', N'Nơi đó hơn chỉ của của đã.', '2025-04-01 10:04:49', '2025-05-04 10:51:03');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (21, 21, '2025-06-22 02:26:22', '2025-06-22 02:26:22', 
    'D', 'P', N'Nhưng và cũng nơi nhiều lớn đã chỉ cách đang.', '2025-04-12 18:21:24', '2025-05-25 05:12:12');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (17, 39, '2025-05-07 09:32:35', '2025-05-07 09:37:35', 
    'T', 'X', N'Nếu được mà tại có cho đó để về dưới.', '2025-04-07 09:49:57', '2025-05-05 23:47:35');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (31, 5, '2025-06-08 12:20:53', '2025-06-08 12:20:53', 
    'D', 'P', N'Gần để như sau trong trong.', '2025-04-28 18:05:28', '2025-05-01 23:23:59');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (15, 9, '2025-05-21 19:58:15', '2025-05-21 19:58:15', 
    'T', 'P', N'Khiến mỗi sau thì vài dưới như.', '2025-04-06 08:25:24', '2025-05-19 21:42:42');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (22, 11, '2025-06-29 22:00:04', '2025-06-29 22:05:04', 
    'D', 'C', N'Với thì rất cái đã.', '2025-04-09 00:31:48', '2025-05-15 01:46:21');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (33, 25, '2025-06-18 03:18:36', '2025-06-18 03:38:36', 
    'D', 'P', N'Cách hoặc một cho nào người bạn đang số.', '2025-04-11 05:41:18', '2025-04-20 00:54:39');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (34, 39, '2025-05-04 19:47:42', '2025-05-04 19:47:42', 
    'D', 'C', N'Hơn nhiều khi vì hơn đến làm vậy.', '2025-04-15 21:48:54', '2025-05-29 21:07:33');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (14, 19, '2025-05-02 18:08:10', '2025-05-02 18:28:10', 
    'D', 'C', N'Lớn có dưới thì thế có này cái.', '2025-04-16 23:10:25', '2025-05-27 01:10:47');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (31, 25, '2025-05-07 13:38:21', '2025-05-07 13:58:21', 
    'D', 'P', N'Khi đến cho các rất.', '2025-04-08 00:05:02', '2025-04-09 23:48:35');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (1, 12, '2025-06-04 20:51:37', '2025-06-04 21:01:37', 
    'D', 'X', N'Của được gần giống mà nào làm.', '2025-04-26 21:37:48', '2025-05-09 06:05:48');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (22, 5, '2025-06-15 00:37:49', '2025-06-15 00:52:49', 
    'T', 'C', N'Lớn với từng của để.', '2025-04-26 01:21:18', '2025-05-15 20:47:40');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (25, 25, '2025-05-15 11:50:03', '2025-05-15 11:50:03', 
    'H', 'X', N'Được bên như theo đó.', '2025-04-09 07:17:44', '2025-04-21 15:58:28');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (16, 19, '2025-06-24 14:45:19', '2025-06-24 15:15:19', 
    'T', 'P', N'Chỉ nhưng chưa cũng dưới chỉ.', '2025-04-03 01:14:17', '2025-04-06 12:58:11');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (31, 27, '2025-05-25 14:52:57', '2025-05-25 14:57:57', 
    'T', 'X', N'Của khiến là tự là một đang trong.', '2025-04-12 13:42:25', '2025-05-17 09:17:32');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (6, 10, '2025-06-19 08:59:39', '2025-06-19 09:09:39', 
    'T', 'P', N'Tôi giống khi của số đó với đang.', '2025-04-23 20:54:23', '2025-05-23 13:40:15');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (30, 25, '2025-05-04 11:58:01', '2025-05-04 12:13:01', 
    'H', 'P', N'Lớn làm điều rất hơn nào thế đó khiến là.', '2025-04-29 08:39:41', '2025-05-22 05:17:13');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (10, 2, '2025-05-29 05:48:31', '2025-05-29 05:48:31', 
    'D', 'X', N'Sau giữa cũng bên theo với.', '2025-04-17 02:24:23', '2025-04-23 13:00:55');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (21, 7, '2025-05-24 15:59:08', '2025-05-24 16:29:08', 
    'D', 'X', N'Vậy với như tôi chưa trong để mỗi có và.', '2025-04-08 16:31:31', '2025-05-12 08:19:12');
INSERT INTO LICH_KHAM 
    (bacsi_id, benhnhan_id, thoi_gian_hen, thoi_gian_den, kieu_lich_kham, trang_thai, ghi_chu, ngay_tao, ngay_cap_nhat)
    VALUES 
    (13, 25, '2025-06-03 13:30:37', '2025-06-03 13:45:37', 
    'H', 'P', N'Đang đang thế nào nhưng của đúng lớn.', '2025-04-22 13:24:57', '2025-05-22 04:15:24');

-- 12. BENH_AN
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (18, 37, 
    N'Lớn của có với sau tại mà.', N'Thế thay cũng hơn.', N'Hoặc làm của vài.', '2025-05-06 01:44:42');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (98, 5, 
    N'Là đó cách số mà sẽ của là đã vì.', N'Này này đã rất đang đó bên. Các để dưới hơn nếu khiến thay.', N'Số của như vậy nếu có như để để.', '2025-05-29 16:52:45');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (33, 8, 
    N'Tại giống nào đến về như.', N'Vì để trong giữa. Về khiến tại bạn để hơn.', N'Cũng của để gần trong cách chưa này giữa từng.', '2025-05-29 03:49:18');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (64, 29, 
    N'Rất nơi cách từng cái đúng mỗi thay khiến mỗi.', N'Sẽ từng tại về từ số của. Của cái cách đúng được vài.', N'Dưới cách người để cách để tự.', '2025-05-02 16:27:34');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (61, 25, 
    N'Một đó đó giống theo cũng.', N'Khi như tôi với. Đến đi đang hoặc.', N'Tại đó cũng của người cũng như để sẽ.', '2025-05-30 12:16:25');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (27, 7, 
    N'Mỗi đó đó trong hơn tôi hoặc vậy cách đã gần.', N'Đã đi cũng lớn được dưới có. Với sẽ và như như.', N'Giống của theo cái như là mỗi.', '2025-05-28 19:04:01');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (63, 2, 
    N'Của chưa nhiều hoặc để mà thì sẽ vậy nhưng không.', N'Nếu thế được chưa như đó.', N'Để mỗi từ cho nhưng làm.', '2025-05-05 18:57:43');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (50, 28, 
    N'Tự khi như điều tại gần này hơn một của.', N'Làm được để theo khi. Đang chưa hơn từng.', N'Cho cách cũng và như chưa đúng như khi.', '2025-05-30 23:23:08');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (78, 1, 
    N'Trong mà lớn đã một làm thay lớn tự rất nơi đúng như.', N'Vậy để cũng thay và này từ của.', N'Rất điều tôi bên nhưng.', '2025-05-19 11:22:00');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (90, 29, 
    N'Như đang theo tại để đi và cái gần nếu vài rất.', N'Có các nhiều nhiều cũng sẽ. Trong thay chưa tại thì người sẽ không.', N'Một nơi gần vì đi đi số cũng.', '2025-05-16 00:04:17');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (35, 15, 
    N'Được bạn để thay nếu khi.', N'Có vài theo đó theo như cách như. Đó cái giống về.', N'Chưa tôi để của một từng của trong gần.', '2025-05-16 15:13:02');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (76, 7, 
    N'Cũng giữa các đang thay trong các là bạn.', N'Bên giống điều của nhưng tôi chỉ. Theo như nhiều mỗi cách.', N'Vì với cái bên của tại đúng tự gần đó.', '2025-05-18 08:10:51');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (41, 2, 
    N'Cho với làm như nào nào hơn này cái với để đi vì.', N'Bạn điều từng chỉ khi.', N'Như các nơi đi và như để như tôi sau như.', '2025-05-16 05:55:03');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (3, 2, 
    N'Hoặc để về hoặc khiến vài để thay từng.', N'Của theo sẽ lớn sau có. Chỉ thì giữa tôi hơn và.', N'Mỗi dưới làm các từng.', '2025-05-07 20:44:08');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (84, 35, 
    N'Bên đến hoặc vì tự nhiều mà của nhưng tôi được với như.', N'Nhưng với như đến.', N'Theo giống cái người vì đó vẫn.', '2025-05-30 12:14:57');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (2, 25, 
    N'Bên sẽ đang cách nơi có theo điều đúng.', N'Thì của với sẽ như không mỗi.', N'Với giống cách nhiều sau.', '2025-05-07 17:47:07');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (88, 14, 
    N'Để lớn bạn để thì với.', N'Vì rất nếu nào.', N'Thế đi mà không cái nơi vài như như để.', '2025-05-23 12:25:21');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (55, 2, 
    N'Bên nào giống từ nếu của vẫn với về cái cũng nhưng nào.', N'Gần hoặc nhiều như từ theo nhiều đang. Nào dưới dưới.', N'Đúng để sau mỗi hơn thì làm chỉ.', '2025-05-27 12:44:07');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (68, 15, 
    N'Trong như tại tại và để giống của thì.', N'Tôi chỉ tôi. Nào điều hơn sẽ.', N'Này khi như hoặc các đến.', '2025-05-23 19:49:39');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (98, 29, 
    N'Từ và nếu khiến từ từ thì khiến cũng nào tại làm.', N'Chỉ làm hơn theo đến để. Nào tự tự theo làm như khiến chưa.', N'Vì các hơn hơn làm với cho cho chỉ về.', '2025-05-20 13:33:23');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (64, 36, 
    N'Với sẽ điều như đã được tự từng và.', N'Thay sẽ là. Mỗi nhiều hơn khi bên với hoặc.', N'Đã này rất giống nhiều.', '2025-05-12 13:17:42');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (30, 23, 
    N'Tại có sẽ chỉ được vài như từ và.', N'Bạn mà có các nào như sau.', N'Đúng là cũng như cách lớn.', '2025-05-13 10:46:11');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (30, 15, 
    N'Một đi nếu đó với giữa cho.', N'Nhưng người thế cho.', N'Điều bên đến cũng dưới nhiều đi.', '2025-05-12 21:51:51');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (98, 30, 
    N'Có tự vài thì hơn từ giữa có thì.', N'Không như nhưng đến chỉ khiến hơn. Theo gần trong các.', N'Để có để mỗi tại về gần và với.', '2025-05-22 15:10:54');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (38, 2, 
    N'Thay sau như vì khiến nơi theo.', N'Nếu chưa có làm. Làm mà với vậy.', N'Nhưng theo từ được khi.', '2025-05-20 02:17:50');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (54, 36, 
    N'Tại cho mỗi giữa từ bên có giữa là gần từ khiến không.', N'Được nào với như nếu của với. Nếu thì được giống để với.', N'Bạn hơn đúng lớn rất nơi.', '2025-05-23 03:45:21');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (83, 7, 
    N'Tự nhiều mỗi tự các của cho giữa lớn từ.', N'Giống về số đi nào tại gần.', N'Để là theo đã cho cũng sau số vẫn mỗi.', '2025-05-27 14:26:15');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (24, 19, 
    N'Chỉ không như lớn đi để đúng sẽ bên.', N'Đó về để chỉ đang thay. Thế như này rất về các người tại.', N'Mỗi từ làm không giống.', '2025-05-19 14:12:31');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (16, 22, 
    N'Như như vẫn để có nhưng thì từ cái từng hoặc đi.', N'Như để từ bạn. Đi từ đang của số tự giữa.', N'Dưới bạn nếu để có cách gần tôi dưới từ.', '2025-05-28 13:58:23');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (93, 33, 
    N'Về nào số thay vậy như.', N'Mà tại của.', N'Dưới để sau cũng của tại trong trong.', '2025-05-09 11:07:21');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (55, 33, 
    N'Về với đúng từng của số đang của nơi.', N'Sẽ như từng nào nhưng như sẽ. Đã là theo tại.', N'Nào hơn bên một hơn.', '2025-05-03 13:54:45');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (86, 13, 
    N'Đã của và đi tự khiến vậy bên khiến từ điều của của.', N'Vậy một cũng vậy đang.', N'Thế cũng hơn tại trong hơn hoặc của làm khiến.', '2025-05-27 03:57:39');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (39, 19, 
    N'Chưa dưới mỗi các đúng vẫn chưa cũng sau.', N'Có vẫn nếu như để. Nơi chỉ của cho không từ vài.', N'Với hơn trong của nơi.', '2025-05-15 22:55:16');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (76, 32, 
    N'Thế thế vài này của sau khiến có rất.', N'Để với cho sau.', N'Bạn thế được với cho làm.', '2025-05-05 09:12:10');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (65, 26, 
    N'Như và của với từ để đến bạn được trong như như.', N'Khiến nơi vẫn chưa.', N'Vài giữa đó được cho theo trong.', '2025-05-28 23:24:35');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (76, 3, 
    N'Thì để từ nếu theo với.', N'Một tự mà. Để được cái thay từng.', N'Thì của đi bên hơn.', '2025-05-14 06:28:22');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (62, 16, 
    N'Để lớn hơn tại của tự nếu đã nếu cho vài.', N'Này thay nơi đó.', N'Nơi với tại nào cũng mà đến cách cách bên.', '2025-05-25 17:45:11');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (96, 26, 
    N'Là bạn điều tôi các trong như sẽ bên để khi thay tôi.', N'Nào gần trong nếu điều dưới. Với cái mỗi.', N'Mà từ như rất trong vài.', '2025-05-21 14:37:58');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (54, 12, 
    N'Tự nào hơn có tại là hoặc cái và.', N'Cho để thì nơi gần như đến của.', N'Tự vẫn cũng từng như với và.', '2025-05-16 08:07:38');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (47, 36, 
    N'Như thì đến từ trong có nhưng mà đang mỗi vì.', N'Giữa có vậy thay của đi thế khi.', N'Gần đó thay mà bên của.', '2025-05-12 04:03:11');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (90, 24, 
    N'Theo gần được theo vậy khiến về.', N'Vì cách lớn tự bên trong.', N'Của của đi số rất mà để mỗi.', '2025-05-08 15:49:31');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (12, 29, 
    N'Nhiều như số đó cũng dưới khiến.', N'Hoặc từ cách theo của tôi của.', N'Như với từ tôi mà đó sẽ.', '2025-05-12 13:12:32');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (85, 33, 
    N'Tự hơn hoặc điều đi với.', N'Trong với đi cũng từ đi.', N'Và giữa trong đó chưa tại hơn của cho.', '2025-05-28 09:01:44');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (14, 11, 
    N'Trong dưới từ của từ hoặc hoặc mỗi thế nơi.', N'Lớn bên trong vẫn khiến.', N'Tự làm theo mà lớn đó từng từng.', '2025-05-12 01:51:08');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (67, 26, 
    N'Như có vẫn cách chỉ này cho rất.', N'Vẫn một đúng có.', N'Mà điều vài cho cách như này mà.', '2025-05-14 23:28:22');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (48, 32, 
    N'Đến gần thì bên đã chỉ thì với.', N'Như sẽ tại đang mỗi vài hơn.', N'Theo có như bạn mỗi từng dưới cũng để.', '2025-05-29 13:57:48');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (94, 2, 
    N'Giống để cũng các gần sẽ số đến giữa.', N'Hơn chỉ mỗi gần từ. Cách đã là của vậy từ này.', N'Nhiều sau của nơi để như cho từ.', '2025-05-23 03:30:34');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (61, 3, 
    N'Thế cũng hơn như khi này.', N'Để bên người.', N'Vài người để giữa không về.', '2025-05-29 13:26:50');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (40, 40, 
    N'Khi có và hơn thay để.', N'Và để từ bên cũng từ của.', N'Đi cũng như tại tự từ như tại nhưng có.', '2025-05-16 12:20:07');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (76, 38, 
    N'Vài từ từ như hơn đúng về.', N'Đúng lớn cũng lớn đó như khi. Giống là về như thay một.', N'Vì để mỗi cái tôi được sẽ thay trong cũng.', '2025-05-16 12:12:28');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (51, 11, 
    N'Của về khi làm về chỉ sau theo đúng giống cũng đang.', N'Như của số làm. Với cách đi này.', N'Nơi tại khiến nếu như.', '2025-05-11 00:12:43');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (22, 33, 
    N'Như bạn tự chưa cho vì về giống là bạn giống thay.', N'Hoặc dưới với người như này có nhiều.', N'Với làm không có nhiều khi nhiều hơn đã.', '2025-05-01 13:32:16');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (30, 1, 
    N'Gần là theo từ cái sau.', N'Mỗi là với sẽ đang thế về.', N'Số như vài người vẫn từng có hơn.', '2025-05-18 18:07:25');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (99, 13, 
    N'Thế tự đến có vẫn bên.', N'Khi đi không giữa thế bên. Từ cách để tại điều lớn để rất.', N'Tôi làm mỗi nếu sau cũng cách theo đó.', '2025-05-03 08:03:31');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (70, 36, 
    N'Rất thì để sẽ tại khi từ trong chưa có cũng.', N'Giống khiến nếu đó khi.', N'Như như và chỉ được vậy như như trong đang.', '2025-05-20 23:55:53');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (30, 26, 
    N'Khi là đi điều giống sau giống dưới nếu mà tự nhiều mỗi.', N'Nào này và này đã.', N'Mà vẫn hơn nếu hơn về chỉ điều.', '2025-05-22 16:15:22');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (66, 23, 
    N'Của trong từ vì khi của thế số cũng đi mỗi đến.', N'Bên giống dưới. Để chưa giống giống.', N'Vì đúng có vài giữa tôi đang.', '2025-05-03 10:56:41');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (74, 23, 
    N'Đã vậy của chỉ đó có.', N'Khi đúng hơn từ tại làm có.', N'Theo này sẽ thay này từ rất được nào đó.', '2025-05-10 02:14:17');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (59, 18, 
    N'Dưới sau đã của như để đúng như trong như trong và.', N'Có một không đã người có.', N'Giống với từng mỗi đã.', '2025-05-14 23:59:09');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (85, 36, 
    N'Với chưa hơn hơn sau được thì sau các.', N'Chưa cũng nhưng theo như như. Hơn cũng như của.', N'Với các tự giống về rất thì.', '2025-05-20 08:04:24');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (78, 1, 
    N'Để về nếu nếu với cách hơn của đi trong tôi mỗi.', N'Thì bạn nơi tại một.', N'Cách thay các bên điều như.', '2025-05-10 04:16:02');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (50, 33, 
    N'Với gần hơn người thì nhiều để chưa để trong vẫn đến.', N'Người mà gần thay. Có bên nếu từ theo.', N'Này đang lớn không gần.', '2025-05-11 22:10:31');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (17, 34, 
    N'Để làm tôi như lớn để thay vài chưa đúng.', N'Để người chưa không của nơi đã trong. Đó tại người đúng một.', N'Vậy chưa một đi không khi lớn.', '2025-05-01 23:33:09');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (100, 36, 
    N'Bạn tại là có về từ cho như.', N'Vậy bạn bạn đúng một khi để. Có đến chưa đó người.', N'Đã làm mỗi chưa từng của cái tôi.', '2025-05-15 05:25:44');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (27, 28, 
    N'Với nhưng hơn nơi sau hơn.', N'Nơi theo của trong để thì giống. Cũng rất như nhiều này.', N'Một như giữa tại tại được giữa.', '2025-05-09 09:13:00');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (8, 31, 
    N'Chỉ nào cũng hơn như rất vài mà bên về thì này đi.', N'Để vì chưa không cho. Từng lớn nhiều.', N'Lớn tại lớn như hơn vì.', '2025-05-09 01:09:28');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (47, 37, 
    N'Sẽ nào tại bạn cho của cho của khiến với này chỉ.', N'Để bạn giữa để bạn bên sẽ. Điều mỗi khi nhưng.', N'Khiến vẫn vì mỗi vì bên có hơn để cũng.', '2025-05-22 15:13:32');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (71, 13, 
    N'Người rất để là không gần rất cũng các trong của.', N'Người trong từ của như. Đã để vì thay để có tại.', N'Tại để tôi cách nhưng thay khiến tại.', '2025-05-08 08:11:13');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (65, 27, 
    N'Trong nhiều hơn đã mỗi sẽ rất như cũng cũng.', N'Trong mà được nơi đó tại vì.', N'Đi cũng để đang để người trong.', '2025-05-06 05:32:09');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (63, 23, 
    N'Với bạn từ thế vậy tự khi có từ của được điều.', N'Tôi với để tự có. Như sau được số khi về.', N'Như như sẽ như từ như bạn từ mà trong.', '2025-05-01 12:24:31');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (54, 23, 
    N'Đi nhiều thì đúng vẫn thay này như bạn không.', N'Nhưng mỗi để nào.', N'Cũng đúng mỗi của khi mà.', '2025-05-16 21:55:51');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (1, 35, 
    N'Chưa số giữa nơi số không tôi với nhiều trong vì giữa.', N'Để hơn khiến điều. Cho thì của này thế thế các để.', N'Tại từ sẽ chỉ nơi khiến gần mà là tại.', '2025-05-10 16:10:33');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (70, 40, 
    N'Sẽ như cái hoặc và mỗi người của mỗi.', N'Được vì tự lớn chỉ tại.', N'Trong về thì giống của về cách.', '2025-05-11 02:34:52');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (79, 22, 
    N'Như này đó vậy rất vẫn lớn có.', N'Và để nơi. Chưa hoặc đến như.', N'Có và rất điều giữa có thì bên.', '2025-05-13 00:35:54');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (59, 39, 
    N'Vì trong đó cho đang tại là.', N'Nhưng tại hơn để cách vậy số đi.', N'Từng này từ mà như bạn với sẽ hơn hoặc.', '2025-05-06 04:13:33');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (4, 15, 
    N'Thì như không điều vài cái nhưng.', N'Nếu hơn lớn từ.', N'Vẫn vậy là như tại đã như chưa.', '2025-05-24 07:12:51');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (82, 12, 
    N'Với làm của chỉ rất có người để đến sau đến.', N'Vài tại dưới nếu có trong nhiều. Như làm bên đúng.', N'Như cho để cho rất là tại lớn được về.', '2025-05-01 19:42:01');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (71, 38, 
    N'Không làm mỗi đúng đang đi hơn để đó nào để được.', N'Tự vì hơn với có vậy người. Vẫn của với với.', N'Tôi trong chưa một thì điều.', '2025-05-28 10:15:01');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (24, 6, 
    N'Làm cho có theo để làm tự đó hơn đang tại.', N'Người sau là dưới. Từng của số để trong của.', N'Đã số về chưa được sẽ làm.', '2025-05-26 09:35:44');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (71, 17, 
    N'Cũng điều như trong cái bạn trong hoặc từ như.', N'Đến đúng mà với đó này.', N'Đi thay hoặc vì giữa để này lớn của.', '2025-05-18 12:18:38');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (5, 5, 
    N'Dưới vẫn nào nhiều bên đó nào chưa nhưng có cũng nhưng để.', N'Tại của để sau được. Từ với làm vậy.', N'Từ khiến để về làm.', '2025-05-05 16:59:58');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (11, 2, 
    N'Cho một chỉ mà tại hơn trong từ cũng.', N'Là của của một vậy như một.', N'Và trong như như có thì để tại thì được sau.', '2025-05-18 08:28:16');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (58, 1, 
    N'Theo hơn từ dưới hoặc bạn từ như được nếu cái tại.', N'Nhiều chưa một nào.', N'Tôi từ các để vẫn bạn.', '2025-05-11 08:30:16');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (97, 18, 
    N'Và sẽ đúng hoặc bạn đã dưới để.', N'Một như này giữa chỉ từ. Vài của nhưng.', N'Người này sẽ hơn như.', '2025-05-13 22:21:36');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (32, 18, 
    N'Làm và như vẫn để vì sẽ bạn đến cũng.', N'Là dưới cho vài như.', N'Vì hơn từ như của.', '2025-05-26 22:37:14');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (15, 40, 
    N'Đã có chưa bạn lớn giữa.', N'Nào cách thì gần cũng.', N'Với với nơi người tại cũng như sẽ.', '2025-05-02 08:30:32');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (24, 23, 
    N'Có bạn đã cũng như hơn vài như như như điều cho.', N'Cũng nơi và không chỉ từng như. Tự làm với.', N'Thay đã sẽ tôi đến nào đang trong để số.', '2025-05-29 14:43:50');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (38, 5, 
    N'Tại của mỗi lớn mỗi tự nhiều đến như có khi.', N'Để về mỗi có để vì số. Cũng của đã như chưa người.', N'Dưới khi là như thế gần rất cũng đi số.', '2025-05-12 11:31:28');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (22, 11, 
    N'Thì để khi là bên giữa hơn khi lớn nhưng bạn.', N'Thế mà từng theo đang. Lớn được giữa.', N'Đã khiến của mà dưới trong.', '2025-05-23 02:13:30');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (33, 34, 
    N'Đến để cũng thế một vậy có nơi làm của tại chỉ.', N'Rất khi để. Khi bên chỉ đó để.', N'Trong của một và bạn rất mỗi với.', '2025-05-02 23:08:20');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (22, 18, 
    N'Đã số vậy nhiều vì bên hơn chỉ của để nơi.', N'Tự một như giống tôi nhưng bên. Trong hơn vẫn làm của tại từng.', N'Chưa từ đang thì cách thay hoặc đã đó.', '2025-05-04 15:05:07');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (83, 19, 
    N'Chỉ cũng làm trong có thế tôi tại đã.', N'Có như tại hơn tại đó.', N'Có tại khiến sẽ vài cũng như.', '2025-05-19 15:57:01');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (59, 21, 
    N'Đang đã hơn từ từ nhưng như giống có người.', N'Nhiều nhiều như vài nhiều lớn.', N'Trong hơn bên cũng không số.', '2025-05-12 10:16:33');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (64, 31, 
    N'Vẫn các chỉ trong nếu để cho nào thế hoặc.', N'Như về tôi như vì có nhưng.', N'Tự như một hơn trong các từ tại.', '2025-05-09 15:53:34');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (15, 2, 
    N'Cái đó nơi hơn nào cách nơi.', N'Mà cũng cũng này hơn bạn điều.', N'Dưới mà có khi đến.', '2025-05-01 22:18:46');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (40, 25, 
    N'Vì có sau bạn như đúng hoặc sau và mỗi vì điều đi.', N'Khiến để từ đó các trong. Nào nhiều của khiến trong số đang hoặc.', N'Như tôi lớn hơn có gần theo vậy.', '2025-05-20 01:57:04');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (44, 27, 
    N'Số của trong của cũng gần các như đến để đi hơn.', N'Làm thế là vẫn đang bên. Cũng với nhiều nhiều bên.', N'Tại trong này này đã.', '2025-05-06 08:48:00');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (25, 17, 
    N'Hơn có cũng theo trong thì và.', N'Vẫn đã với thế gần số thì hơn. Đúng lớn của với như dưới giống.', N'Mỗi nếu rất cái.', '2025-05-03 10:04:10');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (14, 17, 
    N'Cách vài vẫn sau theo mà mỗi đi nếu.', N'Để giống đó như vì từ mỗi.', N'Nơi mà sau sẽ các cho.', '2025-05-11 22:25:19');
INSERT INTO BENH_AN 
    (lichkham_id, bacsi_ket_luan_id, tom_tat, ket_luan, ghi_chu, thoi_gian)
    VALUES 
    (94, 33, 
    N'Cái chỉ tại đi nào khi như vì theo với chỉ bạn gần.', N'Mà làm cái thế để.', N'Sau để của nơi đã nhưng trong vậy như.', '2025-05-11 14:47:55');

-- 13. HO_SO_BENH_AN
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (4, 12);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (6, 47);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (11, 95);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (20, 33);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (39, 28);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (39, 5);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (38, 88);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (11, 56);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (26, 93);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (33, 48);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (35, 57);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (33, 35);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (3, 4);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (24, 60);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (21, 49);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (28, 68);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (11, 72);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (12, 31);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (15, 4);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (12, 42);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (12, 18);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (33, 66);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (24, 66);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (36, 24);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (29, 54);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (34, 98);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (24, 76);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (23, 47);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (29, 21);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (26, 92);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (30, 84);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (34, 32);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (32, 36);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (32, 65);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (33, 46);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (30, 60);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (23, 73);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (36, 93);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (30, 63);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (15, 42);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (11, 79);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (18, 99);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (31, 40);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (20, 91);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (33, 72);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (34, 65);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (40, 76);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (27, 40);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (14, 63);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (33, 47);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (40, 10);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (22, 93);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (1, 25);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (7, 8);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (37, 84);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (4, 35);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (38, 30);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (7, 97);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (34, 18);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (18, 32);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (14, 8);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (28, 92);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (3, 8);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (24, 47);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (12, 32);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (2, 11);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (8, 9);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (2, 6);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (2, 48);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (17, 17);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (11, 95);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (12, 67);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (1, 50);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (38, 6);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (16, 20);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (3, 1);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (23, 79);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (8, 37);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (22, 63);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (2, 40);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (29, 71);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (39, 95);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (3, 34);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (26, 80);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (10, 61);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (15, 12);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (21, 14);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (2, 58);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (9, 67);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (38, 100);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (26, 63);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (33, 42);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (10, 44);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (17, 34);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (39, 54);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (2, 90);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (36, 18);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (4, 33);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (3, 17);
INSERT INTO HO_SO_BENH_AN 
    (benhan_id, benh_id)
    VALUES (11, 22);

-- 14. LICH_SU_DIEU_TRI
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (31, '2025-05-12', N'Cách về hơn vẫn như đó bên làm này từ tại bên tại.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (76, '2025-05-08', N'Dưới chưa giữa khiến vậy có sau vài.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (70, '2025-05-15', N'Như nơi vài các cũng đúng.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (17, '2025-05-21', N'Hơn lớn nhiều cho về là thế làm vậy trong để.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (48, '2025-05-21', N'Bên lớn với nào này khi các là nơi hơn hoặc hoặc.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (78, '2025-05-16', N'Như lớn chỉ sẽ như lớn đang có để từ một của.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (61, '2025-05-20', N'Đó nhưng của với hơn sau mà.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (81, '2025-05-29', N'Cách các nơi này là cái cũng với từng nhiều.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (75, '2025-05-15', N'Làm điều gần khi về cho chưa mà chưa cũng chưa điều cũng.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (9, '2025-05-25', N'Nhưng hơn này nếu gần giữa cách cái của.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (78, '2025-05-29', N'Đó vẫn dưới có vẫn tại vậy thì chỉ khiến.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (2, '2025-05-02', N'Có vậy nhiều theo rất vài bạn về bạn về vài nếu mà.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (61, '2025-05-02', N'Điều cho để đi nơi được vậy đi để vài từng vậy đã.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (34, '2025-05-09', N'Khi đi thay rất đã với với.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (71, '2025-05-10', N'Của bên người nơi của đi của khi cho đang.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (30, '2025-05-14', N'Thì của của nào các tôi cái số như gần nhưng.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (25, '2025-05-11', N'Giống bên đến giữa đang khi.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (92, '2025-05-12', N'Để nhiều với theo là của.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (61, '2025-05-25', N'Thay như có đó giống của nếu đến.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (70, '2025-05-26', N'Của số hơn khi theo chưa tại đúng thì không với mỗi.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (71, '2025-05-09', N'Đúng các của như cái dưới chưa và nơi.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (61, '2025-05-14', N'Với của tại trong cái có với với như gần để một để.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (51, '2025-05-16', N'Bạn thì đi có về người được với.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (82, '2025-05-27', N'Chỉ mà một của mà hơn.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (20, '2025-05-27', N'Dưới và thay có vẫn sau bạn từng của đó.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (30, '2025-05-11', N'Nơi vài của đã cho là được nhiều từ chưa với điều.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (82, '2025-05-26', N'Vậy khiến từ cũng có cái trong trong và để.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (20, '2025-05-05', N'Của đó bên với bên vậy bên từng có của.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (67, '2025-05-02', N'Để chỉ cũng giống tự có được từ như này người theo vẫn.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (50, '2025-05-20', N'Về cũng thì của một để nhiều của giống.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (95, '2025-05-08', N'Điều giống vậy giữa tại đi thay trong để giống các.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (2, '2025-05-26', N'Có để cho giống trong giữa tự để với trong vậy.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (86, '2025-05-21', N'Để có làm sẽ đó tại mà của về được trong trong từ.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (100, '2025-05-24', N'Sẽ có như đi là từ như số đúng như và các thay.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (9, '2025-05-04', N'Để này người làm người hoặc để như.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (21, '2025-05-13', N'Chưa bạn nhưng hơn một để bên đang.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (98, '2025-05-18', N'Có vậy cái khi vì tại sẽ có từng cũng cách.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (76, '2025-05-06', N'Như nhưng vì với theo với hoặc vậy về.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (6, '2025-05-22', N'Đến vậy số mỗi cũng số khi lớn với.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (39, '2025-05-24', N'Thì hơn vậy lớn người đi dưới của thay đến với tự.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (100, '2025-05-07', N'Đi đi của nếu người tại đúng chỉ cũng người.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (4, '2025-05-27', N'Lớn cũng để nơi có cho tại nơi hoặc giữa như số.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (35, '2025-05-22', N'Mỗi như thế từ trong vài điều lớn như cũng hoặc lớn.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (61, '2025-05-19', N'Vài trong nào không với lớn không.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (77, '2025-05-13', N'Trong là của thay từng mà từ có dưới gần.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (93, '2025-05-15', N'Là người dưới cũng giống này của vẫn không đúng sẽ mỗi.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (50, '2025-05-22', N'Lớn từng thay cho đúng vẫn và.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (92, '2025-05-18', N'Này một cách tự được chưa hoặc cho để vài tự chỉ khiến.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (55, '2025-05-17', N'Tự chưa vì sau tại cũng và một.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (51, '2025-05-10', N'Cũng tại như để sẽ thế đó rất.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (94, '2025-05-20', N'Người như hơn về về với vài đã cái sẽ đúng.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (74, '2025-05-07', N'Với tôi đó có để dưới cho hơn vì người bên.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (57, '2025-05-20', N'Bạn là chỉ này và thế như như này cũng người.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (18, '2025-05-17', N'Với các vài của đang gần số đúng nhiều thế từ là khi.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (47, '2025-05-17', N'Để điều nhiều vài cái là để của là có.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (13, '2025-05-25', N'Không nhiều tại của các số là nếu hơn số.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (5, '2025-05-05', N'Người của để cách với trong nào bên chưa.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (18, '2025-05-19', N'Về người của vì vì hoặc khi như để giống các hoặc từng.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (64, '2025-05-03', N'Của giống như để điều đến bạn.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (28, '2025-05-30', N'Như như rất thay khiến khi.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (34, '2025-05-18', N'Như nào từng cũng lớn cũng.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (87, '2025-05-04', N'Này và trong đi có cái đã nhiều.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (56, '2025-05-11', N'Giữa để như bạn như đúng tại vẫn và của vài để để.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (100, '2025-05-13', N'Cũng nào như điều cũng tại vậy.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (81, '2025-05-17', N'Hơn vì cũng bên vài mỗi sẽ cách tại hơn một.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (39, '2025-05-17', N'Tại như từ khiến của đi hơn sẽ.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (54, '2025-05-18', N'Khi nhưng một sẽ tôi tự.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (65, '2025-05-11', N'Tại chỉ để về người vẫn nào thay gần tại có là từng.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (50, '2025-05-01', N'Thay là trong để có tại không sẽ.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (74, '2025-05-24', N'Là tại không trong trong vì như vì sẽ thế mỗi.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (45, '2025-05-14', N'Gần như mà tôi bạn tại với cách về để.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (69, '2025-05-14', N'Tại thay của nếu này của.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (75, '2025-05-01', N'Cho với với tôi và không.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (53, '2025-05-23', N'Gần đúng gần là người đó nhưng khi và cách.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (75, '2025-05-05', N'Bạn theo của của làm và nhưng vẫn vậy các mỗi.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (30, '2025-05-13', N'Giống bên của giống khi cho đó.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (44, '2025-05-03', N'Tại có mỗi rất giữa giống.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (88, '2025-05-30', N'Của giữa của người điều từ cách nào thì rất của rất.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (4, '2025-05-26', N'Có cho là tại đã rất có.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (36, '2025-05-14', N'Bạn vài với với đúng giống.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (78, '2025-05-13', N'Nhưng như là tại giống như vì.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (86, '2025-05-16', N'Người mà như bạn nơi từng số bạn cũng nơi.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (90, '2025-05-07', N'Theo gần một đã không một với khiến bên dưới mỗi.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (21, '2025-05-01', N'Gần điều nhưng gần tại đang từ của tại.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (90, '2025-05-09', N'Trong chỉ điều tại nào cái cũng.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (42, '2025-05-09', N'Của người như như và từng với mà cũng cũng từ nơi cho trong.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (70, '2025-05-07', N'Thì các một người số từ gần theo thì từng.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (74, '2025-05-24', N'Hoặc bạn đó khi giống trong lớn.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (73, '2025-05-23', N'Với vì với như không vài tự để của nhiều bên của.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (14, '2025-05-13', N'Cho hơn có hơn của lớn tôi với.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (92, '2025-05-20', N'Điều giữa sau để cách vì trong vài được để mà bạn thì.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (84, '2025-05-30', N'Chưa bên đang gần nơi với để khiến khi đi.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (28, '2025-05-14', N'Nhiều rất tại với như gần với vì vẫn như nhưng.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (82, '2025-05-30', N'Có để mà gần về sẽ cách như nhưng.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (74, '2025-05-19', N'Về nếu để nào mà đi như có trong đã về hơn cho.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (35, '2025-05-04', N'Được đang là cách các với khiến như.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (37, '2025-05-11', N'Khi có để tự đã cho nếu từ với của như.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (16, '2025-05-21', N'Của mà thế gần tại cho.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (9, '2025-05-10', N'Dưới có từng nếu đang dưới giống như như như giống được.');
INSERT INTO LICH_SU_DIEU_TRI 
    (benhan_id, ngay_dieu_tri, ghi_chu)
    VALUES (62, '2025-05-01', N'Tại của thay như được của có như không cũng.');

-- 15. PHUONG_PHAP_DIEU_TRI
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (31, N'Liệu pháp tâm lý', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (93, N'Xạ trị', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (20, N'Châm cứu', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (3, N'Xạ trị', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (98, N'Vật lý trị liệu', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (67, N'Massage y học', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (36, N'Phẫu thuật nội soi', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (34, N'Dùng thuốc', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (83, N'Liệu pháp tâm lý', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (25, N'Phẫu thuật nội soi', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (38, N'Truyền dịch', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (78, N'Truyền dịch', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (65, N'Dùng thuốc', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (32, N'Hóa trị', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (12, N'Massage y học', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (1, N'Liệu pháp tâm lý', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (98, N'Massage y học', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (53, N'Xạ trị', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (56, N'Hóa trị', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (30, N'Liệu pháp tâm lý', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (6, N'Châm cứu', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (60, N'Liệu pháp tâm lý', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (90, N'Truyền dịch', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (87, N'Dùng thuốc', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (53, N'Dùng thuốc', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (36, N'Phẫu thuật nội soi', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (56, N'Thay băng sát trùng', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (82, N'Massage y học', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (42, N'Châm cứu', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (91, N'Dùng thuốc', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (98, N'Thay băng sát trùng', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (16, N'Truyền dịch', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (38, N'Hóa trị', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (6, N'Truyền dịch', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (37, N'Truyền dịch', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (42, N'Liệu pháp tâm lý', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (20, N'Xạ trị', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (38, N'Thay băng sát trùng', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (57, N'Liệu pháp tâm lý', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (33, N'Xạ trị', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (43, N'Thay băng sát trùng', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (47, N'Vật lý trị liệu', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (22, N'Truyền dịch', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (38, N'Thay băng sát trùng', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (57, N'Dùng thuốc', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (27, N'Châm cứu', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (8, N'Vật lý trị liệu', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (77, N'Phẫu thuật nội soi', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (70, N'Hóa trị', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (42, N'Vật lý trị liệu', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (68, N'Liệu pháp tâm lý', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (84, N'Dùng thuốc', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (26, N'Dùng thuốc', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (53, N'Hóa trị', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (29, N'Xạ trị', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (32, N'Xạ trị', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (64, N'Dùng thuốc', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (5, N'Liệu pháp tâm lý', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (32, N'Massage y học', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (99, N'Dùng thuốc', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (34, N'Phẫu thuật nội soi', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (7, N'Truyền dịch', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (73, N'Xạ trị', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (64, N'Xạ trị', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (56, N'Dùng thuốc', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (44, N'Liệu pháp tâm lý', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (83, N'Truyền dịch', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (68, N'Dùng thuốc', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (44, N'Xạ trị', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (10, N'Liệu pháp tâm lý', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (6, N'Xạ trị', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (99, N'Liệu pháp tâm lý', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (22, N'Hóa trị', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (96, N'Xạ trị', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (28, N'Vật lý trị liệu', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (21, N'Vật lý trị liệu', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (15, N'Xạ trị', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (29, N'Massage y học', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (26, N'Phẫu thuật nội soi', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (72, N'Hóa trị', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (4, N'Châm cứu', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (90, N'Thay băng sát trùng', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (63, N'Massage y học', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (78, N'Phẫu thuật nội soi', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (47, N'Châm cứu', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (39, N'Truyền dịch', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (11, N'Massage y học', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (49, N'Dùng thuốc', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (50, N'Dùng thuốc', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (52, N'Châm cứu', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (15, N'Thay băng sát trùng', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (66, N'Xạ trị', 'Y');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (92, N'Hóa trị', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (81, N'Dùng thuốc', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (62, N'Xạ trị', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (72, N'Phẫu thuật nội soi', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (21, N'Phẫu thuật nội soi', 'K');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (42, N'Hóa trị', 'M');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (34, N'Massage y học', 'T');
INSERT INTO PHUONG_PHAP_DIEU_TRI 
    (lsdieutri_id, ten_phuong_phap, hieu_qua)
    VALUES (91, N'Phẫu thuật nội soi', 'T');

-- 16. DON_THUOC
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (80, '2025-01-20 17:17:29');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (95, '2025-02-09 17:43:40');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (89, '2025-05-14 12:33:24');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (95, '2025-04-07 17:31:09');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (68, '2024-12-07 18:00:19');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (60, '2025-05-01 19:03:37');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (32, '2025-04-07 03:16:19');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (7, '2025-05-26 01:19:55');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (21, '2024-12-24 02:24:33');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (48, '2025-03-03 04:51:05');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (32, '2025-02-14 01:17:30');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (70, '2024-12-21 22:03:59');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (74, '2025-01-19 12:47:48');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (2, '2025-04-23 02:23:40');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (28, '2025-02-19 08:57:11');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (36, '2025-01-06 11:21:55');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (99, '2025-02-15 17:44:26');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (21, '2025-04-29 01:39:40');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (10, '2024-12-29 01:32:03');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (80, '2025-04-01 00:22:07');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (57, '2024-12-26 17:17:33');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (17, '2024-12-02 11:06:10');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (1, '2025-01-11 18:58:07');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (100, '2025-01-12 23:02:47');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (22, '2025-05-20 12:32:46');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (22, '2025-01-27 07:05:28');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (41, '2025-01-09 17:43:22');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (70, '2025-05-21 05:50:29');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (87, '2025-04-02 14:56:43');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (27, '2025-01-06 09:28:07');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (89, '2025-01-09 08:21:15');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (50, '2025-01-29 03:17:18');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (3, '2025-02-10 06:05:54');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (54, '2025-01-03 08:14:33');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (19, '2025-01-22 08:17:02');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (9, '2025-02-04 13:23:07');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (39, '2025-05-09 20:11:34');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (78, '2025-03-25 22:26:51');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (1, '2025-03-27 20:17:40');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (87, '2025-04-18 12:50:28');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (44, '2024-12-14 22:31:05');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (40, '2025-02-09 02:53:19');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (40, '2025-03-05 11:15:58');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (90, '2025-02-01 10:32:02');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (24, '2025-03-05 13:28:17');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (61, '2025-04-17 22:49:39');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (23, '2024-12-13 04:28:29');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (33, '2024-12-06 13:23:33');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (96, '2025-02-09 13:34:24');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (52, '2024-12-05 15:01:55');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (71, '2025-05-04 01:57:28');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (54, '2025-02-11 05:22:29');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (49, '2025-03-24 10:55:28');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (2, '2025-02-28 01:08:09');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (6, '2025-04-18 13:13:26');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (24, '2025-04-02 05:32:41');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (26, '2024-12-25 05:30:26');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (97, '2025-01-18 21:40:44');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (60, '2025-02-06 23:46:01');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (66, '2025-02-09 00:17:15');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (68, '2025-01-19 20:04:55');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (100, '2025-03-01 23:52:03');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (14, '2025-03-26 15:19:40');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (96, '2025-05-02 18:29:43');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (48, '2025-05-18 01:17:50');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (38, '2024-12-09 05:32:48');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (56, '2024-12-19 19:45:37');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (27, '2025-02-06 06:47:50');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (66, '2025-03-30 17:29:38');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (47, '2025-05-29 09:25:40');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (19, '2025-02-06 03:09:27');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (36, '2025-05-30 13:54:16');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (90, '2025-03-17 23:23:12');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (12, '2025-01-31 18:57:20');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (88, '2025-02-01 15:13:34');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (40, '2025-01-05 13:56:15');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (11, '2025-04-02 19:57:28');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (20, '2025-04-21 03:33:51');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (89, '2025-01-31 04:17:25');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (62, '2025-01-02 11:36:47');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (93, '2024-12-11 13:06:03');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (11, '2025-03-28 18:03:34');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (69, '2025-05-30 11:09:04');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (52, '2024-12-08 07:09:12');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (31, '2025-04-24 22:05:02');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (77, '2025-02-06 21:12:31');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (33, '2025-02-28 14:23:04');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (84, '2025-02-22 00:21:46');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (19, '2024-12-12 22:26:45');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (82, '2024-12-08 11:19:23');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (64, '2025-02-05 00:14:51');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (27, '2024-12-27 11:20:24');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (94, '2025-03-21 15:29:01');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (17, '2025-04-03 12:42:18');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (53, '2024-12-22 19:45:57');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (22, '2025-02-24 12:00:19');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (48, '2024-12-31 02:21:54');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (8, '2025-05-15 03:34:36');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (54, '2025-01-28 08:45:33');
INSERT INTO DON_THUOC
    (ppdieutri_id, ngay_phat_hanh)
    VALUES (19, '2025-02-28 02:41:10');

-- 17. CHI_TIET_DON_THUOC
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (42, N'Amoxicillin', 203, 1, 3);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (69, N'Ibuprofen', 188, 1, 30);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (65, N'Captopril', 20, 1, 14);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (54, N'Ibuprofen', 124, 1, 18);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (55, N'Paracetamol', 424, 1, 8);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (81, N'Ciprofloxacin', 486, 1, 19);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (75, N'Simvastatin', 26, 2, 2);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (72, N'Amoxicillin', 149, 4, 5);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (70, N'Ibuprofen', 293, 3, 18);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (88, N'Amoxicillin', 53, 2, 12);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (13, N'Azithromycin', 365, 1, 19);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (8, N'Ciprofloxacin', 106, 4, 22);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (69, N'Simvastatin', 398, 3, 15);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (75, N'Aspirin', 186, 3, 8);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (24, N'Captopril', 42, 3, 17);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (64, N'Omeprazole', 374, 4, 10);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (78, N'Ibuprofen', 61, 4, 6);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (97, N'Omeprazole', 78, 4, 14);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (6, N'Ibuprofen', 392, 3, 11);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (89, N'Omeprazole', 305, 4, 19);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (59, N'Ibuprofen', 431, 1, 9);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (61, N'Ibuprofen', 32, 3, 21);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (74, N'Aspirin', 146, 4, 29);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (86, N'Omeprazole', 12, 4, 12);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (22, N'Ciprofloxacin', 60, 4, 2);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (28, N'Metformin', 67, 2, 13);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (51, N'Aspirin', 42, 2, 15);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (52, N'Azithromycin', 143, 2, 27);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (56, N'Azithromycin', 143, 4, 12);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (88, N'Simvastatin', 491, 2, 5);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (11, N'Amoxicillin', 78, 2, 22);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (30, N'Paracetamol', 249, 2, 9);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (37, N'Paracetamol', 75, 4, 18);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (48, N'Ciprofloxacin', 290, 3, 5);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (89, N'Azithromycin', 487, 1, 15);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (100, N'Azithromycin', 201, 4, 13);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (51, N'Ibuprofen', 247, 4, 2);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (25, N'Ibuprofen', 107, 4, 6);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (15, N'Omeprazole', 308, 1, 4);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (1, N'Ciprofloxacin', 78, 1, 12);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (79, N'Paracetamol', 37, 2, 20);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (49, N'Amoxicillin', 325, 3, 12);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (78, N'Omeprazole', 243, 1, 4);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (63, N'Aspirin', 246, 4, 10);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (11, N'Amoxicillin', 53, 3, 24);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (34, N'Aspirin', 425, 2, 17);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (3, N'Captopril', 487, 3, 5);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (89, N'Azithromycin', 469, 1, 25);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (68, N'Metformin', 330, 1, 23);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (34, N'Azithromycin', 188, 2, 12);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (99, N'Captopril', 273, 3, 21);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (29, N'Ciprofloxacin', 416, 2, 26);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (31, N'Simvastatin', 379, 2, 7);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (67, N'Aspirin', 183, 1, 1);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (36, N'Aspirin', 133, 2, 23);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (78, N'Omeprazole', 229, 3, 12);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (11, N'Captopril', 53, 2, 16);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (26, N'Omeprazole', 105, 4, 20);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (79, N'Paracetamol', 246, 3, 26);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (83, N'Ibuprofen', 428, 1, 30);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (50, N'Captopril', 245, 2, 14);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (82, N'Omeprazole', 45, 4, 15);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (52, N'Ibuprofen', 372, 2, 6);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (17, N'Paracetamol', 78, 4, 26);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (84, N'Amoxicillin', 314, 4, 22);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (45, N'Amoxicillin', 281, 2, 1);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (2, N'Ibuprofen', 270, 2, 14);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (25, N'Captopril', 15, 3, 7);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (38, N'Azithromycin', 124, 3, 9);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (70, N'Simvastatin', 428, 2, 2);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (95, N'Omeprazole', 460, 4, 22);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (75, N'Azithromycin', 216, 2, 18);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (20, N'Azithromycin', 262, 1, 28);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (57, N'Amoxicillin', 312, 1, 25);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (20, N'Amoxicillin', 73, 4, 20);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (93, N'Ibuprofen', 285, 1, 11);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (88, N'Azithromycin', 272, 4, 26);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (100, N'Ibuprofen', 453, 1, 8);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (25, N'Metformin', 22, 1, 17);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (58, N'Azithromycin', 15, 1, 15);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (42, N'Ciprofloxacin', 499, 2, 23);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (36, N'Aspirin', 261, 4, 17);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (32, N'Azithromycin', 449, 3, 30);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (72, N'Captopril', 431, 4, 5);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (54, N'Ibuprofen', 201, 4, 11);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (10, N'Captopril', 220, 1, 7);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (86, N'Metformin', 402, 1, 29);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (100, N'Amoxicillin', 482, 3, 5);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (33, N'Amoxicillin', 496, 4, 8);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (96, N'Ibuprofen', 204, 4, 6);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (86, N'Captopril', 83, 4, 17);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (52, N'Omeprazole', 216, 2, 12);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (41, N'Ibuprofen', 370, 3, 1);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (44, N'Azithromycin', 235, 4, 23);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (3, N'Simvastatin', 170, 3, 17);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (9, N'Ibuprofen', 471, 2, 29);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (14, N'Ibuprofen', 136, 3, 2);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (100, N'Amoxicillin', 139, 2, 27);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (55, N'Metformin', 208, 2, 18);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (66, N'Ciprofloxacin', 254, 3, 3);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (36, N'Paracetamol', 410, 2, 14);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (10, N'Metformin', 481, 1, 21);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (12, N'Metformin', 43, 2, 3);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (34, N'Ibuprofen', 233, 1, 11);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (71, N'Simvastatin', 475, 3, 20);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (17, N'Paracetamol', 270, 2, 4);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (21, N'Metformin', 26, 2, 7);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (40, N'Metformin', 272, 2, 10);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (58, N'Azithromycin', 345, 2, 9);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (45, N'Paracetamol', 129, 1, 1);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (3, N'Azithromycin', 283, 2, 17);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (61, N'Captopril', 479, 4, 4);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (85, N'Simvastatin', 337, 4, 18);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (51, N'Azithromycin', 158, 2, 8);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (44, N'Captopril', 427, 2, 13);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (45, N'Paracetamol', 429, 2, 1);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (10, N'Metformin', 221, 2, 2);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (11, N'Simvastatin', 446, 3, 20);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (32, N'Metformin', 24, 4, 6);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (21, N'Metformin', 229, 1, 9);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (47, N'Omeprazole', 498, 3, 8);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (5, N'Metformin', 112, 3, 6);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (1, N'Omeprazole', 196, 1, 16);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (36, N'Azithromycin', 336, 2, 8);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (65, N'Paracetamol', 47, 3, 27);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (12, N'Amoxicillin', 205, 1, 13);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (3, N'Metformin', 156, 2, 3);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (75, N'Azithromycin', 437, 2, 22);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (92, N'Ciprofloxacin', 200, 3, 24);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (64, N'Amoxicillin', 146, 2, 2);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (92, N'Azithromycin', 322, 4, 24);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (90, N'Azithromycin', 72, 1, 27);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (88, N'Ciprofloxacin', 409, 2, 3);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (4, N'Paracetamol', 69, 3, 4);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (49, N'Aspirin', 286, 1, 21);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (3, N'Azithromycin', 349, 2, 16);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (34, N'Paracetamol', 234, 1, 24);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (65, N'Azithromycin', 48, 1, 24);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (95, N'Aspirin', 130, 1, 28);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (34, N'Captopril', 374, 2, 8);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (95, N'Aspirin', 253, 4, 3);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (62, N'Metformin', 393, 1, 20);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (81, N'Captopril', 40, 2, 11);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (33, N'Metformin', 319, 2, 1);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (62, N'Paracetamol', 249, 3, 22);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (13, N'Captopril', 346, 4, 10);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (91, N'Azithromycin', 147, 4, 15);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (60, N'Ibuprofen', 458, 2, 10);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (11, N'Aspirin', 9, 3, 15);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (10, N'Azithromycin', 496, 4, 9);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (50, N'Captopril', 470, 2, 3);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (75, N'Ibuprofen', 73, 3, 12);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (17, N'Ciprofloxacin', 420, 3, 29);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (15, N'Omeprazole', 119, 4, 29);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (63, N'Simvastatin', 13, 2, 1);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (63, N'Aspirin', 208, 3, 24);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (19, N'Simvastatin', 177, 4, 11);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (16, N'Omeprazole', 1, 3, 25);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (44, N'Simvastatin', 62, 2, 23);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (2, N'Metformin', 130, 3, 3);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (51, N'Simvastatin', 446, 1, 12);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (55, N'Metformin', 438, 1, 9);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (14, N'Paracetamol', 428, 3, 21);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (20, N'Captopril', 498, 3, 14);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (66, N'Omeprazole', 98, 3, 26);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (55, N'Paracetamol', 416, 4, 30);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (71, N'Azithromycin', 105, 1, 2);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (94, N'Simvastatin', 231, 2, 21);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (37, N'Aspirin', 26, 2, 6);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (61, N'Simvastatin', 176, 3, 10);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (33, N'Metformin', 208, 2, 10);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (62, N'Azithromycin', 343, 4, 4);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (22, N'Amoxicillin', 39, 2, 17);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (64, N'Azithromycin', 113, 4, 30);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (43, N'Aspirin', 219, 2, 18);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (25, N'Captopril', 47, 2, 11);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (72, N'Ibuprofen', 164, 2, 12);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (34, N'Ciprofloxacin', 104, 1, 24);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (53, N'Simvastatin', 212, 2, 13);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (35, N'Omeprazole', 386, 1, 16);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (36, N'Ciprofloxacin', 496, 3, 5);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (88, N'Azithromycin', 271, 2, 3);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (35, N'Captopril', 197, 4, 21);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (58, N'Simvastatin', 489, 3, 28);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (3, N'Amoxicillin', 17, 4, 23);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (98, N'Aspirin', 496, 4, 1);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (10, N'Simvastatin', 477, 4, 15);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (32, N'Ibuprofen', 115, 2, 5);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (67, N'Ibuprofen', 483, 4, 3);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (71, N'Paracetamol', 1, 2, 8);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (73, N'Paracetamol', 331, 3, 5);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (81, N'Metformin', 271, 4, 23);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (98, N'Ibuprofen', 51, 1, 10);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (68, N'Ciprofloxacin', 99, 4, 9);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (29, N'Ciprofloxacin', 1, 1, 18);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (39, N'Aspirin', 143, 3, 21);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (32, N'Aspirin', 270, 2, 18);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (32, N'Paracetamol', 492, 4, 23);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (84, N'Metformin', 29, 1, 7);
INSERT INTO CHI_TIET_DON_THUOC
    (donthuoc_id, ten_thuoc, lieu_dung, tinh_thuong_xuyen, khoan_thoi_gian)
    VALUES
    (64, N'Simvastatin', 42, 3, 8);

-- 18. DICH_VU
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (30, N'Vật lý trị liệu', N'Về mà không và cho mỗi để nào.', 4815245.68);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (17, N'Chụp X-quang phổi', N'Rất rất thế người như một.', 3553602.92);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (11, N'Siêu âm ổ bụng', N'Sau hoặc giữa tại các hơn đến để.', 1312460.83);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (65, N'Chụp X-quang phổi', N'Cũng như cũng có này một.', 2063480.16);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (4, N'Phẫu thuật nhỏ', N'Như có trong như số thế không số có hơn như đang.', 2488270.18);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (50, N'Phẫu thuật nhỏ', N'Để nhưng tôi vài với bạn thì đi thế vẫn.', 2908312.13);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (52, N'Xét nghiệm máu', N'Trong với để như như để hoặc đã theo.', 2476987.46);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (98, N'Khám tổng quát', N'Nếu đã là theo nếu chỉ.', 3535692.88);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (67, N'Tiêm phòng', N'Của cũng tôi đến gần không sau nếu đó sau khi.', 2424182.83);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (49, N'Xét nghiệm máu', N'Lớn như cho từ nào một như chỉ.', 3348514.74);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (13, N'Xét nghiệm máu', N'Một cũng giữa về mỗi để.', 1993209.17);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (49, N'Xét nghiệm máu', N'Gần có đó cho cũng lớn giống.', 3338131.54);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (44, N'Chụp X-quang phổi', N'Được về đi thế có vẫn như chưa mỗi mỗi.', 3487372.8);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (64, N'Nội soi dạ dày', N'Của nhiều vì một hơn thế tại tôi.', 4516737.3);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (75, N'Siêu âm ổ bụng', N'Cũng hơn đi hơn giữa để tự.', 3072910.96);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (70, N'Khám tổng quát', N'Cũng về đã không vì cũng hơn chỉ hơn đó về nhưng để.', 2494467.47);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (25, N'Siêu âm ổ bụng', N'Để chỉ không đã với giống đi cái hơn như khiến tự gần.', 4735617.19);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (75, N'Phẫu thuật nhỏ', N'Dưới một của giống của khiến được nếu.', 3671813.15);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (57, N'Điện tim', N'Đúng nếu bên không về từng để bạn đang hơn.', 2830868.3);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (55, N'Siêu âm ổ bụng', N'Số hơn như hơn về nhưng thế với bên làm như khiến.', 875668.81);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (77, N'Xét nghiệm máu', N'Từ trong vẫn như gần nơi như làm từ.', 2705859.17);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (41, N'Vật lý trị liệu', N'Của về nhiều đúng giống theo mỗi vài như về trong đúng cũng đến.', 4754998.69);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (64, N'Nội soi dạ dày', N'Từ các đúng cho hơn điều một tại chưa như tự để hơn.', 3157530.01);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (40, N'Siêu âm ổ bụng', N'Bạn và các chưa đi về.', 1843121.51);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (37, N'Nội soi dạ dày', N'Mỗi hơn vài bạn nếu thì.', 3319575.3);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (65, N'Nội soi dạ dày', N'Như như các hơn nhưng tôi thay trong hơn như.', 1177779.65);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (32, N'Khám tổng quát', N'Đã đang của giống cũng và từ khiến như từ được như.', 1548962.72);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (29, N'Điện tim', N'Tại từ số từ tự cho được nào của sau có thay.', 264902.56);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (33, N'Tiêm phòng', N'Vậy đang mỗi vì điều khiến mà từ chỉ chưa khiến trong người.', 1561930.32);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (91, N'Tiêm phòng', N'Điều tại với bên thế nhiều với số đang.', 958729.85);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (51, N'Xét nghiệm máu', N'Lớn cũng cho thế tại đang là chưa.', 914290.1);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (85, N'Khám tổng quát', N'Số thì hoặc vẫn trong điều một người có với nhiều nhưng.', 1088860.47);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (99, N'Siêu âm ổ bụng', N'Có như mà để từ chỉ về gần cũng bạn để bên đi tại.', 1570219.29);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (2, N'Tiêm phòng', N'Thì về mỗi mà dưới và cho chỉ thay bạn là này về.', 1774898.03);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (22, N'Thăm khám nha khoa', N'Tại của cho làm đó vì đang điều rất nếu.', 2234475.76);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (30, N'Siêu âm ổ bụng', N'Chưa vì dưới thế đến khi có khiến về vài rất.', 2109494.79);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (58, N'Tiêm phòng', N'Lớn không giữa vài trong để là cách đến bạn trong nào.', 2148011.57);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (76, N'Xét nghiệm máu', N'Từng đó vì như bạn là cái đó.', 1514847.06);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (13, N'Khám tổng quát', N'Lớn dưới cái mỗi được để của.', 517753.78);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (14, N'Nội soi dạ dày', N'Chưa điều giữa không các giống.', 2683691.78);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (20, N'Nội soi dạ dày', N'Như nhưng trong trong chỉ từng đến thì vài đến theo.', 2492372.47);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (20, N'Thăm khám nha khoa', N'Từ đang trong bạn tôi có như bạn.', 408572.12);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (3, N'Siêu âm ổ bụng', N'Giữa hơn nào sẽ hoặc hoặc người của đến.', 1769884.1);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (85, N'Thăm khám nha khoa', N'Tôi như này như nhưng thay như cách thế tại hơn về.', 691669.71);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (39, N'Vật lý trị liệu', N'Vẫn tại đã của hơn tôi này.', 1694628.9);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (47, N'Khám tổng quát', N'Nhưng vậy các khi cho trong như được.', 3264647.78);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (64, N'Chụp X-quang phổi', N'Cho này vài bên các nào sau với cũng để đến vì vài.', 397263.26);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (80, N'Khám tổng quát', N'Khi chỉ chưa các đó đó hoặc điều bạn chỉ như cũng.', 4426234.68);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (98, N'Thăm khám nha khoa', N'Cũng từ nơi cách không dưới như khi.', 942666.49);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (44, N'Tiêm phòng', N'Chỉ tự hơn nhiều khiến nơi số thay có bên.', 2263466.98);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (11, N'Chụp X-quang phổi', N'Sau như cách vậy điều giữa để nào rất tại của tôi với.', 3066468.68);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (64, N'Phẫu thuật nhỏ', N'Để hoặc các khiến lớn từng vẫn vì người tôi đúng thay thì.', 3972031.31);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (49, N'Xét nghiệm máu', N'Có nào từng như theo như từng tại đang số tại như.', 631453.63);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (93, N'Phẫu thuật nhỏ', N'Dưới đang người để với người.', 3274783.35);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (93, N'Phẫu thuật nhỏ', N'Được này không theo mà giữa nếu với thế và để hơn.', 2620964.85);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (12, N'Phẫu thuật nhỏ', N'Được cũng không tại lớn để bên là với.', 2862913.65);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (47, N'Phẫu thuật nhỏ', N'Như vậy các nhưng cũng mà từng dưới như trong hơn.', 1205046.29);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (26, N'Khám tổng quát', N'Vì nơi từ vậy các trong từng cái thay.', 2286484.81);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (14, N'Chụp X-quang phổi', N'Một tôi bạn như của hơn cho mà đó cũng.', 3653190.92);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (91, N'Thăm khám nha khoa', N'Đã để tôi trong đang tự cũng.', 3096439.89);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (3, N'Vật lý trị liệu', N'Chỉ từng cũng các nhưng tại này như và các vậy.', 4163398.25);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (68, N'Xét nghiệm máu', N'Từ vẫn đi nhưng hơn từ.', 4895404.4);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (96, N'Thăm khám nha khoa', N'Và vẫn vẫn cách số có đó hơn để cho.', 2562654.74);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (91, N'Thăm khám nha khoa', N'Bên thì để cách bên này chưa đi người này.', 1083314.0);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (30, N'Vật lý trị liệu', N'Vẫn của người cũng nào trong làm.', 2676130.13);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (96, N'Nội soi dạ dày', N'Tự thay để sau tôi vẫn.', 3271631.45);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (1, N'Điện tim', N'Hoặc tôi hoặc hơn đó và hơn gần từ nếu cách sẽ cho và.', 3104527.16);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (11, N'Vật lý trị liệu', N'Sau cho nơi hơn vậy thì nhiều nếu thay cho rất từ.', 4645141.96);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (52, N'Chụp X-quang phổi', N'Sau như vẫn cách như với từng sau.', 3198469.37);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (11, N'Nội soi dạ dày', N'Chưa khi để nơi cái tại.', 2155467.57);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (96, N'Vật lý trị liệu', N'Gần nhiều vẫn hoặc với để điều cho vẫn và khi.', 4053221.36);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (95, N'Vật lý trị liệu', N'Từ dưới trong từ số thế giống nào số giữa.', 2629743.4);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (81, N'Vật lý trị liệu', N'Thế giống để cũng được thay thế mà vậy từng như.', 3938039.69);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (38, N'Xét nghiệm máu', N'Của từ cũng bạn làm khi để chưa.', 1059131.24);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (48, N'Tiêm phòng', N'Của với bên được tại đã lớn của từng.', 4797059.41);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (40, N'Chụp X-quang phổi', N'Giống người có vậy mà giữa lớn như.', 1523426.98);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (79, N'Tiêm phòng', N'Đến đang trong tại về để chỉ.', 4228924.67);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (88, N'Nội soi dạ dày', N'Làm chưa cũng có như đến và cũng đang khiến cho từng.', 4686640.01);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (94, N'Vật lý trị liệu', N'Có đi hoặc giống cái như tại về đã có vài tại nếu.', 4122518.6);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (78, N'Thăm khám nha khoa', N'Nào làm nhưng như được khiến nào vì này như như nào cái.', 1874697.37);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (55, N'Chụp X-quang phổi', N'Trong là không cách của bên tại hơn cho từng thế.', 2500717.1);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (68, N'Nội soi dạ dày', N'Của từ đang từ thì nơi.', 4207145.37);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (35, N'Siêu âm ổ bụng', N'Để tại này có đã bạn để nhưng từ làm nào tự.', 436274.25);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (94, N'Điện tim', N'Cho sau để điều chưa của mà.', 4944869.41);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (100, N'Xét nghiệm máu', N'Để như khi được nếu tại cái theo làm dưới các và.', 3160315.25);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (36, N'Điện tim', N'Là cái hơn sẽ thế đang một.', 1443080.64);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (65, N'Điện tim', N'Như nếu tôi vẫn thì làm thay nhiều trong là hoặc đó từng.', 1458912.67);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (81, N'Tiêm phòng', N'Cách lớn như như hơn của làm vì chưa các theo.', 1298233.99);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (32, N'Chụp X-quang phổi', N'Nếu hơn như của là hơn trong rất bên thì.', 3971796.94);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (96, N'Phẫu thuật nhỏ', N'Với nơi là đang của thay trong của có khi để.', 1324505.04);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (77, N'Nội soi dạ dày', N'Cho tại mỗi khiến rất làm giữa các làm như có khi sẽ.', 4165651.84);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (48, N'Phẫu thuật nhỏ', N'Cũng người bạn và tại có vẫn vì.', 3925754.91);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (15, N'Tiêm phòng', N'Dưới như để bạn và nơi không.', 512696.97);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (22, N'Thăm khám nha khoa', N'Số sau mỗi đúng một sẽ từ đó với từ trong.', 4966106.35);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (6, N'Siêu âm ổ bụng', N'Từng từng thế sau số khi.', 208236.66);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (25, N'Điện tim', N'Nào là nhưng giữa nếu nào số mà làm.', 526519.62);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (60, N'Phẫu thuật nhỏ', N'Số với vẫn trong nhiều người đã bên với về theo.', 4356688.83);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (37, N'Thăm khám nha khoa', N'Một giữa đúng như như hơn thì và.', 554216.26);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (78, N'Vật lý trị liệu', N'Người với mà tôi chỉ thì với về như cách như có.', 4338551.05);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (84, N'Xét nghiệm máu', N'Được tôi sau có vài vẫn số thế từ vậy nào cái.', 1667605.53);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (5, N'Xét nghiệm máu', N'Được các trong đi để từ khiến nhưng hoặc sẽ điều cho của.', 4309435.39);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (84, N'Vật lý trị liệu', N'Lớn từ tự để chỉ với của.', 4975219.38);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (10, N'Chụp X-quang phổi', N'Đang đúng đến cũng hơn nhiều gần.', 3651103.0);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (77, N'Vật lý trị liệu', N'Tại của nhiều bạn như từ tại thì nhiều.', 1189415.02);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (96, N'Vật lý trị liệu', N'Nào cho như của tự nào này giữa với khiến cho.', 4839339.68);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (9, N'Nội soi dạ dày', N'Để là về giữa của tại về dưới trong theo như đã.', 4510583.28);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (93, N'Thăm khám nha khoa', N'Như nếu theo của như của như thì điều sẽ vài gần.', 1805428.51);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (21, N'Siêu âm ổ bụng', N'Của vậy từng khiến thì vẫn tôi nhưng.', 1349080.57);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (50, N'Siêu âm ổ bụng', N'Dưới các gần thay đi thế chỉ.', 2213004.47);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (9, N'Xét nghiệm máu', N'Này với số như tôi như làm như tại mà chỉ điều chỉ.', 2718871.21);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (11, N'Điện tim', N'Từ của nào mỗi làm đã lớn.', 4632648.4);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (44, N'Chụp X-quang phổi', N'Mỗi để khiến từ đó đang.', 634148.65);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (7, N'Khám tổng quát', N'Nhiều gần tôi dưới sẽ chỉ tại vậy tại thay cái của.', 2823680.83);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (95, N'Siêu âm ổ bụng', N'Làm giống vẫn giữa hoặc như đang.', 4142880.29);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (72, N'Vật lý trị liệu', N'Khiến khiến này điều người nào cách có chỉ.', 1547475.7);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (32, N'Nội soi dạ dày', N'Vậy hơn nào của nhiều để chưa.', 2446559.41);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (73, N'Xét nghiệm máu', N'Như với tôi vì trong gần là nơi các.', 4987048.26);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (96, N'Siêu âm ổ bụng', N'Khiến nơi đi nhiều người là nếu chỉ này được.', 1204431.47);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (28, N'Tiêm phòng', N'Từng sẽ hoặc bạn hoặc như.', 952095.84);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (18, N'Phẫu thuật nhỏ', N'Để đi điều tôi chỉ với.', 398149.99);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (58, N'Thăm khám nha khoa', N'Khi một đó hơn như nào và điều chưa đó hơn.', 3372426.41);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (37, N'Tiêm phòng', N'Từ nhiều bạn thay cách đã nơi để sau đã có.', 4090470.42);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (56, N'Thăm khám nha khoa', N'Theo đi điều nhưng đúng nhưng.', 3464095.57);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (95, N'Vật lý trị liệu', N'Cũng theo như điều lớn đã giống.', 3491379.85);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (91, N'Phẫu thuật nhỏ', N'Cách làm có nếu từ nào hơn vậy được với mà dưới sau.', 4355922.37);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (95, N'Nội soi dạ dày', N'Gần và sẽ như của để từ.', 1018585.62);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (35, N'Phẫu thuật nhỏ', N'Này với trong cũng một đến như.', 4181802.76);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (36, N'Phẫu thuật nhỏ', N'Cách có bạn chỉ mỗi thay từ cũng nơi nhưng.', 3212819.05);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (65, N'Nội soi dạ dày', N'Để số trong số có chưa khiến.', 3965239.71);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (66, N'Điện tim', N'Cách một tự cũng theo một của chưa rất.', 4053844.63);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (73, N'Nội soi dạ dày', N'Của để số đi vài là đã từ với số đã mỗi.', 2014220.17);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (18, N'Phẫu thuật nhỏ', N'Bạn từ khi từ số một như nào.', 3272442.19);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (16, N'Điện tim', N'Trong sẽ cho đó lớn của là từ dưới.', 2030966.47);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (5, N'Vật lý trị liệu', N'Giống tại khiến như các cái làm.', 2582361.5);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (38, N'Vật lý trị liệu', N'Nhưng thay như hoặc giống nơi một không khiến và.', 1937916.65);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (4, N'Thăm khám nha khoa', N'Này tự cái là hơn sẽ các dưới như từng giống nhiều của.', 4963767.65);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (89, N'Khám tổng quát', N'Vậy thay tại được không một cách giữa.', 490586.73);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (24, N'Phẫu thuật nhỏ', N'Từ cái từ hoặc theo tôi các trong khi từng rất.', 2941592.96);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (17, N'Tiêm phòng', N'Tại về để về hơn được bạn được một chưa đi vẫn.', 2864091.8);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (75, N'Xét nghiệm máu', N'Từ bạn thế nơi tại này cách cũng đúng cách làm sẽ vài.', 1926315.2);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (65, N'Khám tổng quát', N'Sẽ thế từng bên hoặc lớn từ các.', 4940663.49);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (92, N'Vật lý trị liệu', N'Thì đến này để người này mà hoặc mỗi như thế bên để.', 4930654.84);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (46, N'Xét nghiệm máu', N'Như như về đã gần được sẽ thế của.', 4739112.76);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (84, N'Xét nghiệm máu', N'Đang không để tự để hơn.', 2435635.04);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (22, N'Chụp X-quang phổi', N'Điều từ đúng của lớn số gần cái dưới giống.', 2436432.69);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (74, N'Vật lý trị liệu', N'Lớn này với nơi đúng giống điều mà tôi nhiều đó sau.', 4670153.61);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (97, N'Tiêm phòng', N'Như trong điều nhiều gần lớn có hoặc tại gần này với.', 1937082.23);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (81, N'Khám tổng quát', N'Đang bạn đi khiến tại có người.', 3699075.7);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (91, N'Vật lý trị liệu', N'Như đúng trong đến như dưới cho nếu từ đã hoặc.', 398630.38);
INSERT INTO DICH_VU
    (benhan_id, ten_dich_vu, mo_ta, gia)
    VALUES
    (30, N'Nội soi dạ dày', N'Tự số nhiều đó giống và và có nơi.', 1866427.13);

-- 19. HOA_DON
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (30, 40, '2025-05-15', 4046463.35, 560594.66, 3485868.69);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (1, 22, '2025-05-30', 5276429.76, 4739806.14, 536623.62);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (6, 22, '2025-05-07', 5765569.45, 3555338.65, 2210230.8);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (3, 47, '2025-04-26', 4100686.24, 2884752.36, 1215933.88);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (29, 47, '2025-04-14', 4514573.47, 760380.47, 3754193.0);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (4, 8, '2025-04-19', 1758042.94, 1532530.73, 225512.21);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (38, 5, '2025-04-01', 7854989.94, 3013683.5, 4841306.44);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (7, 59, '2025-05-03', 3266191.75, 2202184.06, 1064007.69);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (27, 57, '2025-05-19', 1333267.64, 355627.24, 977640.4);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (14, 26, '2025-05-16', 3171251.94, 2567162.38, 604089.56);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (13, 46, '2025-05-29', 8920797.45, 7844710.1, 1076087.35);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (4, 58, '2025-04-08', 4098755.82, 2015406.34, 2083349.48);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (2, 16, '2025-05-03', 4534890.84, 4110473.24, 424417.6);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (8, 39, '2025-05-24', 536808.92, 410316.95, 126491.97);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (13, 58, '2025-05-30', 8595865.63, 2838498.37, 5757367.26);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (6, 9, '2025-04-04', 5627809.68, 98288.81, 5529520.87);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (6, 37, '2025-05-07', 5219045.67, 4806356.52, 412689.15);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (27, 5, '2025-04-17', 4282280.81, 2735167.86, 1547112.95);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (6, 45, '2025-05-14', 6008101.45, 1036729.1, 4971372.35);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (39, 47, '2025-05-12', 9604096.13, 520284.65, 9083811.48);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (36, 44, '2025-04-16', 6260617.78, 934738.27, 5325879.51);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (18, 48, '2025-04-17', 9951397.11, 9931138.76, 20258.35);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (8, 56, '2025-04-24', 7201948.5, 6848496.94, 353451.56);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (16, 11, '2025-04-05', 6305710.75, 271339.43, 6034371.32);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (24, 55, '2025-04-11', 6904185.07, 4075257.67, 2828927.4);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (6, 56, '2025-04-13', 3798382.44, 3281939.4, 516443.04);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (38, 24, '2025-05-20', 4787350.04, 1925330.01, 2862020.03);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (37, 48, '2025-05-28', 674482.85, 539161.26, 135321.59);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (22, 1, '2025-04-07', 4618938.7, 985807.17, 3633131.53);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (29, 18, '2025-05-08', 3584740.85, 318384.36, 3266356.49);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (19, 7, '2025-04-10', 5416290.03, 298782.7, 5117507.33);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (25, 50, '2025-04-29', 5824128.99, 2496444.35, 3327684.64);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (23, 46, '2025-04-20', 7888938.65, 4465348.03, 3423590.62);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (5, 28, '2025-04-22', 6654603.18, 637344.67, 6017258.51);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (26, 33, '2025-05-11', 4043209.69, 3476762.08, 566447.61);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (24, 9, '2025-04-09', 6841301.02, 1170271.28, 5671029.74);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (17, 2, '2025-04-26', 979785.65, 955544.73, 24240.92);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (12, 17, '2025-04-21', 9491932.44, 9360621.98, 131310.46);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (39, 10, '2025-05-09', 612809.99, 37326.69, 575483.3);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (14, 51, '2025-04-28', 4194347.13, 2565047.44, 1629299.69);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (23, 19, '2025-05-04', 1836122.84, 1031776.45, 804346.39);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (9, 6, '2025-04-05', 7601239.52, 2250045.52, 5351194.0);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (8, 5, '2025-04-20', 4489309.23, 639818.9, 3849490.33);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (36, 49, '2025-04-01', 8051457.8, 4735653.16, 3315804.64);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (11, 43, '2025-05-10', 7296931.62, 5631076.59, 1665855.03);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (39, 32, '2025-04-06', 3814273.87, 3521296.53, 292977.34);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (18, 34, '2025-05-07', 1719269.56, 1372684.13, 346585.43);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (6, 11, '2025-05-18', 7911416.03, 1759561.18, 6151854.85);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (1, 13, '2025-04-14', 2170580.17, 991298.55, 1179281.62);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (36, 35, '2025-04-03', 4188698.06, 724853.19, 3463844.87);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (31, 38, '2025-04-23', 9491153.65, 5081846.56, 4409307.09);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (2, 38, '2025-05-12', 9934961.88, 8832122.73, 1102839.15);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (35, 20, '2025-04-11', 5473206.54, 2939790.46, 2533416.08);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (5, 57, '2025-05-28', 6606699.38, 3581830.77, 3024868.61);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (20, 5, '2025-04-01', 7386808.43, 5323497.03, 2063311.4);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (7, 7, '2025-04-12', 7145445.62, 3240686.35, 3904759.27);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (32, 57, '2025-05-27', 6549235.09, 346769.31, 6202465.78);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (39, 2, '2025-04-20', 4044856.06, 3554352.65, 490503.41);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (15, 24, '2025-04-20', 8319654.7, 6069933.3, 2249721.4);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (40, 32, '2025-05-03', 8820569.21, 317531.25, 8503037.96);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (39, 6, '2025-04-01', 6326102.58, 4289451.51, 2036651.07);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (27, 38, '2025-04-09', 1155164.99, 218430.22, 936734.77);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (39, 49, '2025-04-13', 2222473.37, 144186.4, 2078286.97);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (23, 40, '2025-05-23', 4967296.36, 2660330.69, 2306965.67);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (2, 46, '2025-04-02', 7867953.84, 2626553.87, 5241399.97);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (21, 1, '2025-05-19', 4906568.69, 2203820.2, 2702748.49);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (10, 25, '2025-04-09', 9869990.74, 8219574.17, 1650416.57);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (7, 58, '2025-05-26', 3813252.9, 882068.21, 2931184.69);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (9, 13, '2025-05-19', 9702496.91, 1055389.08, 8647107.83);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (4, 8, '2025-05-23', 1209018.61, 780203.31, 428815.3);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (6, 24, '2025-04-20', 1484391.19, 34814.98, 1449576.21);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (34, 13, '2025-05-11', 4010139.4, 2545290.37, 1464849.03);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (16, 1, '2025-04-07', 2935464.17, 1520062.96, 1415401.21);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (13, 1, '2025-05-09', 4672930.3, 4410787.97, 262142.33);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (2, 7, '2025-04-19', 5434723.61, 2267112.97, 3167610.64);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (17, 31, '2025-04-10', 8590576.7, 5199473.56, 3391103.14);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (15, 41, '2025-05-27', 1056788.32, 290810.82, 765977.5);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (20, 3, '2025-04-15', 8102653.05, 7904577.34, 198075.71);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (26, 60, '2025-04-17', 568907.09, 556059.41, 12847.68);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (20, 55, '2025-05-30', 1396944.07, 443778.95, 953165.12);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (16, 27, '2025-04-05', 6239619.36, 3068052.53, 3171566.83);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (23, 57, '2025-04-06', 8452488.91, 3373318.81, 5079170.1);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (14, 6, '2025-04-27', 3125690.52, 1443286.49, 1682404.03);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (40, 60, '2025-05-24', 5900164.3, 2595678.46, 3304485.84);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (12, 22, '2025-05-29', 4320575.39, 1404290.93, 2916284.46);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (11, 21, '2025-04-15', 5666875.23, 1068557.96, 4598317.27);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (24, 43, '2025-04-27', 9018085.98, 8510558.47, 507527.51);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (6, 22, '2025-05-26', 9761654.57, 9393849.14, 367805.43);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (39, 49, '2025-04-04', 9435080.67, 6323765.36, 3111315.31);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (25, 14, '2025-04-12', 7121571.78, 5493432.75, 1628139.03);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (5, 2, '2025-05-10', 6862844.86, 2894909.12, 3967935.74);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (15, 56, '2025-04-23', 7408724.64, 5659887.21, 1748837.43);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (33, 33, '2025-04-16', 1441397.31, 1033364.15, 408033.16);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (19, 59, '2025-05-30', 5568262.27, 397713.26, 5170549.01);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (1, 59, '2025-05-20', 3489169.62, 319229.2, 3169940.42);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (22, 11, '2025-04-05', 7089375.25, 3612847.13, 3476528.12);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (26, 42, '2025-05-06', 8477676.76, 3301361.87, 5176314.89);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (38, 33, '2025-05-21', 8749647.83, 4451157.81, 4298490.02);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (23, 23, '2025-05-28', 9497945.54, 1918462.03, 7579483.51);
INSERT INTO HOA_DON
    (benhnhan_id, nguoidung_lap_hoadon_id, ngay_tao, tong_tien, tong_tien_thanh_toan, tong_tien_con_no)
    VALUES
    (25, 37, '2025-05-25', 2233092.9, 1367776.86, 865316.04);

-- 20. CHI_TIET_HOA_DON
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (74, 3, 7, 970297.73, 6792084.11);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (2, 14, 8, 1628509.29, 13028074.32);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (36, 42, 3, 78463.11, 235389.33);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (63, 21, 2, 507493.39, 1014986.78);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (96, 24, 1, 846588.44, 846588.44);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (18, 39, 6, 769395.91, 4616375.46);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (37, 44, 5, 919093.99, 4595469.95);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (88, 20, 6, 274626.51, 1647759.06);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (99, 16, 8, 1230520.37, 9844162.96);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (6, 38, 1, 478951.32, 478951.32);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (25, 20, 9, 738629.75, 6647667.75);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (31, 21, 9, 906739.77, 8160657.93);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (61, 5, 10, 656129.69, 6561296.9);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (65, 11, 4, 1939869.45, 7759477.8);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (31, 3, 1, 998240.96, 998240.96);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (78, 43, 2, 1071632.63, 2143265.26);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (11, 10, 7, 1138798.6, 7971590.2);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (48, 39, 3, 234702.25, 704106.75);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (100, 50, 2, 888686.14, 1777372.28);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (25, 23, 7, 1941268.39, 13588878.73);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (58, 16, 5, 295591.3, 1477956.5);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (67, 12, 2, 541383.87, 1082767.74);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (39, 11, 3, 1557247.66, 4671742.98);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (62, 50, 6, 662847.22, 3977083.32);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (29, 1, 9, 1428020.67, 12852186.03);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (43, 21, 4, 169050.81, 676203.24);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (58, 26, 10, 324881.77, 3248817.7);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (64, 44, 4, 1475278.49, 5901113.96);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (35, 34, 8, 1208188.69, 9665509.52);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (9, 11, 8, 1351846.02, 10814768.16);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (52, 9, 7, 1087172.06, 7610204.42);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (45, 35, 7, 984892.56, 6894247.92);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (22, 36, 8, 206316.04, 1650528.32);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (54, 3, 1, 882770.88, 882770.88);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (9, 4, 6, 194559.38, 1167356.28);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (14, 39, 8, 1668569.57, 13348556.56);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (63, 9, 8, 1725452.74, 13803621.92);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (100, 33, 8, 693026.41, 5544211.28);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (34, 45, 8, 852388.1, 6819104.8);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (84, 34, 9, 315718.41, 2841465.69);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (31, 21, 10, 75470.18, 754701.8);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (26, 42, 10, 1154884.17, 11548841.7);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (81, 31, 1, 1617101.83, 1617101.83);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (38, 28, 4, 1439302.33, 5757209.32);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (12, 3, 10, 1827066.3, 18270663.0);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (99, 7, 5, 333640.42, 1668202.1);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (62, 10, 6, 1194314.2, 7165885.2);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (25, 23, 3, 168693.9, 506081.7);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (25, 28, 4, 1972684.44, 7890737.76);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (88, 20, 8, 1727713.6, 13821708.8);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (97, 45, 9, 1447724.23, 13029518.07);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (58, 43, 9, 424928.24, 3824354.16);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (77, 24, 2, 1258260.86, 2516521.72);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (81, 1, 4, 853517.52, 3414070.08);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (53, 25, 4, 149643.62, 598574.48);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (55, 6, 1, 702528.94, 702528.94);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (47, 30, 7, 1521205.01, 10648435.07);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (81, 48, 5, 938695.07, 4693475.35);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (38, 33, 8, 1019983.94, 8159871.52);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (34, 26, 8, 1282602.87, 10260822.96);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (45, 47, 5, 970367.1, 4851835.5);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (58, 31, 10, 965023.63, 9650236.3);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (89, 35, 6, 1604182.98, 9625097.88);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (52, 11, 10, 1984775.33, 19847753.3);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (93, 37, 2, 1195112.89, 2390225.78);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (94, 20, 1, 1187627.23, 1187627.23);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (84, 21, 2, 1483479.82, 2966959.64);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (79, 24, 5, 1215424.11, 6077120.55);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (31, 11, 5, 199951.93, 999759.65);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (7, 15, 10, 1492376.26, 14923762.6);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (54, 13, 10, 1148069.96, 11480699.6);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (57, 38, 1, 791033.29, 791033.29);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (44, 37, 4, 1050410.44, 4201641.76);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (73, 49, 6, 1741786.92, 10450721.52);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (85, 45, 10, 109774.72, 1097747.2);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (73, 24, 7, 655876.72, 4591137.04);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (82, 11, 3, 243655.73, 730967.19);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (45, 11, 1, 1448594.13, 1448594.13);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (69, 33, 6, 185532.08, 1113192.48);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (57, 37, 6, 128717.31, 772303.86);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (57, 46, 8, 1223611.33, 9788890.64);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (93, 29, 10, 358434.87, 3584348.7);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (55, 22, 9, 1030502.55, 9274522.95);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (50, 13, 2, 871466.17, 1742932.34);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (20, 3, 3, 1283707.04, 3851121.12);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (25, 37, 7, 1949568.73, 13646981.11);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (47, 36, 7, 1920909.8, 13446368.6);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (78, 4, 3, 628837.15, 1886511.45);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (29, 4, 10, 361719.05, 3617190.5);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (82, 37, 6, 1673582.75, 10041496.5);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (39, 3, 7, 1200138.66, 8400970.62);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (55, 5, 6, 1521485.34, 9128912.04);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (63, 11, 3, 817198.46, 2451595.38);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (97, 30, 6, 1758538.06, 10551228.36);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (23, 12, 10, 1415307.35, 14153073.5);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (20, 33, 7, 1938824.91, 13571774.37);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (51, 8, 4, 222586.36, 890345.44);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (93, 41, 5, 1449292.4, 7246462.0);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (69, 42, 2, 697708.73, 1395417.46);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (67, 40, 8, 1219579.28, 9756634.24);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (69, 19, 1, 1333624.59, 1333624.59);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (87, 25, 4, 202820.97, 811283.88);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (82, 49, 8, 208453.28, 1667626.24);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (52, 38, 4, 581764.29, 2327057.16);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (9, 13, 10, 1725970.04, 17259700.4);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (68, 2, 2, 806407.22, 1612814.44);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (5, 2, 7, 683610.43, 4785273.01);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (23, 47, 1, 723266.43, 723266.43);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (81, 31, 3, 47528.03, 142584.09);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (17, 19, 4, 501391.11, 2005564.44);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (32, 25, 10, 1094614.45, 10946144.5);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (77, 27, 9, 1524244.79, 13718203.11);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (17, 1, 2, 65062.47, 130124.94);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (8, 44, 3, 258030.58, 774091.74);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (50, 5, 1, 1327498.92, 1327498.92);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (95, 43, 3, 1252027.48, 3756082.44);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (7, 36, 3, 115012.67, 345038.01);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (49, 38, 8, 915989.48, 7327915.84);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (24, 3, 7, 1258662.36, 8810636.52);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (63, 46, 6, 1335268.7, 8011612.2);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (18, 17, 5, 360387.55, 1801937.75);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (59, 1, 3, 563278.1, 1689834.3);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (68, 20, 3, 1536138.14, 4608414.42);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (69, 8, 5, 1413735.94, 7068679.7);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (43, 1, 10, 526729.72, 5267297.2);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (97, 34, 7, 1752395.43, 12266768.01);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (19, 46, 1, 1271433.47, 1271433.47);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (78, 4, 4, 1075796.26, 4303185.04);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (28, 10, 5, 1722187.47, 8610937.35);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (54, 10, 1, 754502.69, 754502.69);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (86, 46, 2, 960856.48, 1921712.96);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (60, 30, 3, 1809317.98, 5427953.94);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (19, 2, 7, 1222480.05, 8557360.35);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (58, 43, 3, 683999.37, 2051998.11);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (86, 31, 3, 95849.47, 287548.41);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (76, 25, 3, 944622.62, 2833867.86);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (36, 14, 8, 1044503.49, 8356027.92);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (84, 37, 9, 765471.38, 6889242.42);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (83, 21, 6, 268501.46, 1611008.76);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (59, 4, 6, 1939301.19, 11635807.14);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (67, 4, 7, 1223741.53, 8566190.71);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (11, 45, 1, 263928.71, 263928.71);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (2, 24, 7, 450700.62, 3154904.34);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (62, 37, 2, 214816.71, 429633.42);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (47, 30, 7, 629547.43, 4406832.01);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (96, 9, 7, 1091302.67, 7639118.69);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (70, 13, 4, 1441557.13, 5766228.52);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (49, 14, 9, 1200489.58, 10804406.22);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (88, 43, 7, 1578553.55, 11049874.85);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (25, 5, 9, 1461682.67, 13155144.03);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (20, 39, 10, 1080883.17, 10808831.7);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (10, 43, 7, 916847.93, 6417935.51);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (27, 1, 8, 365890.91, 2927127.28);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (22, 24, 7, 1267415.58, 8871909.06);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (32, 22, 5, 1182247.17, 5911235.85);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (20, 4, 8, 839279.53, 6714236.24);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (44, 1, 6, 1351648.79, 8109892.74);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (65, 50, 10, 105596.08, 1055960.8);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (92, 19, 8, 349124.22, 2792993.76);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (15, 27, 7, 1981803.23, 13872622.61);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (16, 30, 3, 1755479.36, 5266438.08);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (10, 25, 9, 169407.82, 1524670.38);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (1, 34, 9, 527199.04, 4744791.36);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (62, 6, 7, 1889236.36, 13224654.52);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (97, 27, 8, 1632275.38, 13058203.04);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (51, 2, 8, 1995093.7, 15960749.6);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (82, 37, 8, 1394321.48, 11154571.84);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (39, 36, 3, 907013.53, 2721040.59);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (30, 31, 8, 1149202.57, 9193620.56);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (52, 20, 9, 1818700.29, 16368302.61);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (77, 49, 1, 1006566.36, 1006566.36);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (48, 41, 8, 613825.11, 4910600.88);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (31, 15, 6, 1210379.59, 7262277.54);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (68, 50, 1, 1087763.84, 1087763.84);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (5, 4, 3, 845901.89, 2537705.67);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (98, 20, 3, 1538083.37, 4614250.11);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (4, 11, 8, 635218.41, 5081747.28);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (65, 16, 1, 44395.84, 44395.84);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (87, 32, 8, 1544801.4, 12358411.2);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (3, 27, 6, 525168.63, 3151011.78);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (20, 17, 1, 290340.6, 290340.6);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (88, 43, 4, 237530.23, 950120.92);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (92, 31, 5, 707546.19, 3537730.95);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (71, 28, 6, 1198764.66, 7192587.96);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (38, 28, 1, 223692.81, 223692.81);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (86, 47, 6, 977035.03, 5862210.18);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (56, 31, 6, 149016.38, 894098.28);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (75, 13, 9, 1516758.89, 13650830.01);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (37, 13, 1, 1971260.04, 1971260.04);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (75, 28, 1, 1528316.63, 1528316.63);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (22, 11, 8, 727119.16, 5816953.28);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (16, 25, 4, 1583522.13, 6334088.52);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (26, 37, 2, 987910.5, 1975821.0);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (7, 36, 5, 982122.46, 4910612.3);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (100, 48, 10, 1988336.27, 19883362.7);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (90, 6, 4, 1731098.49, 6924393.96);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (23, 11, 8, 815448.19, 6523585.52);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (91, 36, 4, 1375215.02, 5500860.08);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (90, 15, 7, 833483.46, 5834384.22);
INSERT INTO CHI_TIET_HOA_DON
    (hoadon_id, dichvu_id, so_luong, don_gia, tong_gia)
    VALUES
    (30, 47, 6, 967649.61, 5805897.66);

-- 21. THANH_TOAN
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (93, '2025-05-29', 1306538.96, 'Q', 'P', N'c439f34a-c963-4fe0-afae-5a3bb9096a04', N'Làm dưới như như.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (42, '2025-05-06', 144630.43, 'T', 'P', N'69599354-06e8-4a01-ab5c-5cd1e7ca430e', N'Từ cũng bạn từng rất sẽ.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (14, '2025-04-09', 1602504.35, 'Q', 'C', N'55e7d67e-ae6a-44a9-a89c-5bc7a0187b4d', N'Nhưng vẫn của thế một lớn.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (53, '2025-03-31', 1007082.61, 'Q', 'F', N'30b9f609-1570-4c62-9832-c9e233aa3918', N'Hoặc đang điều tôi với.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (43, '2025-04-15', 2142585.25, 'Q', 'F', N'dbeece42-3be4-478b-b4ae-3dd3447e6046', N'Lớn có của vẫn nơi.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (63, '2025-05-20', 416515.26, 'Q', 'P', N'b8a6acd6-9988-4356-95fa-c783a5998165', N'Như các nơi như tôi nào chỉ.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (5, '2025-04-07', 481679.61, 'C', 'C', N'c79f25ee-fefa-4243-a00c-54e9b096ebf5', N'Nhưng đã như có không của của một.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (89, '2025-05-29', 1424527.38, 'Q', 'C', N'cf5d777f-0083-4f1b-8b21-6f91e25bd3ab', N'Vậy nào rất sau hơn bên.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (21, '2025-04-01', 4529381.87, 'T', 'F', N'8ea995cd-7489-49b0-b025-f1e11e177c0b', N'Cái lớn cũng được đi từng.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (30, '2025-05-23', 2873916.19, 'C', 'P', N'c9a20e34-0b58-4fd6-a9e4-93f04d0eec27', N'Không giữa hoặc.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (83, '2025-04-24', 1404196.48, 'Q', 'F', N'bea74ba7-aaa4-4956-acf0-7bda0616c7bc', N'Thay thay như của cũng để này.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (43, '2025-05-31', 4533458.26, 'Q', 'C', N'20188f42-4d29-446d-98e2-cd3639f4faf9', N'Cũng cho một thế của mỗi bạn.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (72, '2025-05-29', 792083.32, 'T', 'F', N'4be644a6-d41f-4278-a8a9-02151851c006', N'Về nếu vậy để nơi.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (16, '2025-05-31', 634688.98, 'Q', 'C', N'f84d77df-bc48-4fc4-9f8c-57c66330a015', N'Cũng bên tại để có.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (45, '2025-04-19', 590578.85, 'Q', 'P', N'b36e7613-0290-445d-aafb-9fdaf6d1cf46', N'Như giống vẫn khi đó nơi hơn.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (67, '2025-04-04', 2187821.14, 'C', 'P', N'0a8e824e-fc0a-49ab-bb46-8f75009faaba', N'Giống vẫn nào vài có.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (15, '2025-05-25', 4422226.19, 'C', 'F', N'0cc4fc28-715a-4a55-886f-f3dfca226f80', N'Như mà để cũng.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (41, '2025-05-16', 4763155.19, 'Q', 'F', N'ed2bf943-c767-4920-8cf9-28a200eef70a', N'Để chưa bạn trong đang từ khi.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (7, '2025-04-12', 596553.79, 'T', 'F', N'22883aba-5923-451e-8d69-0b1a9f9783f9', N'Giống về sau tại.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (43, '2025-04-23', 374780.48, 'Q', 'P', N'ba761481-c68d-4833-8bc1-429324455479', N'Cho về với.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (12, '2025-04-14', 1293984.37, 'C', 'F', N'72ef9d72-86c3-4268-aec0-157a3aceea2c', N'Tự gần điều bên như.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (100, '2025-05-09', 3321583.9, 'C', 'P', N'fe23ab59-b704-4f2d-a624-ee1f9bec75a4', N'Vẫn trong đến làm khiến.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (29, '2025-05-18', 2538134.64, 'C', 'P', N'3c5b7eec-da12-4c2f-bc59-5d50a8c0e9f7', N'Cho để được thay như trong giống.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (4, '2025-05-31', 3726253.74, 'C', 'C', N'eab03393-89f5-402a-afc0-cb32aeb7a344', N'Giống đi với về.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (17, '2025-05-14', 1382453.44, 'T', 'P', N'4e9ab4a6-b461-4fa7-81f6-01688be877cc', N'Dưới số cho nơi đó vậy như.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (28, '2025-05-23', 995700.5, 'C', 'P', N'3ed13cd2-464d-40de-96f6-cbf82bbba246', N'Một làm để nếu như và.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (39, '2025-03-22', 2779560.17, 'C', 'F', N'b6787450-6433-4940-b8f8-06b579c075fa', N'Khiến để như như bạn cách tự.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (11, '2025-05-14', 2442008.6, 'C', 'P', N'e628d7d0-af7b-4d00-b16a-90e274a1be10', N'Tại trong người đang người nào như.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (82, '2025-05-24', 2031290.37, 'C', 'C', N'a2eb0848-4e7b-4d4a-84c9-26ead9a638dc', N'Cũng sẽ như như hơn chưa sẽ.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (27, '2025-04-22', 3118304.41, 'C', 'F', N'792ca505-da96-414f-af8b-1d3afe775172', N'Về theo mỗi người.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (93, '2025-05-02', 34222.41, 'C', 'C', N'269d18dd-4ad5-49b1-9073-090d5f41a2a0', N'Khi mà đang.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (48, '2025-05-31', 4849961.01, 'T', 'C', N'20f12a02-bb24-40e2-a0e5-6092df1eeaea', N'Như vài để là chưa như từ.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (13, '2025-03-18', 2892471.0, 'C', 'P', N'd6460c24-9a5b-4ae9-b128-22b188808f71', N'Vì tự và điều như như.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (90, '2025-05-17', 359240.7, 'Q', 'F', N'9058b619-9931-4524-b446-0a287f15d868', N'Nếu này nơi này để điều vài nhưng.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (44, '2025-05-28', 87440.64, 'T', 'C', N'2ad8ced5-bafa-4523-8abc-14d43cd93faa', N'Có một đó là theo thì tự.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (78, '2025-04-28', 22157.26, 'C', 'P', N'e68ba0ff-e9dd-4d2c-a23b-e3ba66f8986f', N'Vậy về có khiến.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (96, '2025-05-26', 3095162.22, 'T', 'F', N'a3988f51-3a8f-48ec-a859-da3e2d9db089', N'Khiến của và vài.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (77, '2025-04-02', 2915484.19, 'T', 'C', N'f31ba9f0-efa1-4c4a-8a4f-fc6763a08b1f', N'Của để sau để thay để trong.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (57, '2025-04-25', 4052211.7, 'C', 'F', N'72005550-1ad1-4cf3-9419-43b34bc78156', N'Trong dưới khiến để người.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (49, '2025-05-31', 1992602.25, 'T', 'P', N'001da806-4af3-48de-b9bf-871f2e32a646', N'Có đã nhưng để.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (100, '2025-05-29', 467604.67, 'T', 'C', N'9c2f9168-46bd-4420-ab68-f71e60e117df', N'Đi vài từng bạn số có.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (30, '2025-05-27', 1471735.1, 'T', 'C', N'86d22649-8165-46ed-8246-177a17bb8437', N'Của trong cách như với như từ.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (27, '2025-05-08', 271396.56, 'C', 'P', N'8d9ee299-2bc9-4f18-99b3-567fcb004fc6', N'Mỗi không một tôi từng.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (96, '2025-05-03', 110707.01, 'C', 'C', N'5a71fc7e-f2b7-498e-8058-6df0826f6229', N'Về giống đó chỉ vì.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (31, '2025-05-05', 716997.61, 'Q', 'P', N'7856e8f3-b3f6-4e04-890b-57f7c9016e21', N'Đúng có gần một để bạn nơi.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (18, '2025-05-22', 1823479.88, 'Q', 'P', N'd02dd43b-15bb-46e9-87e2-4f12eabbadce', N'Chưa như thay sau làm đó.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (3, '2025-05-23', 2168766.14, 'T', 'P', N'963d8253-86aa-4f39-aee0-fea0ed570744', N'Vậy cái bạn để.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (51, '2025-05-06', 3456023.23, 'Q', 'C', N'06afaf64-841c-4332-9572-ac531ab78905', N'Điều các từ.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (65, '2025-05-23', 3248515.03, 'T', 'F', N'9fa1ec73-e0b9-4c14-88dd-109da3865328', N'Rất thì từ chỉ như.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (98, '2025-05-12', 3274615.82, 'T', 'C', N'd31f4704-d70a-46b7-bec3-615410aa071e', N'Có bên thế như mỗi.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (95, '2025-05-21', 2330912.92, 'Q', 'P', N'a7242152-c1af-401a-8ef7-3b52e9609f8e', N'Một như có vẫn từ của hơn.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (63, '2025-05-03', 1774096.46, 'T', 'F', N'496729fc-3d0d-423b-b373-be313eb99cb5', N'Cho khi có.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (72, '2025-05-16', 3199107.58, 'Q', 'F', N'74c13be0-9883-45f9-a5a5-7acab9f78bbc', N'Vì cái nếu với khiến để.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (88, '2025-05-18', 3735103.9, 'Q', 'P', N'953e2ded-98ca-4ca3-a5b7-7cf4dc89763d', N'Khiến với có đúng này người là.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (68, '2025-05-01', 1858612.65, 'C', 'F', N'1b6e0bb5-c164-47b3-a140-69d502c7a65c', N'Cũng rất giữa đã như.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (65, '2025-05-28', 1542170.15, 'T', 'F', N'ccf0c85d-48cd-4bdc-bfde-3205f54f5377', N'Bạn thì nhưng như như không.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (23, '2025-04-09', 652891.23, 'C', 'F', N'77cf01e7-7f7a-488d-b8ca-8722f4193dd2', N'Trong đến từng nhiều đó trong.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (86, '2025-04-01', 4409713.67, 'C', 'C', N'82f119b9-bdf4-4ef0-9502-22f79100378f', N'Tại làm cũng.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (36, '2025-04-30', 4983323.96, 'Q', 'C', N'a9dde1b8-1e58-49c1-b9af-4a110a7b1263', N'Cho thay tự.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (11, '2025-04-17', 1327087.37, 'C', 'P', N'57d3654a-8c81-4fac-877e-d55a860e4e8d', N'Làm hơn gần nhiều sẽ.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (39, '2025-04-02', 2481457.19, 'Q', 'P', N'40d0c3c8-0c4b-4483-aace-c6c3e06eb73e', N'Vẫn cái này vì của khiến một.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (61, '2025-05-09', 1963123.77, 'Q', 'F', N'2de5b823-7979-424a-a55d-b2db9f9850aa', N'Với nhiều điều và giống.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (86, '2025-03-25', 3272821.19, 'C', 'F', N'360a5430-0609-4d49-b0da-407297d9acaf', N'Được và đã cho.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (40, '2025-05-26', 2753985.64, 'C', 'C', N'1bf4f174-64e1-4fcb-b2fc-e66bd7f94956', N'Theo như từ bên bạn như vì.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (57, '2025-05-24', 4496312.98, 'Q', 'C', N'a1c744aa-edda-4fc9-9fc4-33ed8c952d92', N'Lớn điều khiến chưa chỉ.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (20, '2025-04-12', 957779.96, 'T', 'P', N'e1e320b8-e32f-45da-a131-336418695efe', N'Để các cái chưa bên khi của.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (25, '2025-05-24', 2010943.32, 'C', 'C', N'6b4f0481-abb2-400c-9d18-1db6d36fbb8a', N'Và trong nếu đến đúng để.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (82, '2025-05-16', 581653.09, 'C', 'F', N'74113458-9525-4a38-a1b1-ac693a92ca2d', N'Để các đó đến mà từ sẽ mỗi.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (27, '2025-05-26', 1534126.64, 'C', 'F', N'9f423a9e-d23a-4612-bb72-68b1e52a0725', N'Của cho giữa cho tại điều như.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (37, '2025-05-18', 4270756.54, 'C', 'C', N'8b596d65-b71a-4750-8871-6a0582ca12a9', N'Từ theo mà như.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (67, '2025-04-10', 3743433.07, 'C', 'F', N'2114295c-5f58-4240-88f2-b42f9ceae7df', N'Và nhiều cho cũng với.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (74, '2025-05-10', 4073133.94, 'C', 'P', N'416d20eb-902f-4df5-8e52-2a3f6e69c22b', N'Trong trong tại người.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (43, '2025-05-02', 743927.34, 'Q', 'F', N'3178687b-0b65-4d75-a18a-1a01e697117a', N'Các thì nhiều được.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (17, '2025-05-27', 341097.87, 'Q', 'F', N'545c0c34-51d9-4a9d-8cc4-8387db5a4a7a', N'Thay thay tự từng điều vì.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (67, '2025-03-23', 590800.69, 'T', 'C', N'c6779c39-86d1-4780-a2a1-86ab11865f4c', N'Từ không hơn dưới nhưng người.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (73, '2025-05-15', 2670726.24, 'Q', 'F', N'0b74560b-59d9-408c-a9cb-1b75ad467d2e', N'Lớn gần nếu thì bên hơn chưa.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (57, '2025-05-27', 2043028.11, 'Q', 'P', N'3db23fe2-8e9a-4443-a457-3134f5cf42ec', N'Thế gần cái đến như chỉ.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (92, '2025-05-30', 885205.67, 'C', 'P', N'80adeec0-c956-498d-a3bd-ae9798a78214', N'Về nhiều như này một đúng tại.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (64, '2025-05-15', 799669.87, 'T', 'P', N'f928a64c-ac7e-481a-b490-84b5f8a45ecb', N'Các đến nhiều một hơn cũng để.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (16, '2025-04-30', 2758050.88, 'Q', 'F', N'6d7f4438-2f77-4caf-80ae-b2e4de081a8d', N'Trong nếu lớn hoặc tự của.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (58, '2025-05-23', 1686027.64, 'C', 'F', N'5dcf1618-dec3-49eb-9b4f-a8de4a4a961d', N'Đi nhưng khi điều để này với.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (94, '2025-05-26', 2556143.01, 'T', 'P', N'56db3d3e-225b-4565-bca1-fbb24871b846', N'Các lớn hơn về lớn đã khi.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (65, '2025-03-31', 1436074.09, 'T', 'C', N'fb943e32-71f4-4e5c-8c8e-b62fe97f7c4d', N'Vẫn tôi như đang thế một hơn vậy.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (34, '2025-05-06', 4855015.13, 'T', 'F', N'15a82560-6136-40d4-a31c-3e907b7c9906', N'Là vẫn nơi.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (87, '2025-03-13', 3384116.51, 'T', 'P', N'a1ef96c4-5508-4518-aa9c-d9fe8455faf2', N'Dưới theo từng.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (8, '2025-05-16', 3704905.03, 'C', 'P', N'7e50259a-ad27-44ad-add3-992240ae7af7', N'Vẫn có đi.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (30, '2025-04-28', 3670762.75, 'T', 'P', N'b8340080-23c9-4f8a-a617-2332f60ddb96', N'Chỉ điều như đó.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (1, '2025-04-24', 1951950.54, 'Q', 'C', N'0e844227-3ba9-4a3a-9c4c-1473a09cbc5e', N'Có từng đang giữa.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (12, '2025-04-19', 3817732.69, 'T', 'F', N'68aa508c-8aa6-4108-9c4b-b606982df682', N'Đã như chưa là.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (85, '2025-05-25', 1487104.65, 'C', 'C', N'0708bd84-63b3-41cf-9571-62d2b2959cc9', N'Cũng nào từng.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (25, '2025-05-07', 3112980.47, 'C', 'F', N'07f9fd02-af95-41bf-836d-10b12171a94b', N'Từng được nếu điều trong.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (5, '2025-05-26', 943382.01, 'C', 'P', N'9eedfe88-8e3b-4144-803a-e427fa2fd4fe', N'Vẫn với bên với nơi.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (29, '2025-04-30', 12258.07, 'C', 'P', N'eddba674-b4e0-495f-86d2-c82eec6e9eaf', N'Đến điều theo nơi đang nếu tôi.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (55, '2025-05-18', 3181638.0, 'T', 'F', N'd324d330-dc2f-46df-8748-14f8ef15ac34', N'Có để mà tại như số.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (36, '2025-05-26', 1711427.32, 'Q', 'F', N'f94cadb9-5ab8-4903-8826-610dac4f6029', N'Điều nào sẽ nhưng.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (17, '2025-05-23', 4419108.18, 'C', 'P', N'4c3cc555-ab4d-46c9-9106-43cfc15fb638', N'Cái vài tôi về như rất.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (12, '2025-05-25', 2532208.32, 'T', 'P', N'fe8a931c-956e-474d-9d91-c8ea7be38f2a', N'Vì bạn thì của lớn để.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (19, '2025-05-10', 2744693.74, 'T', 'P', N'176468c5-0335-478a-94cb-ed0795dd0482', N'Để từng điều thay cách của gần.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (19, '2025-05-30', 3966937.79, 'C', 'F', N'1dc2399a-ff2f-4862-9522-53fb217660c9', N'Thế theo nếu.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (39, '2025-05-27', 2337190.96, 'C', 'P', N'3737b91b-2200-4da0-a773-a29b4b980436', N'Thế đến thay đi tôi một thế nào.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (20, '2025-05-19', 4751389.2, 'C', 'F', N'0318c7b9-6dd4-49f3-bdd1-de90cd396c10', N'Hoặc và bên lớn điều từ có.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (97, '2025-05-26', 4858345.52, 'T', 'F', N'193fc31a-2d9f-4eb4-b2c3-1410140beb31', N'Theo từ không đúng và như.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (3, '2025-05-17', 3591099.4, 'T', 'P', N'd2e8c686-d9ce-4969-b7e2-744d01db86b9', N'Để thế trong là từ dưới.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (41, '2025-05-28', 3517893.62, 'T', 'C', N'156a4643-07d2-407f-aafd-a4bd782a3f01', N'Rất giữa khiến giữa sẽ.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (7, '2025-05-09', 4925278.56, 'C', 'P', N'db06a153-c804-499a-bbd4-10db5607206d', N'Để gần điều đang làm của rất.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (66, '2025-05-12', 2111351.09, 'T', 'F', N'0f00ef7d-c8d4-44ac-9d4f-d72ecfba7030', N'Như thế hơn vài người để.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (36, '2025-04-11', 4067864.48, 'Q', 'C', N'6facb617-45e8-46e4-8c66-fd166cc30d12', N'Sau hơn chưa các nào đúng như.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (91, '2025-04-07', 132716.81, 'T', 'P', N'c5cd829b-953f-46ba-8fb3-96aa861c9738', N'Mỗi của hơn giữa này đó với.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (34, '2025-05-31', 87892.01, 'Q', 'F', N'd6b519a7-58de-4c11-a0ec-d361ce852aff', N'Tôi sẽ như làm vì đến đó.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (76, '2025-03-20', 3384687.35, 'C', 'C', N'6e9b647c-21c5-4bfe-83eb-4c3d77144f7c', N'Để người trong mà hoặc nếu.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (93, '2025-04-12', 2477903.69, 'C', 'C', N'4a07bc6a-fdf8-4b34-922b-5ae47732600f', N'Bên bên đã thế của đang một.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (67, '2025-03-07', 3669274.34, 'Q', 'P', N'1599fcc5-8804-4dce-ab07-2f24f07cb3f3', N'Để như đi hơn về với.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (73, '2025-05-28', 3295787.95, 'C', 'F', N'6c120804-2a19-4a4c-a732-a11ac8049f9d', N'Làm trong khi điều.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (30, '2025-05-18', 1252707.2, 'T', 'F', N'da16031c-9c1d-4eb1-aabe-78814db44a09', N'Từ từ sẽ như nào.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (9, '2025-05-22', 4131987.9, 'Q', 'P', N'7bc2c780-83bc-46e5-9dc0-8516b2811032', N'Từng có tại có không không.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (32, '2025-05-13', 2898598.3, 'T', 'C', N'3de1e5dc-a0c3-4011-a760-a3cb64052712', N'Có từng khiến đi.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (6, '2025-03-22', 4053543.55, 'Q', 'C', N'ccff65cf-d82f-4f74-a62e-300c3ef76cd4', N'Có trong đang điều.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (11, '2025-04-15', 4501160.61, 'Q', 'F', N'7fe8ca2c-a658-4b18-8e54-3d011c8e1cf0', N'Khi người nhưng và.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (80, '2025-05-18', 2802072.82, 'Q', 'F', N'b7f790aa-cfa0-4de5-973f-0ad307aee3b8', N'Dưới về của đến nhưng đến cái với.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (32, '2025-05-23', 1200080.54, 'C', 'P', N'1113bc49-973b-4049-ba5e-0a8aa9e4fd36', N'Để từ đang người đang.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (45, '2025-05-17', 4160010.88, 'Q', 'F', N'3830065e-efbb-406d-a837-e4dd39643447', N'Đang để như để được số cho.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (59, '2025-05-28', 3672800.16, 'T', 'C', N'159f7f27-cf53-452e-ac18-ed4d1c6242ee', N'Vài hơn là để chưa cũng mà.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (1, '2025-04-16', 3037099.2, 'T', 'F', N'791ba6c7-8871-4463-87bc-a99c06fafc2d', N'Theo giữa tôi của của tự đã tự.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (26, '2025-05-04', 3845913.92, 'C', 'F', N'be8ff06d-4968-498b-a4b7-7ec8ac3e33c5', N'Chưa mà tại đi như cũng.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (75, '2025-05-25', 3660731.89, 'Q', 'P', N'b4b5e2ef-b50d-4c73-8667-fdcd8d4bcc90', N'Chỉ như các.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (8, '2025-05-28', 4368902.11, 'T', 'P', N'01bfc79f-6581-4598-8c17-ae26530351a0', N'Hơn được như để chỉ.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (67, '2025-03-06', 3882333.3, 'C', 'F', N'fef72747-2cfc-43fc-bf55-c2b958a638f3', N'Đã và khi tại vì.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (97, '2025-05-25', 947145.53, 'T', 'C', N'923cef49-e4e2-4e16-b150-0b4e5b0e250b', N'Nơi vài về đúng số khiến.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (67, '2025-04-21', 1142580.24, 'C', 'C', N'6c934caf-2f71-419d-8499-bb81b10eb4c0', N'Như tự lớn như.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (32, '2025-05-15', 4004739.77, 'T', 'C', N'b10ca841-3f76-47c4-a895-f779962f89f6', N'Từ khi vẫn vẫn.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (32, '2025-04-28', 2462111.91, 'Q', 'P', N'b31a2135-9094-45e3-9ada-182e07f59aae', N'Hoặc vì cho lớn.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (27, '2025-04-11', 4433070.16, 'Q', 'C', N'4a56577f-c96d-4af0-b533-abe8a7f54165', N'Sau cách được giữa vậy vẫn.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (60, '2025-05-28', 1634552.27, 'T', 'F', N'5d3ded1c-eba4-4827-9af2-915c285ac643', N'Các sau đã gần dưới của giống người.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (69, '2025-05-19', 4855996.4, 'C', 'P', N'83273b0b-06fb-49da-8d47-99da307e0f53', N'Như để và số số.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (61, '2025-04-23', 2836383.72, 'Q', 'F', N'6dba1c66-4e44-4abc-a0ac-b8248ddcc7b0', N'Rất của chỉ từ.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (7, '2025-05-18', 3585293.44, 'C', 'P', N'42dce587-3aa5-4dd7-b507-3d7bc1949e48', N'Làm tự chỉ nhiều.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (66, '2025-05-28', 214292.74, 'C', 'F', N'ff384f4f-f51e-473f-866f-fb722dbc8f70', N'Cái cách chưa không giống sau thay.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (3, '2025-03-22', 4619325.37, 'C', 'P', N'5da2a48e-038e-45ce-bf10-43e6231eb2c1', N'Là giống của theo của.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (50, '2025-05-20', 156102.57, 'T', 'P', N'5c18135a-2f38-4d0e-b301-8c68ea0f3604', N'Đã để khiến.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (33, '2025-05-01', 4808379.84, 'C', 'F', N'479929ce-06ab-4f63-bc08-eff30ead5f41', N'Nếu với trong.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (30, '2025-05-08', 249675.31, 'Q', 'F', N'8a50bb48-38f4-41be-81b5-68017a11ce66', N'Tại cũng với như có sẽ.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (79, '2025-05-30', 65209.12, 'C', 'F', N'f4339649-e13b-455a-b598-0830b56427ef', N'Hơn mà tại.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (57, '2025-05-15', 2111147.35, 'Q', 'C', N'6f04acfc-7aa0-4df5-a110-4e4230fce5be', N'Thì số dưới vậy.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (11, '2025-04-26', 3120855.29, 'T', 'P', N'ea75abda-c778-4ed0-ac6b-47b2e93d1288', N'Của từng thì đến gần vẫn từng trong.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (35, '2025-04-19', 380613.74, 'Q', 'P', N'0c9b9c1c-b15a-4314-b393-5f2e3a61b414', N'Từ của bạn để của đó được bên.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (6, '2025-05-07', 3743453.87, 'C', 'F', N'cab7619b-e41e-45aa-852d-16d9748d4502', N'Các chưa rất lớn mỗi chỉ.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (4, '2025-04-14', 463471.35, 'C', 'P', N'44967aee-8157-4fc9-8978-ff876ea4c38e', N'Vài hơn hơn đang với như người.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (63, '2025-05-23', 4602480.48, 'Q', 'C', N'fb9b59ac-8171-4498-b06e-5aa07b1cf9b9', N'Theo vài giữa đi đi với vẫn.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (14, '2025-05-06', 1267467.56, 'Q', 'P', N'c86c3b4b-4ecc-4c25-970f-95dd6bc820b7', N'Cũng tại trong gần đi.');
INSERT INTO THANH_TOAN
    (hoadon_id, ngay_thanh_toan, so_tien_thanh_toan, phuong_thuc_thanh_toan, trang_thai, ma_giao_dich, ghi_chu)
    VALUES
    (7, '2025-05-26', 1977196.37, 'T', 'C', N'eb99a1ae-6a1e-4cdc-b7e4-de3bbd0495aa', N'Của nếu từng đi hoặc lớn này.');