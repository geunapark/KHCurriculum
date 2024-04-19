function sayHello(){
  alert("그만클릭해");
}

function changeColor(){
const x = document.querySelector("#target")
x.style.backgroundColor = "red";
x.innerText ="JavaScript";
}

function setBox(){
  const boxArr = document.querySelectorAll(".box")
  
  console.log(boxArr);

  for(let i = 0; i< boxArr.length ; i++){
    boxArr[i].style.width = "100px";
    boxArr[i].style.height = "100px";
    boxArr[i].style.backgroundColor = "green";
  }
}

function checkDup(){
  //유저가 입력한 아이디 가져오기
   const userIdTag = document.querySelector("#userId");
   console.log(userIdTag);
   console.log(userIdTag.placeholder);
   console.log(userIdTag.id);
   console.log(userIdTag.type);
   console.log(userIdTag.value);

   userIdTag.placeholder="내맘대로 바꿔볼게"
  

  
}



