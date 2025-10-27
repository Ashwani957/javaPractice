// first method to create the thread 
// public class ThreadCreation extends Thread {


//     // this run is the default method inside the Thread class 
//     public void run(){
//         System.out.println("Thread is running ");
//     }
//     public void run(int a , int b ){
//         System.out.println("Thread is running"+ (a+b));
//     }

//     public static void main (String args[]){

//         ThreadCreation t1=new ThreadCreation (); 
//         t1.start();  // jvn will call the thread run method without argument 
//         t1.run(1,2);

//     }
// }

// Second method to create the thread 
public class ThreadCreation implements  Runnable {


    // this run is the default method inside the Thread class 
    public void run(){
        System.out.println("Thread is running ");
    }
    public void run(int a , int b ){
        System.out.println("Thread is running"+ (a+b));
    }

    public static void main (String args[]){

        ThreadCreation t1=new ThreadCreation (); 
        Thread t2=new Thread(t1); 
        t2.start();  // jvn will call the thread run method without argument 
    }
}