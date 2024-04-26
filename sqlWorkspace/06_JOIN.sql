--JOIN

/*
    <JOIN>
        �� ���� �̻��� ���̺��� �����͸� ��ȸ�ϰ��� �� �� ����ϴ� �����̴�.
        
        1. � ����(EQUAL JOIN) / ���� ����(INNER JOIN)
            �����Ű�� Į���� ���� ��ġ�ϴ� ��鸸 ���εǼ� ��ȸ�Ѵ�.(��ġ�ϴ� ���� ���� ���� ��ȸ X)
            
            1) ����Ŭ ���� ����
                [����]
                    SELECT Į��, Į��, ...
                    FROM ���̺�1, ���̺�2
                    WHERE ���̺�1.Į���� = ���̺�2.Į����;
                
                - FROM ���� ��ȸ�ϰ��� �ϴ� ���̺���� �޸�(,)�� �����Ͽ� �����Ѵ�.
                - WHERE ���� ��Ī ��ų Į���� ���� ������ �����Ѵ�.
            
            2) ANSI ǥ�� ����
                [����]
                    SELECT Į��, Į��, ...
                    FROM ���̺�1
                    [INNER] JOIN ���̺�2 ON (���̺�1.Į���� = ���̺�2.Į����);
                
                - FROM ���� ������ �Ǵ� ���̺��� ����Ѵ�.
                - JOIN ���� ���� ��ȸ�ϰ��� �ϴ� ���̺��� ��� �� ��Ī ��ų Į���� ���� ������ ����Ѵ�.
                - ���ῡ ����Ϸ��� Į������ ���� ��� ON ���� ��ſ� USING(Į����) ������ ����Ѵ�.
*/

--�����,�����ڵ�,���޸�

SELECT EMP_NAME , ABC.JOB_CODE ,JOB_NAME
FROM EMPLOYEE ABC
JOIN JOB X 
ON ABC.JOB_CODE = X.JOB_CODE;

--�����,�μ��ڵ�,�μ���

SELECT 
   D.DEPT_TILLE
   ,SUM(SALARY)
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
WHERE E.DEPT_CODE != 'D5'
GROUP BY E.DEPT_CODE;

-- EMPLOYEE ���̺� , JOB ���̺��� �̿��Ͽ�
-- �����, �����ڵ�, ���޸� ��ȸ
SELECT 
    EMP_NAME
    ,A.JOB_CODE
    ,JOB_NAME
FROM EMPLOYEE A
JOIN JOB B
ON A.JOB_CODE = B.JOB_CODE;


-- EMPLOYEE ���̺� , DEPARTMENT ���̺��� �̿��Ͽ�
-- �����, �μ��ڵ�, �μ��� ��ȸ
SELECT EMP_NAME
    ,A.DEPT_CODE
    ,DEPT_TITLE
FROM EMPLOYEE A
JOIN DEPARTMENT B
ON A.DEPT_CODE = B.DEPT_ID;


-- DEPARTMENT ���̺� , LOCATION ���̺��� �̿��Ͽ�
-- �μ��ڵ�, �μ���, �����ڵ�, ������, �����ڵ� ��ȸ
SELECT 
    DEPT_ID
    ,DEPT_TITLE
    ,A.LOCATION_ID
    ,NATIONAL_CODE
FROM DEPARTMENT A
JOIN LOCATION B
ON A.LOCATION_ID = B.LOCAL_CODE;


-- LOCATION ���̺� , NATIONAL ���̺��� �̿��Ͽ�
-- �����ڵ�, ������, �����ڵ�, ������ ��ȸ
SELECT
    LOCAL_CODE
    ,LOCAL_NAME
    ,A.NATIONAL_CODE
    ,NATIONAL_NAME
FROM LOCATION A
JOIN NATIONAL B
ON A.NATIONAL_CODE = B.NATIONAL_CODE;

-- DEPARTMENT ���̺� , LOCATION ���̺� , NATIONAL ���̺��� �̿��Ͽ�
-- �μ��ڵ�, �μ���, ������, ������ ��ȸ
SELECT 
    DEPT_ID
    ,DEPT_TITLE
    ,LOCAL_NAME
    ,NATIONAL_NAME
FROM DEPARTMENT A
JOIN LOCATION B
ON A.LOCATION_ID = B.LOCAL_CODE
JOIN NATIONAL C
ON B.NATIONAL_CODE = C.NATIONAL_CODE;


SELECT EMP_NAME , D.DEPT_TITLE
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID;

/*
    3. �ܺ� ���� (OUTTER JOIN)
        ���̺� ���� JOIN �� ��ġ���� �ʴ� �൵ ���Խ��Ѽ� ��ȸ�� �����ϴ�.
        ��, �ݵ�� �����̵Ǵ� ���̺�(�÷�)�� �����ؾ� �Ѵ�. (LEFT/RIGHT/(+))
        full �� �� �� �츰��
*/

    
/*
    4. ī�׽þȰ�(CARTESIAN PRODUCT) / ���� ����(CROSS JOIN)
        ���εǴ� ��� ���̺��� �� ����� ���μ��� ��� ���ε� �����Ͱ� �˻��ȴ�.
        ���̺��� ����� ��� ������ ����� ������ ��� -> ����ȭ�� ����
*/


