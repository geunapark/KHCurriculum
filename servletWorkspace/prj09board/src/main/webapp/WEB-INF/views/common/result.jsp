<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String x =(String)request.getAttribute("x"); %>
	<h1>
	<%= x %>
	</h1>
</body>
</html>