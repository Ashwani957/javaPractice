// array creation

const arraynew = new Array(5);

arraynew.push(1);
arraynew[0] = 12;

console.log(arraynew);

const arr = [1, 2, 3, 4, 5];

arr.length = 10;
console.log(arr.length);
console.log(arr);

arr.length = 2;
console.log(arr.length);
console.log(arr);

// concatetaion

const arr2 = [5, 6, 7, 8, 9];

const newarray = arr.concat(arr2);
console.log(newarray);

// print the alternative array

const arralternative = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

for (let i = 0; i < arralternative.length; i += 2) {
  console.log(arralternative[i]);
}

function lineraSearch(key, array) {
  for (let i = 0; i < array.length; i++) {
    if (array[i] === key) {
      return i;
    }
  }
}

let key = 10;

const index = lineraSearch(key, arralternative);

console.log("Search at index:", index);

// largest of array

const largestelement = [120, 45, 67, 43, 90];

largestelement.sort();
console.log(largestelement[largestelement.length - 1]);

function largrstofArray(max, array) {
  for (let i = 0; i < array.length; i++) {
    if (array[i] > max) {
      max = array[i];
    }
  }
  return max;
}

let max = largestelement[0];

let maxvalue = largrstofArray(max, largestelement);
console.log("maxValue", maxvalue);

// second largest element in the array

function secondLargestElement(array) {
  const maxvalue = largrstofArray(array[0], array);
  var seconMaxValue = -1;
  for (let i = 0; i < array.length; i++) {
    if (array[i] != maxvalue) {
      if (array[i] > seconMaxValue) {
        seconMaxValue = array[i];
      }
    }
  }

  return seconMaxValue;
}

const largestElementSecond = secondLargestElement(largestelement);
console.log("secondlargestElement", largestElementSecond);



// Remove the duplicate element from the array 



const duplicateArray=[1,3,4,3,5,6,5]




function removeDuplicate(array){

    let newarray=[]

    for(let i = 0 ; i<array.length; i++){
        
    }


}

removeDuplicate(duplicateArray)