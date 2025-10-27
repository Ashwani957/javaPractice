
class Modifiers {

  int a = 10;

    public Modifiers() {

    }

public int getValue(){
    return a; 
}
  
}

public class AcessModifiers {
 
    public static void main(String args[]) {

        Modifiers md = new Modifiers();
    System.out.println(md.getValue())  ; 

    }
}
