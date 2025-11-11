

public class Main {
    public static void main(String[] args)
    {
        // Device Manager
        DeviceManager<Device> deviceManager = new DeviceManager<>();

        // add light
        DeviceType light = DeviceType.LIGHT;
        deviceManager.addDevice(new Light("11",light,80));

        // add thermostat
        DeviceType thermostat = DeviceType.THERMOSTAT;
        deviceManager.addDevice(new Thermostat("22",thermostat,20));

        // add camera
        deviceManager.addDevice(new Camera("33",DeviceType.CAMERA,"1080p"));

        // start all device
        deviceManager.startAllDevices();
    }
}