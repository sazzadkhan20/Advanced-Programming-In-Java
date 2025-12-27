

@Manufacturer(name = "Nest",year = 2025)
public class Thermostat extends Device
{
    private final double temperature;

    public Thermostat(String id,DeviceType t,double temperature)
    {
        super(id,t);
        this.temperature = temperature;
    }

    @Override
    public void start() {
        System.out.println("Thermostat " + this.id + " started. Setting temperature to: " + this.temperature + "C");
    }
}