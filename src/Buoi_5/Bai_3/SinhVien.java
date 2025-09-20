package Buoi_5.Bai_3;

public class SinhVien extends Nguoi {
    private String maSV;

    // Constructor
    public SinhVien(String ten, int tuoi, String maSV) {
        super(ten, tuoi); // gọi constructor của lớp cha
        this.maSV = maSV;
    }

    // Phương thức riêng của SinhVien
    public void hocTap() {
        System.out.println("Sinh viên " + ten + " (Mã SV: " + maSV + ") đang học tập.");
    }
}
