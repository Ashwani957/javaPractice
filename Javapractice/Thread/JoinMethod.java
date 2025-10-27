
public class JoinMethod extends Thread {

    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Child Method:" + i);
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) throws InterruptedException {
        JoinMethod jm = new JoinMethod();
        jm.start();

        // i want that the main thread will be wait for the thread t to execute then after that it will create 
        jm.join();
        for (int i = 0; i <= 5; i++) {
            System.out.println("Main Thread:" + i);
            Thread.sleep(1000);
        }

    }
}
