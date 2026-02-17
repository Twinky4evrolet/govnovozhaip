public class Vehicle {
    private String brand;
    private int maxSpeed;

    public Vehicle() {
        this("Неизвестный бренд", 0);
    }

    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void move() {
        System.out.println("Транспортное средство двигается");
    }

    public void stop() {
        System.out.println(brand + " остановился");
    }

    public void displayInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч");
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }
}