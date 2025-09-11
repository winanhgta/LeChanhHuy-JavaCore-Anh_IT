package Buoi_2.Bai1;

public class Main {
    public static void main(String[] args) {
        // Tạo 2 tài khoản
        BankAccount acc1 = new BankAccount("123456", 10000000);
        BankAccount acc2 = new BankAccount("654321", 20000000);

        // In thông tin
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();

        // Thay đổi lãi suất cho tất cả
        BankAccount.setInterestRate(0.07); // 7%

        System.out.println("Sau khi thay đổi lãi suất:");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}