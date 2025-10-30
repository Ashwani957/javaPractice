
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;

public class CopyOnWriteArrayListThread {

    public static void main(String args[]) {
        // CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        ArrayList<String> list = new ArrayList<>();
        list.add("milk");
        list.add("banana");
        list.add("Graphes");
        list.add("butter");

        // for (String item : list) {
        //     if (item.equals("banana")) {
        //         list.add("oranges");
        //         list.add("pineapple");
        //     }
        // }
        System.out.println(list);

        Thread t1 = new Thread(() -> {
            try {

                while (true) {
                    for (String item : list) {
                        System.out.println("The list item:" + item);
                        Thread.sleep(1000);
                    }
                }

            } catch (Exception e) {

            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(500);
                list.add("Mango");
                System.out.println("Added Item4 to the list:");
                list.remove("banana");
            } catch (Exception e) {
                System.out.println("Thread Message:" + e.getMessage());
            }
        });

        t1.start();
        t2.start();
    }
}
