
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteSets {

    public static void main(String args[]) {

        // Thread safe
        // copy on write mechanism 
        //No duplicate Elements 
        //Iterator do not reflect modification 
        CopyOnWriteArraySet<Integer> set1 = new CopyOnWriteArraySet<>();
        CopyOnWriteArrayList<Integer> set2 = new CopyOnWriteArrayList<>();
        ConcurrentSkipListSet<Integer> set3 = new ConcurrentSkipListSet<>();
        // Here we insert the element 
        for (int i = 0; i <= 15; i++) {
            set1.add(i);
            set2.add(i);
            set3.add(i);
        }
        // Here we read the element 
        // Here we work on the 
        System.out.println("CopyOnWriteSet");
        for (Integer num : set1) {
            System.out.println("Read the value form the CopyOnwriteSet" + num);
            // while reading i try to write the value
            set1.add(6);// It will just print the five element because after printing it will creat the new copy of it when it will be itrate then it will be itrate over the stable copy 
        }
        // know we will itrate over the set 
        System.out.println("CopyOnWriteArrayList");
        for (Integer num : set2) {
            System.out.println("Read the value form the CopyOnwriteArrayList" + num);
            // while reading i try to write the value
            set2.add(6);// It will just print the five element
        }

        // 
        System.out.println("ConcurrentSkipListSet");
        for (Integer num : set3) {
            System.out.println("Read the value for the ConcurrentSkipListSet" + num);
            set3.add(6);
        }

    }
}
