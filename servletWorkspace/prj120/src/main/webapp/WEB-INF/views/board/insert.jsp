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
    <a href="/app120/home">홈페이지 이동</a>

    <hr>
    <form action="/app120/board/insert" method="post">
        <br>
        <textarea name="content"  placeholder="내용"></textarea>
        <br>
        <input type="submit" value="게시글작성">
    </form>



</body>
</html>