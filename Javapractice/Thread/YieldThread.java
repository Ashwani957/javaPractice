
public class YieldThread extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {

        YieldThread y1 = new YieldThread();
        YieldThread y2 = new YieldThread();

        y1.start();
        Thread.yield();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread" + " " + Thread.currentThread().getName() + i);
        }

    }
}
