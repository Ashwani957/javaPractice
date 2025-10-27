// Encapsulation means wrapping of data (variables) and the acting of the data into the single unit (together)

// step to achieve encapsulation :
// 1.first make all the variables in the class as a private 
// 2.Provide public setter and getter method to modify and view the variables values 


// Data Hiding 
// Data Hiding means restricting the direct access of the variables to the internal data (variables)  of a class and allowing access only through the public methods 



class Student {
    private String name ; // data hiding because this method is not directly accessed by the other class
    private int rollNo;

    public void setName(String name){
        this.name=name; 
    }
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }

    public String getName(){
        return name; 
    }
    public int getRollNo(){
        return rollNo; 
    }

}


public class Encapsulation {
    public static void main(String args[]){

        Student st=new Student(); 
        st.setName("Ashwani"); 
        st.setRollNo(211024); 
        // After that we print it 

        System.out.println("print the name"+st.getName());
        System.out.println("print the rollNo"+st.getRollNo());

    }
}