
interface Showing {

    void show();
}

class Printer {

    Printer() {
        System.out.println("This is my constructor");
    }

    static void m1() {
        System.out.println("This is my static Method");
        System.out.println("This is second method");
    }

    // non static method calling 
    void m2() {
        System.out.println("This is my instance method");
    }

}

public class MethodReferenceTwo {

    public static void main(String args[]) {

        Printer printer = new Printer();
        // instance variable 
        Showing showing2 = printer::m2;

        // showing2.show();
        // first accessing the static method using the method Reference 
        Showing showing = Printer::m1;
        showing.show();

        // Constructor Reference  
        Showing showing3 = Printer::new;
        showing3.show();
        

    }
}
