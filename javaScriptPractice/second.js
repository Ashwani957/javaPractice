console.log(5 > 3 > 2);

console.log([] == []);

// we get the outpout as a false becasue when the javascript compare it compare the unicode values lexicographically (character by character)
// since 10 is compared to 9 where as the value of 1 unicode is less than it
console.log("10" > "9");

// false because it represent the not a number and This behavior exists due to the design of the IEEE 754 standard, which JavaScript follows for floating-point arithmetic.
console.log(NaN === NaN);

console.log(true == 1);

// any comparision with not a number always return a false

console.log("Comparison", NaN < 2);

// not a number means the value is not a number but it type is still a number 

let age =Number("twenty")
console.log(age)
console.log(typeof age )

