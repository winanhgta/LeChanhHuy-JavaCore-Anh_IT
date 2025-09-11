package Buoi_2.Bai3;

public class Main {
    public static void main(String[] args) {
        // Tạo ít nhất 3 sản phẩm
        SanPham sp1 = new SanPham("Laptop Dell", 15000000);
        SanPham sp2 = new SanPham("Điện thoại Samsung", 12000000);
        SanPham sp3 = new SanPham("Tai nghe Sony", 2000000);

        // In thông tin từng sản phẩm
        sp1.displayInfo();
        sp2.displayInfo();
        sp3.displayInfo();

        // In tổng số sản phẩm đã tạo
        SanPham.displayTotalCount();
    }
}
