package Buoi_2.Bai2;

public class HocSinh {
    // Biến instance
    private String ten;
    private int tuoi;
    private double gpa;

    // Biến static (dùng chung cho tất cả học sinh)
    private static String tenTruong = "Đại học CNTT";

    // Constructor
    public HocSinh(String ten, int tuoi, double gpa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gpa = gpa;
    }

    // Setter để thay đổi tên trường
    public static void setTenTruong(String newName) {
        tenTruong = newName;
    }

    // Phương thức hiển thị thông tin
    public void displayInfo() {
        // Biến local rank
        String rank;
        if (gpa >= 8.0) {
            rank = "Giỏi";
        } else if (gpa >= 6.5) {
            rank = "Khá";
        } else {
            rank = "Trung bình";
        }

        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("GPA: " + gpa);
        System.out.println("Xếp loại: " + rank);
        System.out.println("Trường: " + tenTruong);
        System.out.println("-----------------------------");
    }
}
