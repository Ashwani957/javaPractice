
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMaps {

    public static void main(String args[]) {

        // in sorted oreder we cna find the range wiht the help of map.firstkey(), map.lastkey(),map.headMap, map.tailMap()
        // In the Naviagablemap  are used when we want to find the closest one 
        NavigableMap<Integer, String> nav1 = new TreeMap<>();
        nav1.put(1, "one");
        nav1.put(6, "Six");
        nav1.put(5, "Five");
        System.out.println(nav1);
        System.out.println(nav1.lowerKey(5));// it will reutrn the lower key of five just 5 lower key is 1
        System.out.println("celing key " + nav1.ceilingKey(3));// it will return the upper key of the  if we did not provide the exact key if we provide the exact key then it will provdie the same key 
        System.out.println(nav1.descendingMap());
        System.out.println("NavigableKeySet()" + nav1.navigableKeySet());

    }
}
