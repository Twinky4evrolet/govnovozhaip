public class SmartLight extends SmartDevice {
    private int brightness;
    private String color;
    private boolean isColorChanging;

    public SmartLight() {
        this("light1", "Умная лампа", "Гостиная", false, 10.0, 50, "Белый", false);
    }

    public SmartLight(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, int brightness, String color, boolean isColorChanging) {
        super(deviceId, deviceName, location, isPoweredOn, powerConsumption);
        this.brightness = brightness;
        this.color = color;
        this.isColorChanging = isColorChanging;
    }

    public int getBrightness() { return brightness; }
    public void setBrightnesscheck(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            this.brightness = 50;
        }
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isColorChanging() { return isColorChanging; }
    public void setColorChanging(boolean colorChanging) { isColorChanging = colorChanging; }

    @Override
    public String getDeviceType() {
        return "Умная лампа";
    }

    @Override
    public void performAction() {
        if (isPoweredOn()) {
            System.out.println("Лампа светит с яркостью " + brightness + "% и цветом " + color);
        } else {
            System.out.println("Лампа выключена");
        }
    }

    public void setBrightness(int level) {
        setBrightnesscheck(level);
    }

    public void setBrightness(int level, String color) {
        setBrightnesscheck(level);
        this.color = color;
    }

    public void changeColor(String newColor) {
        if (isColorChanging) {
            this.color = newColor;
            System.out.println("Цвет изменен на " + newColor);
        } else {
            System.out.println("Эта лампа не поддерживает смену цвета");
        }
    }

    public void dimLights() {
        brightness = Math.max(0, brightness - 10);
        System.out.println("Яркость уменьшена до " + brightness + "%");
    }
}