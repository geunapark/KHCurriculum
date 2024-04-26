.+/*
    <GROUP BY>
        �׷� ������ ������ �� �ִ� ����
        ���� ���� ������ �ϳ��� �׷����� ��� ó���� �������� ����Ѵ�.
        SELECT���� ���� ������
*/


/*
    <HAVING>
        �׷쿡 ���� ������ ������ �� ����ϴ� ����(�ַ� �׷� �Լ��� ����� ������ �� ����)
    
    * ���� ����
        5: SELECT      ��ȸ�ϰ��� �ϴ� Į���� AS "��Ī" | ���� | �Լ���
        1: FROM        ��ȸ�ϰ��� �ϴ� ���̺��
        2: WHERE       ���ǽ�
        3: GROUP BY    �׷� ���ؿ� �ش��ϴ� Į���� | ���� | �Լ���
        4: HAVING      �׷쿡 ���� ���ǽ�
        6: ORDER BY    ���� ���ؿ� �ش��ϴ� Į���� | ��Ī | Į�� ����
*/

SELECT 
    DEPT_CODE
    , SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE;

-- ��ü �޿� ���� ��ȸ
SELECT 
    SUM(SALARY)
FROM EMPLOYEE;

-- �� �μ��� �޿� ���� ��ȸ
SELECT 
    DEPT_CODE
    , SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE;

-- ��ü ��� �� ��ȸ
SELECT
   COUNT(EMP_ID)
FROM EMPLOYEE;

-- �� �μ��� ��� �� ��ȸ
SELECT DEPT_CODE
        ,COUNT(EMP_ID) AS �����
FROM EMPLOYEE
GROUP BY DEPT_CODE;

    

-- �� �μ��� ���ʽ��� �޴� �����
SELECT DEPT_CODE
        ,COUNT(BONUS)
FROM EMPLOYEE
GROUP BY DEPT_CODE;
        

-- �� ���޺� �޿� ��� ��ȸ
SELECT JOB_CODE
    ,AVG(SALARY)
FROM EMPLOYEE
GROUP BY JOB_CODE;
    

-- �μ��� �����, ���ʽ��� �޴� �����, �޿��� ��, ��� �޿�, �ְ� �޿�, ���� �޿� ��ȸ
SELECT DEPT_CODE AS �μ�
        ,COUNT(EMP_ID) AS �����
        ,COUNT(BONUS) AS ���ʽ�
        ,SUM(SALARY)  AS �޿�
        ,FLOOR(AVG(SALARY))  AS ��ձ޿�
        ,MAX(SALARY) AS �ְ�޿�
        ,MIN(SALARY) AS �����޿�
FROM EMPLOYEE
GROUP BY DEPT_CODE
ORDER BY DEPT_CODE;

--�������� ����� ��ȸ
SELECT SUBSTR(EMP_NO, 8, 1) AS "���� �ڵ�",
       COUNT(*) AS "�����"
FROM EMPLOYEE
GROUP BY SUBSTR(EMP_NO, 8, 1)
ORDER BY "���� �ڵ�"
;

--���ʽ��� ���� �ʴ� ������� �������
--�μ��� ��� �޿��� ��ȸ
--(��ձ޿��� 300���� �̻��� �μ��� ����)
--(��ձ޿��� ���� ������� ����)

SELECT 
    DEPT_CODE
    ,FLOOR(AVG(SALARY)) ��ձ޿�
FROM EMPLOYEE
WHERE BONUS IS NULL
HAVING AVG(SALARY) <= 3000000
GROUP BY DEPT_CODE
ORDER BY FLOOR(AVG(SALARY))DESC;


--���ʽ��� �޴� ������� ��� �ڵ带 ��ȸ
--��� �޿��� 3000000���� �̻��� ����鸸

SELECT *
FROM EMPLOYEE
WHERE BONUS IS NOT NULL
    AND SALARY >= 3000000;
    
--
  /*
    <���� �Լ�>
        �׷캰 ������ ��� ���� �߰� ���踦 ��� ���ִ� �Լ�
*/

-- ���޺� �޿��� �հ踦 ��ȸ
SELECT JOB_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY JOB_CODE
ORDER BY JOB_CODE;

-- ������ �࿡ ��ü �� �޿��� �հ���� ��ȸ
SELECT JOB_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY ROLLUP(JOB_CODE)
ORDER BY JOB_CODE;

SELECT JOB_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY CUBE(JOB_CODE)
ORDER BY JOB_CODE;

-- �μ� �ڵ嵵 ���� ���� �ڵ嵵 ���� ������� �׷� ��� �޿��� �հ踦 ��ȸ
SELECT DEPT_CODE, JOB_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE, JOB_CODE
ORDER BY DEPT_CODE, JOB_CODE;

-- ROLLUP(�÷� 1, �÷� 2, ...) -> �÷� 1�� ������ �߰����踦 ���� �Լ�
SELECT DEPT_CODE, JOB_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY ROLLUP(DEPT_CODE, JOB_CODE)
ORDER BY DEPT_CODE, JOB_CODE;

-- CUBE(�÷� 1, �÷� 2, ...) -> �÷� 1�� ������ �߰����踦 ����, �÷� 2�� ������ �߰����踦 ����. ��, ���޵Ǵ� �÷� ��� �����ϴ� �Լ�
SELECT DEPT_CODE, JOB_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY CUBE(DEPT_CODE, JOB_CODE)
ORDER BY DEPT_CODE, JOB_CODE;



/*
    <���� ������>
        ���� ���� �������� ������ �ϳ��� ���������� ����� �������̴�.
        
        UNION       : �� �������� ������ ������� ���� �� �ߺ��Ǵ� ���� �����Ѵ�. (������)
        UNION ALL   : UNION�� �����ϰ� �� �������� ������ ������� ���ϰ� �ߺ��� ����Ѵ�. (������)
        INTERSECT   : �� �������� ������ ������� �ߺ��� ������� �����Ѵ�. (������)
        MINUS       : ���� ������ ��������� ���� ������ ������� �� ������ ������� �����Ѵ�. (������)
*/

--�μ��ڵ尡 D5�� ����� ��ȸ
SELECT EMP_ID,EMP_NAME , DEPT_CODE ,SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5';

--�޿��� 300���� �ʰ��� ����� ��ȸ
SELECT EMP_ID,EMP_NAME , DEPT_CODE ,SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
INTERSECT
SELECT EMP_ID,EMP_NAME , DEPT_CODE ,SALARY
FROM EMPLOYEE
WHERE SALARY > 3000000;

--�μ��ڵ尡 D5�̸鼭 �޿��� 300�����ʰ�
SELECT EMP_ID,EMP_NAME , DEPT_CODE ,SALARY
FROM EMPLOYEE
WHERE SALARY > 3000000
OR DEPT_CODE = 'D5';
    

