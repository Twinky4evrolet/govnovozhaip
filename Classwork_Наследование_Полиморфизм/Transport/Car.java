public class Car extends Vehicle {
    private String fuelType;

    public Car() {
        this("Неизвестный автомобиль", 0, "Бензин");
    }

    public Car(String brand, int maxSpeed, String fuelType) {
        super(brand, maxSpeed);
        this.fuelType = fuelType;
    }

    @Override
    public void move() {
        System.out.println("Едет по дороге");
    }

    public void refuel() {
        System.out.println(getBrand() + " заправлен " + fuelType);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип топлива: " + fuelType);
    }

    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
}