package Buoi_4;
import java.util.Scanner;
public class Baitap {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tìm số lớn nhất trong mảng");
            System.out.println("2. Đếm số chẵn, số lẻ");
            System.out.println("3. Đảo ngược mảng");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    timSoLonNhat();
                    break;
                case 2:
                    demChanLe();
                    break;
                case 3:
                    daoNguocMang();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    // 1. Tìm số lớn nhất
    public static void timSoLonNhat() {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }

    // 2. Đếm số chẵn, số lẻ (nâng cao: nhập mảng từ bàn phím)
    public static void demChanLe() {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int countChan = 0, countLe = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                countChan++;
            } else {
                countLe++;
            }
        }

        System.out.print("Mảng đã nhập: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Số chẵn: " + countChan);
        System.out.println("Số lẻ: " + countLe);
    }

    // 3. Đảo ngược mảng
    public static void daoNguocMang() {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Mảng đảo ngược: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
