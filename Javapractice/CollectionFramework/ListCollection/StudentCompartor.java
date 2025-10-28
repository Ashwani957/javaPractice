
import java.util.*;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentCompartor {

    public static void main(String args[]) {

        List<Student> list = List.of(
                new Student(3, "Ashwani"),
                new Student(1, "sahil"),
                new Student(2, "Ravi")
        );

        list.stream().sorted(Comparator.comparing(s -> s.name)).forEach(s -> System.out.println(s.name));

    }
}
