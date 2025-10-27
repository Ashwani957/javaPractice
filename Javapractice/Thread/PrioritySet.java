class PrioritySetOne extends Thread{

    public void run(){
        System.out.println("PriorptySetOne");
    }
    
}

class PrioritySetTwo extends Thread{
public void run(){
System.out.println("PrioritySetTwo");
}
}

class PrioritySetThree extends Thread{
public void run(){
    System.out.println("PrioritySetThree");

}
}

public class PrioritySet{
    public static void main (String args[]){

        PrioritySetOne p1=new PrioritySetOne(); 
        PrioritySetTwo p2=new PrioritySetTwo(); 
        PrioritySetThree p3=new PrioritySetThree(); 


        // Here we set the prioroty of the ques 
        
        p1.setPriority(3);
        p2.setPriority(1);
        p3.setPriority(10);

        p1.start(); 
        p2.start(); 
        p3.start(); 



    }
}