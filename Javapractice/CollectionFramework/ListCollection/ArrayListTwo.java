
import java.util.*;


class StringLengthComparator implements Comparator{

    @Override
    public int compare (Object o1, Object o2){
        return 0 ; 
    }
}

public class ArrayListTwo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(67);
        list2.add(89);
        list.addAll(list2);
        list.remove(1);// this will remove the element from the index 
        list.remove(Integer.valueOf(1));// This will remove the element from the  1 from the  list 
        System.out.println(list);

        // we can remove by two way first way to remove with the help of index and second way to remove with the name 
        ArrayList<String> list3 = new ArrayList<>();

        list3.add("Apple");
        list3.add("Apple");
        list3.add("Banana");
        list3.add("Mango");
        list3.add("orange");
        list3.remove("Apple");// Remove with the help of name 
        list3.remove(2);

        System.out.println(list3);
        // we can also convert it form list to array with the help of list.toArray()
        Integer[] array1 = list.toArray(new Integer[0]);
        // we have sort metho in the collection 

        Collections.sort(list);// this sort will sort the list and return nothing 
        System.out.println(list);


        List <String > words =Arrays.asList("banana","apple","mango","orange");
        words.sort(null); // this will sort according to the alphabetic way :
        // if we want that we will sort according to the lenght of the character then we will 
        words.sort(new StringLengthComparator());
        System.out.println(words);




    }
}
