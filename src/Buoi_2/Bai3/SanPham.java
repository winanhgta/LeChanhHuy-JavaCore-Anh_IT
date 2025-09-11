package Buoi_2.Bai3;

public class SanPham {
    // Biến instance
    private String tenSanPham;
    private double giaTien;

    // Biến static (dùng chung)
    private static int count = 0;

    // Constructor
    public SanPham(String tenSanPham, double giaTien) {
        this.tenSanPham = tenSanPham;
        this.giaTien = giaTien;
        count++; // mỗi lần tạo sản phẩm thì tăng
    }

    // Phương thức in thông tin sản phẩm
    public void displayInfo() {
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.printf("Giá: %,.0f VND%n", giaTien); // in đẹp có phân cách nghìn
        System.out.println("----------------------------");
    }

    // Phương thức static in tổng số sản phẩm
    public static void displayTotalCount() {
        System.out.println("Tổng số sản phẩm đã tạo: " + count);
    }
}



