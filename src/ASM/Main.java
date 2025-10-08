package ASM;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static final String DATA_FILE = "C:/Users/winan/IdeaProjects/Java_Huy/src/ASM/vehicles.txt";
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadVehiclesFromFile();
        boolean running = true;
        while (running) { // sử dụng while cho menu lặp
            printMenu();
            String choice = scanner.nextLine().trim();
            switch (choice) { // switch-case xử lý menu
                case "1":
                    addVehicle();
                    break;
                case "2":
                    deleteVehicleById();
                    break;
                case "3":
                    displayVehicles();
                    break;
                case "4":
                    searchByBrand();
                    break;
                case "5":
                    sortByPriceAscending();
                    break;
                case "6":
                    sortByYearDescending();
                    break;
                case "0":
                    System.out.println("Thoát chương trình. Dữ liệu đã được lưu!");
                    saveVehiclesToFile();
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("===== QUẢN LÝ GARA XE =====");
        System.out.println("1. Thêm xe mới");
        System.out.println("2. Xóa xe theo ID");
        System.out.println("3. Hiển thị danh sách xe");
        System.out.println("4. Tìm kiếm xe theo hãng");
        System.out.println("5. Sắp xếp xe theo giá tăng dần");
        System.out.println("6. Sắp xếp xe theo năm sản xuất giảm dần");
        System.out.println("0. Thoát");
        System.out.println("===========================");
        System.out.print("Chọn (0-6): ");
    }

    // ✅ Đọc dữ liệu từ file
    private static void loadVehiclesFromFile() {
        File file = new File(DATA_FILE);
        if (!file.exists()) {
            System.out.println("[INFO] Không tìm thấy file dữ liệu, tạo mới.");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 7) continue;

                String type = parts[0];
                String brand = parts[1];
                String model = parts[2];
                int year = Integer.parseInt(parts[3]);
                double price = Double.parseDouble(parts[4]);
                String color = parts[5];

                if (type.equalsIgnoreCase("Car")) {
                    int seats = Integer.parseInt(parts[6]);
                    vehicles.add(new Car(brand, model, year, price, color, seats));
                } else if (type.equalsIgnoreCase("Truck")) {
                    double capacity = Double.parseDouble(parts[6]);
                    vehicles.add(new Truck(brand, model, year, price, color, capacity));
                }
            }
            System.out.println("[INFO] Đã tải " + vehicles.size() + " xe từ file.");
        } catch (Exception e) {
            System.out.println("[ERROR] Lỗi khi đọc file: " + e.getMessage());
        }
    }

    // ✅ Ghi danh sách xe ra file
    private static void saveVehiclesToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DATA_FILE))) {
            for (Vehicle v : vehicles) {
                bw.write(v.toDataLine());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("[ERROR] Lỗi khi ghi file: " + e.getMessage());
        }
    }

    private static void addVehicle() {
        System.out.println("--- Thêm xe mới ---");
        System.out.print("Chọn loại xe (1: Car, 2: Truck): ");
        String typeChoice = scanner.nextLine().trim();
        System.out.print("Nhập hãng (brand): ");
        String brand = scanner.nextLine().trim();
        System.out.print("Nhập model: ");
        String model = scanner.nextLine().trim();

        int year = 0;
        while (true) {
            System.out.print("Nhập năm sản xuất (ví dụ 2020): ");
            String y = scanner.nextLine().trim();
            try {
                year = Integer.parseInt(y);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Năm không hợp lệ. Nhập lại.");
            }
        }

        double price = 0.0;
        while (true) {
            System.out.print("Nhập giá (VD: 350000000): ");
            String p = scanner.nextLine().trim();
            try {
                price = Double.parseDouble(p);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Giá không hợp lệ. Nhập lại.");
            }
        }

        System.out.print("Nhập màu (color): ");
        String color = scanner.nextLine().trim();

        if ("1".equals(typeChoice)) { // Car
            int seats = 4;
            while (true) {
                System.out.print("Nhập số ghế (seatCount): ");
                String s = scanner.nextLine().trim();
                try {
                    seats = Integer.parseInt(s);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Số ghế không hợp lệ. Nhập lại.");
                }
            }
            Car car = new Car(brand, model, year, price, color, seats);
            vehicles.add(car);
            System.out.println("Đã thêm Car: " + car);
        } else if ("2".equals(typeChoice)) { // Truck
            double capacity = 0.0;
            while (true) {
                System.out.print("Nhập tải trọng (loadCapacity): ");
                String c = scanner.nextLine().trim();
                try {
                    capacity = Double.parseDouble(c);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Tải trọng không hợp lệ. Nhập lại.");
                }
            }
            Truck truck = new Truck(brand, model, year, price, color, capacity);
            vehicles.add(truck);
            System.out.println("Đã thêm Truck: " + truck);
        } else {
            System.out.println("Loại xe không hợp lệ. Hủy hành động thêm.");
        }
    }

    private static void deleteVehicleById() {
        System.out.println("--- Xóa xe theo ID ---");
        System.out.print("Nhập ID cần xóa: ");
        String s = scanner.nextLine().trim();
        int idToDelete;
        try {
            idToDelete = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("ID không hợp lệ.");
            return;
        }

        // Dùng Iterator để xóa (ví dụ sử dụng for-each bị lỗi khi xóa trực tiếp)
        Iterator<Vehicle> iter = vehicles.iterator();
        boolean found = false;
        while (iter.hasNext()) { // sử dụng while để duyệt
            Vehicle v = iter.next();
            if (v.getId() == idToDelete) {
                iter.remove();
                Vehicle.decrementTotalVehicles(); // giảm tổng số xe
                found = true;
                System.out.println("Đã xóa xe có ID " + idToDelete);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy xe có ID " + idToDelete);
        }
    }

    private static void displayVehicles() {
        System.out.println("--- Danh sách xe ---");
        if (vehicles.isEmpty()) {
            System.out.println("Hiện không có xe trong gara.");
        } else {
            // Sử dụng for-each để in
            for (Vehicle v : vehicles) {
                System.out.println(v.toString());
            }
        }
        int total = Vehicle.getTotalVehicles();
        System.out.println("Tổng số xe hiện tại: " + total + " (static)");
        if (total > 20) {
            System.out.println("Gara lớn");
        } else {
            System.out.println("Gara nhỏ");
        }
    }

    private static void searchByBrand() {
        System.out.println("--- Tìm kiếm xe theo hãng ---");
        System.out.print("Nhập tên hãng (brand) để tìm: ");
        String q = scanner.nextLine().trim().toLowerCase();
        ArrayList<Vehicle> results = new ArrayList<>();
        // sử dụng for loop để tìm
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle v = vehicles.get(i);
            if (v.getBrand().toLowerCase().contains(q)) {
                results.add(v);
            }
        }

        if (results.isEmpty()) {
            System.out.println("Không tìm thấy xe của hãng '" + q + "'.");
        } else {
            System.out.println("Tìm thấy " + results.size() + " xe:");
            // sử dụng for-each để in kết quả
            for (Vehicle v : results) {
                System.out.println(v);
            }
        }
    }

    private static void sortByPriceAscending() {
        System.out.println("--- Sắp xếp xe theo giá tăng dần ---");
        // sử dụng Collections.sort với Comparator (lambda)
        Collections.sort(vehicles, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle v1, Vehicle v2) {
                return Double.compare(v1.getPrice(), v2.getPrice());
            }
        });
        displayVehicles();
    }

    private static void sortByYearDescending() {
        System.out.println("--- Sắp xếp xe theo năm sản xuất giảm dần ---");
        Collections.sort(vehicles, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle v1, Vehicle v2) {
                return Integer.compare(v2.getYear(), v1.getYear()); // giảm dần
            }
        });
        displayVehicles();
    }
}
