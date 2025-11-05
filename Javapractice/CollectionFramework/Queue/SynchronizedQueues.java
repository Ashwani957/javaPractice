
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronizedQueues {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new SynchronousQueue<>();

        Thread Producer = new Thread(() -> {
            try {
                System.out.println("Producer is waiting to transfer");
                queue.put("Hello form producer");
                System.out.println("Producer has transfer the message");
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer Interrupted");
            }
        });

        Thread Consumer = new Thread(() -> {
            try {
                System.out.println("Consumer is waiting to receive");

                String message = queue.take();
                System.out.println("Consumer recieved" + message);

            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer Interrupted");
            }
        });
        Producer.start();
        Consumer.start();
    }
}
