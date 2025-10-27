import java.util.* ; 

class SalrayNegativeException extends Exception {

    public SalrayNegativeException() {
        super("your salary is very low ");
    }


    public SalrayNegativeException(String msg){
        super(msg);
    }


}
public class CustomeException3{
    public static void main(String[] args) {

        Scanner sc =new Scanner (System.in);
        int salary=sc.nextInt(); 
        try {
            if (salary<1000){
                    throw new SalrayNegativeException("you salary is two low you cannot able to get the loan ");
            }
            else {
                System.out.println("you are able to get the loan");
            }
        } catch (Exception e) {
            System.out.println(e);
        }



        
    }
}