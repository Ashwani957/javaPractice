
public class VariableScope {


    int a = 10 ; // instance variable 
    final int b = 20; // we cannot modify the value of it 
    static String name = "John";

    public static void greet(){
        // local variable 
        String wish="good Morning";
        System.out.println(wish);
    }


    public static void main(String args[]) {

        VariableScope v1 = new VariableScope();
        VariableScope v2 = new VariableScope();
        System.out.println("using class name" + VariableScope.name);
        System.out.println(v1.name);
        v1.name = "ashwani";
        System.out.println(v2.name);

        greet(); 

    }
}
