const obj1 = {
  key: "value1",
  key2: "value2",
};

const obj2 = {
  key3: "value3",
};

// console.log(obj2.key1)

// object2.createa are used to create a new object and set another object as it prototype

// if we want to create the object with inheritance of parent object or another object then we will use it
const obj3 = Object.create(obj1);

console.log(obj3.key);

// console.log(obj3.__proto__)

function hello() {
  console.log("Hello world");
}

console.log(hello);
console.log(hello.name);
console.log(typeof hello);

hello.fistname = () => {
  console.log("first name ");
};

hello.lastname = "Rajput";
hello();

hello.fistname();

console.log(hello.lastname);

// constructor function

function fulldetails(firstname, lastname) {
  this.firstname = firstname;
  this.lastname = lastname;

  this.printfulldetails = () => {
    console.log(`${this.firstname} ${this.lastname}`);
  };
}

fulldetails.prototype.firstnames = function (){
  console.log("prototype first name", this.firstname);
};

const details = new fulldetails("Ashwani", "Maurya");

details.printfulldetails();
details.firstnames()

// Here we inherit the name and whatever we have
const objectdetails = Object.create(details);

console.log(objectdetails.firstname);
