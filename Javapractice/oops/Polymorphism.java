
// Method overloading 

public class Polymorphism {


    public static int sum(int a , int b ){
        return a +b ; 
    }

    public static int sum (int a , int b , int c){
        return a+b+c; 
    }
    public static int sum (int a , int b , int c , int d){
        return a+b+c+d; 
    }

    public static int sum (int a , int b , int c , int d , int e){
        return a+b+c+d+e; 
    }
    
   






    public static void main (String args[]){
 
        Polymorphism pl=new Polymorphism(); 
        System.out.println(pl.sum(1,2));
        System.out.println(pl.sum(1,2,3));
        System.out.println(pl.sum(1,2,3,4));
        System.out.println(pl.sum(1,2,3,4,5));

    }

}