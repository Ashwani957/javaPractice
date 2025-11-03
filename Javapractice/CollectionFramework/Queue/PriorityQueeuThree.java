
import java.util.Comparator;
import java.util.PriorityQueue;

class Students {

    int marks;
    String name;

    Students(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.marks;
    }
}

public class PriorityQueeuThree {

    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // least element having higher priority Here 
        pq.add(13);
        pq.add(15);
        pq.add(64);
        pq.add(43);
        System.out.println(pq); // It will print in the reverse order 

        // descending order 
        PriorityQueue<Students> pq2 = new PriorityQueue<>((s1, s2) -> s2.marks - s1.marks);
        pq2.add(new Students(89, "Ashwani"));
        pq2.add(new Students(80, "sahil"));
        pq2.add(new Students(56, "karan"));
        System.out.println(pq2);

    }
}
