
import java.util.ArrayList;
import java.util.List;

class StudentOne implements Comparable<StudentOne> {

    String name;
    Double cgp;

    StudentOne(String name, Double cgp) {
        this.name = name;
        this.cgp = cgp;
    }

    @Override
    public int compareTo(StudentOne o) {
        return Double.compare(o.cgp, this.cgp);
    }

    @Override
    public String toString() {
        return "{"
                + " name='" + name + "'"
                + ", cgp='" + cgp + "'"
                + "}";
    }
}

public class Student {

    public static void main(String args[]) {
        List<StudentOne> stu = new ArrayList<>();
        stu.add(new StudentOne("Ashwani", 8.45));
        stu.add(new StudentOne("Karan", 9.45));
        stu.add(new StudentOne("sahil", 7.45)
        );
        stu.sort(null); // if we pass as null then its means natural comparison  it only work for interger or string not for class
        System.out.println(stu);

    }
}
