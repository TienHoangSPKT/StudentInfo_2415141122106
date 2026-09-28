package com.example.studentinfo_2415141122106

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Ánh xạ các View từ giao diện XML bằng ID
        val tvMssv = findViewById<TextView>(R.id.tvMssv)
        val tvHoTen = findViewById<TextView>(R.id.tvHoTen)
        val tvLop = findViewById<TextView>(R.id.tvLop)
        val tvTuoi = findViewById<TextView>(R.id.tvTuoi)
        val tvDiem = findViewById<TextView>(R.id.tvDiem)
        val tvMoRong = findViewById<TextView>(R.id.tvMoRong)

        // 2. Tạo đối tượng Model SinhVien với thông tin cá nhân của bạn
        val sinhVien = SinhVien(
            mssv = "2415141122106",
            hoTen = "Nguyễn Tiến Hoàng",
            lop = "Khoa SPCN", // Bạn có thể sửa lại thành tên lớp chính xác
            tuoi = 20,
            diem = 8.5
        )

        // 3. Hiển thị thông tin lên giao diện
        tvMssv.text = "Mã sinh viên: ${sinhVien.mssv}"
        tvHoTen.text = "Họ tên: ${sinhVien.hoTen}"
        tvLop.text = "Lớp: ${sinhVien.lop}"
        tvTuoi.text = "Tuổi: ${sinhVien.tuoi}"
        tvDiem.text = "Điểm: ${sinhVien.diem}"

        // 4. Sử dụng Extension Function (Yêu cầu mở rộng cho MSSV số chẵn)
        val trangThai = sinhVien.diem.kiemTraTrangThai()
        tvMoRong.text = "Trạng thái: $trangThai"
    }
}