
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueues {

    public static void main(String args[]) {
        // Non blocking 
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        Thread ProducerOne = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                queue.add("Producer Task-1" + i);
                System.out.println("Producer 1 added :p1-taskt" + i);
                try {
                    Thread.sleep(1000);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread ProducerTwo = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                queue.add("Producer Task-2" + i);
                System.out.println("Producer 2 added :p2-taskt" + i);
                try {
                    Thread.sleep(1000);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread Consumer = new Thread(() -> {
            while (true) {
                String value = queue.poll();

                if (value != null) {
                    System.out.println("Consumer Produer"+" " + value);
                }

            }
        });

        ProducerOne.start();
        ProducerTwo.start();
        Consumer.start();

    }
}
