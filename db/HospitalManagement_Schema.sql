-- TẠO DATABASE
CREATE DATABASE BENH_VIEN_NIMBUS;
GO
USE BENH_VIEN_NIMBUS;
GO

-- 1. Bảng VAI_TRO
CREATE TABLE VAI_TRO (
    vaitro_id INT IDENTITY(1,1) PRIMARY KEY,
    ten_vai_tro NVARCHAR(50) NOT NULL,
    mo_ta NVARCHAR(250)
);
GO

-- 2. Bảng NGUOI_DUNG
CREATE TABLE NGUOI_DUNG (
    nguoidung_id INT IDENTITY(1,1) PRIMARY KEY,
    hoten NVARCHAR(50) NOT NULL,
    gioi_tinh CHAR(1),
    email VARCHAR(50),
    so_dien_thoai VARCHAR(15),
    mat_khau VARCHAR(255) NOT NULL,
    ngay_tao DATETIME DEFAULT GETDATE(),
    ngay_cap_nhat DATETIME DEFAULT GETDATE()
);
GO

-- 3. PHAN_QUYEN
CREATE TABLE PHAN_QUYEN (
    phanquyen_id INT IDENTITY(1,1) PRIMARY KEY,
    vaitro_id INT,
    nguoidung_id INT,
    FOREIGN KEY (vaitro_id) REFERENCES VAI_TRO(vaitro_id),
    FOREIGN KEY (nguoidung_id) REFERENCES NGUOI_DUNG(nguoidung_id)
);
GO

-- 4. CHUYEN_KHOA
CREATE TABLE CHUYEN_KHOA (
    chuyenkhoa_id INT IDENTITY(1,1) PRIMARY KEY,
    ten_khoa NVARCHAR(50),
    mo_ta NVARCHAR(250)
);
GO

-- 5. PHONG_KHAM
CREATE TABLE PHONG_KHAM (
    phongkham_id INT IDENTITY(1,1) PRIMARY KEY,
    so_phong VARCHAR(4),
    loai_phong CHAR(1),
    mo_ta NVARCHAR(250)
);
GO

-- 6. BENH
CREATE TABLE BENH (
    benh_id INT IDENTITY(1,1) PRIMARY KEY,
    ten_benh NVARCHAR(50),
    trieu_chung NVARCHAR(100),
    nguyen_nhan NVARCHAR(100),
    phong_ngua NVARCHAR(100),
    huong_dieu_tri NVARCHAR(100),
    ghi_chu NVARCHAR(100)
);
GO

-- 7. BAC_SI
CREATE TABLE BAC_SI (
    bacsi_id INT IDENTITY(1,1) PRIMARY KEY,
    nguoidung_id INT,
    chuyenkhoa_id INT,
    chung_chi NVARCHAR(200),
    trinh_do NVARCHAR(50),
    kinh_nghiem INT,
    ngay_tao DATE,
    ngay_cap_nhat DATE,
    FOREIGN KEY (nguoidung_id) REFERENCES NGUOI_DUNG(nguoidung_id),
    FOREIGN KEY (chuyenkhoa_id) REFERENCES CHUYEN_KHOA(chuyenkhoa_id)
);
GO

-- 8. BENH_NHAN
CREATE TABLE BENH_NHAN (
    benhnhan_id INT IDENTITY(1,1) PRIMARY KEY,
    nguoidung_id INT,
    bao_hiem VARCHAR(25),
    lien_he_khan_cap NVARCHAR(50),
    ngay_tao DATE,
    ngay_cap_nhat DATE,
    FOREIGN KEY (nguoidung_id) REFERENCES NGUOI_DUNG(nguoidung_id)
);
GO

-- 9. LICH_LAM_VIEC_BAC_SI
CREATE TABLE LICH_LAM_VIEC_BAC_SI (
    lichlv_id INT IDENTITY(1,1) PRIMARY KEY,
    bacsi_id INT,
    ngay DATE,
    ngay_tao DATE,
    ngay_cap_nhat DATE,
    FOREIGN KEY (bacsi_id) REFERENCES BAC_SI(bacsi_id)
);
GO

