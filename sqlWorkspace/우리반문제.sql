--���ʽ��� ���� �ʴ� ������� �������
-- �μ��� ��� �޿��� ��ȸ
-- (����޿��� 300���� �̻��� �μ��� ����)
-- (��ձ޿��� ���� ������� ����)
SELECT DEPT_CODE ,FLOOR(AVG(SALARY))
FROM EMPLOYEE
GROUP BY DEPT_CODE
WHERE FLOOR(AVG(SALARY))<=3000000
HAVING COUNT(BONUS) IS NULL
ORDER BY AVG(SALARY)DESC;

-- ������ 3000���� ������ ������ ���,�̸�,���� ��ȸ
SELECT EMP_ID , EMP_NAME, SALARY
FROM EMPLOYEE
WHERE SALARY*12 <= 30000000
ORDER BY SALARY*12 ASC;

--������� ������ ���� ���� ����� ���� ���� ����� ���� ����
SELECT (MAX(SALARY)-MIN(SALARY))*12 as "���� ����"
FROM EMPLOYEE;

--dept_code�� D5�� ������� �̸��� �޴��ȣ ���ڸ� 3�ڸ��� ����Ͻÿ�
SELECT EMP_NAME , SUBSTR(PHONE,1,3) 
FROM EMPLOYEE
WHERE DEPT_CODE IN ('D5');

--���ʽ��� �޴� ����� ������� 
-- ���޺� ��� �޿� ��ȸ 
-- ��ձ޿��� ���� ������� ����
-- (��, �������� ���� ����� ��� ��ȸ)
SELECT JOB_CODE ����
    , FLOOR(AVG(SALARY)) ��ձ޿�
    FROM EMPLOYEE
    WHERE BONUS IS NOT NULL
    AND ENT_YN = 'N'
    GROUP BY JOB_CODE
    ORDER BY AVG(SALARY) DESC
;

--���� �������� �̸��� ���̸� ���̰� ���� ������ ��ȸ
-- �̸��� ���� ����, ���̴� ������ ���
-- EX �̸� ����
--    ���� 61��
--    �浿 54��

SELECT SUBSTR(EMP_NAME,2,2) �̸�
,EXTRACT(YEAR FROM SYSDATE) - (19 || SUBSTR(EMP_NO,1,2)) - 1 || '��' AS ����
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO,8,1)=1
ORDER BY EMP_NO;

-- �μ��߿� �޿� �հ谡 ���� ���� �μ��� �޿��հ��? (�μ� �հ踸 ������ �˴ϴ�.)
-- (��, EMPLOYEE �������� Ǯ����Ѵ�. )

SELECT MIN(SUM(SALARY)) 
FROM EMPLOYEE
GROUP BY DEPT_CODE;

--���ʽ��� �޴� ������� ��� �ڵ带 ��ȸ
--��� �޿��� 3000000�� �̻��� ����鸸

SELECT *
FROM EMPLOYEE
WHERE BONUS IS NOT NULL
    AND SALARY >= 3000000;
    
--�μ��� ������ ���� ������ ���������� �̸�, ���, ����, ��ȸ 
SELECT EMP_NAME, EMP_ID,JOB_CODE, SALARY*12
FROM EMPLOYEE
ORDER BY JOB_CODE DESC, SALARY*12 DESC;

-- 010���� �������� �ʴ� ��ȭ��ȣ�� ���� ������� �̸�, �μ�, ��ȭ��ȣ 
--(NULL ���� X, �μ� �ڵ�� ��������)
SELECT EMP_NAME,DEPT_CODE, SUBSTR(PHONE,1,3)
FROM EMPLOYEE
WHERE SUBSTR(PHONE,1,3)!=010 AND DEPT_CODE IS NOT NULL
ORDER BY DEPT_CODE
;





 --�μ� ��� �޿��� 400���� �̻��� �μ��� ��ȸ(�Ҽ��� ���ý� �Ҽ��� ���ϴ� ������)
