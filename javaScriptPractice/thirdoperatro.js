// comma operator

let n1, n2;
const res = ((n1 = 1), (n2 = 2), n2 - n1);
console.log(res);

// optional chaining operator

const obj = {
  id: 12,
  name: "Ashwani",
    address: { city: "gurgoan", state: "Haryana" },
};

// it will give me undefined when the city is not exist or even address is not exist if i use the optional chainig but if i did not use the optional chaining and address will not exist then it will through and error
console.log(obj.address?.city);

const a =[1,2,3,4,5]
console.log(typeof a)