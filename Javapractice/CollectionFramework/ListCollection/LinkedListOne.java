
public class LinkedListOne {

    public static void main(String args[]) {
        // Here we creat the linklist and add the data in it 
        Node node1 = new Node();
        node1.value = 10;
        node1.next = null;
        Node node2 = new Node();
        node2.value = 20;
        node2.next = null;

    }
}

class Node {

    int value;
    public Node next;
}
