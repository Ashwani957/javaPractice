// closure is a function that remeber and having a access of outer scope variable even the outer function complete its execution

function outterfunction() {
  let name = "ashwani";
  function innerfunction() {
    console.log(name);
  }

  return innerfunction;
}

const outter = outterfunction();

outter()
// where we use this clousre  here we use the clouser for private purpose 

function counter(){
let count=0;
    return function incrementCounter(){

        count++; 
        console.log(count)

    }
}

const outtercounter=counter()
outtercounter()
outtercounter()
outtercounter()
outtercounter()
outtercounter()
outtercounter