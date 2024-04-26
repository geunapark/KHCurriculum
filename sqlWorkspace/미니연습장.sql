--------------------------------
---------- ������ ����-----------
--------------------------------
DROP SEQUENCE SEQ_MEMBER_NO;
DROP SEQUENCE SEQ_BOARD_NO;



--------------------------------
---------- ������ ���� -----------
--------------------------------
CREATE SEQUENCE SEQ_MEMBER_NO NOCACHE NOCYCLE;
CREATE SEQUENCE SEQ_BOARD_NO NOCACHE NOCYCLE;



--------------------------------
---------- ���̺� ���� -----------
--------------------------------
DROP TABLE MEMBER CASCADE CONSTRAINTS;
DROP TABLE BOARD CASCADE CONSTRAINTS;



--------------------------------
---------- ���̺� ���� -----------
--------------------------------
CREATE TABLE MEMBER(
    NO              NUMBER          CONSTRAINT PK_MEMBER_NO PRIMARY KEY
    , ID            VARCHAR2(100)   CONSTRAINT NN_MEMBER_ID NOT NULL CONSTRAINT UQ_MEMBER_ID UNIQUE
    , PWD           VARCHAR2(100)   CONSTRAINT NN_MEMBER_PWD NOT NULL
    , NICK          VARCHAR2(100)   CONSTRAINT NN_MEMBER_NICK NOT NULL --�츮 ����Ʈ�� �г��� �ߺ��� ����Ұ���
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
---------- �ܷ�Ű �߰� -----------
--------------------------------
ALTER TABLE BOARD
ADD CONSTRAINT FK_BOARD_MEMBER
FOREIGN KEY (WRITER_NO) REFERENCES MEMBER(NO);



------------------------------------------------------------
-- �̴Ͽ�����


-- ȸ������
INSERT INTO MEMBER(NO, ID, PWD, NICK) VALUES( SEQ_MEMBER_NO.NEXTVAL, ?, ?, ? );

-- �α���
SELECT * FROM MEMBER WHERE ID = ? AND PWD = ?;

-- ���� ���� (��� ����)
UPDATE MEMBER SET PWD = ? WHERE NO = ?;

-- ���� ���� (�г��� ����)
UPDATE MEMBER SET NICK = ? WHERE NO = ?;

-- ȸ�� Ż��
UPDATE MEMBER SET QUIT_YN = 'Y' WHERE NO = ?;

-- ȸ�� ��ü ��� ��ȸ (������ ����)
SELECT * FROM MEMBER ORDER BY NO DESC;

-- ȸ�� �� ��ȸ (������ ����)
SELECT * FROM MEMBER WHERE NO = ?;

-- �Խñ� �ۼ�
INSERT INTO BOARD(NO, TITLE, CONTENT, WRITER_NO) VALUES(SEQ_BOARD_NO.NEXTVAL , ?, ?, ?);

-- �Խñ� ��� ��ȸ(�ֽż�)
SELECT * FROM BOARD ORDER BY NO DESC;

-- �Խñ� ��� ��ȸ(�����ȼ�)
SELECT * FROM BOARD ORDER BY NO ASC;


SELECT
    B.NO
    ,TITLE
    ,CONTENT
    ,HIT
    ,NICK
    ,TO_CHAR(B.ENROLL_DATE, 'YYYY"��" MM"��"DD"��"HH:MI:SS') ENROLL_DATE
FROM BOARD B
JOIN MEMBER M
ON M.NO = B.WRITER_NO
WHERE B.NO = 1 AND B.DEL_YN = 'N';


-- �Խñ� ��� ��ȸ(��ȸ�� ���� ��)
SELECT * FROM BOARD ORDER BY HIT DESC;

-- �Խñ� �� ��ȸ 
SELECT * FROM BOARD WHERE NO = ?;

-- �Խñ� �˻� (����)
SELECT * FROM BOARD WHERE TITLE LIKE '%?%';

-- �Խñ� �˻� (����)
SELECT * FROM BOARD WHERE CONTENT LIKE '%?%';

-- �Խñ� ���� (�ۼ��� �Ǵ� ������ �� ����)
UPDATE BOARD SET TITLE = ? , CONTENT = ? , MODIFY_DATE = SYSDATE WHERE NO = ?;

-- �Խñ� ���� (�ۼ��� �Ǵ� ������ �� ����)
UPDATE BOARD SET DEL_YN = 'Y' , MODIFY_DATE = SYSDATE WHERE NO = ?;












