const btnTag = document.querySelector("#sidebarBtn");
const sidebar = document.querySelector(".sidebar");

btnTag.addEventListener("click", e => {
  e.stopPropagation(); // 이벤트 전파를 막음
    //사이드바가 열려있을 때
  if (sidebar.classList.contains("folding-open")) {
    sidebar.classList.remove("folding-open");
    sidebar.classList.add("folding-close");
  } else {
    //사이드바가 닫혀있을 때
    sidebar.classList.remove("folding-close");
    sidebar.classList.add("folding-open");
  }
});

//사이드바 영역 이외 클릭/터치 시 닫기
document.addEventListener("click", function(e) {
  // 사이드바 영역 외의 영역을 클릭했을 때
  if (!sidebar.contains(e.target) && e.target !== btnTag) {
    // 사이드바가 열려있는지 확인하고 열려 있다면 닫습니다.
    if (sidebar.classList.contains("folding-open")) {
      sidebar.classList.remove("folding-open");
      sidebar.classList.add("folding-close");
    }
  }
});




// const btn = document.querySelector("#sidebarBtn");
// btn.addEventListener("click", e => {
//   const sidebar = document.querySelector(".sidebar");
//   sidebar.classList.toggle("hidden");
// })

// 문서가 로드되면 실행될 함수
// window.onload = function() {
//   // 문서 전체에 클릭 이벤트 리스너 추가
//   document.addEventListener('click', function(event) {
//     let clickedElement = event.target; // 클릭된 요소 가져오기
//     let sidebar = document.querySelector('.sidebar'); // 사이드바 요소 가져오기
    
//     // 클릭된 요소가 사이드바 토글 버튼이 아니고 사이드바 요소나 그 자식 요소가 아닌 경우
//     if (clickedElement !== btn && !sidebar.contains(clickedElement)) {
//       sidebar.classList.add('hidden'); // 사이드바를 숨김
//     }
//   });
// };

// // 문서가 로드되면 실행될 함수
// window.onload = function() {
//   // 문서 전체에 클릭 이벤트 리스너 추가
//   document.addEventListener('click', function(event) {
//     let clickedElement = event.target; // 클릭된 요소 가져오기

//     // 클릭된 요소가 aside 요소 또는 aside의 자식 요소인지 확인
//     let isClickedInsideAside = clickedElement.closest('aside');

//     // 클릭된 요소가 aside 영역을 제외한 다른 요소인 경우
//     if (!isClickedInsideAside) {
//       // 원하는 동작 수행
//       console.log('aside 영역을 제외한 다른 영역이 클릭되었습니다.');
//     }
//   });
// };
