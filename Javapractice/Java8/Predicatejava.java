
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicatejava {

    public static void main(String args[]) {

        Predicate<Integer> predicate = n -> n > 10;
        boolean b = predicate.test(20);
        System.out.println(b);

        BiPredicate<String, Integer> predicatesOne = (x, y) -> x.length() == y;

        System.out.println(predicatesOne.test("Ashwani", 7));
        
    }
}
