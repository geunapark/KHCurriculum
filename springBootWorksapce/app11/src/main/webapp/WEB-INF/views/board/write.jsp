<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>without bootstrap</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

    <!--제이쿼리가 있으니까 여기서 제공하는 제이쿼리는 지우기 
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
-->

    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
</head>
  <body>
    <form action="/board/write" method="post">
        <input type="text" name="title">
         </br>
        <textarea id="summernote" name="content"></textarea>
        </br>
     <input type="submit" value="작성하기">

    </form>
    </body>
    <script>
      $('#summernote').summernote({
        placeholder: 'Hello stand alone ui',
        tabsize: 2,
        height: 120,
        minHeight:200,
        maxHeight:400,
        toolbar: [
          ['style', ['style']],
          ['font', ['bold', 'underline', 'clear']],
          ['color', ['color']],
          ['para', ['ul', 'ol', 'paragraph']],
          ['table', ['table']],
          ['insert', ['link', 'picture', 'video']],
          ['view', ['fullscreen', 'codeview', 'help']]
        ],
                    //onImageUpload를 오버라이드 
                      //이미지드래그했을떄동작하게끔하는거 -->
        callbacks: {
            onImageUpload: handleImgUpload,
      },
    });
    function handleImgUpload(fileList){
      const fd=  new FormData();
      
      fd.append('fileList',fileList[0])

          $.ajax({
            url:"/board/upload",
            method:"POST",
            //키밸류가 아닌 폼태그 형식으로 데이터를 전달해야한다.
            data:fd,
            processData:false,
            contentType:false,
            success:function(resp){
                console.log("handleImgUpload통신에성공")
                console.log(resp);
                $('#summernote').summernote('insertImage', resp);
              },

          })
        }
    </script>
  </body>
</html>
