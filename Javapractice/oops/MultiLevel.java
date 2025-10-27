 class Animal {
    int age ; 
    String name ; 
    String bread ; 
    Animal (int age , String name , String bread){
        this.age =age; 
        this.name=name; 
        this.bread=bread; 
    }

    void fullDetails (){
        System.out.println("FullDetials"+" "+ " "+this.name+" " +" "+ this.age + " " + this .bread);
    }

}
class dog extends Animal {
    dog(int age , String name , String bread ){
        super(age, name , bread);
    }
}
class buffallo extends Animal {
    buffallo (int age , String name , String bread){
        super(age,name, bread);
    }
}
public  class MultiLevel{
    public static void main (String args[]){

        // Multilevel question 
        buffallo bf =new buffallo(12 , "chandu","pahadi"); 
        bf.fullDetails(); 

    }
}