console.log("ddd");
function checkDup(){
    const id = document.querySelector("input[name=id]").value;
    const obj = {
        url:"/app/member/id-dup" ,
        type: "get" ,
        data :{"id":id},
        success : function (x){
            console.log( x );
            
            if ( x === "good"){
                alert("사용 가능한 아이디입니다");
            }else{
        
                alert("중복된 아이디입니다");
            }
        
        },
        error : function(x){console.log("통신실패")},
    };
    
    $.ajax( obj );

}
