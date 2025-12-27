
//class Demo
//{
//    public  void m4()
//    {
//        System.out.println("m4 ok Demo");
//    }
//
//    public  void m5()
//    {
//        System.out.println("m5 ok Demo");
//    }
//}
//
//class Demo2 extends Demo
//{
//    @Override
//    public void m4()
//    {
//        super.m5();
//        System.out.println("m4 ok Demo2");
//    }
//}

abstract class  MyAbstractClass
{
    int a = 10;
    abstract void m5();
    public void m1(){
        System.out.println("m1 ok");
    }
    private void m2(){
        System.out.println("m2 ok");
    }
    static void m3()
    {
        System.out.println("m3 ok");
    }

    // No Default method
//    default void m4()
//    {
//        System.out.println("m4 ok");
//    }
}

class Dem03 extends MyAbstractClass
{
    void m5()
    {
        System.out.println("m4 ok");
    }
}

public class Main
{
    public static void main(String[] args) {
        // Device object
        Device d = new Device() {
            @Override
            public void isMotor() {
                System.out.println("motor ok");
            }
        };
//        Device d2 = new Device(){
//            @Override
//            public void isMotor() {
//                System.out.println("motor ok");
//            }
//        };

        d.isMotor(); // abstract method
        d.m1(); // default method
        Device.m3(); // static method & static variable

        Light l = new Light();
        l.isMotor();
        l.m1();

        MyAbstractClass myAbstractClass = new MyAbstractClass() {
            @Override
            void m5() {
                System.out.println("m5 ok");
            }
        };
        myAbstractClass.m5();
        myAbstractClass.m3();
    }
}