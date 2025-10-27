package SychronizationThread;

// class TotalEarning extends Thread {
//     int total = 0;
//     @Override
//     public void run() {
//         System.out.println("main Thread" + Thread.currentThread().getName());
//         for (int i = 0; i <= 10; i++) {
//             total += total + 100;
//         }
//     }
// }
// public class CooperationMethod {
//     public static void main(String[] args) {
//         System.out.println("main Thread" + " " + Thread.currentThread().getName());
//         TotalEarning te = new TotalEarning();
//         te.start();
//         // In this we get the totalEaring is zero because the main therad will be execute before the te thread so that why it will return the value zero and somethime it will return the correct value 
//         System.out.println("TotalEarning is :" + te.total);
//     }
// }
// In The above we face a problem  of data inconsitency but we can resovle it 
class TotalEarning extends Thread {

    int total = 0;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("main Thread" + Thread.currentThread().getName());
            for (int i = 0; i <= 10; i++) {
                total=total+100;
            }
            // after the completion of the execution then thread 0 or te thread will release the lock and notify the main thread to start its execution 
            this.notify();
        }

    }
}

public class CooperationMethod {

    public static void main(String[] args) throws Exception {
        System.out.println("main Thread" + " " + Thread.currentThread().getName());
        TotalEarning te = new TotalEarning();
        te.start();
        synchronized (te) {

            // its means the current thread that is main thread will release the lock and the te thread will acquire the lock after that te thread will be notify after completion of its body 
            te.wait();
            System.out.println("Total Earning+" + te.total);

        }

    }
}
