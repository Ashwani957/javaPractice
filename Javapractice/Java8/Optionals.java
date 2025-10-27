import java.util.Optional; 
public class Optionals {

    // before java 8 
    public static String getuserName() {
        return null;
    }

    // after java 8
    public static Optional<String> getName(){
        String name="Ashwani";
        return Optional.ofNullable(name);

    }


    public static void main(String args[]) {


        // Before java8 we should handle the exception Manually 
        // String name = getuserName();

        // if(name!=null){
        //     System.out.println(name.length());

        // }
        // else {
        //     System.out.println("name is null");
        // }

        // But after java8 we should have optional 

        // create opitonla 
        String str=null; 
        // String str=null; 
        Optional<String> str1=Optional.ofNullable(str);

        // if we want to check whether the value is present or not then we should use isPresent() it will return true if value is present otherwise it will return false 
        System.out.println(str1.isPresent());
        // if we want the value then we use the get() method 
        // System.out.println(str1.get()); 
       

        // optinal value passing 
        System.out.println(str1.orElse("Name is null"));


        // Here we call the function getName()

     Optional<String> name= getName(); 
     System.out.println("Name"+ name.orElse("name is empty"));



     
    }
}
