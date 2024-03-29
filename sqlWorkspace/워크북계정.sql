--�� ���б� ��ũ�� ����
--SQL04_DDL

-- 1��
-- �迭 ������ ������ ī�װ� ���̺��� ������� �Ѵ�. ������ ���� ���̺��� �ۼ��Ͻÿ�.
CREATE TABLE TB_CATEGORY(
        NAME VARCHAR2(10),
        USE_YN CHAR(1) DEFAULT 'Y'
);

-- 2��
-- ���� ������ ������ ���̺��� ������� �Ѵ�. ������ ���� ���̺��� �ۼ��Ͻÿ�.
CREATE TABLE TB_CLASS_TYPE(
        NO VARCHAR2(5) PRIMARY KEY,
        NAME VARCHAR2(10)
);

-- 3��
-- TB_CATEGORY ���̺��� NAME �÷��� PRIMARY KEY�� �����Ͻÿ�.
-- (KEY �̸��� �������� �ʾƵ� ������. ���� KEY�� �����ϰ��� �Ѵٸ� �̸��� ������ �˾Ƽ� ������ �̸��� ����Ѵ�.)
DROP TABLE TB_CATEGORY;
CREATE TABLE TB_CATEGORY(
        NAME VARCHAR2(10) PRIMARY KEY
        );

-- 4��
-- TB_CLASS_TYPE ���̺��� NAME �÷��� NULL ���� ���� �ʵ��� �Ӽ��� �����Ͻÿ�.
DROP TABLE TB_CLASS_TYPE;
CREATE TABLE TB_CLASS_TYPE (
    NAME VARCHAR2(10) NOT NULL
);

-- 5��
-- �� ���̺��� �÷� ���� NO�� ���� ���� Ÿ���� �����ϸ鼭 ũ��� 10����, 
--�÷����� NAME�� ���� ���������� ���� Ÿ���� �����ϸ鼭
-- ũ�� 20���� �����Ͻÿ�.


-- 6��
-- �� ���̺��� NO �÷��� NAME �÷��� �̸��� �� ���̺� �̸��� �տ� ���� ���·� �����Ѵ�.
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

-- 7��
-- TB_CATAGORY ���̺�� TB_CLASS_TYPE ���̺��� PRIMARY_KEY �̸��� ������ ���� �����Ͻÿ�
-- PRIMARY KEY�� �̸��� "PK_ + �÷��̸�"���� �����Ͻÿ�
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

-- 8��
-- ������ ���� INSERT ���� �����Ѵ�.
INSERT INTO TB_CATEGORY VALUES('����','Y');
INSERT INTO TB_CATEGORY VALUES('�ڿ�����','Y');
INSERT INTO TB_CATEGORY VALUES('����','Y');
INSERT INTO TB_CATEGORY VALUES('��ü��','Y');
INSERT INTO TB_CATEGORY VALUES('�ι���ȸ','Y');
COMMIT;


-- 9��
-- TB_DEPARTMENT�� CATEGORY �÷��� TB_CATEGORY ���̺��� CATEGORY_NAME �÷��� �θ����� �����ϵ��� FOREIGN KEY�� �����Ͻÿ�.
-- �� �� KEY �̸��� FK_���̺��̸�_�÷��̸����� �����Ѵ�
INSERT INTO CATEGORY VARCHAR2(40 BYTE) [CONSTRAINT CATEGORY_NAME] REFERENCES TB_CATEGORY [(�⺻Ű)];


-- 10��
-- �� ������б� �л����� �������� ���ԵǾ� �ִ� �л��Ϲ����� VIEW�� ������� �Ѵ�.
-- �Ʒ� ������ �����Ͽ� ������ SQL���� �ۼ��Ͻÿ�.

CREATE VIEW VIEW_STUDENT AS
SELECT *
FROM TB_STUDENT;
   
-- 11��
-- �� ������б��� 1�⿡ �� ���� �а����� ���������� ���� ����� �����Ѵ�.
-- �̸� ���� ����� �л��̸�, �а��̸�, ��米���̸����� �����Ǿ� �ִ� VIEW�� ����ÿ�.
-- �̶� ���� ���簡 ���� �л��� ���� �� ������ ����Ͻÿ�.
-- (��, �� VIEW�� �ܼ� SELECT���� �� ��� �а����� ���ĵǾ� ȭ�鿡 �������� ����ÿ�.)


-- 12��
-- ��� �а��� �а��� �л� ���� Ȯ���� �� �ֵ��� ������ VIEW�� �ۼ��غ���.

   
-- 13��
-- ������ ������ �л��Ϲ����� VIEW�� ���ؼ� �й��� A213046�� �л��� �̸��� ���� �̸����� ����


-- 14��
-- 13�������� ���� VIEW�� ���ؼ� �����Ͱ� ����� �� �ִ� ��Ȳ�� �������� VIEW�� ��� �����ؾ� �ϴ��� �ۼ��Ͻÿ�
-- WITH READ ONLY ���� �� SELECT�� ����

--�� ���б� ��ũ�� ����
--SQL05_DML

