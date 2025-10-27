// creation of object
const obj = {
  name: "ashwnai",
  class: 12,
  phoneNo: 343224343,
};

// anther method to create the object

const obj1 = new Object();
obj1.name = "sahil";
obj1.class = 11;
console.log(obj1);

console.log(obj);

// iterate over the object

for (let key in obj1) {
  console.log(key, "", obj1[key]);
}

// check whether the property exist or not
console.log("name" in obj1);

// mergin the object

const obj2 = {
  city: "Amritsar",
};

const obj3 = { ...obj1, ...obj2 };
console.log("Mergin the object", obj3);

const obj4 = Object.assign(obj1, obj2);

console.log("assign", obj4);

// method of the objects

const object5 = {
  education: "Btech",
  Branch: "CSE",
  Roll: 123456789,
  password: "ash123456",
};

// object.keys() provide the array of the key of object

console.log(Object.keys(object5));

// counting the length of the prorpety
console.log(Object.keys(object5).length);

// Iterate over the object
Object.keys(object5).forEach((key) => {
  console.log(key, object5[key]);
});

// looping throught object using for in loop
for (let key in object5) {
  console.log(key, object5[key]);
}

// filtering from the object

console.log(Object.keys(object5).filter((key) => key !== "password"));

// Important concept

function createfunction() {
  let obj1 = {
    company: "cpt",
    field: function () {
      console.log("Working in the tech industry");
      createfunction;
    },
  };
  return obj1;
}

let object2 = createfunction();
object2.field();
console.log(object2.company);

// cloining the object

const object3 = {
  name: "karan",
  age: 18,
};

const object4 = {
  city: "amritsar",
  state: "Punjab",
};

const object6 = Object.assign(object3, object4);
console.log(object6);

for (let key in object6) {
  console.log(key, ":", object6[key]);
}

// state

console.log("state missing ");
Object.keys(object6)
  .filter((key) => key != "state")
  .forEach((key) => {
    console.log(key, object6[key]);
  });




  