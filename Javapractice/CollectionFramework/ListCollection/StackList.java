
import java.util.Stack;
import java.util.LinkedList;
public class StackList {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        System.out.println(st.peek());// peek method are used to peek the top element  from the stack 
        //  if we want to remove the element from the stack then  we should use the pop element 
        // st.pop();
        System.out.println(st); // pop will remove the last element 
        System.out.println(st.size());
        System.out.println(st.isEmpty());
// search are used to search the element form the stack at the top level 
        System.out.println(st.search(3)); // search having the one based indexing 

// we can also use the linkelist as a stack 
LinkedList<Integer> list = new LinkedList<>();
       list.addLast(1);
       list.addLast(2);
       list.addLast(3);
       list.addLast(4);
       list.addLast(5); // behave like push 
       
        System.out.println(list);
        
        list.removeLast(); // behave like pop 
        System.out.println(list);

        System.out.println(list.getLast());// behave like peek()


    }
}
