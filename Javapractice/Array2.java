

import java.util.Arrays;
class Student {

    public int age;
    public String name;

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }
}


public class Array2 {
    public static void main(String args[]) {

        // Declare the Array of the student 
        // Here we make the non-Primitve array 
        int arr[] = new int[5];
        Student arr1[] = new Student[3];
        arr1[0] = new Student("Ashwani", 2);
        arr1[1] = new Student("Pawan", 12);
        arr1[2] = new Student("Karan", 23);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i].name);
            System.out.println(arr1[i].age);
        }
    }
}
