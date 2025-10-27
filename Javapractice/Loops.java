
public class Loops {

    public static void main(String[] args) {

        // for loop 
        System.out.println("For loop ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }

        System.out.println("while loop ");

        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("do while loop ");

        do {
            System.out.println("Hello I am do while loop " + i);
            i++;  
        
} while (i < 20);

        System.out.println("ForEachLoop");

        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int a : arr) {
            System.out.println(a);

        }

    }

}
