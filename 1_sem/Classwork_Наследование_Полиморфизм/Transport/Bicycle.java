public class Bicycle extends Vehicle {
    private int gearCount;

    public Bicycle() {
        this("Неизвестный велосипед", 0, 1);
    }

    public Bicycle(String brand, int maxSpeed, int gearCount) {
        super(brand, maxSpeed);
        this.gearCount = gearCount;
    }

    @Override
    public void move() {
        System.out.println("Едет по велодорожке");
    }

    public void changeGear() {
        System.out.println(getBrand() + " переключает скорость");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество скоростей: " + gearCount);
    }

    public int getGearCount() { return gearCount; }
    public void setGearCount(int gearCount) { this.gearCount = gearCount; }
}