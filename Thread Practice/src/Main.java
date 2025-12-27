class One {
    int num;

    void increment() {
        synchronized (this) {
            num++;
        }
    }
}

class MyThread extends Thread {
    One o;
    public MyThread(One o) {
        this.o = o;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            o.increment();
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        // Thread Task 1 -------------
//        ThreadImplement t1 = new ThreadImplement(1);
//        ThreadImplement t2 = new ThreadImplement(2);
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("Main thread finished");

        // Thread Task 2 -------------

//        RunnableImplement t1 = new RunnableImplement(1);
//        RunnableImplement t2 = new RunnableImplement(2);
//        t1.run();
//        t2.run();
//
//        System.out.println("Main thread finished");

        // Thread Task 3 -------------
//        ThreadImplement t1 = new ThreadImplement(1);
//        ThreadImplement t2 = new ThreadImplement(2);
//        ThreadImplement t3 = new ThreadImplement(3);
//        t1.start();
//        t2.start();
//        t3.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("Main thread finished");


        // Lab Done by Sir
        One o1 = new One();

        MyThread m1 = new MyThread(o1);
        MyThread m2 = new MyThread(o1);

        m1.start();
        m2.start();

        m1.join();
        m2.join();

        System.out.println(o1.num);

        System.out.println("Main Thread ends");

    }
}