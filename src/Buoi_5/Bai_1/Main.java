package Buoi_5.Bai_1;

public class Main {
// Lớp chạy main

    public static void main(String[] args) {
        // Tạo ít nhất 2 học sinh
        HocSinh hs1 = new HocSinh("Nam", 16, "10A1");
        HocSinh hs2 = new HocSinh("Lan", 15, "9B");

        // Gọi phương thức hocBai()
        hs1.hocBai();
        hs2.hocBai();
    }
}