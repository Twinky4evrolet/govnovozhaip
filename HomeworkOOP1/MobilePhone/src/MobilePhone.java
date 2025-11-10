public class MobilePhone {
    private String brand;
    private String model;
    private int storageGB;
    private int batteryLevel;
    private boolean isPoweredOn;

    public MobilePhone() {
        this("xiami", "redmi note turbo puper pro plus 15 extra", 512, 86, false);
    }

    public MobilePhone(String brand, String model, int storageGB) {
        this(brand, model, storageGB, 86, false);
    }

    public MobilePhone(String brand, String model, int storageGB, int batteryLevel, boolean isPoweredOn) {
        this.brand = brand;
        this.model = model;
        this.storageGB = storageGB;
        this.batteryLevel = batteryLevel;
        this.isPoweredOn = isPoweredOn;
    }

    public void displayInfo() {
        System.out.println("Бренд: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Память: " + storageGB + "GB");
        System.out.println("Заряд батареи: " + batteryLevel + "%");
        System.out.println("Включен: " + (isPoweredOn ? "Да" : "Нет"));
    }

    public void powerOn() {
        isPoweredOn = true;
    }

    public void powerOff() {
        isPoweredOn = false;
    }

    public void chargeBattery(int percent) {
        batteryLevel = Math.min(100, batteryLevel + percent);
    }

    public void useBattery(int percent) {
        batteryLevel = Math.max(0, batteryLevel - percent);
        if (batteryLevel == 0) {
            powerOff();
        }
    }
}