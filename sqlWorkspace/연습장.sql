--������

--MEMBER ���̺� ����(���̵� , ��й�ȣ , �г���)
DROP TABLE MEMBER CASCADE CONSTRAINTS; --�������ǵ� ���� ���� ��
CREATE TABLE MEMBER(
    ID          VARCHAR2(100)       NOT NULL UNIQUE
    ,PWD        VARCHAR2(100)       NOT NULL
    ,NICK       VARCHAR2(100)       UNIQUE
);

--ȸ�� ��� ��ȸ
SELECT * FROM MEMBER;


--Ư�� ȸ�� ��ȸ
SELECT * FROM MEMBER WHERE ID = 'USER01';


--ȸ������
INSERT INTO MEMBER(ID,PWD,NICK)VALUES('USER01','1234','NICK01'); 


--�α���
SELECT *
FROM MEMBER 
WHERE ID = 'USER01'
AND PWD = '1234';


--ȸ������ ����(�������)
UPDATE MEMBER SET PWD = '1234' WHERE ID = ?;


--ȸ��Ż��
DELETE FROM MEMBER
WHERE ID = 'USER01';


------------------�ǽ�--------------------------

--BOARD ���̺� ���� (����,����,�ۼ��Ͻ�)
DROP TABLE BOARD CASCADE CONSTRAINTS;
CREATE TABLE BOARD(
        TITLE            VARCHAR2(1000)       NOT NULL
        ,CONTENT         VARCHAR2(1000)       NOT NULL
        ,ENROLL_DATE     TIMESTAMP            DEFAULT SYSDATE
);
     

--�Խñ� ��� ��ȸ
SELECT *
FROM BOARD;

--�Խñ� �˻�(�������� �˻�)
SELECT TITLE
FROM BOARD
WHERE TITLE LIKE '?????';

--�Խñ� �˻�(�������� �˻�)
SELECT TITLE 
FROM   BOARD
WHERE CONTENT LIKE '????"; 


--�Խñ� �ۼ�
INSERT INTO BOARD(TITLE,CONTENT,DATE)VALUES ('�ȳ�','��û��','0325');

--�Խñ� ����(�������)
UPDATE BOARD
SET CONTENT ='?????' WHERE TITTLE = '????'; 


--�Խñ� ����
DELECT FROM BOARD
WHERE TITTLE = '?????';