--JOIN

/*
    <JOIN>
        두 개의 이상의 테이블에서 데이터를 조회하고자 할 때 사용하는 구문이다.
        
        1. 등가 조인(EQUAL JOIN) / 내부 조인(INNER JOIN)
            연결시키는 칼럼의 값이 일치하는 행들만 조인되서 조회한다.(일치하는 값이 없는 행은 조회 X)
            
            1) 오라클 전용 구문
                [문법]
                    SELECT 칼럼, 칼럼, ...
                    FROM 테이블1, 테이블2
                    WHERE 테이블1.칼럼명 = 테이블2.칼럼명;
                
                - FROM 절에 조회하고자 하는 테이블들을 콤마(,)로 구분하여 나열한다.
                - WHERE 절에 매칭 시킬 칼럼명에 대한 조건을 제시한다.
            
            2) ANSI 표준 구문
                [문법]
                    SELECT 칼럼, 칼럼, ...
                    FROM 테이블1
                    [INNER] JOIN 테이블2 ON (테이블1.칼럼명 = 테이블2.칼럼명);
                
                - FROM 절에 기준이 되는 테이블을 기술한다.
                - JOIN 절에 같이 조회하고자 하는 테이블을 기술 후 매칭 시킬 칼럼에 대한 조건을 기술한다.
                - 연결에 사용하려는 칼럼명이 같은 경우 ON 구문 대신에 USING(칼럼명) 구문을 사용한다.
*/

--사원명,직급코드,직급명

SELECT EMP_NAME , ABC.JOB_CODE ,JOB_NAME
FROM EMPLOYEE ABC
JOIN JOB X 
ON ABC.JOB_CODE = X.JOB_CODE;

--사원명,부서코드,부서명

SELECT 
   D.DEPT_TILLE
   ,SUM(SALARY)
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
WHERE E.DEPT_CODE != 'D5'
GROUP BY E.DEPT_CODE;

-- EMPLOYEE 테이블 , JOB 테이블을 이용하여
-- 사원명, 직급코드, 직급명 조회
SELECT 
    EMP_NAME
    ,A.JOB_CODE
    ,JOB_NAME
FROM EMPLOYEE A
JOIN JOB B
ON A.JOB_CODE = B.JOB_CODE;


-- EMPLOYEE 테이블 , DEPARTMENT 테이블을 이용하여
-- 사원명, 부서코드, 부서명 조회
SELECT EMP_NAME
    ,A.DEPT_CODE
    ,DEPT_TITLE
FROM EMPLOYEE A
JOIN DEPARTMENT B
ON A.DEPT_CODE = B.DEPT_ID;


-- DEPARTMENT 테이블 , LOCATION 테이블을 이용하여
-- 부서코드, 부서명, 지역코드, 지역명, 국가코드 조회
SELECT 
    DEPT_ID
    ,DEPT_TITLE
    ,A.LOCATION_ID
    ,NATIONAL_CODE
FROM DEPARTMENT A
JOIN LOCATION B
ON A.LOCATION_ID = B.LOCAL_CODE;


-- LOCATION 테이블 , NATIONAL 테이블을 이용하여
-- 지역코드, 지역명, 국가코드, 국가명 조회
SELECT
    LOCAL_CODE
    ,LOCAL_NAME
    ,A.NATIONAL_CODE
    ,NATIONAL_NAME
FROM LOCATION A
JOIN NATIONAL B
ON A.NATIONAL_CODE = B.NATIONAL_CODE;

-- DEPARTMENT 테이블 , LOCATION 테이블 , NATIONAL 테이블을 이용하여
-- 부서코드, 부서명, 지역명, 국가명 조회
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
    3. 외부 조인 (OUTTER JOIN)
        테이블 간의 JOIN 시 일치하지 않는 행도 포함시켜서 조회가 가능하다.
        단, 반드시 기준이되는 테이블(컬럼)을 지정해야 한다. (LEFT/RIGHT/(+))
        full 은 둘 다 살린다
*/

    
/*
    4. 카테시안곱(CARTESIAN PRODUCT) / 교차 조인(CROSS JOIN)
        조인되는 모든 테이블의 각 행들이 서로서로 모두 매핑된 데이터가 검색된다.
        테이블의 행들이 모두 곱해진 행들의 조합이 출력 -> 과부화의 위험
*/


