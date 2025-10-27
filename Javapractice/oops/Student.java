public class Student{
    // Instance variable 
    String name ; 
    int age ; 
    int roll ; 


    Student(String name ,int age , int roll){
        this.name=name; 
        this.age=age; 
        this.roll=roll; 
    }
    public static void main (String args[]){

        // create the object of it

        Student st=new Student("Ashwani",23,211024);
        System.out.println(st.name);
        System.out.println(st.age);
        System.out.println(st.roll);
        System.out.println(st instanceof Student);
    }
}