// const btn01 = document.querySelector("#btn01");
// btn01.onclick =  f01;

// function f01() {
//   console.log("f01 called,,,,");
  
// } 고전이벤트 모델

//표준 이벤트 모델
const btn02 =document.querySelector("#btn02");
btn02.addEventListener('click' , f02);

function f02() {
  console.log("f02 호출됨,,,,");  
}

//이벤트가 발생한 요소에 접근하기
const btn03 = document.querySelector("#btn03");
btn03.addEventListener('click' , f03);

function f03(x){
  console.log(x.target); 
  
}

//기본이벤트 제거
const a1 = document.querySelector("#naver");
a1.addEventListener("click" , f04);

function f04(evt){
  evt.preventDefault();
  //기본이벤트 막아버리기~
  //JS에 기본적으로 들어가있는 함수

}

//이벤트 전파
const outer = document.querySelector("#outer");
outer.addEventListener('click' , f05)

function f05() {
  console.log("f05 called");
  
}

// const div01 = document.querySelector("#div01");
// div01.addEventListener("click" , function() { console.log("div01 click");  })

document.querySelector("#div01").addEventListener("click" , function(){ console.log("div01 click !!!!!"); });
document.querySelector("#div02").addEventListener("click" , function(){ console.log("div02 click !!!!!"); });
document.querySelector("#div03").addEventListener("click" , function(){ console.log("div03 click !!!!!"); });