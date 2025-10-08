package ASM;

import java.text.DecimalFormat;

public class Vehicle {
    // Các thuộc tính private (access modifier)
    private int id;
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    private String type; // kiểu xe: Car, Truck, Motorbike...

    // Static counter cho id tự tăng và tổng số xe
    private static int idCounter = 1;
    private static int totalVehicles = 0;

    // Constructor mặc định (overloading)
    public Vehicle() {
        this.id = idCounter++;
        this.brand = "";
        this.model = "";
        this.year = 0;
        this.price = 0.0;
        this.color = "";
        this.type = "Vehicle";
        totalVehicles++;
    }

    // Constructor có tham số (overloading)
    public Vehicle(String brand, String model, int year, double price, String color, String type) {
        this.id = idCounter++;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
        totalVehicles++;
    }

    // Getter và Setter (sử dụng this trong setter)
    public int getId() {
        return this.id;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return this.type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    // Static methods for totalVehicles
    public static int getTotalVehicles() {
        return totalVehicles;
    }

    public static void decrementTotalVehicles() {
        if (totalVehicles > 0) {
            totalVehicles--;
        }
    }

    // Method applyDiscount() - có thể override ở lớp con
    public void applyDiscount() {
        // Mặc định: không giảm
    }

    // 💰 Hàm định dạng giá dạng xxx.xxx.xxx VND
    public String formatPrice() {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(price).replace(",", ".") + " VND";
    }

    // In ra màn hình
    @Override
    public String toString() {
        return String.format("ID: %-3d | Loại: %-6s | Hãng: %-8s | Mẫu: %-10s | Năm: %-4d | Giá: %-15s | Màu: %-6s",
                id, type, brand, model, year, formatPrice(), color);
    }

    // Dòng dữ liệu dạng CSV để ghi ra file
    public String toDataLine() {
        return String.format("%s,%s,%s,%d,%.2f,%s", this.type, this.brand, this.model, this.year, this.price, this.color);
    }
}
