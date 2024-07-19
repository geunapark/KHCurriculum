<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈페이지</title>


</head>
<body>
	<h1>홈페이지</h1>


    <h3>유저정보 ::: ${loginMemberVo.nick}</h3>
    <c:if test="${not empty loginMemberVo}">
        <button onclick="location.href='/member/quit?num=${loginMemberVo.no}'">탈퇴하기</button>
    </c:if>

    

</body>
</html>