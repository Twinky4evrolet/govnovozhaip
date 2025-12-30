public class MobilePhone {
    private String brand;
    private String model;
    private int storageGB;
    private int batteryLevel;
    private boolean isPoweredOn;

    private static int totalPhones = 0;
    public static final int MAX_BATTERY = 100;

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
        totalPhones++;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getStorageGB() { return storageGB; }
    public int getBatteryLevel() { return batteryLevel; }
    public boolean isPoweredOn() { return isPoweredOn; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }

    public void setStorageGB(int storageGB) {
        if (storageGB >= 0) {
            this.storageGB = storageGB;
        }
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= MAX_BATTERY) {
            this.batteryLevel = batteryLevel;
        }
    }

    public void setPoweredOn(boolean poweredOn) {
        isPoweredOn = poweredOn;
    }

    public static int getTotalPhones() {
        return totalPhones;
    }

    public static void displayTechSupport() {
        System.out.println("Техническая поддержка: +7-800-555-35-35");
        System.out.println("Часы работы: 24/7");
    }

    public void displayInfo() {
        System.out.println("Бренд: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Память: " + storageGB + "GB");
    }

    public void displayInfo(boolean showPowerStatus) {
        System.out.println("Бренд: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Память: " + storageGB + "GB");
        System.out.println("Заряд батареи: " + batteryLevel + "%");
        if (showPowerStatus) {
            System.out.println("Включен: " + (isPoweredOn ? "Да" : "Нет"));
        }
    }

    public void powerOn() {
        isPoweredOn = true;
    }

    public void powerOff() {
        isPoweredOn = false;
    }

    public void chargeBattery(int percent) {
        batteryLevel = batteryLevel + percent;
        if (batteryLevel > MAX_BATTERY) {
            batteryLevel = MAX_BATTERY;
        }
    }

    public void chargeBattery(int percent, int minutes) {
        batteryLevel = batteryLevel + percent;
        if (batteryLevel > MAX_BATTERY) {
            batteryLevel = MAX_BATTERY;
        }
        System.out.println("Время зарядки: " + minutes + " минут");
    }

    public void useBattery(int percent) {
        batteryLevel = batteryLevel - percent;
        if (batteryLevel < 0) {
            batteryLevel = 0;
        }
        if (batteryLevel == 0) {
            powerOff();
        }
    }

    public void useBattery(int percent, String appName) {
        batteryLevel = batteryLevel - percent;
        if (batteryLevel < 0) {
            batteryLevel = 0;
        }
        System.out.println("Приложение использовало заряд: " + appName);
        if (batteryLevel == 0) {
            powerOff();
        }
    }
}