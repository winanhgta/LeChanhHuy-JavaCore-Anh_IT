package Buoi_2;
import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Cà phê");
        System.out.println("2. Trà sữa");
        System.out.println("3. Nước lọc");
        System.out.print("Mời bạn chọn (1-3): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Bạn đã chọn: Cà phê");
                break;
            case 2:
                System.out.println("Bạn đã chọn: Trà sữa");
                break;
            case 3:
                System.out.println("Bạn đã chọn: Nước lọc");
                break;
            default:
                System.out.println("Không có trong menu");
        }

        sc.close();
    }
}