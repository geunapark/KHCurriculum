$.ajax( {
    url : "http://127.0.0.1:8080/api/board/list",
    method: "get" ,
    success: (data)=> {
        console.log("통신성공~");
        console.log(data);

       const x = document.querySelector("table > tbody");
       console.log(x);

      let str = "";
      for (let i = 0; i < data.length; i++) {
        str += "<tr>"
        str += "<td>" + data[i].no + "</td>"
        str += "<td>" + data[i].title + "</td>"
        str += "<td>" + data[i].content + "</td>"
        str += "</tr>"
        
      }

       x.innerHTML = str;

    },
    fail: () => {
        console.log("통신실패 ㅠㅠ");
    }
} );