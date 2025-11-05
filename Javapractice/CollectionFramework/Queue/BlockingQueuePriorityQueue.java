
import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;


public class BlockingQueuePriorityQueue {

    public static void main(String args[]) {

        BlockingQueue<Integer> queue2 = new PriorityBlockingQueue<>(11);
        queue2.add(12);
            queue2.add(45);
            queue2.add(54);
            queue2.add(43);
            System.out.println(queue2);
        }
}
