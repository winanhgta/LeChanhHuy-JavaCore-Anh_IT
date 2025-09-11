package Buoi_2;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bài 1
        System.out.print("Nhập vào một số nguyên: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }

        // Bài 2
        System.out.print("Nhập vào tuổi: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Đủ điều kiện lái xe");
        } else {
            System.out.println("Chưa đủ điều kiện");
        }

        // Bài 3
        System.out.print("Nhập điểm (0–100): ");
        int score = sc.nextInt();
        if (score >= 50) {
            System.out.println("Qua môn");
        } else {
            System.out.println("Trượt");
        }

        // Bài 4
        System.out.print("Nhập điểm (0–100): ");
        int diem = sc.nextInt();
        if (diem >= 85) {
            System.out.println("Giỏi");
        } else if (diem >= 65) {
            System.out.println("Khá");
        } else if (diem >= 50) {
            System.out.println("Trung bình");
        } else {
            System.out.println("Yếu");
        }

        System.out.print("Nhập một số nguyên: ");
        n = sc.nextInt();

        if (n > 0) {
            System.out.println("Số dương");
        } else if (n < 0) {
            System.out.println("Số âm");
        } else {
            System.out.println("Bằng 0");
        }

        sc.close();
    }
}
