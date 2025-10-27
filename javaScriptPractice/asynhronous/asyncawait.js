// async function callapi() {
//   const url = "https://jsonplaceholder.typicode.com/posts";

//   const data = await fetch(url);
//   return data;
// }

// callapi().then((message) => {
//   console.log("messagedata:", message.json());
// });

let apicalling = async () => {
  const url = "https://jsonplaceholder.typicode.com/posts";
  const data = await fetch(url);
  console.log(data.json());
};

apicalling();
