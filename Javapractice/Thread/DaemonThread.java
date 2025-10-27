class ThreadOne extends Thread{
    public void run(){
        System.out.println("Daemon Thread is create");
    }
}


public class DaemonThread{
    public static void main (String args[]){

        DaemonThread dt=new DaemonThread();
       
        System.out.println(Thread.currentThread().getName());
        ThreadOne t1=new ThreadOne(); 
        t1.setDaemon(true);
        // System.out.println(t1.isDaemon());
        t1.start(); 


    }
}