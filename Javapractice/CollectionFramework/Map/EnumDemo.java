
import java.util.EnumMap;
import java.util.Map;

public class EnumDemo {

    public static void main(String args[]) {

        Map<Day, String> map = new EnumMap<>(Day.class);
        // array of size same as enum 
        //no hasing 
        // ordinary is used 
        //Faster than HashMap
        //Memory efficiently
        map.put(Day.MONDAY,'GYM'
        );
        map.put(Day.TUESDAY,'Walk'
        );
        map.put(Day.MONDAY, "walk");

        
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
