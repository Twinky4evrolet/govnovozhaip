public class SmartSecurityCamera extends SmartDevice {
    private boolean isRecording;
    private boolean motionDetection;
    private String videoQuality;

    public SmartSecurityCamera() {
        this("camera1", "Умная камера", "Прихожая", false, 15.0, false, true, "HD");
    }

    public SmartSecurityCamera(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, boolean isRecording, boolean motionDetection, String videoQuality) {
        super(deviceId, deviceName, location, isPoweredOn, powerConsumption);
        this.isRecording = isRecording;
        this.motionDetection = motionDetection;
        this.videoQuality = videoQuality;
    }

    public boolean isRecording() { return isRecording; }
    public void setRecording(boolean recording) { isRecording = recording; }

    public boolean isMotionDetection() { return motionDetection; }
    public void setMotionDetection(boolean motionDetection) { motionDetection = motionDetection; }

    public String getVideoQuality() { return videoQuality; }
    public void setVideoQuality(String videoQuality) { this.videoQuality = videoQuality; }

    @Override
    public String getDeviceType() {
        return "Умная камера";
    }

    @Override
    public void performAction() {
        if (isPoweredOn()) {
            if (isRecording) {
                System.out.println("Камера записывает видео с качеством " + videoQuality);
            } else {
                System.out.println("Камера включена, но не записывает");
            }
        } else {
            System.out.println("Камера выключена");
        }
    }

    public void startRecording() {
        isRecording = true;
        System.out.println("Запись начата");
    }

    public void startRecording(boolean motionDetection) {
        isRecording = true;
        this.motionDetection = motionDetection;
        System.out.println("Запись начата с обнаружением движения: " + motionDetection);
    }

    public void detectMotion() {
        if (motionDetection) {
            System.out.println("Обнаружено движение!");
        } else {
            System.out.println("Обнаружение движения отключено");
        }
    }

    public void getLiveFeed() {
        if (isPoweredOn()) {
            System.out.println("Прямая трансляция с камеры " + getDeviceName() + " в качестве " + videoQuality);
        } else {
            System.out.println("Камера выключена, трансляция недоступна");
        }
    }
}