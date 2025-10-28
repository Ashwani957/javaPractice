package CollectionFramework.ListCollection;

import java.util.*;

public class ArrayListOne {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        // as a list will always return the list that is parent of every list 
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // we always use the list because arrays.asList will return the fixed sized array 
        // we cannot do anything when these arraylist when we create with the help of Array.aslist except remove the list 
        List<Integer> list3=Arrays.asList(1,2,3,4,5);
        // in new version of the arraylist we can also create the arraylist with the help of List.of() method 
        List<Integer>list4 =List.of(1,2,3,4,5);
        // list4.add(3); we cannot add anything or remove means we cannot perform any operation Here 
System.out.println("list4:"+list4);
        System.out.println(list2);

        // provide the class name 
        System.out.println("class Name :" + list.getClass().getName());
        System.out.println("list 2 :" + list2.getClass().getName());

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        // indexingis possible 
        System.out.println("The element at particular index is :" + " " + list.get(2));

        // particular element present or not then we use the contain method 
        System.out.println("Contain method:" + list.contains(5));

        // Remove element from the index 
        list.remove(1);

        // if we want to add at partuicaulr index then we should use the add 
        // if we add the element with the help of add at particular index then it will move the elemnt to the partiuclar index at next element 
        list.add(2, 10);

        // if we use the set then it will add the partcuialre element at that index and replace the element already present at that index 
        list.set(2, 15);

// if we want to iterate then we use the for loop 
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // second way to iterate 
        // for(int x : list){
        //     System.out.println(x);
        // }
    }
}
