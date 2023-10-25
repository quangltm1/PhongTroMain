package com.example.phongtromain.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "PhongTro.db";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_PHONG = "Phong";
    public static final String COLUMN_PHONG_ID = "pId";
    public static final String COLUMN_PHONG_TENPHONG = "pTenPhong";
    public static final String COLUMN_PHONG_DIACHI = "pDiaChi";
    public static final String COLUMN_PHONG_MOTA = "pMoTa";
    public static final String COLUMN_PHONG_GIAPHONG = "pGiaPhong";
    public static final String COLUMN_PHONG_TIENDIEN = "pTienDien";
    public static final String COLUMN_PHONG_TIENNUOC = "pTienNuoc";
    public static final String COLUMN_PHONG_DATHUE = "pDaThue";

    public static final String TABLE_NGUOIDUNG = "NguoiDung";
    public static final String COLUMN_NGUOIDUNG_ID = "nId";
    public static final String COLUMN_NGUOIDUNG_HOTEN = "nHoTen";
    public static final String COLUMN_NGUOIDUNG_TENDANGNHAP = "nTenDangNhap";
    public static final String COLUMN_NGUOIDUNG_MATKHAU = "nMatKhau";
    public static final String COLUMN_NGUOIDUNG_SODIENTHOAI = "nSoDienThoai";
    public static final String COLUMN_NGUOIDUNG_EMAIL = "nEmail";
    public static final String COLUMN_NGUOIDUNG_CCCD = "nCCCD";
    public static final String COLUMN_NGUOIDUNG_ROLE = "nRole";

    public static final String TABLE_SUCO = "SuCo";
    public static final String COLUMN_SUCO_ID = "scId";
    public static final String COLUMN_SUCO_NGAYBAO = "scNgayBao";
    public static final String COLUMN_SUCO_LOAISUCO = "scLoaiSuCo";
    public static final String COLUMN_SUCO_MOTA = "scMoTa";
    public static final String COLUMN_SUCO_NGAYSUA = "scNgaySua";
    public static final String COLUMN_SUCO_DAXULY = "scDaXuLy";

    public static final String TABLE_HOPDONG = "HopDong";
    public static final String COLUMN_HOPDONG_ID = "hdId";
    public static final String COLUMN_HOPDONG_NGAYBATDAU = "hdNgayBatDau";
    public static final String COLUMN_HOPDONG_NGAYKETTHUC = "hdNgayKetThuc";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
