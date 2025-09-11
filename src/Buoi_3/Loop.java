package Buoi_3;
import java.util.Scanner;
public class Loop {
        public static void main(String[] args) {
            // 1. In ra màn hình các số từ 1 → 100
            System.out.println("Bài 1: Các số từ 1 đến 100");
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\n------------------");

            // 2. In ra các số chẵn trong khoảng 2 → 200 (dùng while)
            System.out.println("Bài 2: Các số chẵn từ 2 đến 200");
            int i = 2;
            while (i <= 200) {
                System.out.print(i + " ");
                i += 2;
            }
            System.out.println("\n------------------");

            // 3. Tính tổng các số từ 1 → 100
            System.out.println("Bài 3: Tổng các số từ 1 đến 100");
            int sum = 0;
            for (i = 1; i <= 100; i++) {
                sum += i;
            }
            System.out.println("Tổng = " + sum);
            System.out.println("------------------");

            // 4. Tính giai thừa n!
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập n để tính n!: ");
            int n = sc.nextInt();
            long factorial = 1;
            for (i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
            System.out.println("------------------");

            // 5. Bảng cửu chương của n
            System.out.print("Nhập số n để in bảng cửu chương: ");
            int num = sc.nextInt();
            System.out.println("Bảng cửu chương của " + num + ":");
            for (i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            System.out.println("------------------");

            // 6. Đếm ngược từ 10 → 1 (dùng while)
            System.out.println("Bài 6: Đếm ngược từ 10 về 1");
            int countdown = 10;
            while (countdown >= 1) {
                System.out.print(countdown + " ");
                countdown--;
            }
            System.out.println("\nHết giờ!");
            System.out.println("------------------");

            // 7. Mảng {3,7,2,9,5} -> tìm số lớn nhất
            int[] arr1 = {3, 7, 2, 9, 5};
            int max = arr1[0];
            for (int x : arr1) {
                if (x > max) {
                    max = x;
                }
            }
            System.out.println("Bài 7: Số lớn nhất trong mảng = " + max);
            System.out.println("------------------");

            // 8. Mảng {1,2,3,4,5,6} -> tính tổng các số chẵn
            int[] arr2 = {1, 2, 3, 4, 5, 6};
            int sumEven = 0;
            for (int x : arr2) {
                if (x % 2 == 0) {
                    sumEven += x;
                }
            }
            System.out.println("Bài 8: Tổng các số chẵn trong mảng = " + sumEven);

            sc.close();
        }
    }

