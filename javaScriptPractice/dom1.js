const heading1 = document.getElementById("firstheading");
console.log("heading1:", heading1);

const heading2 = document.getElementById("secondheading");
console.log("heading2", heading2);
console.log("heading2 Inner element", heading2.innerHTML);
// change the text of the html using javascript

heading1.textContent = "<b>Hello Ashwani How are you</b> ";
heading2.innerHTML = "<b>Hello Ashwani How are you</b> ";

// change the style of the

heading1.style.color = "yellow";
heading1.style.background = "pink";

// add anchor tag in it

const addanchor = document.getElementById("anchorlink");

console.log(addanchor);

const linkeattribute = addanchor.getAttribute("href");

console.log(linkeattribute);

addanchor.setAttribute("href", "https://www.google.com");

// get Root Node

const nodesdetails = document.getRootNode();
console.log(nodesdetails); // it willl print the document
console.log(nodesdetails.childNodes); // document having a child html

// provide me the sibiling

console.log("sibiling", nodesdetails.childNodes[0].childNodes[0].nextSibling);

console.log(nodesdetails.childNodes[0].childNodes[0]); // the first child will be html and the first child of the html is head
console.log(nodesdetails.childNodes[0].childNodes[0].childNodes[0]);

// container

// const maincontainer = document.querySelector("#container");
// const maindiv = document.createElement("li");
// const textnode = document.createTextNode("New created List");
// maindiv.appendChild(textnode);

// maincontainer.append(maindiv);

// event listner start Here

const buttonclick = document.getElementById("btn");
const bodybackground = document.body;
// buttonclick.addEventListener("click", function () {
//   //   bodybackground.style.background = "red";
// });

// changes in the background

const thirdheadings = document.querySelector(".thirdheading");

// thirdheadings.style.background = "yellow";

const printallclass = thirdheadings.classList;
console.log(printallclass);

// button

buttonclick.addEventListener("click", function (event) {
  console.log(this); //Here this will be the button
  console.log("thirdheading", thirdheadings.classList);
  thirdheadings.classList.remove("thirdheading");
});

// event bubbling
const grandparent = document.querySelector(".grandparent");
console.log(grandparent);
const parent = document.querySelector(".parent");
console.log(parent);
const child = document.querySelector(".child");
console.log(child);

// grandparent.addEventListener("click", function () {
//   console.log("grandparent is clicked");
// });

// parent.addEventListener("click", function () {
//   console.log("parent is clicked");
// });

// child.addEventListener("click", function () {
//   console.log("child is clicked");
// });

// event capturing

// grandparent.addEventListener(
//   "click",
//   () => {
//     console.log("eventCapturing grandparent");
//   },
//   true
// );
// parent.addEventListener(
//   "click",
//   () => {
//     console.log("eventCapturing parent");
//   },
//   true
// );
// child.addEventListener(
//   "click",
//   () => {
//     console.log("eventCapturing child");
//   },
//   true
// );

const list = document.addEventListener("list");

list.addEventListener("click", (event) => {
  if ((event.target.tagName = "LI")) {
    console.log("Clicked on:", event.target.textContent);
  }
});
