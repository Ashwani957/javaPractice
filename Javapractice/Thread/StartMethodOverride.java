
public class StartMethodOverride extends Thread {

    public void start() {
        System.out.println("Start method is override");
        super.start(); // this will actually call the run method 
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of i is :" + i);
        }
    }
 
    public static void main(String[] args) {

        StartMethodOverride smo = new StartMethodOverride();
        smo.start();
    }
}
