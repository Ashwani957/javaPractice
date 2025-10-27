
class Animal {

    String name;
    int age;
    String bread;
    String eat;

    Animal(String name, int age, String bread, String eat) {
        this.name = name;
        this.age = age;
        this.bread = bread;
        this.eat = eat;
    }

    void fullDetails() {
        System.out.println("FullDetails of the dogs" + this.name + " " + this.age + " " + this.bread + " " + this.eat);
    }

}

class Dog extends Animal {

    Dog(String name, int age, String bread, String eat) {
        super(name, age, bread, eat);
    }

}

class Buffallo extends Animal {

    String milk;

    public Buffallo(String name, int age, String bread, String eat, String milk) {
        super(name, age, bread, eat);
        this.milk = milk;
    }

    void fullDetailsOfCow() {
        System.out.println("FullDetailsofCow"+ " " + this.name + " " + this.age + "  " + this.bread + " " + this.eat + " " + this.milk + " ");
    }

}

public class Employees {

    public static void main(String args[]) {
        Animal an = new Animal("Dog", 12, "Labrador", "Everything");
        System.out.println("Name:" + an.name);
        System.out.println("Age:" + an.age);
        System.out.println("Bread:" + an.bread);
        an.fullDetails();

        // Child constructor 
        Dog dg = new Dog("pintu", 13, "brownbread", "everything");
        System.out.println("DogName" + " " + dg.name);
        dg.fullDetails();

        // Buffallo Object 
        Buffallo bf = new Buffallo("champa", 15, "pahadi", "grass ", "pureMilk");
        bf.fullDetailsOfCow();

    }
}
