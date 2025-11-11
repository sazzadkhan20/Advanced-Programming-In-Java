

@Manufacturer(name = "Philips",year = 2024)
public class Light extends Device
{
    private final int brightness;

    public Light(String id,DeviceType t,int brightness)
    {
        super(id,t);
        this.brightness = brightness;
    }

    @Override
    public void start() {
        System.out.println("Light " + id + " started with brightness: " + brightness + "%");
    }

}
