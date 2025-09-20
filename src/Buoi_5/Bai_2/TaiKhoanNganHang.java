package Buoi_5.Bai_2;

public class TaiKhoanNganHang {
    // Thuộc tính private
    private String soTaiKhoan;
    private double soDu;

    // Constructor
    public TaiKhoanNganHang(String soTaiKhoan, double soDuBanDau) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDuBanDau;
    }

    // Phương thức nạp tiền
    public void napTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Nạp thành công " + soTien + " VND.");
        } else {
            System.out.println("Số tiền nạp phải > 0");
        }
    }

    // Phương thức rút tiền
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút thành công " + soTien + " VND.");
        } else {
            System.out.println("Số dư không đủ hoặc số tiền không hợp lệ!");
        }
    }

    // Phương thức xem số dư
    public void xemSoDu() {
        System.out.println("Số dư hiện tại của tài khoản " + soTaiKhoan + " là: " + soDu + " VND.");
    }
}
