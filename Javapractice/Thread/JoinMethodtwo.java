
public class JoinMethodtwo extends Thread {

    static Thread mainthread;

    public void run() {
        try {
            mainthread.join();
            for (int i = 0; i < 5; i++) {
                System.out.println("child Thread" + i);
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String args[]) {

        mainthread = Thread.currentThread();
        JoinMethodtwo jm = new JoinMethodtwo();
        jm.start();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("main Thread" + i);
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
