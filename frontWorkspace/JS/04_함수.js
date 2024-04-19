//선언적 함수
function f01(x) {
  //console.log("f01 called...");
  return x+1;
}

//익명함수
const f02 = function (x) {
  //console.log("anonymous called,,,");
  return x+1;
}


//화살표 함수
const f03 = (x) => x+1;
/*
const f03 = (x) => {return x+1;} 이랑 같다
*/


// result01 = f01(10);
// result02 = f02(10);
// result03 = f03(10);

// console.log(result01);
// console.log(result02);
// console.log(result03);

//=================================================

const printNum =function(x) {
  console.log(x);
  console.log(arguments);
}

// printNum(100 ,200,300);

//=================================================

function getTen() {
  return printNum
}

// const result = getTen();
// console.log(result);


//=====================================
function hello() {
  console.log("안녕~~~");
}
// const hi = hello;
// hi();
// console.log(hi);

// const x = undefined;
// console.log(typeof x);

// console.log(3/0);
// const calcResult = 3/0;
// const isFiniteResult = isFinite (calcResult)
// console.log(isFiniteResult);

// const calcResult = 1 / "hello" ;
// console.log(isNaN(calcResult));

console.log(0 == "0");
console.log(0 == [] );
console.log("0" == []);