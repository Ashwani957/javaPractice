
import java.lang.ref.WeakReference;

class Phone {

    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "{"
                + " brand='" + brand + "'"
                + ", model='" + model + "'"
                + "}";
    }
}

public class Garbage {

    public static void main(String[] args) {

        // Strong Reference : if we make the strong refernce then garbage collector did not remove this until we make this line ph=null then the garabge collector may b remove new Phone("Iphone","16 pro max ")
        Phone ph = new Phone("Iphone ", "16 pro max");
        // System.out.println(ph.brand + " " + ph.model);
        // System.out.println(ph);
        ph = null;
        System.out.println(ph);

// WeakReference
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Apple", "16 Pro max"));
        System.out.println(phoneWeakReference.get());

        System.gc();
        try {
            Thread.sleep(5000);

        } catch (Exception ignored) {
            System.out.println(ignored);
        }
        System.out.println(phoneWeakReference.get());

    }
}
