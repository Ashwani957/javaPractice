class Student {
    void print (){
        System.out.println("Student is writting");
    }
}

class Student1 extends Student {
    void print(){
        System.out.println("Student1 is  writting");
    }
}



public class PolymorphismOverrriding {
    public static void main (String args[]){
 
        Student1 st=new Student1();
        st.print();
    }
}