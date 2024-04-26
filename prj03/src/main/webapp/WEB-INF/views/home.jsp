<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>근아네 메뉴판</h1>
	
	<% String x = request.getParameter("name"); %>
	
	<% if(x != null){ %>
	<h2><%= x %>님메뉴를 골라주세요~</h2>	
	<% }else{ %>
	
	<h2>님사이드 메뉴를 골라주세요~</h2>
	<% }%>	
</body>
</html>