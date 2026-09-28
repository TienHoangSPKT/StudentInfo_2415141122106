package com.example.studentinfo_2415141122106

data class SinhVien(
    val mssv: String,
    val hoTen: String,
    val lop: String,
    val tuoi: Int,
    val diem: Double
)

fun Double.kiemTraTrangThai(): String {
    return if (this >= 5.0) "Đạt" else "Chưa đạt"
}