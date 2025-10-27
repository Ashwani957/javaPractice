
public class StringBuilders {

    public static void main(String args[]) {

        StringBuilder str = new StringBuilder("Ashwani");
        StringBuffer str1 = new StringBuffer("karan");
        System.out.println(str);
        System.out.println(str1);
        // common method of the stirn gbuffer and builder 

        str.append("maurya");
        str1.append("Sing");
        System.out.println(str);
        System.out.println(str1);
        // lenght of the string 
        System.out.println(str.length());
        System.out.println(str1.length());

        // charAt
        System.out.println(str.charAt(0));
        System.out.println(str1.charAt(1));
        // insert 
        System.out.println("Insert method " + str.insert(0, 'V'));
        System.out.println(str.length());
        System.out.println("Insert method in str1 " + str1.insert(0, 'v'));
        System.out.println(str1.length());

        // Replace 
        System.out.println("Replace" + str.replace(1, 3, "kkk"));
        System.out.println("Replace in the string Builder" + str1.replace(1, 3, "aaa"));
        // Delete 
        System.out.println("Delete" + str.delete(1, 3));
        System.out.println("Delete" + str1.delete(1, 3));

        // setCharAt particular index 
        StringBuffer name=new StringBuffer("suman");
        name.setCharAt(0,'k');
        System.out.println(name);

        // subString are used to provide the sub part of the sting 
       String k=     name.substring(0,3);
            System.out.println(k);
      

    }
}
