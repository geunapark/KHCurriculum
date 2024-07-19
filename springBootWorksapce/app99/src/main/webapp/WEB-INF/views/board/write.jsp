<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헬로월드</title>


</head>
<body>
	<h1>게시글 작성</h1>

        <input type="text" id="title" placeholder="제목">
        <br>
        <textarea id="content"></textarea>
        <br>
        <input type="text" id="no" placeholder="작성자 번호">
        <button onclick="f01();">작성하기</button>
</body>
</html>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<script>

    function f01(){

        const title = document.querySelector("#title").value;
        const content = document.querySelector("#content").value;
        const num = document.querySelector("#no").value

        console.log(title);
        console.log(content);
        console.log(num);


        $.ajax({
            url : 'http://127.0.0.1:8080/api/board',
            type : "post" ,
            data:{
                title: title,
                content: content ,
                writerNo: num
            },
            success: (x)=>{
                console.log(x);
            } ,
            error : (x)=>{
                console.log(x);
            }

        });
    }

</script>