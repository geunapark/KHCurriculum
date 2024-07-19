function openTest(){
   const x =window.open("https://www.naver.com", "abc","width=500,height=500,resizable=no ,left=500,top=500");
   
}

const helloWorld =() =>  {
    alert("hello~~!");
} 

function timeoutTest() {
 timer01 =setTimeout(
    //익명함수 이용
  () => {
        alert("hello");
    },3000);//몇초뒤에 머해라 이런거 수행  


}
function intervalTest() {
    timer02 =setInterval(() => {
        console.log("2초 지남...");
    }, 
        2000);
}

function clearTimeoutTest() {
    clearTimeout(timer01);
}
function clearInterValTest() {
    clearInterval(timer02);
}

function locationTest() {
    console.log(locationTest.href);
}

function locationTest() {
   // location.href="http://naver.com";
    location.reload();
}

function navigatorTest() {
    console.log(navigator);
}

function screenTest() {
    console.log(screen);
}