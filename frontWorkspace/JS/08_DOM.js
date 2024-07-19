
// const x = document.querySelector("#result");
// console.log(x); //요소 가져오기

// x.classList.add("box");

function addRed(){
    const divTag =document.querySelector("#result");
    divTag.classList.add("red");
}


function addBlue(){
    const divTag =document.querySelector("#result");
    divTag.classList.add("blue");
}


function addGreen(){
    const divTag =document.querySelector("#result");
    divTag.classList.add("green");
}


function removeRed() {
    const divTag =document.querySelector("#result");
    divTag.classList.remove("red");
}
function removeBlue() {
    const divTag =document.querySelector("#result");
    divTag.classList.remove("blue");
}
function removeGreen() {
    const divTag =document.querySelector("#result");
    divTag.classList.remove("green");
}

// x.style.backgroundColor = "grey";
// x.style.width = "100px";
// x.style.height = "100px";
// x.style.border = "1px solid black"; 
//하나 하나 주는건 별로 좋지 않음
//그래서 다른 방식 디브태그에 인라인 스타일 주는거랑
//마찬가지 style =backgroundcolor:red;....
//유지보수하기가 어렵다 인라인으로 주면 그래서
//클래스 css


//=========================================================



function f01() {
 //요소노드 만들기
const x=document.createElement('h1');


//텍스트노드 만들기 
const y =document.createTextNode("안녕ㅋㅋㅋ");


//요소노드 하위에 텍스트노드 추가 
x.appendChild(y);


//직접 만든 노드를 화면에 부착
const bodyTag = document.querySelector("body");
bodyTag.appendChild(x);  
}


function f02() {
  
//이미지 요소 생성
const imgTag =document.createElement('img');

// 속성 셋팅 텍스트노드 만들기 
 imgTag.setAttribute("src","../resources/img/dddd.png");
 imgTag.setAttribute("alt","귀여운");
 imgTag.setAttribute("width","100px");
 imgTag.setAttribute("height","100px");

 //화면에 요소노드 부착
 const target = document.querySelector("#target");
 target.appendChild(imgTag);  
}

function f03() {
 const target =document.querySelector("#target");
 const imgTag =document.querySelector("img");
 target.removeChild(imgTag);
}
