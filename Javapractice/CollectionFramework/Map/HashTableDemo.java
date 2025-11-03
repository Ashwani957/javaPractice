
import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String args[]) {
        // it also implement the map 
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        //Hashtable is present in jdk verion 1.0 
        //legecy class 
        // it is synchronized but we cannot use it because it is replace by concurrenthashMap
        //It is slowe becuase multiple thrad cannot be acessed the same resource at a time 
        // in hastable we do not use null as a key or value but in the map we can use one null value as a key   
        // only likedlist in case of collision 
        // all method are synchronzed 
        hashtable.put(1, "apple");
        hashtable.put(2, "orange");
        hashtable.put(3, "pineapple");
        System.out.println(hashtable);
        System.out.println(hashtable.get(2));
        System.out.println(hashtable.get(1));
        System.out.println(hashtable.containsKey(1));
        System.out.println(hashtable.contains("apple"));

    }
}