/*
    5. 비등가 조인(NON EQUAL JOIN)
        조인 조건에 등호(=)를 사용하지 않는 조인문을 비등가 조인이라고 한다.
        지정한 칼럼 값이 일치하는 경우가 아닌, 값의 범위에 포함되는 행들을 연결하는 방식이다.
        ( = 이외에 비교 연산자 >, <, >=, <=, BETWEEN AND, IN, NOT IN 등을 사용한다.)
        ANSI 구문으로는 JOIN ON 구문으로만 사용이 가능하다. (USING 사용 불가)
*/

SELECT *
FROM EMPLOYEE  E
JOIN SAL_GRADE S ON E.SALARY >= S.MIN_SAL AND E.SALARY < S.MAX_SAL;

/*
    6. 자체 조인(SELF JOIN)
        같은 테이블을 다시 한번 조인하는 경우에 사용한다.
*/

SELECT 
    E.EMP_ID 직원번호
    ,E.EMP_NAME 직원이름
    ,E.MANAGER_ID 사수번호
    ,M.EMP_NAME 사수이름
FROM EMPLOYEE E
JOIN EMPLOYEE M
ON M.EMP_ID = E.MANAGER_ID;

-- 1. DEPARTMENT 테이블과 LOCATION 테이블의 조인하여 부서 코드, 부서명, 지역 코드, 지역명을 조회
SELECT
     DEPT_ID 부서코드
    ,DEPT_TITLE 부서명
    ,D.LOCATION_ID 지역코드
    ,LOCAL_NAME 지역명
FROM DEPARTMENT D
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE;

-- 2. EMPLOYEE 테이블과 DEPARTMENT 테이블을 조인해서 보너스를 받는 사원들의 사번, 사원명, 보너스, 부서명을 조회
SELECT
    EMP_ID 사번
    ,EMP_NAME 사원명
    ,BONUS 보너스
    ,DEPT_TITLE 부서명
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
WHERE BONUS IS NOT NULL;


-- 3. EMPLOYEE 테이블과 DEPARTMENT 테이블을 조인해서 인사관리부가 아닌 사원들의 사원명, 부서명, 급여를 조회
SELECT 
    EMP_NAME
    ,DEPT_TITLE
    ,SALARY
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
WHERE DEPT_ID != 'D1';


-- 4. EMPLOYEE 테이블, DEPARTMENT 테이블, LOCATION 테이블의 조인해서 사번, 사원명, 부서명, 지역명 조회
SELECT 
     EMP_ID 사번
    ,EMP_NAME 사원명
    ,DEPT_TITLE 부서명
    ,LOCAL_NAME 지역명
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE;


-- 5. 사번, 사원명, 부서명, 지역명, 국가명 조회
SELECT 
    EMP_ID 사번
    ,EMP_NAME 사원명
    ,DEPT_TITLE 부서명
    ,LOCAL_NAME 지역명
    ,NATIONAL_NAME 국가명
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N
ON L.NATIONAL_CODE = N.NATIONAL_CODE;

-- 6. 사번, 사원명, 부서명, 지역명, 국가명, 급여 등급 조회 
SELECT 
    EMP_ID 사번
    ,EMP_NAME 사원명
    ,DEPT_TITLE 부서명
    ,LOCAL_NAME 지역명
    ,NATIONAL_NAME 국가명
    ,SALARY 급여
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N
ON L.NATIONAL_CODE = N.NATIONAL_CODE;

-- 1. 직급이 대리이면서 ASIA 지역에서 근무하는 직원들의 사번, 사원명, 직급명, 부서명, 근무지역, 급여를 조회하세요.
SELECT 
    EMP_ID 사번
    ,EMP_NAME 사원명
    ,JOB_NAME 직급명
    ,DEPT_TITLE 부서명
    ,LOCAL_NAME 근무지역
    ,SALARY 급여
 FROM EMPLOYEE E
 JOIN DEPARTMENT D
 ON E.DEPT_CODE =D.DEPT_ID
 JOIN JOB J
 ON E.JOB_CODE = J.JOB_CODE
 JOIN LOCATION L
 ON D.LOCATION_ID = L.LOCAL_CODE
 WHERE J.JOB_CODE = 'J6'
 AND SUBSTR(LOCAL_NAME  ,1,4) = 'ASIA';



-- 2. 70년대생 이면서 여자이고, 성이 전 씨인 직원들의 사원명, 주민번호, 부서명, 직급명을 조회하세요.
SELECT 
    EMP_NAME 사원명
    ,EMP_NO 주민번호
    ,DEPT_TITLE 부서명
    ,JOB_NAME 직급명
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE =D.DEPT_ID
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
WHERE EMP_NAME LIKE '전%'
AND SUBSTR(EMP_NO , 8 , 1) = 2
AND SUBSTR(EMP_NO , 1 , 1) = 7;