SELECT DEPT_CODE , FLOOR(AVG(SALARY))
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING FLOOR(AVG(SALARY))>=4000000
;






-- ���ʽ��� �޴� ������� �������
-- �μ��� ��� ���ʽ� �ݾ� ��ȸ
SELECT
    DEPT_CODE
    , FLOOR ( AVG(SALARY*BONUS) ) ��պ��ʽ�
FROM EMPLOYEE
WHERE BONUS IS NOT NULL
GROUP BY DEPT_CODE
ORDER BY ��պ��ʽ� DESC
;
--���� ����� �������
--���޺� ��ü �޿��� ��ȸ (��Ī : �޿��Ѿ�)
--�����ڵ� J4 ����
--�޿����� ���� ������� ����
SELECT 
    JOB_CODE
    ,SUM(SALARY) �޿��Ѿ�
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 8, 1) = 2
GROUP BY JOB_CODE
HAVING JOB_CODE != 'J4'
ORDER BY "�޿��Ѿ�" ASC;

--�μ��ڵ庰 ������̵� ��ȣ�� ���� ��������� �μ��ڵ�� ������̵� ��ȸ
--(���ʽ��� �ִ� ����� ����)
SELECT DEPT_CODE, MIN(EMP_ID)FROM EMPLOYEE
WHERE BONUS IS NULL 
GROUP BY DEPT_CODE;
-- ������ ����� �ִ� ����� �������
-- �μ��� �� �޿��� ��ȸ
-- (�޿� ���� ������� ����)
SELECT DEPT_CODE,SUM(SALARY)
FROM EMPLOYEE
WHERE MANAGER_ID IS NOT NULL
GROUP BY DEPT_CODE
ORDER BY SUM(SALARY) DESC;

--1. �����ȣ 200���� ������ �̸���, �����ڵ� ���
SELECT EMP_NAME,JOB_CODE
FROM EMPLOYEE
WHERE EMP_ID = 200;
--2. ȸ���� ������ �������� ���� '��'���� ����� ��� ���� 
--�ڽŰ� ������ '��'���� �����Ű���� �Ѵ�. �����Ͽ��� �� ���̱� ���� ����
SELECT REPLACE(EMP_NAME, '��', '��')
FROM EMPLOYEE
WHERE EMP_NAME LIKE '��%'
;
--3. �⻵�� �������� �̸��� ������ �������� ������ �ϳ��� ���̷��� �Ѵ�.
SELECT REPLACE(EMP_NAME, '��', '��') , 'J' || (SUBSTR(JOB_CODE,2 ,1)-1), JOB_CODE
FROM EMPLOYEE
WHERE EMP_NAME LIKE '��%'
;
--�Ի�⵵�� ���� ������� ��ձ޿��� ���� 250�������� ���� ����鿡�� ������ ��Ű�� �Ѵ�
--�̻������ �Ի�⵵�� �޿��� ��ȸ�϶�
 SELECT SUBSTR(HIRE_DATE,1,2),AVG(SALARY)
 FROM EMPLOYEE
 GROUP BY SUBSTR(HIRE_DATE,1,2)
 HAVING AVG(SALARY)<2500000 ;

--����̸��� ���� ���� ���
SELECT EMP_NAME,(100-SUBSTR(EMP_NO,0,2))+TO_CHAR(SYSDATE,'YY') || '��' AS ����
FROM EMPLOYEE
ORDER BY ����;

