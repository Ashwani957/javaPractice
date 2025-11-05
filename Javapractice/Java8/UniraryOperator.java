
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UniraryOperator {

    public static void main(String args[]) {

        // Here we declare both that it will take a Integer and return the integer 
        Function<Integer, Integer> fn = x -> x * x;

        System.out.println("FunctionalOperator" + fn.apply(2));

        // But in this case when the input and output datatype will be change then  we should use the uniraryOperator 
        // Here the output and input datatype will be same 
        UnaryOperator<Integer> un = x -> x * x;
        System.out.println("UnaryOperator" + un.apply(3));

        UnaryOperator<Double> un2 = x -> x * x * 0.23;
        System.out.println("UnaryOperator" + un2.apply(2.0));

        // Here we have Binary operator 
        BiFunction<Integer, Integer, Integer> fn2 = (x, y) -> x * y;
        System.out.println("BiFunction" + fn2.apply(2, 3));

        // we can also write the above Bifunction with the help of BinaryOperator 
        BinaryOperator<Integer> bn2 = (x, y) -> x * y;
        System.out.println("BinaryOperator" + bn2.apply(1, 2));

    }
}
