class animal {
    constructor(bread,color ,size ){
        this.bread=bread,
        this.color=color,
        this.size=size
    
    }


    Details(){
        console.log(`The bread of the animal is ${this.bread}, the color is ${this.color} and the size is ${this.size}`)
    }



}

class dog extends animal{
    constructor(bread,color,size,){
        super(bread,color,size)
    }

}


const dogdetails=new dog("libra","black","25kg")
dogdetails.Details()