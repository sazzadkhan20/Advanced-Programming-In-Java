// File: MultithreadDemo.java
import java.util.concurrent.*;

public class MultithreadDemo {
    public static void main(String[] args) throws Exception {
        BlockingQueue<Integer> q = new ArrayBlockingQueue<>(5);

        // Producer
        Runnable producer = () -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    q.put(i);
                    System.out.println("Produced " + i);
                    Thread.sleep(100); // simulate work
                }
            } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        };

        // Consumer
        Runnable consumer = () -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    int v = q.take();
                    System.out.println("Consumed " + v);
                    Thread.sleep(150);
                }
            } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        };

        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.submit(producer);
        ex.submit(consumer);
        ex.shutdown();
        ex.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Done");
    }
}
