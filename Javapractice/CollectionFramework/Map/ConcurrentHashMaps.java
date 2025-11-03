
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMaps {

    public static void main(String args[]) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();// here we achive synchornization Here 
        // Map<Integer, String> map = new HashMap<>(); // we do not achieve synchronization here 
// Java7-->To achieve the synchronization we have segment based locking -->16 segment-->smaller segment 
// only the segment that are used to read or write are used to b lock 
// Read:Do not require locking unless there is a write operation happening on the same segment
// write :lock 

// java8-->No segmentation 
// -->Compare and swap approach -->no segment approach ,no locking except resizing  or collision  and locking are excepted in resizing and etch
// Thread A last saw-->x=45
// Thread A work --> X to 50 
// If  x is still 45 then  change it to 50 else do not change and retry 
        // map.put(1, "Ashwani");
        // map.put(2, "Sahil");
        // map.put(3, "Karan");
        // System.out.println(map);
// Thead safe 
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "value" + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "value" + i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(map.size());
    }
}
