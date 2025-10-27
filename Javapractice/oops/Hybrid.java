// class BaseCompany {
//     void details(){
//         System.out.println("The Basic Details of the company");
//     }
// }

// class ChildCompany extends BaseCompany {

// }

// class localCompany extends BaseCompany{

// }

// // The above code are multilevel code


// // Here this is the Hierarchical code 

// class parentCompany extends BaseCompany {

// }

// public class Hybrid {
//     public static void main (String args[]){

//         localCompany lCompany=new localCompany(); 
//         lCompany.details(); 
//         parentCompany pCompany =new parentCompany(); 
//         pCompany.details(); 

//     }
// }



// // Hybrid inheritance in which we can use the multiple inheritca mean we can use more than one inheritance 



// Second example 



interface itService{

    public void  getItService();
}

interface hardware {
    public void getHardware();
}
class BaseCompany  implements itService,hardware{
    void details(){
        System.out.println("The Basic Details of the company");
    }
   public void getItService(){
System.out.println("getItService");
    }

    public void getHardware(){
        System.out.println("Get this hardware details");
    }
}

class ChildCompany extends BaseCompany {

}

class localCompany extends BaseCompany{

}

// The above code are multilevel code


// Here this is the Hierarchical code 

class parentCompany extends BaseCompany {

}

public class Hybrid {
    public static void main (String args[]){

        localCompany lCompany=new localCompany(); 
        lCompany.details(); 
        parentCompany pCompany =new parentCompany(); 
        pCompany.details(); 
        lCompany.getHardware();
        lCompany.getItService();


    }
}



// Hybrid inheritance in which we can use the multiple inheritca mean we can use more than one inheritance 
