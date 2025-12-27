

@Manufacturer(name = "Arlo")
public class Camera extends Device
{
    private final String resolution;

    public Camera(String id,DeviceType t,String resolution)
    {
        super(id,t);
        this.resolution = resolution;
    }

    @Override
    public void start() {
        System.out.println("Camera " + this.id + " started with resolution: " + this.resolution);
    }
}