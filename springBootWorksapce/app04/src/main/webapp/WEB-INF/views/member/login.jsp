<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헬로월드</title>
</head>
<body>
	<h1>로그인</h1>

	<form action="/member/login" method="POST">
	    <input type = "text" name= "id">
        <br />
        <input type = "password" name= "pwd">
        <br />
        <input type = "submit" value= "가입하기">
    </form>

</body>
</html>