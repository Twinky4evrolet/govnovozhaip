public class SmartHome {
    private String homeName;
    private SmartDevice[] devices;
    private int deviceCount;
    private static final int MAX_DEVICES = 50;

    public SmartHome(String homeName) {
        this.homeName = homeName;
        this.devices = new SmartDevice[MAX_DEVICES];
        this.deviceCount = 0;
    }

    public void addDevice(SmartDevice device) {
        if (deviceCount < MAX_DEVICES) {
            devices[deviceCount] = device;
            deviceCount++;
            System.out.println("Устройство " + device.getDeviceName() + " добавлено в дом " + homeName);
        } else {
            System.out.println("Достигнут лимит устройств!");
        }
    }

    public void removeDevice(String deviceId) {
        for (int i = 0; i < deviceCount; i++) {
            if (devices[i].getDeviceId().equals(deviceId)) {
                System.out.println("Устройство " + devices[i].getDeviceName() + " удалено");
                for (int j = i; j < deviceCount - 1; j++) {
                    devices[j] = devices[j + 1];
                }
                devices[deviceCount - 1] = null;
                deviceCount--;
                return;
            }
        }
        System.out.println("Устройство с ID " + deviceId + " не найдено");
    }

    public void turnOnAllDevices() {
        System.out.println("Включаем все устройства...");
        for (int i = 0; i < deviceCount; i++) {
            devices[i].turnOn();
        }
    }

    public void turnOffAllDevices() {
        System.out.println("Выключаем все устройства...");
        for (int i = 0; i < deviceCount; i++) {
            devices[i].turnOff();
        }
    }

    public SmartDevice[] getDevicesByType(String type) {
        int count = 0;
        for (int i = 0; i < deviceCount; i++) {
            if (devices[i].getDeviceType().equals(type)) {
                count++;
            }
        }

        SmartDevice[] result = new SmartDevice[count];
        int index = 0;

        for (int i = 0; i < deviceCount; i++) {
            if (devices[i].getDeviceType().equals(type)) {
                result[index] = devices[i];
                index++;
            }
        }

        return result;
    }

    public double calculateTotalPowerConsumption() {
        double total = 0;
        for (int i = 0; i < deviceCount; i++) {
            if (devices[i].isPoweredOn()) {
                total += devices[i].getPowerConsumption();
            }
        }
        return total;
    }

    public void getDeviceStatus(String deviceId) {
        for (int i = 0; i < deviceCount; i++) {
            if (devices[i].getDeviceId().equals(deviceId)) {
                devices[i].getStatus();
                return;
            }
        }
        System.out.println("Устройство с ID " + deviceId + " не найдено");
    }

    public void displayAllDevices() {
        System.out.println("=== Все устройства в доме " + homeName + " ===");
        for (int i = 0; i < deviceCount; i++) {
            devices[i].getStatus();
            System.out.println("---");
        }
    }
    public String getHomeName() { return homeName; }
    public int getDeviceCount() { return deviceCount; }
}