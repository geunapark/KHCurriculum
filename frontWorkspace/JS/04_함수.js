
//선언적 함수
function f01(x) {
    return x+1;
}

//익명 함수 
const f02= function(x) {
    return x+1;
}

//화살표 함수
const f03 = x =>  x+1;
//const f03 = (x) => {return x+1;}  같다 

// result01 =f01(10);
// result02 =f02(10);
// result03 =f03(10);

// console.log(result01);
// console.log(result02);
// console.log(result03);

const printNum=function(x) {
    console.log(x);
    console.log(arguments);
} // 함수도 변수에 담을수 있다 

//printNum(100,200,300);

f01();

f02();

f03();

// ==================================

 function getTen() {
     return printNum;
 }

 const result = getTen();
// console.log(result);

// result(777);

//=====================

// function hello (){
//     console.log("안녕~~");
// }

// const hi =hello(); //()붙이면 안됨 

// const x=undefined;
// console.log( typeof x);

//======================




console.log(3/0);
//const calcResult =3/2; //1.5==일반적인 숫자==finite==인피니티아님
// const calcResult =3/0; //infinity
// const isFiniteResult = isFinite(calcResult);
// console.log(isFiniteResult);

//--nan
// const calcResult =1/"hello"; //nan 숫자가 아닌
// console.log(isNaN(calcResult)); 






