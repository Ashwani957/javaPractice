
public class SleepThread {

    public void run() throws InterruptedException {
        for (int i = 0; i <= 5; i++) {
            Thread.sleep(2000);
            System.out.println(i);
        }
    }

    public static void main(String args[]) throws InterruptedException {

        System.out.println("Sleep method is calling " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            System.out.println("Thread main is sleeping");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        SleepThread st = new SleepThread();
        st.run();

    }

}
