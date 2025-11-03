
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {

    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Producer Proudce:" + value);
                queue.put(value++);
                Thread.sleep(500);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer Interrupted");
            }
        }
    }
}

class Consumer implements Runnable {

    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            try {

                // take will take the value from the queue and after that producer will produce the value 
                Integer value = queue.take(); // it will wait until the producer will proudce the value 
                System.out.println("Consumer consume:" + value);

                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer Interrupted");
            }
        }
    }
}

public class BlockingQueuelist {

    public static void main(String args[]) {

        // A bounded blocking queue bound by an array :means we need to provide the size initial
        // This queue is my share queue 
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        Thread Producer = new Thread(new Producer(queue));
        Thread Consumer = new Thread(new Consumer(queue));
        Producer.start();
        Consumer.start();

    }
}
