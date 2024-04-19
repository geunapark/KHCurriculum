// const x = new Object();
const x = {};

x["max-level"] = 250;
x.name = "홍길동";
x.age = 20;
x.isProgrammer = true;
x.hobby = ["코딩" , "프로그래밍" , "개발"];
x.hello = function() {
  console.log("hello");
}

console.log(x);
x.hello();

for(k in x){
  console.log(k);
}

delete(x.name);