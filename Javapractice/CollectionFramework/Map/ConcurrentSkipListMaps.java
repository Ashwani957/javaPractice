
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMaps {

    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(1, "Apple");
        map.put(3, "Banana");
        System.out.println(map.ceilingKey(2));
        System.out.println(map.descendingMap());

    }
}
