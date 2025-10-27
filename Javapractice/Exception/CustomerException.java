
import java.util.* ; 
class Voting extends Exception{
     

  public Voting (){
    super("You are not eligible");
  }

  public Voting(String msg){
super(msg);
  }
}



public class CustomerException {
    public static void main (String args[]){
         Scanner sc = new Scanner(System.in);
         int age =sc.nextInt(); 
        try {
            if(age<18){
                throw new Voting("you are not able to vote");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}