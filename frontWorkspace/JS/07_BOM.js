function openTest() {
 
  window.open("https://www.naver.com" , "abc" , "width=500 ,height=500, resizable=no, right=500");
  
  
}

// const helloWorld =() =>{
//   alert("hello~")
// }
// const helloWorld = function() {
//   alert("hello~")
// }

function timeoutTest() {
  timr01 = setTimeout( () => {
  alert("hello");
} , 3000);
  
}
function intervalTest() {
  timr02 = setInterval( () => {
  console.log("2초 지남,,,,");
 } , 2000)
}

function clearTimeoutTest() {
  clearTimeout(timr01);
}

function clearIntervalTest() {
  clearInterval(timr02);
}

function locationTest(){
  location.reload();
}

function navigatorTest() {
  console.log(navigator);
}
function screenTest() {
  console.log(screen);
}