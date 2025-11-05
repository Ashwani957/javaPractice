
import java.util.function.Consumer;

public class Consumerjava {

    public static void main(String args[]) {
        Consumer<Integer> consumerOne = n -> System.out.println(n);
        consumerOne.accept(10);
    }
}
