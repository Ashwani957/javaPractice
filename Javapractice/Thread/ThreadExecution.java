
class ThreadOne extends Thread{
    public void run(){
        System.out.println("First thread is running");

    }
}

class ThreadTwo extends Thread{
    public void run(){
System.out.println("Second thread is running ");
    }
}


public class ThreadExecution {


    public static void main(String args[]){


        // the sequence of exectuion of the thread is  determine by the jvm 
        ThreadOne t1=new ThreadOne(); 
        ThreadTwo t2=new ThreadTwo();  
        Thread.currentThread().setName("Ashwani");
        // t1.start(); 
        // t2.start();

        // if we want to get the name of the thread then we should use the mthod like getName

        System.out.println("Thread name:"+Thread.currentThread().getName());
      t1.run(); 

    }
}