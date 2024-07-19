
const x = {
   atk:100  ,
   def:50   ,
   isDead :false ,
   skill :function() {},
   foods : ["사과", "딸기","망고 "],
};
//const x =new Object(); //객체 선언 두가지 방법

const str ="name";
x["max-level"] =250;
x/*.name*//*["name"]*/[str]= "홍길동";
x.age =20;
x.isProgrammer = true;
x.hobby =["코딩" , "프로그래밍", "개발"];
x.hello = function() {
  console.log("hello~");  
}//안에 함수도 넣을수있음 이건 메소드 종속되어 있음

console.log(x);

x.hello();

for(k in x ) {
    console.log(k);
    
//이 코드는 JavaScript에서 객체(object)의 속성을 반복하여 접근하는 방법
// 중 하나입니다. for...in 반복문을 사용하여 객체 x의 모든 속성을 반복하고, 
//각 속성의 값을 출력하는 것입니다.
//여기서 k는 반복 중인 속성의 키(key)를 나타냅니다. for...in 반복문은 객체의 속성을 반복할 때마다 해당 속성의 키를 변수에 할당합니다. 이후 x[k]를 통해 
//해당 키에 해당하는 속성의 값을 접근할 수 있습니다.
//
}

delete(x.name); 










// x.hello();

// function Person(a,b) {
//     temp.name=a;
//     temp.age =b;
// }

// function Programmer() {
//     this.lang = this.lang;
// }

//  const p01 = new Programmer("java");
//  p01._proto_= Person
//  const result=new Person("홍길동",222);
//  console.log(result);
// //함수하나 만들어서 객체 찍어냄

// const member01 =createMember("홍길동",20);
// const member02 =createMember("홍길동",30);
// const member03 =createMember("홍길동",40);



// const member01 ={};
// member01.name ="zzz";
// member02.age=20;
// const member02 ={};
// const member03 ={};