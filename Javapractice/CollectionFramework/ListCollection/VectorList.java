
import java.util.Vector;

public class VectorList {

    public static void main(String[] args) {
        // like arraylist it also have default capactiy of 10
        // In vector the increment of the size is set by us 
// if we want to incement the capacity then we should use the vector(5, 3) menas increment the value with the help of 3
        Vector<Integer> vector = new Vector<>(5,3);
        vector.add(1);
        vector.add(2);
        System.out.println("The Capacity of it is :" + vector.capacity());

    }
}
