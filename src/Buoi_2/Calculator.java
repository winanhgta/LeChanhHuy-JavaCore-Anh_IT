package Buoi_2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập vào 2 số
        System.out.print("Nhập số thứ nhất: ");
        double a = sc.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double b = sc.nextDouble();

        // Nhập toán tử
        System.out.print("Nhập toán tử (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;

        // Dùng switch-case để thực hiện phép tính
        switch (op) {
            case '+':
                result = a + b;
                System.out.println("Kết quả: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Kết quả: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Kết quả: " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Kết quả: " + result);
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0!");
                }
                break;
            default:
                System.out.println("Toán tử không hợp lệ!");
        }

        sc.close();
    }
}