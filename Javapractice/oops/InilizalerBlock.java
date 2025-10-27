public class InilizalerBlock {
// constructor 
    InilizalerBlock(){
        System.out.println("Constructon calling");
    }
    // Block will be execute always 
    {
        System.out.println("Block of code");
    }

    public static void main(String[] args) {

        InilizalerBlock ib=new InilizalerBlock();
    
        
    }
}