-- 10. LICH_PHONG_KHAM
CREATE TABLE LICH_PHONG_KHAM (
    lichphongkham_id INT IDENTITY(1,1) PRIMARY KEY,
    lichlv_id INT,
    phongkham_id INT,
    FOREIGN KEY (lichlv_id) REFERENCES LICH_LAM_VIEC_BAC_SI(lichlv_id),
    FOREIGN KEY (phongkham_id) REFERENCES PHONG_KHAM(phongkham_id)
);
GO

-- 11. LICH_KHAM
CREATE TABLE LICH_KHAM (
    lichkham_id INT IDENTITY(1,1) PRIMARY KEY,
    bacsi_id INT,
    benhnhan_id INT,
    thoi_gian_hen DATETIME,
    thoi_gian_den DATETIME,
    kieu_lich_kham CHAR(1), -- H: hẹn, T: tái khám, D: định kỳ
    trang_thai CHAR(1),
    ghi_chu NVARCHAR(250),
    ngay_tao DATETIME,
    ngay_cap_nhat DATETIME,
    FOREIGN KEY (bacsi_id) REFERENCES BAC_SI(bacsi_id),
    FOREIGN KEY (benhnhan_id) REFERENCES BENH_NHAN(benhnhan_id)
);
GO

-- 12. BENH_AN
CREATE TABLE BENH_AN (
    benhan_id INT IDENTITY(1,1) PRIMARY KEY,
    lichkham_id INT,
    bacsi_ket_luan_id INT,
    tom_tat NVARCHAR(100),
    ket_luan NVARCHAR(250),
    ghi_chu NVARCHAR(250),
    thoi_gian DATETIME,
    FOREIGN KEY (lichkham_id) REFERENCES LICH_KHAM(lichkham_id),
    FOREIGN KEY (bacsi_ket_luan_id) REFERENCES BAC_SI(bacsi_id)
);
GO

-- 13. HO_SO_BENH_AN
CREATE TABLE HO_SO_BENH_AN (
    hoso_id INT IDENTITY(1,1) PRIMARY KEY,
    benhan_id INT,
    benh_id INT,
    FOREIGN KEY (benhan_id) REFERENCES BENH_AN(benhan_id),
    FOREIGN KEY (benh_id) REFERENCES BENH(benh_id)
);
GO

-- 14. LICH_SU_DIEU_TRI
CREATE TABLE LICH_SU_DIEU_TRI (
    lsdieutri_id INT IDENTITY(1,1) PRIMARY KEY,
    benhan_id INT,
    ngay_dieu_tri DATE,
    ghi_chu NVARCHAR(250),
    FOREIGN KEY (benhan_id) REFERENCES BENH_AN(benhan_id)
);
GO

-- 15. PHUONG_PHAP_DIEU_TRI
CREATE TABLE PHUONG_PHAP_DIEU_TRI (
    ppdieutri_id INT IDENTITY(1,1) PRIMARY KEY,
    lsdieutri_id INT,
    ten_phuong_phap NVARCHAR(100),
    hieu_qua CHAR(1),
    FOREIGN KEY (lsdieutri_id) REFERENCES LICH_SU_DIEU_TRI(lsdieutri_id)
);
GO

-- 16. DON_THUOC
CREATE TABLE DON_THUOC (
    donthuoc_id INT IDENTITY(1,1) PRIMARY KEY,
    ppdieutri_id INT,
    ngay_phat_hanh DATETIME,
    FOREIGN KEY (ppdieutri_id) REFERENCES PHUONG_PHAP_DIEU_TRI(ppdieutri_id)
);
GO

