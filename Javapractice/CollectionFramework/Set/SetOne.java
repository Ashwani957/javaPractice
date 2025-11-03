
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetOne {

    public static void main(String args[]) {
        // Set is an Interface and hashSet is a implementatino class of it 
        Set<Integer> setOne = new HashSet<>(); //Hashset does not maintain the order 
        setOne.add(200);
        setOne.add(40);
        setOne.add(100);
        setOne.add(3);
        setOne.add(332323);

        // if we add the small value in the set then the hashcode will happen to the natural increasing order but this is not in the case of large value 
        // setOne.add(1);
        // setOne.add(2);
        // setOne.add(4);
        // setOne.add(7);
        // method of the set 
        System.out.println(setOne.contains(200));
        Iterator<Integer> it = setOne.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("SetOne" + setOne);
        System.out.println(setOne.size());
        // toArray method are used to convert the set into array 
        Object[] arr = setOne.toArray();
        System.out.println(arr.length);

        // LinkedlistSet
        // In the LinkedlistSet insertion order will be maintain
        Set<Integer> setTwo = new LinkedHashSet<>();
        setTwo.add(12);
        setTwo.add(89);
        setTwo.add(15);
        System.out.println(setTwo);

        // Tree set 
        Set<Integer> setThree = new TreeSet<>();
        setThree.add(12);
        setThree.add(89);
        setThree.add(15);
        setThree.add(80);
        System.out.println(setThree);

        // all three are not thread safe so we have one method inside the colletions that is SynchronziedSet to make the thread synchronizedSet(Collection) this is not a good becuase it synchornized everything 

        Set<Integer> setFour = Collections.synchronizedSet(setOne);// not good way 

        // for thread safety we use the

    }
}
