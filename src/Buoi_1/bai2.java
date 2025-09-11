package Buoi_1;

public class bai2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        // Hoán đổi không dùng biến trung gian
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);
    }

}
