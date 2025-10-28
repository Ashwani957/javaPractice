
import java.util.*;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // if the value of int is negative the o1 should come before o2  (ascending o1-o2)
        // if the value of int is postive then it sholud (o2-o1)
        // return o1.length()-o2.length(); // it will print according to the asceding order 
        return o2.length() - o1.length();
    }

}

class IntegerLengthComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // for descending o2-o1 
        // for ascending o1-o2;
        return o2 - o1;
    }

}

public class ArrayListComparator {

    public static void main(String args[]) {

        // sorting of the integer value 
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(12);
        list.add(22);
        list.add(1);
        // sort it 
        // Collections.sort(list);
        // list.sort(null); ascending 
        list.sort(new IntegerLengthComparator()); // descending 
        System.out.println("list sort" + list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Graphes");
        list1.add("Mango");
        list1.add("Banana");
        // list1.sort(null); // this will sort on the basis of the alphabetically 

        // list1.sort(new StringLengthComparator());
        //  we can also do with the help of lambda expression 
        // list1.sort((o1, o2) -> o1.length() - o2.length());
        list1.sort((o1, o2) -> o2.length() - o1.length());

        System.out.println(list1);

    }
}