/*
    5. �� ����(NON EQUAL JOIN)
        ���� ���ǿ� ��ȣ(=)�� ������� �ʴ� ���ι��� �� �����̶�� �Ѵ�.
        ������ Į�� ���� ��ġ�ϴ� ��찡 �ƴ�, ���� ������ ���ԵǴ� ����� �����ϴ� ����̴�.
        ( = �̿ܿ� �� ������ >, <, >=, <=, BETWEEN AND, IN, NOT IN ���� ����Ѵ�.)
        ANSI �������δ� JOIN ON �������θ� ����� �����ϴ�. (USING ��� �Ұ�)
*/

SELECT *
FROM EMPLOYEE  E
JOIN SAL_GRADE S ON E.SALARY >= S.MIN_SAL AND E.SALARY < S.MAX_SAL;

/*
    6. ��ü ����(SELF JOIN)
        ���� ���̺��� �ٽ� �ѹ� �����ϴ� ��쿡 ����Ѵ�.
*/

SELECT 
    E.EMP_ID ������ȣ
    ,E.EMP_NAME �����̸�
    ,E.MANAGER_ID �����ȣ
    ,M.EMP_NAME ����̸�
FROM EMPLOYEE E
JOIN EMPLOYEE M
ON M.EMP_ID = E.MANAGER_ID;

-- 1. DEPARTMENT ���̺�� LOCATION ���̺��� �����Ͽ� �μ� �ڵ�, �μ���, ���� �ڵ�, �������� ��ȸ
SELECT
     DEPT_ID �μ��ڵ�
    ,DEPT_TITLE �μ���
    ,D.LOCATION_ID �����ڵ�
    ,LOCAL_NAME ������
FROM DEPARTMENT D
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE;

-- 2. EMPLOYEE ���̺�� DEPARTMENT ���̺��� �����ؼ� ���ʽ��� �޴� ������� ���, �����, ���ʽ�, �μ����� ��ȸ
SELECT
    EMP_ID ���
    ,EMP_NAME �����
    ,BONUS ���ʽ�
    ,DEPT_TITLE �μ���
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
WHERE BONUS IS NOT NULL;


-- 3. EMPLOYEE ���̺�� DEPARTMENT ���̺��� �����ؼ� �λ�����ΰ� �ƴ� ������� �����, �μ���, �޿��� ��ȸ
SELECT 
    EMP_NAME
    ,DEPT_TITLE
    ,SALARY
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
WHERE DEPT_ID != 'D1';


-- 4. EMPLOYEE ���̺�, DEPARTMENT ���̺�, LOCATION ���̺��� �����ؼ� ���, �����, �μ���, ������ ��ȸ
SELECT 
     EMP_ID ���
    ,EMP_NAME �����
    ,DEPT_TITLE �μ���
    ,LOCAL_NAME ������
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE;


-- 5. ���, �����, �μ���, ������, ������ ��ȸ
SELECT 
    EMP_ID ���
    ,EMP_NAME �����
    ,DEPT_TITLE �μ���
    ,LOCAL_NAME ������
    ,NATIONAL_NAME ������
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N
ON L.NATIONAL_CODE = N.NATIONAL_CODE;

-- 6. ���, �����, �μ���, ������, ������, �޿� ��� ��ȸ 
SELECT 
    EMP_ID ���
    ,EMP_NAME �����
    ,DEPT_TITLE �μ���
    ,LOCAL_NAME ������
    ,NATIONAL_NAME ������
    ,SALARY �޿�
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N
ON L.NATIONAL_CODE = N.NATIONAL_CODE;

-- 1. ������ �븮�̸鼭 ASIA �������� �ٹ��ϴ� �������� ���, �����, ���޸�, �μ���, �ٹ�����, �޿��� ��ȸ�ϼ���.
SELECT 
    EMP_ID ���
    ,EMP_NAME �����
    ,JOB_NAME ���޸�
    ,DEPT_TITLE �μ���
    ,LOCAL_NAME �ٹ�����
    ,SALARY �޿�
 FROM EMPLOYEE E
 JOIN DEPARTMENT D
 ON E.DEPT_CODE =D.DEPT_ID
 JOIN JOB J
 ON E.JOB_CODE = J.JOB_CODE
 JOIN LOCATION L
 ON D.LOCATION_ID = L.LOCAL_CODE
 WHERE J.JOB_CODE = 'J6'
 AND SUBSTR(LOCAL_NAME  ,1,4) = 'ASIA';



-- 2. 70���� �̸鼭 �����̰�, ���� �� ���� �������� �����, �ֹι�ȣ, �μ���, ���޸��� ��ȸ�ϼ���.
SELECT 
    EMP_NAME �����
    ,EMP_NO �ֹι�ȣ
    ,DEPT_TITLE �μ���
    ,JOB_NAME ���޸�
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE =D.DEPT_ID
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
WHERE EMP_NAME LIKE '��%'
AND SUBSTR(EMP_NO , 8 , 1) = 2
AND SUBSTR(EMP_NO , 1 , 1) = 7;


