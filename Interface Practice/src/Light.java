

public class Light implements Device
{
    public void isMotor()
    {
        System.out.println("Light is motor");
    }

    @Override
    public void m1()
    {
        Device.super.m1();
        System.out.println("m1 ok");
    }

//    @Override
//    public void m3()
//    {
//        System.out.println("m3 ok");
//    }
}
