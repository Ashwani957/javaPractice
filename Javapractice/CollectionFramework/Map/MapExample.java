
import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Thread 1: Writing data
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "T1-" + i);
            }
            System.out.println("Thread 1 Finished");
        });

        // Thread 2: Writing data
        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "T2-" + i);
            }
            System.out.println("Thread 2 Finished");
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Final map size: " + map.size());
    }
}
