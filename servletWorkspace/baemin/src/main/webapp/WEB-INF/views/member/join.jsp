<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>유저 회원가입</title>
           <!-- js -->
           <script defer src="./memberbyjoin.js"></script>
           <!-- css -->
           <link rel="stylesheet" href="./memberbyjoin.css">
    <!-- 글씨체 -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
</head>
<style>


</style>


<body>
    <div class="content">
        <header>
          <div class="top-bar">
            <div class="left-bar"><img class="back-img" src="/배민캡쳐/상단바_뒤로가기.jpg"></div>
           <div class="middle-bar"> <img class="top-bar-name" src="/배민캡쳐/상단바_현재페이지이름_가게배달.jpg"> </div>
            <img  class="right-bar" src="/배민캡쳐/홈.png">
          </div>
   
          <div class="middle">주소입력칸&nbsp&nbsp&nbsp▽</div>
          <!-- <div class="bottom"><button>standardard</button><button>star☆</button></div> -->
        </header>
        <main>
            
            
            <div class="main">
                <!-- 회원가입 -->
              

                <div class="mainjoin"><h1>유저 회원가입 📃</h1></div>
                <!-- 아디 그룹 -->
                <form id="signupForm" action="/your/action/endpoint" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <!-- 아디 -->
                        <label for="id">아이디 </label>
                        <button class="checkdup" type="button" onclick="checkDup();">중복검사</button>
                    <!-- 아디 입력 -->
                    <input type="text" id="id" placeholder="아이디 입력">
                    <div class="error-message" id="id-error"></div>
                </div>
                <!-- 비번그룹 -->
                <div class="form-group">
                <!-- 비번 -->
                    <label for="password">비밀번호 </label>
                    <!-- 비번입력 -->
                    <input type="password" id="password" placeholder="비밀번호 입력">
                    <div class="error-message" id="password-error"></div>
                </div>
                  <!-- 비번그룹 -->
                  <div class="form-group">
                    <!-- 비번 -->
                        <label for="password2"> 비밀번호 확인</label>
                        <!-- 비번입력 -->
                        <input type="password" id="password2" placeholder=" 비밀번호 확인">
                        <div class="error-message" id="password2-error"></div>
                    </div>
                    
                <!-- 이름그룹 -->
                <div class="form-group">
                <!-- 이름 -->
                    <label for="name">이름 </label>
                    <!-- 이름 입력 -->
                    <input type="text" id="name" placeholder="이름 입력">
                    <div class="error-message" id="name-error"></div>
                </div>
                <!-- 닉넴그룹 -->
                <div class="form-group">
                    <!-- 닉넴 -->
                    <label for="name">닉네임 </label>
                    <!-- 닉넴 입력 -->
                    <input type="text" id="nickname" placeholder="닉네임 입력">
                    <div class="error-message" id="nickname-error"></div>
                </div>
                <!-- 전번 그룹 -->
                <div class="form-group">
                <!-- 전번 -->
                    <label for="phone">전화번호 </label>
                   
                    <!-- 전번 입력 -->
                    <input type="tel" id="phone" placeholder="전화번호 입력">
                    <div class="error-message" id="phone-error"></div>
                </div>
               
               
                <!-- 주소 그룹 -->
                <div class="form-group">
                <!-- 주소 -->
                    <label for="adress">주소(시,구,동)</label>
                    <!-- 주소 입력 -->
                    <input type="adress" id="adress" placeholder="주소 입력">
                    <div class="error-message" id="address-error"></div>
                </div>
                <!-- 그룹 -->
                <div class="form-group">
                <!-- 상세주소 -->
                    <label for="detailadress">상세주소</label>
                    <!-- 상세주소 입력 -->
                    <input type="detailadress" id="detailadress" placeholder="상세주소 입력">
                    <div class="error-message" id="detail-address-error"></div>
                 
                </div>
                  <!-- 세대 그룹 -->
                  <div class="form-group">
                    <label for="generation">세대</label>
                    <select name="generation" id="generation">
                        <option value="">선택하세요</option>
                        <option value="1">10대미만</option>
                        <option value="2">10대~20대미만</option>
                        <option value="3">30대~40대미만</option>
                        <option value="4">40대~50대미만</option>
                        <option value="5">50대~60대미만</option>
                        <option value="6">60대~70대미만</option>
                        <option value="7">70대~80대미만</option>
                        <option value="8">80대~90대미만</option>
                        <option value="9">90대이상</option>
                    
                    </select>
                    <div class="error-message" id="gene-error"></div>
                     
<!-- 성별 그룹 -->
<div class="form-group">
    <label>성별</label>
    <div class="radio-group">
        <input type="radio" id="male" name="gender" value="male">
        <label for="male">남성</label>
        <input type="radio" id="female" name="gender" value="female">
        <label for="female">여성</label>
        <div class="error-message" id="gender-error"></div>
    </div>
</div>
                            
              
<div class="form-group">
    <label for="file-upload" class="custom-file-upload">
        <h3>유저 사진</h3>
    </label>
    <input id="file-upload" type="file" name="f" onchange="previewImage(event)">
    <div class="error-message" id="file-error"></div>
</div>

          
                    <!-- <input type="submit" value="Upload Image"> -->
              
                <div class="btncenter">
                    <button class="ds" type="button" onclick="validateForm()">등록하기</button>
                </div>
            </div>
        </form>
            <footer>
                <!-- 클릭하면 페이지 넘어갈 수 있게 온클릭에 url쓰기~  -->
                <div onclick=""><img src="/배민캡쳐/하단바_돋보기.jpg">  <span>&nbsp&nbsp검색</span> </div>
                <div onclick=""> <img src="/배민캡쳐/하단바_장바구니.jpg">  <span>장바구니</span></div>
                <div onclick=""> <img src="/배민캡쳐/하단바_찜.jpg"> <span>&nbsp&nbsp&nbsp&nbsp찜</span></div>
                <div onclick=""> <img src="/배민캡쳐/하단바_주문내역.jpg"> <span>주문내역</span></div>
                <div onclick="">  <img src="/배민캡쳐/하단바_마이배민.jpg"> <span>my배민</span></div>
               
        
              </footer>
      

        </main>
      

        </div>

    </div>
    <script>


    </script>
</body>
</html>