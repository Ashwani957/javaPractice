
import java.util.LinkedList;

public class LinkedLIstActAsStack {

    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        // Remove first 

        // list.removeFirst(); // peek  // it will remove element from the first 
        System.out.println(list);
        System.out.println(list.getFirst());

        // linkedlist also act as a Queue  because in the linkedList when an person come to goes to last
        LinkedList<Integer> list2 = new LinkedList<>();

        list2.addLast(12); // when we insert the element in the queue then we call it enque
        list2.addLast(13);//enque means insert 
        list2.addLast(144);

        System.out.println(list2);
        // remove from the first 
        list2.removeFirst();// dequeue means remove 
        System.out.println(list2);

    }
}
