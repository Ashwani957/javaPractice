
import java.util.Arrays;

public class Array1 {

    public static void main(String args[]) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int[] arra2 = {12, 34, 45, 23};
        System.out.println("Array2" + Arrays.toString(arra2));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("array of for each ");
        for (int a : arr) {
            System.out.println(a);
        }

        System.out.println(Arrays.toString(arr));
    }
}
