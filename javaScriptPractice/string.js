let a="abc"

// it will string print the same string abc because string  is immuatble 
console.log(a.charAt(0))


for(let value of a){
    console.log(value)
}



a[0]='x'
 

console.log(a)

// String literal 


let var1 =new String("abcd")
console.log(typeof var1)

let var2="abcd"
console.log(typeof var2)

console.log(var1===var2)