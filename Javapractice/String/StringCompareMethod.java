
public class StringCompareMethod {

    public static void main(String args[]) {

        String name = "Ashwani";
        String name1 = "ashwani";
        System.out.println(name.equals(name1));
        // Ignoring the case 

        System.out.println(name.equalsIgnoreCase(name1));

// CompareTo 
//  it will reutrn the value by name-name1 first convert it into asci value 
// if equal then return zero 
        System.out.println(name.compareTo(name1));
        System.out.println(name.compareToIgnoreCase(name1));// if equal then reutrn zero 

// concate method in string 
// 1.pulus (+)
// Because our programee execute from left to right 
        System.out.println(name + 10 + 20);//Ashwani1020
        System.out.println(name + (10 + 20));//Ashwani30
        System.out.println(10 + 20 + name);//30Ashwani

        // System.out.println(name+10-5);//error (first we concat then we try to subtract form string )
        // concat method 
        System.out.println(name.concat("Maurya"));

        System.out.println(String.join(",", name, name1));

        // substring method 

        System.out.println(name.subSequence(2,5));
        System.out.println(name.substring(3));

    }
}
