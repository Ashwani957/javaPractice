console.log("Exectution start");

setTimeout(() => {
  console.log("Time out Run Here");
}, 1000);

console.log("Exectution end");

// callback hell

setTimeout(() => {
  console.log("step1");

  setTimeout(() => {
    console.log("step2");

    setTimeout(() => {
      console.log("step3");
    }, 1000);
  }, 2000);
}, 3000);

