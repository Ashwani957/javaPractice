

// Any interface that contain the only one abstract method is know as functional interface 
interface calculate {
    void printDetails (); 
}


class square implements  calculate {
    @Override 
    public void  printDetails(){
        System.out.println("Hello world ");
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {
        
        square sq =new square(); 
        sq.printDetails(); 
    }
}