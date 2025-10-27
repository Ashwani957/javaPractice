//  Interfaces are the blueprint that tell the classes what it should do but it never tell how it should do 

// Example1
// interface Student {

//     int age =10; 
//     // static string name 
//     String name ="Ashwani";
// // It Contains the abstract method 
//     public void fulldetails(); 
// }



// class StudentOne implements Student{
    

//     @Override 
//   public  void fulldetails(){
//         System.out.println("fullDetails");    
//     }
// }

// public class Interfaces {
//     public static void main(String[] args) {
//         System.out.println("Interfaces are done");
//         StudentOne stone=new StudentOne(); 
//         stone.fulldetails();
//     }
// }


// Example2:

// interface Animal {

//     void eat(); 
//     void sound(); 

// }

// class Dog implements Animal {

//     @Override 
//     public void eat(){
//         System.out.println("Dog is eating:");
//     }

//     @Override 
//     public void sound(){
//         System.out.println("Dog is barking");
//     }

// }


// class Bird implements Animal{
//     @Override 
//     public void eat(){
//         System.out.println("Bird is eating a nuts");
//     }
//     @Override 
//     public void sound(){
//         System.out.println("Bird is chirping");
//     }
// }

// public class Interfaces {
//     public static void main (String args[]){


//         // Here we can create the object of the dog 
//         Dog dg=new Dog(); 
//         dg.eat(); 
//         dg.sound(); 
//         // Here we can create the object of the Bird 
//         Bird bg=new Bird(); 
//         bg.eat(); 
//         bg.sound(); 

//     }
// }


// example 3 :after the java 8  we can create the default method 


// interface Animal {

//     void eat(); 
//     void sound(); 
//     default void greet(){
//         System.out.println("Good Morning");
//     }

// }

// class Dog implements Animal {

//     @Override 
//     public void eat(){
//         System.out.println("Dog is eating:");
//     }

//     @Override 
//     public void sound(){
//         System.out.println("Dog is barking");
//     }

// }


// class Bird implements Animal{
//     @Override 
//     public void eat(){
//         System.out.println("Bird is eating a nuts");
//     }
//     @Override 
//     public void sound(){
//         System.out.println("Bird is chirping");
//     }
// }

// public class Interfaces {
//     public static void main (String args[]){


//         // Here we can create the object of the dog 
//         Dog dg=new Dog(); 
//         dg.eat(); 
//         dg.sound(); 
//         dg.greet(); 
//         // Here we can create the object of the Bird 
//         Bird bg=new Bird(); 
//         bg.eat(); 
//         bg.sound(); 
//         bg.greet(); 
//     }
// }



// example 4 : after java 9 we can create private method inside the intefaces
// If we want to write the common logic between the default and static method then we use the private method  
interface Animal {

    void eat(); 
    void sound(); 
    default void greet(){
        printdetails(); 
        System.out.println("Good Morning");
    }
    static void stop(){
          printdetails(); 
        System.out.println("stopeed");
    }
    private static  void printdetails (){
        System.out.println("printdetails");
    }

}

class Dog implements Animal {

    @Override 
    public void eat(){
        System.out.println("Dog is eating:");
    }

    @Override 
    public void sound(){
        System.out.println("Dog is barking");
    }

}


class Bird implements Animal{
    @Override 
    public void eat(){
        System.out.println("Bird is eating a nuts");
    }
    @Override 
    public void sound(){
        System.out.println("Bird is chirping");
    }
}

public class Interfaces {
    public static void main (String args[]){


        // Here we can create the object of the dog 
        Dog dg=new Dog(); 
        dg.eat(); 
        dg.sound(); 
        dg.greet(); 
        // Here we can create the object of the Bird 
        Bird bg=new Bird(); 
        bg.eat(); 
        bg.sound(); 
        bg.greet(); 
    }
}