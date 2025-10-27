

// This  will show an error Because we cannot inherit the main class 


// 1.first step 
// final class Student {
//     int age ; 
//     String name ; 

// }

// class StudentOne extends Student {

// }




// public class finalkeyword{
//     public static void main (String args[]){

//     }
// }

// 2.Second in which we make the class a public but method as final 

// 1.first step 
// final class Student {
//     int age ; 
//     String name ; 

// }

// class StudentOne extends Student {

// }




// 2.final keyword 

// class Student {

//     final int a = 12 ; 
//     final void greet(){
//         System.out.println("Good Morning");
//     }


// }

// class StudentOne extends Student{
//     @Override 
//     // If we make the method as a final in the parent class then we should not able to override it 

//     void greet(){
//         System.out.println("Good Evening");
//     }

// }


// public class finalkeyword {
//     public static void main(String[] args) {

//         StudentOne stone=new StudentOne();
//         stone.greet(); 
        
//     }
// }




// 3. final variable 

// if we declare the variable as a final in the parent class then we should not able to reassing the value to the parent class

// class Student {

//     final int a = 12 ; 
//     final void greet(){
//         System.out.println("Good Morning");
//     }


// }

// class StudentOne extends Student{
 
//     a=14; // This will show an error because 'a' is a final variable and cannot be reassigned.
 

// }


// public class finalkeyword {
//     public static void main(String[] args) {

//         StudentOne stone=new StudentOne();
//         stone.greet(); 
        
//     }

// }
