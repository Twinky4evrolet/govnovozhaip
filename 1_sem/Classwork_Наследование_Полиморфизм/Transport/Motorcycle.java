public class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle() {
        this("Неизвестный мотоцикл", 0, 0);
    }

    public Motorcycle(String brand, int maxSpeed, int engineCapacity) {
        super(brand, maxSpeed);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void move() {
        System.out.println("Мчится по шоссе");
    }

    public void wheelie() {
        System.out.println(getBrand() + " делает вилли!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Объем двигателя: " + engineCapacity + " см³");
    }

    public int getEngineCapacity() { return engineCapacity; }
    public void setEngineCapacity(int engineCapacity) { this.engineCapacity = engineCapacity; }
}