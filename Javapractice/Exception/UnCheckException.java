public class UnCheckException{
    public static void main (String args[]){
  
        int a=110 ; 
        int b =0 ; 
       

        try {
             int  c = a/b;
             
        } catch (Exception e) {
        //    e.printStackTrace(); 
     System.out.println(e.getMessage());
        }
        finally {
            System.out.println("code are executed "); 
        }

    }
}