
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalJava{
    public static void main (String args[]){
        Function <String,Integer> function =n->n.length();
        System.out.println(function.apply("Ashwani"));
        BiFunction<Integer,Integer,Integer> functionOne=(x,y)->x*y;

        System.out.println(functionOne.apply(2,3));
    
    }
}