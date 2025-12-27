
class SharedResources {
    private int value = 0;
    synchronized void add(String threadName)
    {
        value++;
        System.out.println(threadName + " added, value = "+value);
    }
    synchronized void subtract(String threadName)
    {
        value--;
        System.out.println(threadName + " subtracted, value = "+value);
    }
}

class Task extends Thread
{
    SharedResources sharedResources;
    Task(SharedResources sharedResources,String threadName)
    {
        super(threadName);
        this.sharedResources = sharedResources;
    }
    @Override
    public void run()
    {
        sharedResources.add(getName());
        try
        {
            Thread.sleep(300);
            System.out.println(getName() + " is sleeping ");
        }
        catch (InterruptedException e)
        {
            System.out.println(getName() + " is Interrupted ");
        }
        sharedResources.subtract(getName());
    }

}
public class Main {
    public static void main(String[] args) {
        SharedResources sharedResources = new SharedResources();

        Thread thread1 = new Task(sharedResources,"T1");
        Thread thread2 = new Task(sharedResources,"T2");
        Thread thread3 = new Task(sharedResources,"T3");

        thread1.start();
        try
        {
           thread1.join();
        }
        catch (InterruptedException e)
        {
            sharedResources.subtract("T1");
        }
        thread2.start();
        try
        {
            thread2.join();
        }
        catch (InterruptedException e)
        {
            sharedResources.subtract("T1");
        }

        thread3.start();
        try
        {
            thread3.join();
        }
        catch (InterruptedException e)
        {
            sharedResources.subtract("T1");
        }

        System.out.println("Main thread finished");

    }
}