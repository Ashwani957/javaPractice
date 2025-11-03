
import java.util.PriorityQueue;

public class PriorityQueueTwo {

    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // least element having higher priority Here 
        pq.add(13);
        pq.add(15);
        pq.add(64);
        pq.add(43);
        System.out.println(pq);

        while (!pq.isEmpty()) {
            // it will remove the head element everytimes
            System.out.println(pq.poll());
        }
    }
}
