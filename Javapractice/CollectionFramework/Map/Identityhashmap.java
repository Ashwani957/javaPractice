
import java.util.Map;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class Identityhashmap {

    public static void main(String args[]) {
        String key1 = new String("key");
        String key2 = new String("key");
        Map<String, Integer> map = new HashMap<>();
        map.put(key1, 1);
        map.put(key2, 2); // it will overide the value of key becauase in map key will be unique 
        System.out.println(key1.equals(key2));
        System.out.println(map); // it print print only the key2
// hascode of the string class
        System.out.println(key1.hashcode());
        System.out.println(key2.hashcode());

        // to get the hashcode we will use it 
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        // IdentityHashMap will compare the value with the help of equality check means where we check the reference not the content of it  because key1 and key2 are genreated with the help of new keyword then we should use other 
        // IdentityHashcode and equality (==)
        Map<String, Integer> map2 = new IdentityHashMap<>();
        map2.put(key1, 1);
        map2.put(key2, 2);
        System.out.println(map2);//It will print the key value pair for both 

    }
}
