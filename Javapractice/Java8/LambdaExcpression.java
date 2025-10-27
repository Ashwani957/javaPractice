// first example without parameter
// interface  calculate {
//     void printDetails();
// }


// // class square implements calculate {
   
   

// // }

// public class LambdaExcpression {
//     public static void main (String args[]){
//         // Here we can Provide the implemtation of the method that are defined in the functional interface 

//         // multiple line we can write anything in this body 
//      calculate cl=()->{
//         System.out.println("Helo");
//      };
// cl.printDetails();
//     }
// }


// Second example with parameter 


interface  Calculator {
    int sum(int a , int b );
}


// class square implements calculate {
   
   

// }

public class LambdaExcpression {
    public static void main (String args[]){
         
        Calculator cl= (a,b)->{
            return a+b; 
        };
 
      System.out.println(cl.sum(2,3))  ;
    }
}