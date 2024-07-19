/*
//함수 외부에 만든 변수는 전역변수
x =10; //전역변수
let x =20; //전역변수 스코프 중복선언가능해서 별로라 let,const사용  

const y =10;
//y =20; 에러남 재할당 불가능 

//let : 일반적인 변수 중복 선언 불가 
//const : final 변수 
function f01() {
    var x =30; //지역변수 
    console.log(window.x);
}
*/


// console.log(x);
// let x =10; //이건 출력이 안됨 하지만 var x=10 이건 출력가능
//바를 쓰면 var x; console.log(x); var x =10; 바는 선언부가 위쪽으로 
//올라가 버려서 그럼 호이스팅 언디파인드 되는건데 그래서 그냥 let쓰는게 정확

function f01() {
//var x; 이런식 var를 쓰면 
    
    if(true){
     let x=10; //함수 스코프 밑에 스코프도 사용가능 
     //렛이랑 콘스트를 사용해야 일반적 함수 작동가능 
    
    }
}

if(true){
    console.log(x); //다른 스코프인데 엑스값이 나온다 
    //왜냐면 위에 엑스가 var값이기 떄문에 위에 선언해버림
}

f01();


