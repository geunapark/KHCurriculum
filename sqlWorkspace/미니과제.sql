-- MEMBER 테이블의 NO 칼럼에 사용할 시퀀스 삭제
DROP SEQUENCE SEQ_MEMBER_NO;
-- MEMBER 테이블의 NO 칼럼에 사용할 시퀀스 생성
CREATE SEQUENCE SEQ_MEMBER_NO NOCACHE NOCYCLE;

-- MEMBER 테이블 삭제
DROP TABLE MEMBER CASCADE CONSTRAINTS;
-- MEMBER 테이블 생성 (NO, ID, PWD, NICK, ENROLL_DATE, MODIFY_DATE, QUIT_YN)
CREATE TABLE MEMBER(
    NO              NUMBER          CONSTRAINT PK_MEMBER_NO PRIMARY KEY
    , ID            VARCHAR2(100)   CONSTRAINT NN_MEMBER_ID NOT NULL CONSTRAINT UQ_MEMBER_ID UNIQUE
    , PWD           VARCHAR2(100)   CONSTRAINT NN_MEMBER_PWD NOT NULL
    , NICK          VARCHAR2(100)   
    , ENROLL_DATE   TIMESTAMP       DEFAULT SYSDATE
    , MODIFY_DATE   TIMESTAMP       
    , QUIT_YN       CHAR(1)         DEFAULT 'N' CONSTRAINT CK_MEMBER_QUIT CHECK( QUIT_YN IN ('Y','N')  )
);


-- 회원가입
INSERT INTO MEMBER(NO, ID, PWD, NICK) VALUES('1' , 'USER01', '1234', 'NICK01');
INSERT INTO MEMBER(NO, ID, PWD, NICK) VALUES(SEQ_MEMBER_NO.NEXTVAL , ?, ?, ?);

-- 로그인
SELECT * FROM MEMBER WHERE ID = 'USER01' AND PWD = '1234';
SELECT * FROM MEMBER WHERE ID = ? AND PWD = ?;

-- 트랜잭션 처리
-- COMMIT;
ROLLBACK;

-------------------------------------------------------------------------
-------------------------------------------------------------------------
-------------------------------------------------------------------------

-- BOARD 테이블의 NO 칼럼에 사용할 시퀀스 삭제
DROP SEQUENCE SEQ_BOARD_NO;
-- BOARD 테이블의 NO 칼럼에 사용할 시퀀스 생성
CREATE SEQUENCE SEQ_BOARD_NO NOCACHE NOCYCLE;

-- BOARD 테이블 생성 삭제
DROP TABLE BOARD CASCADE CONSTRAINTS;
-- BOARD 테이블 생성 (NO , TITLE, CONTENT, ENROLL_DATE) // ENROLL_DATE 는 DEFAULT 값으로 현재시각
CREATE TABLE BOARD(
    NO              NUMBER
    , TITLE         VARCHAR2(100)
    , CONTENT       VARCHAR2(4000)
    , ENROLL_DATE   TIMESTAMP       DEFAULT SYSDATE
    , WRITER_NO     NUMBER          
    , CONSTRAINT FK_BOARD_MEMBER FOREIGN KEY(WRITER_NO) REFERENCES MEMBER(NO)
);

-- 게시글 작성
-- INSERT INTO BOARD(NO, TITLE, CONTENT, WRITER_NO) VALUES(SEQ_BOARD_NO.NEXTVAL , '제목111' , '내용111' , 1);
INSERT INTO BOARD(NO, TITLE, CONTENT, WRITER_NO) VALUES(SEQ_BOARD_NO.NEXTVAL , ? , ?, ?);

-- 게시글 수정 (제목 변경 - 번호이용해서)
UPDATE BOARD SET TITLE = '수정된제목ㅋㅋ' WHERE NO = 1;
UPDATE BOARD SET TITLE = ? WHERE NO = ?;

-- 게시글 수정 (내용 변경 - 번호이용해서)
UPDATE BOARD SET CONTENT = '수정된내용ㅋㅋ' WHERE NO = 1;
UPDATE BOARD SET CONTENT = ? WHERE NO = ?;

-- 게시글 삭제 (번호이용해서)
DELETE BOARD WHERE NO = 1;
DELETE BOARD WHERE NO = ?;

-- 게시글 목록 조회 (최신순)
SELECT 
    NO
    , TITLE
    , TO_CHAR(ENROLL_DATE, 'MM/DD HH:MI') ENROLL_DATE
FROM BOARD 
ORDER BY NO DESC
;

-- 게시글 상세 조회 (번호 이용해서)
SELECT * FROM BOARD WHERE NO = 1;
SELECT * FROM BOARD WHERE NO = ?;

-- 게시글 검색 (제목으로)
SELECT * FROM BOARD WHERE TITLE LIKE '%안녕%';
SELECT * FROM BOARD WHERE TITLE LIKE '%?%';

-- 게시글 검색 (내용으로)
SELECT * FROM BOARD WHERE CONTENT LIKE '%안녕%';
SELECT * FROM BOARD WHERE CONTENT LIKE '%?%';

-- 커밋
COMMIT;