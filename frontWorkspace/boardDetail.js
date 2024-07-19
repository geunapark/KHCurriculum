function getBoardByNo(evt) {

    console.log("상세함수 실행중~");
    const boardNo = evt.target.parentNode.children[0].innerText;



    $.ajax({
        url:"http://127.0.0.1:8080/api/board/detail",
        method:"get",
        data:{
            no: boardNo,
        },
        success:(data)=>{
            console.log("게시글 상세조회 통신성공~");
            console.log(data);
    
            // const y = document.querySelector("#result");
            // console.log(y);
            // let str="";
            // str += "<h3> 글번호 : " + data.no +"</h3>"
            // str += "<h3> 글번호 : " + data.title +"</h3>"
            // str += "<h3> 글번호 : " + data.content +"</h3>"
            // y.innerHTML = str;
    
            const h3Tag = document.createElement("h3");
            const textNode01 = document.createTextNode("글번호 " + data.no);
            h3Tag.appendChild(textNode01);
    
            const h3Tag02 = document.createElement("h3");
            const textNode02 = document.createTextNode("제목 " + data.title);
            h3Tag02.appendChild(textNode02);
    
    
            const preTag = document.createElement("pre");
            const textNode03 = document.createTextNode(data.content);
            preTag.appendChild(textNode03);
    
            const result = document.querySelector("#result");
            result.innerHTML = "";
            result.appendChild(h3Tag);
            result.appendChild(h3Tag02);
            result.appendChild(preTag);
    
        },
        fail:()=>{
            console.log("게시글 상세조회 통신실팽 ㅜㅜ");
        },
    })
    
}