
const url="https://jsonplaceholder.typicode.com/posts"

const xhr=new XMLHttpRequest();

// this open method is used to initilize the new request 
xhr.open("GET",url)

xhr.onload=function(){
    if(xhr.status===200){
        console.log(JSON.parse(xhr.responseText))
    }
}

xhr.send()