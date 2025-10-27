
public class StringBegin {

    public static void main(String args[]) {

        String name = "Ashwani";
        String name1 = new String("Ashwani");

        System.out.println(name == name1);
        System.out.println(name.equals(name1));
        name = name.concat("problem");
        System.out.println(name);
        name = "karan";
        System.out.println(name);

        // String immutable : means once we declare a string we cannot modify the string any modification create a new string 


        String pass="yesno";
        String pass1=new String("yesno");
        System.out.println(pass==pass1); // false because for pass1 the value is store in string literal pool but it is not pointed by the pass1 pass1 point to the heap object and in the 
    }
}
