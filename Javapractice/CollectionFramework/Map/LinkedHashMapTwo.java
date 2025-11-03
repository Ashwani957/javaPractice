
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTwo {

    public static void main(String args[]) {
        // HashMap does not maintain the insertion order 
        HashMap<Integer, String> hash1 = new HashMap<>();
        hash1.put(1, "apple");
        hash1.put(2, "banana");
        hash1.put(3, "Orange");
// hasmap method : 
// getOrDefault method are used to get the value at that partiucalr index if the value is not present then it will give us the default value
        String value = hash1.getOrDefault(45, "not presetn");
        System.out.println("getOrDefault value:" + value);
        hash1.putIfAbsent(4, "pineapple"); // if the value is not present then it will put to it

        for (Map.Entry<Integer, String> entry : hash1.entrySet()) {
            System.out.println("The key value :" + entry.getKey() + "" + entry.getValue());
        }

        System.out.println("LinkedHashMap");
        // LinkedHashMap in which the insertion order are maintain 
        // LinkedHashMap<Integer, String> has2 = new LinkedHashMap<>();
        // last parameter is accessing order if we make it true then the element that are get come to the below of the LinkedHashMap
        // we can use to remove the least recently used data for the caching purpose becuase least recently data come to the top of the linkedHashmap
        LinkedHashMap<Integer, String> has2 = new LinkedHashMap<>(11, 0.3f, true);
        has2.put(1, "apple");
        has2.put(2, "banana");
        has2.put(3, "Orange");

        System.out.println("hasmethod" + has2.entrySet());
        System.out.println(has2.get(2));
        for (Map.Entry<Integer, String> entry : has2.entrySet()) {

            System.out.println("entry will be " + entry);
            // System.out.println("The key value :" + entry.getKey() + "" + entry.getValue());
        }

    }
}
