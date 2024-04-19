function checkDup() {
const idTag =document.querySelector("input[name=memberId]")
  if(idTag.value == "admin"){
    alert("관리자 사칭 하지마 쉐키야")
    idTag.value="";
  }
}


const pwdTag = document.querySelector("input[name=memberPwd]")
pwdTag.addEventListener('focus' , f01)

function f01() {
  const target = document.querySelector("#target");
  target.innerText = "비밀번호는 8글자 이상 20글자 이하"
  // alert("비밀번호는 8글자 이상 20글자 이하");
}
