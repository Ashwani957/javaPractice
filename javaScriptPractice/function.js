function abc(a, callback) {
  console.log(a);
  callback();
}

const xyz = () => {
  console.log("callback function ");
};

abc(12, xyz);

// Constructor function

function CreateUser(name, age) {
  this.name = name;
  this.age = age;
  this.fulldetails = () => {
    console.log(`name is ${this.name} and age is ${this.age}`);
  };
}

// add the function Here
// we cannot use this wiht the arrow function becuase arrow function cannot have own this it take the this from the surronding environmnet or global environment 

CreateUser.prototype.firstName = function () {
  console.log(`the first name is :${this.name}`);
};

const userone = new CreateUser("Ashwani", 12);

console.log(userone.firstName());
console.log("userOne", userone);
console.log("userOnename", userone.name);
console.log("userOneage", userone.age);




// pure function 

// alaways give the same output for same input does not affect from any other outside variable 
// Does not modify (change) anything outside itself — no side effects.
function add(a,b){
    return a+b
}


console.log(add(1,2 ))


// Impure function 

let counter=0; 
function increase (){
    counter++;
    return counter ; 
}


// function overlaoding in javascript 

function greet(arg1){
     
    console.log("greetfucntin first paramneter ",arg1)
}

function greet(arg1,arg2){
    console.log("wiht two parametner",arg1,arg2)
}

console.log(greet(1))



// HOising concept 

console.log('Hoisting concept')


// function declaration hositing work 

sayHi()
function sayHi(){
    console.log("SayHI to function decldareation ")
}




// In function expression we get the error that is use beofre initialization 


// sayHi2()
// const sayHi2=function (){
//     console.log("functin expresssion ")
// }

// // arrow function 


// sayHi3()
// const sayHi3=()=>{
//     console.log("arrow function ")
// }



console.log(c)
let c=12


