
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueOne {

    public static void main(String args[]) {
        // Deque<Integer> deque = new ArrayDeque<>(); // but here we have faster iteration , low memory , null not allowed
        Deque<Integer> deque = new LinkedList<>();// slow iteration , larger memory 
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.addFirst(8);
        deque.addLast(9);
        deque.offerFirst(89);
        deque.offerLast(90);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        // Remove element 
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println(deque.removeLast());

    }
}
