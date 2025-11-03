
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueLinkedListTwo {

    public static void main(String args[]) {
        // It is optinally bounded means if we want to provide the inital capacity then we will otherwise no needed but there is one risk we can get the error somethime outofMemoryerror 
        // not a bounded like a ArrayblockingQueue
        //Uses two seprate lock for enque and deque
        // Higher concurrency between producer and consumer
        BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();

        // ArrayblockingQueue is bounded means we need to provide the initial capactiy of it 
        //A bounded blocking queque  backed a circular array 
        // low memory overhead 
        // uses a single lock for both enque and deque operation 
        //More threads-->create a problem
        BlockingQueue<Integer> queue2 =new ArrayBlockingQueue<>(5);
    }
}