-- 3. 보너스를 받는 직원들의 사원명, 보너스, 연봉, 부서명, 근무지역을 조회하세요.
SELECT 
    EMP_NAME 사원명
    ,BONUS 보너스
    ,SALARY*12 연봉
    ,DEPT_TITLE 부서명
    ,LOCAL_NAME 근무지역
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE =D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
WHERE BONUS IS NOT NULL;

    


-- 4. 한국과 일본에서 근무하는 직원들의 사원명, 부서명, 근무지역, 근무 국가를 조회하세요.
SELECT 
    EMP_NAME
    ,DEPT_TITLE
    ,LOCAL_NAME 근무지역
    ,NATIONAL_NAME 근무국가
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE =D.DEPT_ID
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N
ON L.NATIONAL_CODE = N.NATIONAL_CODE
WHERE N.NATIONAL_CODE = 'KO'
OR N.NATIONAL_CODE = 'JP';

-- 5. 각 부서별 평균 급여를 조회하여 부서명, 평균 급여(정수 처리)를 조회하세요.
SELECT 
    FLOOR(AVG(SALARY)) 평균급여
    ,DEPT_TITLE 부서명
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE =D.DEPT_ID
GROUP BY DEPT_TITLE;
    
-- 6. 각 부서별 총 급여의 합이 1000만원 이상인 부서명, 급여의 합을 조회하시오.
SELECT 
     DEPT_TITLE 부서명
    ,SUM(SALARY) 급여합계
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE =D.DEPT_ID
GROUP BY DEPT_TITLE
HAVING  SUM(SALARY) >= 10000000;

 /*2) ANSI 표준 구문
                [문법]
                    SELECT 칼럼, 칼럼, ...
                    FROM 테이블1
                    [INNER] JOIN 테이블2 ON (테이블1.칼럼명 = 테이블2.칼럼명);
                
                - FROM 절에 기준이 되는 테이블을 기술한다.
                - JOIN 절에 같이 조회하고자 하는 테이블을 기술 후 매칭 시킬 칼럼에 대한 조건을 기술한다.
                - 연결에 사용하려는 칼럼명이 같은 경우 ON 구문 대신에 USING(칼럼명) 구문을 사용한다.
*/

-- 7. 사번, 사원명, 직급명, 급여 등급, 구분을 조회
--    이때 구분에 해당하는 값은 아래와 같이 조회 되도록 하시오.
--    급여 등급이 S1, S2인 경우 '고급'
--    급여 등급이 S3, S4인 경우 '중급'
--    급여 등급이 S5, S6인 경우 '초급'
SELECT 
    EMP_ID 사번
    ,EMP_NAME 사원명
    ,JOB_NAME 직급명
    ,SAL_LEVEL 급여등급
FROM EMPLOYEE E
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE;


-- 8. 보너스를 받지 않는 직원들 중 직급 코드가 J4 또는 J7인 직원들의 사원명, 직급명, 급여를 조회하시오.
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

-- 9. 부서가 있는 직원들의 사원명, 직급명, 부서명, 근무 지역을 조회하시오.
SELECT 
    EMP_NAME 사원명
    ,JOB_NAME 직급명
    ,DEPT_TITLE 부서명
    ,LOCAL_NAME 근무지역
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE =D.DEPT_ID
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
JOIN LOCATION L
ON D.LOCATION_ID = L.LOCAL_CODE
WHERE D.DEPT_ID IS NOT NULL;


-- 10. 해외영업팀에 근무하는 직원들의 사원명, 직급명, 부서 코드, 부서명을 조회하시오
SELECT
    EMP_NAME 사원명
    ,JOB_NAME 직급명
    ,D.DEPT_ID 부서코드
    ,DEPT_TITLE 부서명
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.DEPT_CODE =D.DEPT_ID
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
WHERE D.DEPT_ID = 'D5'
OR D.DEPT_ID = 'D6'
OR D.DEPT_ID = 'D7';


    

-- 11. 이름에 '형'자가 들어있는 직원들의 사번, 사원명, 직급명을 조회하시오.
SELECT 
    EMP_ID
    ,EMP_NAME
    ,JOB_NAME
FROM EMPLOYEE E
JOIN JOB J
ON E.JOB_CODE = J.JOB_CODE
WHERE EMP_NAME LIKE '%형%';