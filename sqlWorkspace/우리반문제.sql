--�츮�� ����

--(�����)
---- ������ 3000���� ������ ������ ���,�̸�,���� ��ȸ
SELECT 
    EMP_ID
    ,EMP_NAME
    ,SALARY*12
FROM EMPLOYEE
WHERE SALARY*12 <= 30000000;

--(������)
--D5�μ��� ��� �̸�, ����, ���� ���
SELECT
    EMP_NAME
    ,JOB_CODE AS �����ڵ�
    ,SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5';

--2.
--������� ������ ���� ���� ����� ���� ���� ����� ���� ����
SELECT 
     MAX(SALARY*12)-MIN(SALARY*12) AS ��������
FROM EMPLOYEE;

--(���¿�)
-- dept_code�� D5�� ������� �̸��� �޴��ȣ ���ڸ� 3�ڸ��� ����Ͻÿ�
SELECT 
    EMP_NAME
    ,SUBSTR(PHONE , 1 , 3)
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5';

--(������)
-- ���ʽ��� �޴� ����� ������� 
-- ���޺� ��� �޿� ��ȸ 
-- ��ձ޿��� ���� ������� ����
-- (��, �������� ���� ����� ��� ��ȸ)

SELECT  
    JOB_CODE
    ,FLOOR(AVG(SALARY))AS ��տ���
FROM EMPLOYEE
WHERE BONUS IS NOT NULL
AND ENT_YN = 'N'
GROUP BY JOB_CODE
ORDER BY FLOOR(AVG(SALARY))DESC;

--(���ؼ�)
-- ���� �������� �̸��� ���̸� ���̰� ���� ������ ��ȸ
-- �̸��� ���� ����, ���̴� ������ ���
-- EX �̸� ����
--    ���� 61��
--    �浿 54�� 

SELECT 
    SUBSTR(EMP_NAME , 2 ,2 )
    ,EXTRACT(YEAR FROM SYSDATE) - 1  - (19 || SUBSTR(EMP_NO,1,2)) || '��' AS ����
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO,8 ,1) = 1
ORDER BY EXTRACT(YEAR FROM SYSDATE) - 1  - (19 || SUBSTR(EMP_NO,1,2)) DESC; 

--(���¿�)
-- �μ��߿� �޿� �հ谡 ���� ���� �μ��� �޿��հ��? (�μ� �հ踸 ������ �˴ϴ�.)
-- (��, EMPLOYEE �������� Ǯ����Ѵ�. )
SELECT MIN(SUM(SALARY)) AS "������ �հ�"
FROM EMPLOYEE
GROUP BY DEPT_CODE;

--(�ڱپ�)
--���ʽ��� �޴� ������� ��� �ڵ带 ��ȸ
--��� �޿��� 3000000�� �̻��� ����鸸

SELECT *
FROM EMPLOYEE
WHERE BONUS IS NOT NULL
    AND SALARY >= 3000000;
    
--(������)
--�μ��� ������ ���� ������ ���������� �̸�, ���, ����, ��ȸ 
SELECT 
    EMP_NAME �̸�
    ,EMP_ID ���
    ,JOB_CODE �ڵ�
    ,SALARY*12 ����
FROM EMPLOYEE
ORDER BY JOB_CODE DESC, SALARY*12 DESC;

--(������)
-- 010���� �������� �ʴ� ��ȭ��ȣ�� ���� ������� �̸�, �μ�, ��ȭ��ȣ
--(NULL ���� X, �μ� �ڵ�� ��������))
SELECT 
    EMP_NAME  �̸�
    ,DEPT_CODE �μ�
    ,PHONE ��ȭ��ȣ
FROM EMPLOYEE
WHERE NOT SUBSTR(PHONE , 1 ,3) = 010
AND DEPT_CODE IS NOT NULL
ORDER BY DEPT_CODE;

--(������)
--�μ� ��� �޿��� 400���� �̻��� �μ��� ��ȸ(�Ҽ��� ���ý� �Ҽ��� ���ϴ� ������)
SELECT 
    DEPT_CODE �μ�
    ,FLOOR(AVG(SALARY))
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING FLOOR(AVG(SALARY)) >= 4000000;

--(������)
-- ���ʽ��� �޴� ������� �������
-- �μ��� ��� ���ʽ� �ݾ� ��ȸ
SELECT 
    DEPT_CODE �μ�
    ,AVG(SALARY*BONUS) ���ʽ�
FROM EMPLOYEE
WHERE BONUS IS NOT NULL
GROUP BY DEPT_CODE;

--(�ۿ���)
--���� ����� �������
--���޺� ��ü �޿��� ��ȸ (��Ī : �޿��Ѿ�)
--�����ڵ� J4 ����
--�޿����� ���� ������� ����

SELECT
    JOB_CODE
    ,SUM(SALARY) �޿��Ѿ�
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO , 8 ,1) = 2
AND NOT JOB_CODE =('J4')
GROUP BY JOB_CODE
ORDER BY SUM(SALARY)






