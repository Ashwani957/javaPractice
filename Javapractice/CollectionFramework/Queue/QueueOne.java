
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueOne {

    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<>();
        // System.out.println(queue.remove()); //It will Provide you the exception NoSuchElementException if the queue is empty 
        System.out.println(queue.poll());// if the queue is empty then it will provide the null value instead of throwing an error 

        System.out.println(queue.peek());// it will return the null value if the queue is empty 

        System.out.println(queue.element());//it will show an exception when the queue is empty 

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(3);
        queue2.add(1);
        queue2.add(3);
        queue2.add(5);
        queue2.offer(6); // At that point the capacity of the queue is full and we did not get add more value in it if we add more value then we will get the error Here if we add with the help of queue2.add()like this but we did not get the error if we add like this queue2.offer(6)
         

    }
}
