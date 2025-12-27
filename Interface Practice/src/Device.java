

public interface Device
{

     int a = 10; // public static final

     void isMotor(); // public abstract

     default void m1()
     {
          System.out.println("m1 ok");
     }

     private static  void m2()
     {
          System.out.println("m2 ok");
     }

     static  void m3()
     {
          System.out.println("m3 ok");
     }

     private void m4()
     {
          System.out.println("m4 ok");
     }
}
