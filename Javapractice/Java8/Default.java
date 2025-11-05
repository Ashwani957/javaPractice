
interface car {

    void color();

    default void selfDriving() {
        System.out.println("Self Driving is possible");
    }
}

class Example implements car {

    @Override
    public void color() {
        System.out.println("red");
    }
// we can also override the method here 
    @Override
    public void selfDriving() {
        System.out.println("Self driving is not possible");
    }

}

class Hyundai implements car {

    @Override
    public void color() {
        System.out.println("This is color Method in Hyundai");
    }
}

public class Default {

    public static void main(String args[]) {

        Example ex = new Example();
        ex.selfDriving();

    }
}
