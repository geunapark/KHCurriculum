//함수 외부에 만든 변수는 전역변수
// let x = 10; //전역변수
// x = 20; //전역변수

// const y = 10;
// // y=20;  //재할당 불가능


// function f01() {
//   var x = 30; // 지역변수
//   console.log(window.x);
  
// }

// console.log(x);
// let x = 10;

function f01() {
  
  if(true){
   let x=10;
  }


  if(true){
    console.log(x);
  }
}

f01();
