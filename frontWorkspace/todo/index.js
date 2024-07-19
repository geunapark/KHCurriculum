// 버튼 요소를 각각 변수에 할당
const btnTodoInsert = document.querySelector("#btn-todo-insert"); // 할일 추가 버튼
const btnTodoSelect = document.querySelector("#btn-todo-select"); // 할일 조회 버튼
const inputTag = document.querySelector("input[name=todo]"); // 할일 입력 input 요소

// 로컬스토리지 초기값 설정
localStorage.setItem("todo", JSON.stringify([])); // 할일 목록을 저장할 로컬스토리지의 초기값을 빈 배열로 설정

// 할일 추가 이벤트 리스너 등록
btnTodoInsert.addEventListener('click', function() {
  // 로컬스토리지에서 할일 목록을 문자열 형태로 가져와서 파싱하여 배열로 변환
  const todoListStr = localStorage.getItem("todo");
  const todoList = JSON.parse(todoListStr);
  
  // 입력된 할일을 할일 목록에 추가
  todoList.push(inputTag.value);
  
  // 변경된 할일 목록을 다시 로컬스토리지에 문자열 형태로 저장
  localStorage.setItem("todo", JSON.stringify(todoList));
});

// 할일 조회 이벤트 리스너 등록
btnTodoSelect.addEventListener('click', function() {
  // 로컬스토리지에서 할일 목록을 문자열 형태로 가져와서 파싱하여 배열로 변환
  const todoListStr = localStorage.getItem("todo");
  const todoList = JSON.parse(todoListStr);

  // 할일 목록을 표시할 영역 선택
  const todoListArea = document.querySelector("#todo-list-area");

  // 기존에 표시된 할일 목록을 모두 지우기
  todoListArea.innerHTML = "";

  // 할일 목록을 반복하여 화면에 표시
  for (const x of todoList) {
    // 할일을 담을 div 요소 생성
    const divTag = document.createElement("div");
    
    // 할일 내용을 텍스트 노드로 생성
    const todoText = document.createTextNode(x);
    
    // 텍스트 노드를 div 요소에 추가
    divTag.appendChild(todoText);
  
    // 할일 목록 영역에 div 요소 추가
    todoListArea.appendChild(divTag);
  }
});
// btnTodoInsert 변수는 HTML 문서에서 id가 "btn-todo-insert"인 요소를 찾아 할당합니다. 이 버튼은 할일을 추가하는 기능을 실행합니다.
// btnTodoSelect 변수는 HTML 문서에서 id가 "btn-todo-select"인 요소를 찾아 할당합니다. 이 버튼은 할일을 조회하는 기능을 실행합니다.
// inputTag 변수는 HTML 문서에서 name 속성이 "todo"인 input 요소를 찾아 할당합니다. 여기에 사용자가 입력한 할일을 받습니다.
// localStorage.setItem("todo", JSON.stringify([]))은 "todo"라는 키로 로컬스토리지에 빈 배열을 초기값으로 설정합니다. 여기에 할일 목록이 저장됩니다.
// 할일 추가 이벤트 리스너는 btnTodoInsert 버튼을 클릭할 때 실행됩니다. 사용자가 입력한 할일을 로컬스토리지에서 가져와서 배열에 추가한 후, 다시 로컬스토리지에 저장합니다.
// 할일 조회 이벤트 리스너는 btnTodoSelect 버튼을 클릭할 때 실행됩니다. 로컬스토리지에서 할일 목록을 가져와서 화면에 표시합니다. 이를 위해 할일 목록 영역을 선택하고, 기존에 표시된 할일 목록을 모두 지우고, 새로운 할일 목록을 화면에 추가합니다.