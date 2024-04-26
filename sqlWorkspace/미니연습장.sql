--------------------------------
---------- 시퀀스 삭제-----------
--------------------------------
DROP SEQUENCE SEQ_MEMBER_NO;
DROP SEQUENCE SEQ_BOARD_NO;



--------------------------------
---------- 시퀀스 생성 -----------
--------------------------------
CREATE SEQUENCE SEQ_MEMBER_NO NOCACHE NOCYCLE;
CREATE SEQUENCE SEQ_BOARD_NO NOCACHE NOCYCLE;



--------------------------------
---------- 테이블 삭제 -----------
--------------------------------
DROP TABLE MEMBER CASCADE CONSTRAINTS;
DROP TABLE BOARD CASCADE CONSTRAINTS;



--------------------------------
---------- 테이블 생성 -----------
--------------------------------
CREATE TABLE MEMBER(
    NO              NUMBER          CONSTRAINT PK_MEMBER_NO PRIMARY KEY
    , ID            VARCHAR2(100)   CONSTRAINT NN_MEMBER_ID NOT NULL CONSTRAINT UQ_MEMBER_ID UNIQUE
    , PWD           VARCHAR2(100)   CONSTRAINT NN_MEMBER_PWD NOT NULL
    , NICK          VARCHAR2(100)   CONSTRAINT NN_MEMBER_NICK NOT NULL --우리 사이트는 닉네임 중복은 허용할거임
    , ENROLL_DATE   TIMESTAMP       DEFAULT SYSDATE
    , MODIFY_DATE   TIMESTAMP       
    , QUIT_YN       CHAR(1)         DEFAULT 'N' CONSTRAINT CK_MEMBER_QUIT CHECK( QUIT_YN IN ('Y','N')  )
);

CREATE TABLE BOARD(
    NO              NUMBER          PRIMARY KEY
    , TITLE         VARCHAR2(100)   NOT NULL
    , CONTENT       VARCHAR2(4000)  NOT NULL
    , WRITER_NO     NUMBER          NOT NULL
    , HIT           NUMBER          DEFAULT 0
    , ENROLL_DATE   TIMESTAMP       DEFAULT SYSDATE
    , MODIFY_DATE   TIMESTAMP       
    , DEL_YN        CHAR(1)         DEFAULT 'N' CONSTRAINT CK_BOARD_DELYN CHECK( DEL_YN IN ('Y','N')  )
);



--------------------------------
---------- 외래키 추가 -----------
--------------------------------
ALTER TABLE BOARD
ADD CONSTRAINT FK_BOARD_MEMBER
FOREIGN KEY (WRITER_NO) REFERENCES MEMBER(NO);



------------------------------------------------------------
-- 미니연습장


-- 회원가입
INSERT INTO MEMBER(NO, ID, PWD, NICK) VALUES( SEQ_MEMBER_NO.NEXTVAL, ?, ?, ? );

-- 로그인
SELECT * FROM MEMBER WHERE ID = ? AND PWD = ?;

-- 정보 수정 (비번 변경)
UPDATE MEMBER SET PWD = ? WHERE NO = ?;

-- 정보 수정 (닉네임 변경)
UPDATE MEMBER SET NICK = ? WHERE NO = ?;

-- 회원 탈퇴
UPDATE MEMBER SET QUIT_YN = 'Y' WHERE NO = ?;

-- 회원 전체 목록 조회 (관리자 전용)
SELECT * FROM MEMBER ORDER BY NO DESC;

-- 회원 상세 조회 (관리자 전용)
SELECT * FROM MEMBER WHERE NO = ?;

-- 게시글 작성
INSERT INTO BOARD(NO, TITLE, CONTENT, WRITER_NO) VALUES(SEQ_BOARD_NO.NEXTVAL , ?, ?, ?);

-- 게시글 목록 조회(최신순)
SELECT * FROM BOARD ORDER BY NO DESC;

-- 게시글 목록 조회(오래된순)
SELECT * FROM BOARD ORDER BY NO ASC;


SELECT
    B.NO
    ,TITLE
    ,CONTENT
    ,HIT
    ,NICK
    ,TO_CHAR(B.ENROLL_DATE, 'YYYY"년" MM"월"DD"일"HH:MI:SS') ENROLL_DATE
FROM BOARD B
JOIN MEMBER M
ON M.NO = B.WRITER_NO
WHERE B.NO = 1 AND B.DEL_YN = 'N';


-- 게시글 목록 조회(조회수 높은 순)
SELECT * FROM BOARD ORDER BY HIT DESC;

-- 게시글 상세 조회 
SELECT * FROM BOARD WHERE NO = ?;

-- 게시글 검색 (제목)
SELECT * FROM BOARD WHERE TITLE LIKE '%?%';

-- 게시글 검색 (내용)
SELECT * FROM BOARD WHERE CONTENT LIKE '%?%';

-- 게시글 수정 (작성자 또는 관리자 만 가능)
UPDATE BOARD SET TITLE = ? , CONTENT = ? , MODIFY_DATE = SYSDATE WHERE NO = ?;

-- 게시글 삭제 (작성자 또는 관리자 만 가능)
UPDATE BOARD SET DEL_YN = 'Y' , MODIFY_DATE = SYSDATE WHERE NO = ?;












