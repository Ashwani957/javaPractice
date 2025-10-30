
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;

public class CopyOnWriteArraylist {

    public static void main(String args[]) {

        
}

// Important Points:
/*
"Copy on write ": Means that whenever we start a write operation like adding , deleting an element 
instead of directly modify the existing list a new copy of the list will be created and the modification is applied to that copy . this ensure that other threads are reading a list it being modified are unaffected

2.A new copy of the list is created for every modification .The reference to the list is then updated to that subsequent reads use this new list 
 */
