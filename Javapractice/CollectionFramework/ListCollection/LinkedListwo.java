
import java.util.LinkedList;

public class LinkedListwo {

    public static void main(String args[]) {

        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(2);
        linkedlist.add(4);
        linkedlist.add(6);
        linkedlist.add(8);
        linkedlist.add(10);
        System.out.println("Get Eleement:" + linkedlist.get(2)); // it will give the element at particular index 
        linkedlist.addFirst(12);// add element at first positon 
        linkedlist.addLast(13);
        System.out.println("Get First:" + linkedlist.getFirst());
        System.out.println("Get Last:" + linkedlist.getLast());
// remove method 
// linkedlist.remove();// remove will remove the first element form the linkedlist 
        linkedlist.remove(1);// remove the element at particular index

        System.out.println("Remove:" + linkedlist);
        linkedlist.removeIf(n -> n % 2 == 0);//Remove all the number that is divided by 2 
        System.out.println("RemoveIf:" + linkedlist); 

    }
}
