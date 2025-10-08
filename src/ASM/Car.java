package ASM;

public class Car extends Vehicle {
    private int seatCount;

    public Car() {
        super();
        this.setType("Car");
        this.seatCount = 4;
    }

    public Car(String brand, String model, int year, double price, String color, int seatCount) {
        super(brand, model, year, price, color, "Car");
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return this.seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    // Override applyDiscount -> giảm 15%
    @Override
    public void applyDiscount() {
        double newPrice = this.getPrice() * 0.85; // giảm 15%
        this.setPrice(newPrice);
    }

    @Override
    public String toDataLine() {
        return super.toDataLine() + "," + seatCount;
    }

    @Override
    public String toString() {
        return super.toString() + " | Ghế: " + seatCount;
    }

//    @Override
//    public String toString() {
//        return super.toString() + String.format(" | Seats: %d", this.seatCount);
//    }
//
//    @Override
//    public String toDataLine() {
//        return String.format("Car,%s,%s,%d,%.2f,%s,%d",
//                this.getBrand(), this.getModel(), this.getYear(), this.getPrice(), this.getColor(), this.seatCount);
//    }
}
