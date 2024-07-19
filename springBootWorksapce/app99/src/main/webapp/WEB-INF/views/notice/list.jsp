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
   <h1>공지사항 리스트</h1>

   <table>
        <thead>
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>조회수</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </tbody>
   </table>
  



</body>
</html>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<script>

$.ajax({
    url: "http://127.0.0.1:8080/api/notice/list",
    method: "get",
    success: (x)=>{
    const voList = x;

    const tbody = document.querySelector("tbody");
    let str = "";

    for(let i = 0; i< voList.length ; i++){
        str += "<tr>";
        str += "<td>" + voList[i].no + "</td>";
        str += "<td>" + voList[i].title + "</td>";
        str += "<td>" + voList[i].hit + "</td>";
        str += "</td>";
    }

    tbody.innerHTML = str;
    },
    error : ()=>{

    },
});




// const trTag = document.createElement("tr")
// const tdTag = document.createElement("td")

// let str = "";
// str = trTag + tdTag +"난 바보" + tdTag 
//        +tdTag +"나는 멍청이" + tdTag
//        +tdTag +"10111" + tdTag
//        +trTagt;
// tbody.innerHTML=str;
</script>
