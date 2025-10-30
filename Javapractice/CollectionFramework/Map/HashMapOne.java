
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class HashMapOne {

    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<>();
// put are used to add the key value pair int the Hashmap
        map.put(1, "Ashwani");
        map.put(2, "sahil");
        map.put(3, "karan");

        // get are used to fetch the value based on the key if the key is not present then give us null 
        System.out.println(map.get(2));
        System.out.println("The value of Map:" + map);

        // check whether any key is present or not 
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(4));

        // check whether value is present or not return true if present other wise return false 
        System.out.println(map.containsValue("Ashwani"));

        // keyset() method are used to convert the key of hashmap into set 
        Set<Integer> keys = map.keySet();
        System.out.println("keys Array:" + keys);
        for (int i : keys) {
            System.out.println(i + " " + map.get(i));
        }

//entrySet() 
// mapEntry is an inner Interface inside Map this represent one key value pair
// Map.Entry<Integer,String> are the return type of it 
// entryset is a method of the map class the are used to get the both key and value pair 
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            // getKey will return the key and getValue will return the value 
            System.out.println(entry.getKey() + "" + entry.getValue());
        }

// covert it ito uppercase 
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue().toUpperCase());
        }

    }
}
