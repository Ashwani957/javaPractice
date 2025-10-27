public class FinallyBlock {


public static int blockedexec(int a ){

    try {
        
     System.exit(0); // only the system.exit will break the flow of the code 
  
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    finally{
        System.out.println("Hello world ");

    }
    return a ; 
}


    public static void main (String args[]){


blockedexec(2);
         


    }
}