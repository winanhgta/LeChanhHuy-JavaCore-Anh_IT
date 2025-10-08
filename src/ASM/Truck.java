package ASM;

class Truck extends Vehicle {
    private double loadCapacity; // tấn hoặc kg tùy quy ước

    public Truck() {
        super();
        this.setType("Truck");
        this.loadCapacity = 0.0;
    }

    public Truck(String brand, String model, int year, double price, String color, double loadCapacity) {
        super(brand, model, year, price, color, "Truck");
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return this.loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    // Override applyDiscount -> giảm 20%
    @Override
    public void applyDiscount() {
        double newPrice = this.getPrice() * 0.80; // giảm 20%
        this.setPrice(newPrice);
    }

    @Override
    public String toDataLine() {
        return super.toDataLine() + "," + loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tải trọng: " + loadCapacity + " tấn";
    }

//    @Override
//    public String toString() {
//        return super.toString() + String.format(" | LoadCapacity: %.2f", this.loadCapacity);
//    }
//
//    @Override
//    public String toDataLine() {
//        return String.format("Truck,%s,%s,%d,%.2f,%s,%.2f",
//                this.getBrand(), this.getModel(), this.getYear(), this.getPrice(), this.getColor(), this.loadCapacity);
//    }
}

