<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파이널</title>

</head>
<body>
   <h1>공지사항 작성하기</h1>

   <form action="/api/notice"  method="POST">
    <input type="text" name="title" placeholder="제목" id="title">
    <br>
    <textarea name="content" placeholder="내용" id="content"></textarea>
    <br>
    <input type="submit" value="작성하기">
   </form>

   <button onclick="insertNotice()">아작스로 작성하기</button>

</body>
</html>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<script>

    
    function insertNotice() {
        
        const titleTag = document.querySelector("#title");
        const title = titleTag.value
        const contentTag = document.querySelector("#content");
        const content = contentTag.value

        $.ajax({
            url:"/api/notice"
            ,method:"post"
            ,data:{
                title:title ,
                content:content,
            }
            ,success:(x)=>{
                alert(x);
                location.href="/notice/list";
            },
            error:()=>{
                location.href="/error-page"

            }
    
        })
        

        
    }

</script>
