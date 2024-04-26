--연습용

--MEMBER 테이블 생성 (ID , PWD , NICK 3개 칼럼)
CREATE TABLE MEMBER(
    ID VARCHAR2(100) --ID라는 칼럼을 만듦 타입은 가변문자열, 최대 100바이트
    ,PWD VARCHAR2(100) --PWD 칼럼을 만듦 타입은 가변문자열, 최대 100바이트
    ,NICK VARCHAR2(100) --NICK 칼럼을 만듦 , 타입은 가변문자열 , 최대 100바이트
);
--데이터 생성(CREATE) INSERT
INSERT INTO MEMBER(ID , PWD , NICK) VALUES ('USER01' , '1234' , '그나');
INSERT INTO MEMBER(ID , PWD , NICK) VALUES ('USER02' , '1235' , '나나');
INSERT INTO MEMBER(ID , PWD , NICK) VALUES ('USER03' , '1236' , '구나');
--데이터 읽기(READ)
SELECT  ID,PWD FROM MEMBER;
SELECT ID      FROM MEMBER;
SELECT PWD     FROM MEMBER;
SELECT *       FROM MEMBER; -- * :모든 칼럼 조회
--데이터 수정(UPDATE)
UPDATE MEMBER SET PWD = '2844'; -- 테이블의 모든 회원 비번을 2844로 변경
--데이터 삭제(DELETE)
DELETE MEMBER; --데이터를 삭제함 테이블은 남아있음

--테이블 삭제
DROP TABLE MEMBER;







---------------------------------------------------------
--테이블 생성
CREATE TABLE HELLO(
    ID VARCHAR2(100)
    ,PWD VARCHAR2(100)
);
--데이터 넣기 
INSERT INTO HELLO(ID,PWD)
VALUES('USER01','1234');

--데이터 조회
SELECT  ID,PWD FROM HELLO;
SELECT ID      FROM HELLO;
SELECT PWD     FROM HELLO;
SELECT *       FROM HELLO; -- * :모든 칼럼 조회

--데이터 수정
UPDATE HELLO SET PWD = '9999' WHERE ID = 'USER01';

--데이터 삭제
DELETE HELLO WHERE ID = 'USER01';

--테이블삭제
DROP TABLE HELLO;