// const headingfirst = document.getElementById("firstheading");
// const secondheading = document.getElementById("secondheading");
// const thirdheading = document.getElementById("thirdheading");
// const fourheading = document.getElementById("fourheading");
// const fifthheading = document.getElementById("fiveheading");

// console.log(fifthheading);

// setTimeout(() => {
//   headingfirst.textContent = "one";
//   headingfirst.style.color = "violet";
//   setTimeout(() => {
//     secondheading.textContent = "two";

//     secondheading.style.color = "pink";

//     setTimeout(() => {
//       thirdheading.textContent = "third";
//       thirdheading.style.color = "yellow";

//       setTimeout(() => {
//         fourheading.textContent = "four";
//         fourheading.style.color = "purple";

//         setTimeout(() => {
//           fifthheading.textContent = "five";
//           fifthheading.style.color = "black";

//           setTimeout(() => {});
//         });
//       }, 4000);
//     }, 3000);
//   }, 2000);
// }, 1000);

setTimeout(() => {
  console.log("step1");

  setTimeout(() => {
    console.log("step2");

    setTimeout(() => {
      console.log("step3");

      setTimeout(() => {
        console.log("step4");
      }, 4000);
    }, 3000);
  }, 2000);
}, 1000);
