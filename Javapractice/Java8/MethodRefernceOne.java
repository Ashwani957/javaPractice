
@java.lang.FunctionalInterface
interface Showing {

    void show();
}

public class MethodRefernceOne {

    public static void main(String args[]) {
        Showing showing = () -> System.out.println("Lambda expression ");
        
        showing.show();
    }
}