-- 3. ���ʽ��� �޴� �������� �����, ���ʽ�, ����, �μ���, �ٹ������� ��ȸ�ϼ���.
SELECT 
    EMP_NAME �����
    ,BONUS ���ʽ�
    ,SALARY*12 ����
    ,DEPT_TITLE �μ���
    ,LOCAL_NAME �ٹ�����
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE =D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
WHERE BONUS IS NOT NULL;

    


-- 4. �ѱ��� �Ϻ����� �ٹ��ϴ� �������� �����, �μ���, �ٹ�����, �ٹ� ������ ��ȸ�ϼ���.
SELECT 
    EMP_NAME
    ,DEPT_TITLE
    ,LOCAL_NAME �ٹ�����
    ,NATIONAL_NAME �ٹ�����
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE =D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N
ON L.NATIONAL_CODE = N.NATIONAL_CODE
WHERE N.NATIONAL_CODE = 'KO'
OR N.NATIONAL_CODE = 'JP';

-- 5. �� �μ��� ��� �޿��� ��ȸ�Ͽ� �μ���, ��� �޿�(���� ó��)�� ��ȸ�ϼ���.
SELECT 
    FLOOR(AVG(SALARY)) ��ձ޿�
    ,DEPT_TITLE �μ���
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE =D.DEPT_ID
GROUP BY DEPT_TITLE;
    
-- 6. �� �μ��� �� �޿��� ���� 1000���� �̻��� �μ���, �޿��� ���� ��ȸ�Ͻÿ�.
SELECT 
     DEPT_TITLE �μ���
    ,SUM(SALARY) �޿��հ�
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE =D.DEPT_ID
GROUP BY DEPT_TITLE
HAVING  SUM(SALARY) >= 10000000;

 /*2) ANSI ǥ�� ����
                [����]
                    SELECT Į��, Į��, ...
                    FROM ���̺�1
                    [INNER] JOIN ���̺�2 ON (���̺�1.Į���� = ���̺�2.Į����);
                
                - FROM ���� ������ �Ǵ� ���̺��� ����Ѵ�.
                - JOIN ���� ���� ��ȸ�ϰ��� �ϴ� ���̺��� ��� �� ��Ī ��ų Į���� ���� ������ ����Ѵ�.
                - ���ῡ ����Ϸ��� Į������ ���� ��� ON ���� ��ſ� USING(Į����) ������ ����Ѵ�.
*/

-- 7. ���, �����, ���޸�, �޿� ���, ������ ��ȸ
--    �̶� ���п� �ش��ϴ� ���� �Ʒ��� ���� ��ȸ �ǵ��� �Ͻÿ�.
--    �޿� ����� S1, S2�� ��� '���'
--    �޿� ����� S3, S4�� ��� '�߱�'
--    �޿� ����� S5, S6�� ��� '�ʱ�'
SELECT 
    EMP_ID ���
    ,EMP_NAME �����
    ,JOB_NAME ���޸�
    ,SAL_LEVEL �޿����
FROM EMPLOYEE E
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE;


-- 8. ���ʽ��� ���� �ʴ� ������ �� ���� �ڵ尡 J4 �Ǵ� J7�� �������� �����, ���޸�, �޿��� ��ȸ�Ͻÿ�.
SELECT 
    EMP_NAME
    ,JOB_NAME
    ,SALARY 
FROM EMPLOYEE E
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
WHERE BONUS IS NULL
AND J.JOB_CODE = 'J4'
OR J.JOB_CODE = 'J7';

-- 9. �μ��� �ִ� �������� �����, ���޸�, �μ���, �ٹ� ������ ��ȸ�Ͻÿ�.
SELECT 
    EMP_NAME �����
    ,JOB_NAME ���޸�
    ,DEPT_TITLE �μ���
    ,LOCAL_NAME �ٹ�����
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE =D.DEPT_ID
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
WHERE D.DEPT_ID IS NOT NULL;


-- 10. �ؿܿ������� �ٹ��ϴ� �������� �����, ���޸�, �μ� �ڵ�, �μ����� ��ȸ�Ͻÿ�
SELECT
    EMP_NAME �����
    ,JOB_NAME ���޸�
    ,D.DEPT_ID �μ��ڵ�
    ,DEPT_TITLE �μ���
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE =D.DEPT_ID
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
WHERE D.DEPT_ID = 'D5'
OR D.DEPT_ID = 'D6'
OR D.DEPT_ID = 'D7';


    

-- 11. �̸��� '��'�ڰ� ����ִ� �������� ���, �����, ���޸��� ��ȸ�Ͻÿ�.
SELECT 
    EMP_ID
    ,EMP_NAME
    ,JOB_NAME
FROM EMPLOYEE E
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
WHERE EMP_NAME LIKE '%��%';