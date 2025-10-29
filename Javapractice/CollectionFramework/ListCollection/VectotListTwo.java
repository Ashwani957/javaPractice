
import java.util.Vector;
import java.util.ArrayList;

public class VectotListTwo {

    public static void main(String args[]) {

        Vector<Integer> v1 = new Vector<>(); // thread shafe 
        // ArrayList<Integer> v1 = new ArrayList<>(); // not a thread shafe 

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                v1.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                v1.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Thread Message:" + e.getMessage());
        }
        System.out.println("The vector length:" + v1.size());
    }
}
