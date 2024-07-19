
const obj ={
    url :"http://127.0.0.1:8080/hello",
    type : "get",
    success: function(abc){
        console.log("통신 성공");
        console.log("서버로부터 전달받은 데이터 :", abc);

        const target =document.querySelector("#target");
        target.innerHTML =abc;

    },
    error : function(){console.log("에러남,, ㅠㅠ");},

};

$.ajax(obj);

