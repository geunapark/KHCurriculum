--우리반 문제

--(김송희)
---- 연봉이 3000만원 이하인 직원의 사번,이름,연봉 조회
SELECT 
    EMP_ID
    ,EMP_NAME
    ,SALARY*12
FROM EMPLOYEE
WHERE SALARY*12 <= 30000000;

--(김제민)
--D5부서의 사원 이름, 직급, 월급 출력
SELECT
    EMP_NAME
    ,JOB_CODE AS 직급코드
    ,SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5';

--2.
--사원들중 월급이 가장 많은 사람과 가장 적은 사람의 연봉 차이
SELECT 
     MAX(SALARY*12)-MIN(SALARY*12) AS 연봉차이
FROM EMPLOYEE;

--(김태우)
-- dept_code가 D5인 사람들의 이름과 휴대번호 앞자리 3자리를 출력하시오
SELECT 
    EMP_NAME
    ,SUBSTR(PHONE , 1 , 3)
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5';

--(나지원)
-- 보너스를 받는 사원을 대상으로 
-- 직급별 평균 급여 조회 
-- 평균급여가 높은 순서대로 정렬
-- (단, 퇴직하지 않은 사원들 대상 조회)

SELECT  
    JOB_CODE
    ,FLOOR(AVG(SALARY))AS 평균월급
FROM EMPLOYEE
WHERE BONUS IS NOT NULL
AND ENT_YN = 'N'
GROUP BY JOB_CODE
ORDER BY FLOOR(AVG(SALARY))DESC;

--(문준서)
-- 남자 직원들의 이름과 나이를 나이가 많은 순으로 조회
-- 이름은 성을 제외, 나이는 만으로 계산
-- EX 이름 나이
--    동운 61세
--    길동 54세 

SELECT 
    SUBSTR(EMP_NAME , 2 ,2 )
    ,EXTRACT(YEAR FROM SYSDATE) - 1  - (19 || SUBSTR(EMP_NO,1,2)) || '세' AS 나이
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO,8 ,1) = 1
ORDER BY EXTRACT(YEAR FROM SYSDATE) - 1  - (19 || SUBSTR(EMP_NO,1,2)) DESC; 

--(문태웅)
-- 부서중에 급여 합계가 제일 적은 부서의 급여합계는? (부서 합계만 나오면 됩니다.)
-- (단, EMPLOYEE 계정에서 풀어야한다. )
SELECT MIN(SUM(SALARY)) AS "월급의 합계"
FROM EMPLOYEE
GROUP BY DEPT_CODE;

--(박근아)
--보너스를 받는 사원들의 모든 코드를 조회
--대신 급여가 3000000원 이상인 사람들만

SELECT *
FROM EMPLOYEE
WHERE BONUS IS NOT NULL
    AND SALARY >= 3000000;
    
--(박진동)
--부서별 직급이 높고 연봉이 많은순으로 이름, 사번, 연봉, 조회 
SELECT 
    EMP_NAME 이름
    ,EMP_ID 사번
    ,JOB_CODE 코드
    ,SALARY*12 연봉
FROM EMPLOYEE
ORDER BY JOB_CODE DESC, SALARY*12 DESC;

--(백의현)
-- 010으로 시작하지 않는 전화번호를 가진 사람들의 이름, 부서, 전화번호
--(NULL 포함 X, 부서 코드로 오름차순))
SELECT 
    EMP_NAME  이름
    ,DEPT_CODE 부서
    ,PHONE 전화번호
FROM EMPLOYEE
WHERE NOT SUBSTR(PHONE , 1 ,3) = 010
AND DEPT_CODE IS NOT NULL
ORDER BY DEPT_CODE;

--(소현지)
--부서 평균 급여가 400만원 이상인 부서만 조회(소수점 나올시 소수점 이하는 버리기)
SELECT 
    DEPT_CODE 부서
    ,FLOOR(AVG(SALARY))
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING FLOOR(AVG(SALARY)) >= 4000000;

--(손지욱)
-- 보너스를 받는 사원들을 대상으로
-- 부서별 평균 보너스 금액 조회
SELECT 
    DEPT_CODE 부서
    ,AVG(SALARY*BONUS) 보너스
FROM EMPLOYEE
WHERE BONUS IS NOT NULL
GROUP BY DEPT_CODE;

--(송예린)
--여자 사원을 대상으로
--직급별 전체 급여를 조회 (별칭 : 급여총액)
--직급코드 J4 제외
--급여합이 낮은 순서대로 정렬

SELECT
    JOB_CODE
    ,SUM(SALARY) 급여총액
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO , 8 ,1) = 2
AND NOT JOB_CODE =('J4')
GROUP BY JOB_CODE
ORDER BY SUM(SALARY)






