<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>헬로월드</title>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
</head>
<body>
   <h1>게시글 목록</h1>

   <h3 id="title"></h3>
   <div id="summernote"></div> <!-- Summernote는 textarea 대신 div로 초기화 -->

   <script>
       $(document).ready(function() {
           $('#summernote').summernote(); // Summernote 초기화
       });

       const title = document.querySelector("#title");

       $.ajax({
           url: "/board",
           method: "get",
           data: {
               no: 13
           },
           success: (data) => {
               title.innerHTML = data.title;
               $('#summernote').summernote('code', data.content); // Summernote에 내용 설정
           },
           error: () => {
               alert("상세조회 실패");
           }
       });
   </script>
</body>
</html>
