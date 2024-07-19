function deleteCheckedBoard() {
  

    // 체크박스 전부 가져오기
    const checkboxArr = document.querySelectorAll("main>table>tbody input[type=checkbox]");
  // 체크된 체크박스의 값을 저장할 변수 선언
    let str = "";
    // 체크박스 순회하며, 체크 상태인 요소만 챙기기
    for (let i = 0; i < checkboxArr.length; ++i) {
        if (checkboxArr[i].checked) {
            console.log(checkboxArr[i].value);
            str += "no=" + checkboxArr[i].value;
            str += "&";
        }
    }

    // 문자열 끝에 추가된 '&' 제거
    str = str.slice(0, -1);

    // 챙겨진 체크박스들의 값을 이용하여 no 값 채우기
    location.href = "http://127.0.0.1:8888/app/board/admin/delete?" + str;
}
