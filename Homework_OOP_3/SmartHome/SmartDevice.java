public class SmartDevice {
    private String deviceId;
    private String deviceName;
    private String location;
    private boolean isPoweredOn;
    private double powerConsumption;

    private static int totalDevices = 0;
    public static final double MAX_POWER_CONSUMPTION = 5000.0;

    public SmartDevice() {
        this("defaultId", "Unnamed Device", "Unknown Location", false, 0.0);
    }

    public SmartDevice(String deviceId, String deviceName, String location) {
        this(deviceId, deviceName, location, false, 0.0);
    }

    public SmartDevice(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption) {
        setDeviceId(deviceId);
        setDeviceName(deviceName);
        setLocation(location);
        this.isPoweredOn = isPoweredOn;
        setPowerConsumption(powerConsumption);
        totalDevices++;
    }

    public String getDeviceId() { return deviceId; }
    public void setDeviceId(String deviceId) {
        if (deviceId != null && !deviceId.isEmpty()) {
            this.deviceId = deviceId;
        } else {
            this.deviceId = "defaultId";
        }
    }

    public String getDeviceName() { return deviceName; }
    public void setDeviceName(String deviceName) { this.deviceName = deviceName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public boolean isPoweredOn() { return isPoweredOn; }
    public void setPoweredOn(boolean poweredOn) { isPoweredOn = poweredOn; }

    public double getPowerConsumption() { return powerConsumption; }
    public void setPowerConsumption(double powerConsumption) {
        if (powerConsumption >= 0 && powerConsumption <= MAX_POWER_CONSUMPTION) {
            this.powerConsumption = powerConsumption;
        } else {
            this.powerConsumption = 0.0;
        }
    }

    public static int getTotalDevices() {
        return totalDevices;
    }

    public String getDeviceType() {
        return "Умное устройство";
    }

    public void performAction() {
        System.out.println("Выполняется действие устройства " + deviceName);
    }

    public void turnOn() {
        isPoweredOn = true;
        System.out.println(deviceName + " включено.");
    }

    public void turnOff() {
        isPoweredOn = false;
        System.out.println(deviceName + " выключено.");
    }

    public void getStatus() {
        System.out.println("Устройство: " + deviceName);
        System.out.println("Тип: " + getDeviceType());
        System.out.println("Местоположение: " + location);
        System.out.println("Состояние: " + (isPoweredOn ? "Включено" : "Выключено"));
        System.out.println("Потребляемая мощность: " + powerConsumption + " Вт");
    }
}