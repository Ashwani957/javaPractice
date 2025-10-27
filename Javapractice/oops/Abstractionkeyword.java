
abstract class vehicles {

    abstract void start(); // we d
    abstract void stop (); 
}


class scooty extends vehicles {
    void start(){
System.out.println("Scooty will be start with both kick and brake");
    }
    void stop (){
        System.out.println("Scooty will be stop with both break and legs ");

    }
}


public class Abstractionkeyword {
    public static void main(String[] args) {
 
        scooty sc=new scooty(); 
        sc.start(); 
        sc.stop(); 
        
    }
}