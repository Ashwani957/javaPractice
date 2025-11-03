
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMaps {

    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ashwnai");
        map.put(2, "Sahil");
        map.put(3, "Karan");
        Map<Integer, String> map1 = Collections.unmodifiableMap(map);
        // map1.put(4, "suman");
        map.put(5, "suman"); // We cannot able to modifity the map if we try to modifty the map then we will get the error Here 

        // we can create only 10 key value pair by using the Map.of
        Map<String, Integer> map2 = Map.of("Shubhum", 98, "Vivek", 89);
        map2.put(8, "akash"); // we also cannot modify the value 
        // if we want to create more than 10 then we use the 
        Map.ofEntreis(Map.entry("pawan", 90), Map.entry("sukla", 89), Map.entry("Vivek", 90));

    }
}
