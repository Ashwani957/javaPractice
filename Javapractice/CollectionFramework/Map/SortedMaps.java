
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;

public class SortedMaps {

    public static void main(String args[]) {
        // sorted map is a interface and its implements by the treeMap class
        // SoretedMap in which we get the result automatiically sorted 
        SortedMap<Integer, String> map = new TreeMap<>();
        // Map<String, Integer> map = new TreeMap<>();
        // map.put("A", 1);
        // map.put("D", 2);
        // map.put("C", 3);
        map.put(1, "A");
        map.put(2, "D");
        map.put(3, "C");
        System.out.println(map);
        // we should have more benfits of sorted map because we have lot of method Here like ;
        System.out.println(map.firstKey());// return the first key after sorted 
        System.out.println(map.lastKey());
        System.out.println(map.headMap(2));//It will return the element from the head and it will exclude the key
        System.out.println(map.tailMap(2));//It will return the element from the tail  it include the key 

        // The above example will be sorted in natural order if we want in the descending order then 
        // Know it will be sorted on the basis of the descending order  
        SortedMap<Integer, String> map2 = new TreeMap<>((a, b) -> b - a);
        map2.put(1, "A");
        map2.put(2, "D");
        map2.put(3, "C");
        System.out.println(map2);

    }
}
