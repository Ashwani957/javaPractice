import java.util.* ; 

 class AgeToLowException extends Exception {

    // first method to handle exception 
    public AgeToLowException (){
        super("you are under age");
    }

    public AgeToLowException(String msg){
        super(msg);
    }

}

public class CustomException2 {
    public  static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt(); 
        try {
            if(age>18){
                System.out.println("you are eligible to vote");
            }

            else {
                throw new AgeToLowException("You are under age so you cannot vote"); 
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    

    }
}