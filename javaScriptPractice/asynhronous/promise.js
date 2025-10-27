// Basic Promise
// let promise = new Promise((resolve, reject) => {
//   let success = false;

//   if (success) {
//     resolve("Promise Resolved");
//   } else {
//     reject("Promise Rejectd");
//   }
// });

// promise
//   .then((message) => {
//     console.log(message);
//   })
//   .catch((error) => {
//     console.log(error);
//   })
//   .finally(() => console.log("Promise Created"));

// Api call using fetch use promise

const url = "https://jsonplaceholder.typicode.com/posts/12";
// this will return us promise

const response = fetch(url);
response
  .then((message) => {
    console.log(message.json());
  })
  .catch(() => {
    console.log("error");
  });

console.log("Hello how are you ")