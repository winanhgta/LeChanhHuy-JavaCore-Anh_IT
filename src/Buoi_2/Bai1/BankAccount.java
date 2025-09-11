package Buoi_2.Bai1;
import java.text.DecimalFormat;
public class BankAccount {
    // Biến instance
    private String accountNumber;
    private double balance;

    DecimalFormat df = new DecimalFormat("#,###");

    // Biến static (chung cho mọi tài khoản)
    private static double interestRate = 0.05; // 5%

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setter lãi suất (nếu muốn thay đổi chung)
    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    // Phương thức tính tiền lãi
    public double calculateInterest() {
        double interest = balance * interestRate; // biến local
        return interest;
    }

    // In thông tin tài khoản
    public void displayAccountInfo() {
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Số dư: " + df.format(balance));
        System.out.println("Tiền lãi: " + df.format(calculateInterest()));
        System.out.println("--------------------------");
    }
}


