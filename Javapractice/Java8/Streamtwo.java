
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamtwo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        // if we want to convert the arraylist into stream then we use like this 

        Stream<String> stream = list.stream();

        int arr[] = {1, 2, 3, 4, 5};
        Arrays.stream(arr);

        //  if we want to create the stream directly then we should use the strem.of method 
        Stream<Integer> integerstream = Stream.of(1, 2, 3, 4, 5);

//   create the stream
        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);

        Stream<Integer> limit1 = Stream.generate(() -> (int) Math.random() * 100).limit(100);

    }
}
