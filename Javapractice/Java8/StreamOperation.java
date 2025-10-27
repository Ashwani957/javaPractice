
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation {

    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        // HEre we filter out the even number 
        List<Integer> collect = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        List<Integer> collects = collect.stream().map(n -> n / 2).collect(Collectors.toList());
        System.out.println(collects);
    }
}
