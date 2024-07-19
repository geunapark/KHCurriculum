//ajax


$.ajax(
    {
    url :"http://192.168.40.44:8080/board/list" ,
    type : "GET" ,
    success: function(data){
        console.log(data);
        const bodyTag =document.querySelector("body");
        bodyTag.innerHTML +="<h1>";
        bodyTag.innerHTML +=data;
        bodyTag.innerHTML +="</h1>";

    } ,
    fail : function(e) {
        console.log(e);

    },
    }
);