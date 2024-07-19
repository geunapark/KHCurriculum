<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel ="stylesheet" href="/app12/resources/home.css">
<!-- 경로 지정은 이렇게 파일이 나오니까 한거 이렇게 아이피까지 써주면 컴터까지 찾아옴
우리가 띄워 놓은 톰캣까지 톰캣은 webapps/여러개 파일을 볼수 있음 app12이름에 해당하는 폴더를 찾아감 
근데 그 파일은 어떤거냐면 우리가 만든 플젝에 webapp이라는 폴더 app12가 들어가 있음 웹앱에 들어가서 app12를 찾아감 
  -->
  <Script defer src="/app12/resources/home.js"></Script>
<title>Insert title here</title>
</head>
<body>
 <h1>홈피</h1>

 <a href="/app12/board/insert">게시글 작성</a>
 <br>
 <a href="/app12/board/list">게시글 목록</a>
</body>
</html>