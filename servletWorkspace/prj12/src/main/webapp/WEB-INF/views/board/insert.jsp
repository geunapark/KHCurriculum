<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <h1>게시글 작성</h1>
   
   <hr>
   
   <a href="http://127.0.0.1:8888/app12/home">홈페이지 이동</a>
   
   <hr>
   
   <form action="/app12/board/insert" method="post">
      <!-- 메소드에선 포스트 데이터를 보내는 거니까 포스트라 적음
       -->
      <input type="text" name="title" placeholder="제목">
      <br>
      <textarea name="content" placeholder="내용"></textarea>
      <br>
      <input type="submit" value="게시글작성">
   </form>

</body>
</html>





