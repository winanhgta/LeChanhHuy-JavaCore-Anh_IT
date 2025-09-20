package Buoi_5.Bai_3;

public class Main {
    public static void main(String[] args) {
        // Tạo một sinh viên
        SinhVien sv1 = new SinhVien("Nguyễn Văn A", 20, "SV001");

        // Gọi phương thức từ lớp cha và lớp con
        sv1.gioiThieu();
        sv1.hocTap();
    }
}