-- 17. CHI_TIET_DON_THUOC
CREATE TABLE CHI_TIET_DON_THUOC (
    ctdonthuoc_id INT IDENTITY(1,1) PRIMARY KEY,
    donthuoc_id INT,
    ten_thuoc NVARCHAR(50),
    lieu_dung INT,
    tinh_thuong_xuyen INT,
    khoan_thoi_gian INT,
    FOREIGN KEY (donthuoc_id) REFERENCES DON_THUOC(donthuoc_id)
);
GO

-- 18. DICH_VU
CREATE TABLE DICH_VU (
    dichvu_id INT IDENTITY(1,1) PRIMARY KEY,
    benhan_id INT,
    ten_dich_vu NVARCHAR(100),
    mo_ta NVARCHAR(250),
    gia DECIMAL(18,2),
    FOREIGN KEY (benhan_id) REFERENCES BENH_AN(benhan_id)
);
GO

-- 19. HOA_DON
CREATE TABLE HOA_DON (
    hoadon_id INT IDENTITY(1,1) PRIMARY KEY,
    benhnhan_id INT,
    nguoidung_lap_hoadon_id INT,
    ngay_tao DATE,
    tong_tien DECIMAL(18,2),
    tong_tien_thanh_toan DECIMAL(18,2),
    tong_tien_con_no DECIMAL(18,2),
    FOREIGN KEY (benhnhan_id) REFERENCES BENH_NHAN(benhnhan_id),
    FOREIGN KEY (nguoidung_lap_hoadon_id) REFERENCES NGUOI_DUNG(nguoidung_id)
);
GO

-- 20. CHI_TIET_HOA_DON
CREATE TABLE CHI_TIET_HOA_DON (
    cthoadon_id INT IDENTITY(1,1) PRIMARY KEY,
    hoadon_id INT,
    dichvu_id INT,
    so_luong INT,
    don_gia DECIMAL(18,2),
    tong_gia DECIMAL(18,2),
    FOREIGN KEY (hoadon_id) REFERENCES HOA_DON(hoadon_id),
    FOREIGN KEY (dichvu_id) REFERENCES DICH_VU(dichvu_id)
);
GO

-- 21. THANH_TOAN
CREATE TABLE THANH_TOAN (
    thanhtoan_id INT IDENTITY(1,1) PRIMARY KEY,
    hoadon_id INT,
    ngay_thanh_toan DATE,
    so_tien_thanh_toan DECIMAL(18,2),
    phuong_thuc_thanh_toan CHAR(1),
    trang_thai CHAR(1),
    ma_giao_dich NVARCHAR(100),
    ghi_chu NVARCHAR(100),
    FOREIGN KEY (hoadon_id) REFERENCES HOA_DON(hoadon_id)
);

-- 22. QUAN_LY
CREATE TABLE quan_ly (
    quanly_id INT IDENTITY(1,1) PRIMARY KEY,
    nguoidung_id INT UNIQUE,
    chuc_vu NVARCHAR(50),
    ghi_chu NVARCHAR(250),
    ngay_tao DATE DEFAULT GETDATE(),
    ngay_cap_nhat DATE DEFAULT GETDATE(),
    FOREIGN KEY (nguoidung_id) REFERENCES NGUOI_DUNG(nguoidung_id)
);
GO

-- 23. LE_TAN
CREATE TABLE le_tan (
    letan_id INT IDENTITY(1,1) PRIMARY KEY,
    nguoidung_id INT UNIQUE,
    ca_lam CHAR(1), -- S: Sáng, C: Chiều, T: Tối
    ghi_chu NVARCHAR(250),
    ngay_tao DATE DEFAULT GETDATE(),
    ngay_cap_nhat DATE DEFAULT GETDATE(),
    FOREIGN KEY (nguoidung_id) REFERENCES NGUOI_DUNG(nguoidung_id)
);
GO


-- Thêm FK từ LICH_KHAM → LE_TAN
ALTER TABLE LICH_KHAM
ADD letan_id INT;

ALTER TABLE LICH_KHAM
ADD CONSTRAINT FK_LICHKHAM_LETAN
    FOREIGN KEY (letan_id) REFERENCES LE_TAN(letan_id);
GO

