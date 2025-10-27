
class Threadone extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i+" "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

public class SleepThreadTwo extends Thread {

    public static void main(String args[]) {
      Threadone to=new Threadone(); 
      Threadone to1=new Threadone(); 
     
   to.start(); 
   to1.start(); 
    //   to.run(); 
    //   to1.run(); 

    }
}
