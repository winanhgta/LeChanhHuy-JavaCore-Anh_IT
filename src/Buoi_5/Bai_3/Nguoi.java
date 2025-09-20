package Buoi_5.Bai_3;

public class Nguoi {
    protected String ten;
    protected int tuoi;

    // Constructor
    public Nguoi(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    // Phương thức giới thiệu
    public void gioiThieu() {
        System.out.println("Xin chào, tôi tên là " + ten + ", năm nay " + tuoi + " tuổi.");
    }
}

