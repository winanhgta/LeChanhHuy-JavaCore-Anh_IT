package Buoi_5.Bai_1;

public class HocSinh {

    // Thuộc tính (fields)
    String ten;
    int tuoi;
    String lop;

    // Constructor (khởi tạo nhanh đối tượng)
    public HocSinh(String ten, int tuoi, String lop) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    // Phương thức hocBai
    public void hocBai() {
        System.out.println(ten + " đang học bài.");
    }
}