--�μ��� �ְ�޿� ��ȸ
SELECT DEPT_CODE,MAX(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
ORDER BY DEPT_CODE;

--���س⵵�� 2017�⵵�̴� ������ 5�� �̸��̰� ������ �븮�� ������ ���, �̸�, ����, ���� ��ȸ
SELECT EMP_ID, EMP_NAME,  2017 -TO_CHAR(HIRE_DATE, 'RRRR') ����, JOB_CODE
FROM EMPLOYEE
WHERE TO_CHAR(HIRE_DATE, 'RRRR') > 2012 AND JOB_CODE ='J6';

-- ���޺� ��� �޿��� 200���� �̻��� �μ����� ��ȭ��ȣ 4��° �ڸ��� 3�� �����ڵ常 ��ȸ
-- �߰����� : (010-X1234-567) ���⼭ X�� 3�� ���
SELECT JOB_CODE
FROM EMPLOYEE
WHERE SUBSTR(PHONE, 5, 1) = '3'
GROUP BY JOB_CODE
HAVING AVG(SALARY) >= 2000000;

--70��� �̻��� ������� ������� �� �μ��� ��ձ޿��� �Ҽ��� �Ʒ��� �����ϰ� ���Ͻÿ�
--��, 70��� ���� ����� ����� 1���� �μ��� ����
--��� ����� �μ��ڵ�,�ο�,��ձ޿� 
SELECT DEPT_CODE �μ��ڵ�, COUNT(*)�ο�, FLOOR(AVG(SALARY)) ��ձ޿�
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO,1,2) > '70'
GROUP BY DEPT_CODE
HAVING COUNT(*)>1
;
-- �������, ������� ��� �� ���ϱ�
SELECT SUBSTR(EMP_NO,8,1),COUNT(*)  
FROM EMPLOYEE
GROUP BY SUBSTR(EMP_NO,8,1);

-- ȸ�� ä�� ������ �ý����� �����Ϸ��� �Ѵ�.
-- �׷��� ���ؼ��� �켱, �Ի糪�̴� ���������� �ľ��ؾ��Ѵ�.
-- ������ ������ �Ի糪�̸� ���� ������� ������. (2023�⵵������ �ѱ����̷� ���)
SELECT
    EMP_NAME �����
    , TO_NUMBER(TO_CHAR(HIRE_DATE, 'RRRR')) - TO_NUMBER('19' || SUBSTR(EMP_NO, 1, 2)) �Ի糪��
    , TO_NUMBER(TO_CHAR(SYSDATE, 'RRRR')) - TO_NUMBER('19' || SUBSTR(EMP_NO, 1, 2)) ���糪��
    , '19' || SUBSTR(EMP_NO, 1, 2) ����
    , TO_CHAR(HIRE_DATE, 'RRRR') �Ի�⵵
FROM EMPLOYEE
ORDER BY �Ի糪�� ASC
;

--�����ڰ� �ִ� �μ��ڵ� , �� ��� �̸� �� ������ ���Ͻÿ�
SELECT EMP_ID , EMP_NAME , SALARY * 12 ����
FROM EMPLOYEE
WHERE ENT_YN  = 'Y';

--���ʽ��� �޴� �μ��ڵ�, ��� �޿���  ��ȸ�Ͻÿ�(��ձ޿��� ���� �������)
SELECT EMP_ID ,AVG(SALARY)
FROM EMPLOYEE
WHERE BONUS IS NOT NULL
GROUP BY EMP_ID
ORDER BY AVG(SALARY) DESC;

-- 10���� ������ ������� ��ȸ�ؼ�
-- �޿��� 50%��ŭ ���ʽ��� �ٷ����Ѵ�
-- �ش� ����ڵ�� ���� ���ʽ��� �ִ��� ��ȸ�Ͻÿ�
SELECT EMP_NAME �̸�
    ,EMP_NO ����
    ,SALARY �޿�
    ,SALARY * 0.5 AS ���ʽ�
    FROM EMPLOYEE
WHERE EMP_NO LIKE '__10%';

--�� ���޺��� ��� ����(�Ҽ������� �ݿø�)�� ���ʽ��� �޴� �ο��� ��ȸ

SELECT 
    JOB_CODE
    , ROUND(AVG(SALARY))
    , COUNT(BONUS)
FROM EMPLOYEE
GROUP BY JOB_CODE
;