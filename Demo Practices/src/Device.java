

abstract class Device {
    String id;
    DeviceType type;

    public Device(String id, DeviceType type) {
        this.id = id;
        this.type = type;
    }

    public abstract void start();

    public void showInfo()
    {
        System.out.println("Device ID: "+this.id+"\nDevice Type: "+this.type);
    }

    public String getId() {
        return this.id;
    }

    public DeviceType getType() {
        return this.type;
    }
}