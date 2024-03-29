--춘 대학교 워크북 과제
--SQL04_DDL

-- 1번
-- 계열 정보를 저장할 카테고리 테이블을 만들려고 한다. 다음과 같은 테이블을 작성하시오.
CREATE TABLE TB_CATEGORY(
        NAME VARCHAR2(10),
        USE_YN CHAR(1) DEFAULT 'Y'
);

-- 2번
-- 과목 구분을 저장할 테이블을 만들려고 한다. 다음과 같은 테이블을 작성하시오.
CREATE TABLE TB_CLASS_TYPE(
        NO VARCHAR2(5) PRIMARY KEY,
        NAME VARCHAR2(10)
);

-- 3번
-- TB_CATEGORY 테이블의 NAME 컬럼에 PRIMARY KEY를 생성하시오.
-- (KEY 이름을 생성하지 않아도 무방함. 만일 KEY를 지정하고자 한다면 이름은 본인이 알아서 적당한 이름을 사용한다.)
DROP TABLE TB_CATEGORY;
CREATE TABLE TB_CATEGORY(
        NAME VARCHAR2(10) PRIMARY KEY
        );

-- 4번
-- TB_CLASS_TYPE 테이블의 NAME 컬럼에 NULL 값이 들어가지 않도록 속성을 변경하시오.
DROP TABLE TB_CLASS_TYPE;
CREATE TABLE TB_CLASS_TYPE (
    NAME VARCHAR2(10) NOT NULL
);

-- 5번
-- 두 테이블에서 컬럼 명이 NO인 것은 기존 타입을 유지하면서 크기는 10으로, 
--컬럼명이 NAME인 것은 마찬가지로 기존 타입을 유지하면서
-- 크기 20으로 변경하시오.


-- 6번
-- 두 테이블의 NO 컬럼과 NAME 컬럼의 이름을 각 테이블 이름이 앞에 붙은 형태로 변경한다.
-- EX. CATEGORY_NAME
DROP TABLE TB_CLASS_TYPE;
DROP TABLE TB_CATEGORY;
CREATE TABLE TB_CATEGORY(
        TB_CATEGORY_NAME VARCHAR2(10),
        USE_YN CHAR(1) DEFAULT 'Y'
);
CREATE TABLE TB_CLASS_TYPE(
        NO VARCHAR2(5) PRIMARY KEY,
        TB_CLASS_TYPE_NAME VARCHAR2(10)
);

-- 7번
-- TB_CATAGORY 테이블과 TB_CLASS_TYPE 테이블의 PRIMARY_KEY 이름을 다음과 같이 병경하시오
-- PRIMARY KEY의 이름은 "PK_ + 컬럼이름"으로 지정하시오
DROP TABLE TB_CLASS_TYPE;
DROP TABLE TB_CATEGORY;

CREATE TABLE TB_CATEGORY(
        PK_TB_CATEGORY_NAME VARCHAR2(20) PRIMARY KEY
        ,USE_YN CHAR(1) DEFAULT 'Y'
);
CREATE TABLE TB_CLASS_TYPE(
        PK_NO VARCHAR2(5) PRIMARY KEY
        ,TB_CLASS_TYPE_NAME VARCHAR2(20)
);

-- 8번
-- 다음과 같은 INSERT 문을 수행한다.
INSERT INTO TB_CATEGORY VALUES('공학','Y');
INSERT INTO TB_CATEGORY VALUES('자연과학','Y');
INSERT INTO TB_CATEGORY VALUES('의학','Y');
INSERT INTO TB_CATEGORY VALUES('예체능','Y');
INSERT INTO TB_CATEGORY VALUES('인문사회','Y');
COMMIT;


-- 9번
-- TB_DEPARTMENT의 CATEGORY 컬럼이 TB_CATEGORY 테이블의 CATEGORY_NAME 컬럼을 부모값으로 참조하도록 FOREIGN KEY를 지정하시오.
-- 이 때 KEY 이름은 FK_테이블이름_컬럼이름으로 지정한다
INSERT INTO CATEGORY VARCHAR2(40 BYTE) [CONSTRAINT CATEGORY_NAME] REFERENCES TB_CATEGORY [(기본키)];


-- 10번
-- 춘 기술대학교 학생들의 정보만이 포함되어 있는 학생일반정보 VIEW를 만들고자 한다.
-- 아래 내용을 참고하여 적절한 SQL문을 작성하시오.

CREATE VIEW VIEW_STUDENT AS
SELECT *
FROM TB_STUDENT;
   
-- 11번
-- 춘 기술대학교는 1년에 두 번씩 학과별로 지도교수가 지도 면담을 진행한다.
-- 이를 위해 사용할 학생이름, 학과이름, 담당교수이름으로 구성되어 있는 VIEW를 만드시오.
-- 이때 지도 교사가 없는 학생이 있을 수 있음을 고려하시오.
-- (단, 이 VIEW는 단순 SELECT만을 할 경우 학과별로 정렬되어 화면에 보여지게 만드시오.)


