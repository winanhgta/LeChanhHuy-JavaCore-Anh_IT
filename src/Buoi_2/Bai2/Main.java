package Buoi_2.Bai2;

public class Main {
    public static void main(String[] args) {
        // Tạo ít nhất 2 học sinh
        HocSinh hs1 = new HocSinh("Nguyễn Văn A", 20, 8.5);
        HocSinh hs2 = new HocSinh("Trần Thị B", 19, 7.0);
        HocSinh hs3 = new HocSinh("Lê Văn C", 21, 5.8);

        // Hiển thị thông tin
        hs1.displayInfo();
        hs2.displayInfo();
        hs3.displayInfo();

        // Thay đổi tên trường (ảnh hưởng tới tất cả)
        HocSinh.setTenTruong("Đại học Bách Khoa");

        System.out.println("Sau khi đổi tên trường:");
        hs1.displayInfo();
        hs2.displayInfo();
        hs3.displayInfo();
    }
}
