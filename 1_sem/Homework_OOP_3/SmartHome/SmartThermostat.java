public class SmartThermostat extends SmartDevice {
    private double currentTemperature;
    private double targetTemperature;
    private String mode; // охлаждение/обогрев

    public SmartThermostat() {
        this("thermostat", "Умный термостат", "Гостиная", false, 50.0, 22.0, 22.0, "обогрев");
    }

    public SmartThermostat(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, double currentTemperature, double targetTemperature, String mode) {
        super(deviceId, deviceName, location, isPoweredOn, powerConsumption);
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
        this.mode = mode;
    }

    public double getCurrentTemperature() { return currentTemperature; }
    public void setCurrentTemperature(double currentTemperature) { this.currentTemperature = currentTemperature; }

    public double getTargetTemperature() { return targetTemperature; }
    public void setTargetTemperature(double targetTemperature) { this.targetTemperature = targetTemperature; }

    public String getMode() { return mode; }
    public void setMode(String mode) { this.mode = mode; }

    @Override
    public String getDeviceType() {
        return "Умный термостат";
    }

    @Override
    public void performAction() {
        if (isPoweredOn()) {
            System.out.println("Термостат работает в режиме " + mode + ". Текущая температура: " + currentTemperature + "°C, целевая: " + targetTemperature + "°C");
        } else {
            System.out.println("Термостат выключен");
        }
    }

    public void setTemperature(double temp) {
        this.targetTemperature = temp;
        System.out.println("Целевая температура установлена на " + temp + "°C");
    }

    public void setTemperature(double temp, String mode) {
        this.targetTemperature = temp;
        this.mode = mode;
        System.out.println("Целевая температура установлена на " + temp + "°C в режиме " + mode);
    }

    public void getEnergyReport() {
        System.out.println("Отчет по энергии: устройство " + getDeviceName() + " потребляет " + getPowerConsumption() + " Вт");
    }

    public void scheduleTemperature(double temp, int hour) {
        System.out.println("Температура запланирована на " + hour + ":00 до " + temp + "°C");
    }
}