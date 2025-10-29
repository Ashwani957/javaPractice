
import java.util.LinkedList;
import java.util.Arrays;
public class LinkedListThree{
    public static void main (String args[]){
        // if we want to create the linkelist at a time then we should use like this 
        LinkedList<String> link=new LinkedList<>(Arrays.asList("Dog","Cat","Tiger","Lion"));
        LinkedList<String> link2=new LinkedList<>(Arrays.asList("Dog","Mouse"));
        link.removeAll(link2);// Remove the common element form both the list , list and list2

        System.out.println("Link"+link);

        
    }
}