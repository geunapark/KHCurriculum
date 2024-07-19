<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>채팅</title>

</head>
<body>
   <h1>채팅 ~~~ !</h1>

   <form onsubmit="return false;">
       <input type="text" id="msg">
       <button type="submit" onclick="f01();">메세지 전송</button>
   </form>

   <div id="chat-area"></div>
</body>
</html>

<script>    

    //웹소켓 연결을 처리하는 url
    const socket = new WebSocket("ws://127.0.0.1:8080/chat");
    socket.onopen = function () {
        console.log("open");
    }
    socket.onmessage = function(evt) {
        const chatArea = document.querySelector("#chat-area");
        chatArea.innerHTML += "<h3>" + evt.data + "</h3>";
    }

    function f01() {
    const content = document.querySelector("#msg").value;
    document.querySelector("#msg").value = ""; // #msg 요소의 값 비우기
    socket.send(content);
}

   
        
</script>