-- 12번
-- 모든 학과의 학과별 학생 수를 확인할 수 있도록 적절한 VIEW를 작성해보자.

   
-- 13번
-- 위에서 생성한 학생일반정보 VIEW를 통해서 학번이 A213046인 학생의 이름을 본인 이름으로 변경


-- 14번
-- 13번에서와 같이 VIEW를 통해서 데이터가 변경될 수 있는 상황을 막으려면 VIEW를 어떻게 생성해야 하는지 작성하시오
-- WITH READ ONLY 기재 시 SELECT만 가능

--춘 대학교 워크북 과제
--SQL05_DML

-- 1번
-- 과목유형 테이블(TB_CLASS_TYPE)에 아래와 같은 데이터를 입력하시오.
INSERT INTO TB_CLASS_TYPE VALUES('01','전공필수');
INSERT INTO TB_CLASS_TYPE VALUES('02','전공선택');
INSERT INTO TB_CLASS_TYPE VALUES('03','교양필수');
INSERT INTO TB_CLASS_TYPE VALUES('04','교양선택');
INSERT INTO TB_CLASS_TYPE VALUES('05','논문지도');

-- 2번
-- 춘 기술대학교 학생들의 정보가 포함되어 있는 학생일반정보 테이블을 만들고자 한다.
-- 아래 내용을 참고하여 적절한 SQL 문을 작성하시오. (서브쿼리를 이용하시오)
CREATE TABLE TB_학생일반정보
AS (SELECT STUDENT_NO 학번, STUDENT_NAME 학생이름, STUDENT_ADDRESS 주소
    FROM TB_STUDENT);
SELECT *
FROM TB_학생일반정보;


-- 3번
-- 국어국문학과 학생들의 정보만이 포함되어 있는 학과정보 테이블을 만들고자 한다.
-- 아래 내용을 참고하여 적절한 SQL 문을 작성하시오. (힌트 방법은 다양)
CREATE TABLE TB_의학과
AS (SELECT STUDENT_NO 학번, STUDENT_NAME 학생이름, 19||SUBSTR(STUDENT_SSN,1,2) 출생년도, PROFESSOR_NAME 교수이름
    FROM TB_STUDENT S, TB_PROFESSOR P, TB_DEPARTMENT D
    WHERE S.COACH_PROFESSOR_NO = P.PROFESSOR_NO(+)
    AND S.DEPARTMENT_NO = D.DEPARTMENT_NO
    AND DEPARTMENT_NAME = '국어국문학과');
    
SELECT *
FROM TB_의학과;

-- 4번
-- 현 학과들의 정원을 10% 증가시키게 되었다. 이에 사용할 SQL 문을 작성하시오.
-- (단, 반올림을 사용하여 소수점 자릿수는 생기지 않도록 한다.)
 UPDATE DEPARTMENT
            SET CAPACITY*10;
    
         

-- 5번
-- 학번 A413042인 박건우 학생의 주소가 "서울시 종로구 숭인동 181-21"로 변경되었다고 한다.
-- 주소지를 정정하기 위해 사용할 SQL 문을 작성하시오.
UPDATE  TB_STUDENT
    SET STUDENT_ADDRESS = '경기도 파주시 적성면 장현2리 산65번지'
    WHERE STUDENT_NO = 'A413042';
    
UPDATE TB_학생일반정보
        SET 주소 = '서울시 종로구 숭인동 181-21'
        WHERE 학생이름 = '박건우';

-- 6번
-- 주민등록번호 보호법에 따라 학생정보 테이블에서 주민번호 뒷자리를 저장하지 않기로 결정하였다.
-- 이 내용을 반영할 적절한 SQL 문장을 작성하시오.
UPDATE VIEW_STUDENT
    SET STUDENT_SSN = SUBSTR(STUDENT_SSN , 1,8), 14 , '*'
    WHERE SEUDENT_SSN = SUBSTR(STUDENT_SSN , 8 ,1 ) = 1;




-- 7번
-- 의학과 김명훈 학생은 2005년 1학기에 자신이 수강한 '피부생리학' 점수가 
-- 잘못되었다는 것을 발견하고는 정정을 요청하였다.
-- 담당 교수의 확인 받은 결과 해당 과목의 학점을 3.5로 변경키로 결정되었다. 적절한 SQL 문을 작성하시오
SELECT 
        학생이름
        ,TERM_NO
        ,학번
        ,POINT
FROM TB_의학과  T
JOIN TB_GRADE E
ON T.학번 = E.STUDENT_NO
WHERE CLASS_NO = 'C3843900';



(SELECT STUDENT_NO 학번, STUDENT_NAME 학생이름, 19||SUBSTR(STUDENT_SSN,1,2) 출생년도, PROFESSOR_NAME 교수이름
    FROM TB_STUDENT S, TB_PROFESSOR P, TB_DEPARTMENT D
    WHERE S.COACH_PROFESSOR_NO = P.PROFESSOR_NO(+)
    AND S.DEPARTMENT_NO = D.DEPARTMENT_NO
    AND DEPARTMENT_NAME = '국어국문학과');          
 
-- 8번
-- 성적 테이블에서 휴학생들의 성적항목을 제거하시오

