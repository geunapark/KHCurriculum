--연습장

--MEMBER 테이블 생성(아이디 , 비밀번호 , 닉네임)
DROP TABLE MEMBER CASCADE CONSTRAINTS; --제약조건도 같이 삭제 됌
CREATE TABLE MEMBER(
    ID          VARCHAR2(100)       NOT NULL UNIQUE
    ,PWD        VARCHAR2(100)       NOT NULL
    ,NICK       VARCHAR2(100)       UNIQUE
);

--회원 목록 조회
SELECT * FROM MEMBER;


--특정 회원 조회
SELECT * FROM MEMBER WHERE ID = 'USER01';


--회원가입
INSERT INTO MEMBER(ID,PWD,NICK)VALUES('USER01','1234','NICK01'); 


--로그인
SELECT *
FROM MEMBER 
WHERE ID = 'USER01'
AND PWD = '1234';


--회원정보 수정(비번변경)
UPDATE MEMBER SET PWD = '1234' WHERE ID = ?;


--회원탈퇴
DELETE FROM MEMBER
WHERE ID = 'USER01';


------------------실습--------------------------

--BOARD 테이블 생성 (제목,내용,작성일시)
DROP TABLE BOARD CASCADE CONSTRAINTS;
CREATE TABLE BOARD(
        TITLE            VARCHAR2(1000)       NOT NULL
        ,CONTENT         VARCHAR2(1000)       NOT NULL
        ,ENROLL_DATE     TIMESTAMP            DEFAULT SYSDATE
);
     

--게시글 목록 조회
SELECT *
FROM BOARD;

--게시글 검색(제목으로 검색)
SELECT TITLE
FROM BOARD
WHERE TITLE LIKE '?????';

--게시글 검색(내용으로 검색)
SELECT TITLE 
FROM   BOARD
WHERE CONTENT LIKE '????"; 


--게시글 작성
INSERT INTO BOARD(TITLE,CONTENT,DATE)VALUES ('안녕','멍청아','0325');

--게시글 수정(내용수정)
UPDATE BOARD
SET CONTENT ='?????' WHERE TITTLE = '????'; 


--게시글 삭제
DELECT FROM BOARD
WHERE TITTLE = '?????';