-- 1��
-- �������� ���̺�(TB_CLASS_TYPE)�� �Ʒ��� ���� �����͸� �Է��Ͻÿ�.
INSERT INTO TB_CLASS_TYPE VALUES('01','�����ʼ�');
INSERT INTO TB_CLASS_TYPE VALUES('02','��������');
INSERT INTO TB_CLASS_TYPE VALUES('03','�����ʼ�');
INSERT INTO TB_CLASS_TYPE VALUES('04','���缱��');
INSERT INTO TB_CLASS_TYPE VALUES('05','������');

-- 2��
-- �� ������б� �л����� ������ ���ԵǾ� �ִ� �л��Ϲ����� ���̺��� ������� �Ѵ�.
-- �Ʒ� ������ �����Ͽ� ������ SQL ���� �ۼ��Ͻÿ�. (���������� �̿��Ͻÿ�)
CREATE TABLE TB_�л��Ϲ�����
AS (SELECT STUDENT_NO �й�, STUDENT_NAME �л��̸�, STUDENT_ADDRESS �ּ�
    FROM TB_STUDENT);
SELECT *
FROM TB_�л��Ϲ�����;


-- 3��
-- ������а� �л����� �������� ���ԵǾ� �ִ� �а����� ���̺��� ������� �Ѵ�.
-- �Ʒ� ������ �����Ͽ� ������ SQL ���� �ۼ��Ͻÿ�. (��Ʈ ����� �پ�)
CREATE TABLE TB_���а�
AS (SELECT STUDENT_NO �й�, STUDENT_NAME �л��̸�, 19||SUBSTR(STUDENT_SSN,1,2) ����⵵, PROFESSOR_NAME �����̸�
    FROM TB_STUDENT S, TB_PROFESSOR P, TB_DEPARTMENT D
    WHERE S.COACH_PROFESSOR_NO = P.PROFESSOR_NO(+)
    AND S.DEPARTMENT_NO = D.DEPARTMENT_NO
    AND DEPARTMENT_NAME = '������а�');
    
SELECT *
FROM TB_���а�;

-- 4��
-- �� �а����� ������ 10% ������Ű�� �Ǿ���. �̿� ����� SQL ���� �ۼ��Ͻÿ�.
-- (��, �ݿø��� ����Ͽ� �Ҽ��� �ڸ����� ������ �ʵ��� �Ѵ�.)
 UPDATE DEPARTMENT
            SET CAPACITY*10;
    
         

-- 5��
-- �й� A413042�� �ڰǿ� �л��� �ּҰ� "����� ���α� ���ε� 181-21"�� ����Ǿ��ٰ� �Ѵ�.
-- �ּ����� �����ϱ� ���� ����� SQL ���� �ۼ��Ͻÿ�.
UPDATE  TB_STUDENT
    SET STUDENT_ADDRESS = '��⵵ ���ֽ� ������ ����2�� ��65����'
    WHERE STUDENT_NO = 'A413042';
    
UPDATE TB_�л��Ϲ�����
        SET �ּ� = '����� ���α� ���ε� 181-21'
        WHERE �л��̸� = '�ڰǿ�';

-- 6��
-- �ֹε�Ϲ�ȣ ��ȣ���� ���� �л����� ���̺��� �ֹι�ȣ ���ڸ��� �������� �ʱ�� �����Ͽ���.
-- �� ������ �ݿ��� ������ SQL ������ �ۼ��Ͻÿ�.
UPDATE VIEW_STUDENT
    SET STUDENT_SSN = SUBSTR(STUDENT_SSN , 1,8), 14 , '*'
    WHERE SEUDENT_SSN = SUBSTR(STUDENT_SSN , 8 ,1 ) = 1;




-- 7��
-- ���а� ����� �л��� 2005�� 1�б⿡ �ڽ��� ������ '�Ǻλ�����' ������ 
-- �߸��Ǿ��ٴ� ���� �߰��ϰ�� ������ ��û�Ͽ���.
-- ��� ������ Ȯ�� ���� ��� �ش� ������ ������ 3.5�� ����Ű�� �����Ǿ���. ������ SQL ���� �ۼ��Ͻÿ�
SELECT 
        �л��̸�
        ,TERM_NO
        ,�й�
        ,POINT
FROM TB_���а�  T
JOIN TB_GRADE E
ON T.�й� = E.STUDENT_NO
WHERE CLASS_NO = 'C3843900';



(SELECT STUDENT_NO �й�, STUDENT_NAME �л��̸�, 19||SUBSTR(STUDENT_SSN,1,2) ����⵵, PROFESSOR_NAME �����̸�
    FROM TB_STUDENT S, TB_PROFESSOR P, TB_DEPARTMENT D
    WHERE S.COACH_PROFESSOR_NO = P.PROFESSOR_NO(+)
    AND S.DEPARTMENT_NO = D.DEPARTMENT_NO
    AND DEPARTMENT_NAME = '������а�');          
 
-- 8��
-- ���� ���̺��� ���л����� �����׸��� �����Ͻÿ�

