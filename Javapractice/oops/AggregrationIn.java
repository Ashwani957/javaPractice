// class 1 
class Address {
    String city , street , state; 

    Address (String city, String street , String state){
        this.city=city; 
        this.street=street; 
        this.state=state; 
    }
}

// class 2 
class Employee {
    int id ; 
    String name; 
    Address adr ;  // aggregation in java oops
    Employee (int id , String name , Address adr){
        this.id =id ; 
        this.name=name; 
        this.adr=adr; 
    }

    // method to display 

     public void dispaly(){
        System.out.println("The Display method "+adr.city +" "+adr.state+" " + adr.street);
        System.out.println("The Details of the Emp"+ this.id +" "+ this.name );
    }

}




public class AggregrationIn {
    public static void main (String args[]){

Address adres=new Address("Amritsar","nangali","Punjab");

Employee emp=new Employee(2,"Ashwani",adres);

System.out.println(emp);
 emp.dispaly();


}
}