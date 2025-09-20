package Buoi_5.Bai_2;

public class Main {
    // Class Main để chạy chương trình
    public static void main(String[] args) {
        // Tạo tài khoản
        TaiKhoanNganHang tk1 = new TaiKhoanNganHang("123456789", 500000);

        // Gọi các phương thức
        tk1.xemSoDu();
        tk1.napTien(200000);
        tk1.rutTien(100000);
        tk1.xemSoDu();
    }
}
