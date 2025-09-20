package Buoi_5.Bai_4;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng DongVat chứa cả chó và mèo
        DongVat[] dsDongVat = new DongVat[4];
        dsDongVat[0] = new Cho();
        dsDongVat[1] = new Meo();
        dsDongVat[2] = new Cho();
        dsDongVat[3] = new Meo();

        // Duyệt mảng và gọi phương thức keu()
        for (DongVat dv : dsDongVat) {
            dv.keu();  // tính đa hình thể hiện ở đây
        }
    }
}
