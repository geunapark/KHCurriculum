--PROCEDURE , FUNCTION

/*
    <PROCEDURE>
        PL/SQL 문을 저장하는 객체이다.
        필요할 때마다 복잡한 구문을 다시 입력할 필요 없이 간단하게 호출해서 실행 결과를 얻을 수 있다.
        특정 로직을 처리하기만 하고 결과값을 반환하지 않는다.
        
        [문법]
            CREATE PROCEDURE 프로시저명
            (
                매개변수 1 [IN/OUT] 테이터타입 [:=DEFAULT 값],
                매개변수 2 [IN/OUT] 테이터타입 [:=DEFAULT 값],
                ...
            )
            IS [AS]
                선언부
            BEGIN
                실행부
            EXCEPTION
                예외처리부
            END [프로시저명];
            /
            
        [실행방법]
            EXECUTE(EXEC) 프로시저명[(매개값1, 매개값2, ...)];
*/
-- 테스트용 테이블 생성
CREATE TABLE EMP_DUP
AS SELECT * FROM EMPLOYEE;

SELECT * FROM EMP_DUP;

-- 테스트 테이블의 데이터를 모두 삭제하는 프로시저 생성
CREATE PROCEDURE DEL_ALL_EMP
IS
BEGIN
    DELETE FROM EMP_DUP;
    
    COMMIT;
END;
/

-- 프로시저를 관리하는 데이터 딕셔너리
SELECT * FROM USER_SOURCE;

-- DEL_ALL_EMP 프로시저 호출
EXECUTE DEL_ALL_EMP;

SELECT * FROM EMP_DUP;

DROP PROCEDURE DEL_ALL_EMP;
DROP TABLE EMP_DUP;

-------------------------------------------
/*
    1) 매개변수가 있는 프로시저
      프로시저 실행 시 매개변수로 인자값을 전달해야 한다.
*/
CREATE OR REPLACE PROCEDURE DEL_EMP_ID
(
    P_EMP_ID EMPLOYEE.EMP_ID%TYPE
)
IS
BEGIN
    DELETE FROM EMPLOYEE
    WHERE EMP_ID = P_EMP_ID;
END;
/

-- 프로시저 실행(단, 매개 값을 전달해야 한다.)
--EXEC DEL_EMP_ID; -- 에러 발생
EXEC DEL_EMP_ID('204');

SELECT * FROM EMPLOYEE;

-- 사용자가 입력한 값도 전달이 가능하다.
EXEC DEL_EMP_ID('&사번');

ROLLBACK;

SELECT * FROM EMPLOYEE;

/*
    2) IN/OUT 매개변수가 있는 프로시저
      IN 매개변수 : 프로시저 내부에서 사용될 변수
      OUT 매개변수 : 프로시저 호출부(외부)에서 사용될 값을 담아줄 변수
*/

CREATE OR REPLACE PROCEDURE SELECT_EMP_ID
(
    V_EMP_ID IN EMPLOYEE.EMP_ID%TYPE,
    V_EMP_NAME OUT EMPLOYEE.EMP_NAME%TYPE,
    V_SALARY OUT EMPLOYEE.SALARY%TYPE,
    V_BONUS OUT EMPLOYEE.BONUS%TYPE
)
IS
BEGIN
    SELECT EMP_NAME, SALARY, BONUS
    INTO V_EMP_NAME, V_SALARY, V_BONUS
    FROM EMPLOYEE
    WHERE EMP_ID = V_EMP_ID;
END;
/

-- 바인드 변수(VARIABLE, VAR)
VARIABLE VAR_EMP_NAME VARCHAR2(30);
VAR VAR_SALARY NUMBER;
VAR VAR_BONUS NUMBER;

SET AUTOPRINT ON;

-- 바인드 변수는 ':변수명' 형태로 참조 가능
EXEC SELECT_EMP_ID('200', :VAR_EMP_NAME, :VAR_SALARY, :VAR_BONUS);

PRINT VAR_EMP_NAME;
PRINT VAR_SALARY;
PRINT VAR_BONUS;

---------------------------------------------------
/*
    <FUNCTION>
        프로시저와 사용 용도가 비슷하지만
        프로시저와 다르게 OUT 변수를 사용하지 않아도 실행 결과를 되돌려 받을 수 있다.(RETURN )
        
        [문법]
            CREATE FUNCTION 함수명
            (
                매개변수 1 타입,
                매개변수 2 타입,
                ...
            )
            RETURN 데이터타입
            IS
                선언부
            BEGIN
                실행부
                
                RETRUN 반환값; -- 프로시저랑 다르게 RETURN 구문이 추가된다.
            EXCEPTION
                예외처리부
            END [함수명];
            /
*/

-- 사번을 입력받아 해당 사원의 보너스를 포함하는 연봉을 계산하고 리턴하는 함수 생성
CREATE OR REPLACE FUNCTION BONUS_CALC
(
    V_EMP_ID EMPLOYEE.EMP_ID%TYPE
)
RETURN NUMBER
IS
    V_SAL EMPLOYEE.SALARY%TYPE;
    V_BONUS EMPLOYEE.BONUS%TYPE;
BEGIN
    SELECT SALARY, NVL(BONUS, 0)
    INTO V_SAL, V_BONUS
    FROM EMPLOYEE
    WHERE EMP_ID = V_EMP_ID;
    
    RETURN (V_SAL + (V_SAL * V_BONUS)) * 12;
END;
/

SELECT * FROM USER_SOURCE;

SELECT BONUS_CALC(203) FROM DUAL;

SELECT EMP_ID, 
       EMP_NAME, 
       SALARY, 
       NVL(BONUS, 0), 
       BONUS_CALC(EMP_ID)
FROM EMPLOYEE;

---------------------------------------------------
/*
    <CURSOR>
        SQL 문의 처리 결과(처리 결과가 여러 행(ROW))를 담고 있는 객체이다.
        커서 사용 시 여러 행으로 나타난 처리 결과에 순차적으로 접근이 가능하다.
        
        [커서 속성]
            커서명%NOTFOUND : 커서 영역에 남아있는 ROW 수가 없다면 TURE, 아니면 FALSE
            커서명%FOUND    : 커서 영역에 남아있는 ROW 수가 한 개 이상일 경우 TRUE, 아니면 FALSE
            커서명%ISOPEN   : 커서가 OPEN 상태인 경우 TRUE, 아니면 FALSE
            커서명%ROWCOUNT : SQL 처리 결과로 얻어온 행(ROW)의 수
        
        [사용 방법]
            1) CURSOR 커서명 IS ..     : 커서 선언
            2) OPEN 커서명;            : 커서 오픈
            3) FETCH 커서명 INTO 변수, ...   : 커서에서 데이터 추출(한 행씩 데이터를 가져온다.)
            4) CLOSE 커서명            : 커서 닫기
        
        [문법]
            CURSOR 커서명 IS [SELECT 문]
            
            OPEN 커서명;
            FETCH 커서명 INTO 변수;
            ...
            
            CLOSE 커서명;
*/
SET SERVEROUTPUT ON;

-- 급여가 3000000 이상인 사원의 사번, 이름, 급여 출력(PL/SQL)
DECLARE
    EID EMPLOYEE.EMP_ID%TYPE;
    ENAME EMPLOYEE.EMP_NAME%TYPE;
    SAL EMPLOYEE.SALARY%TYPE;
    
    -- 커서 선언
    CURSOR C1 IS 
        SELECT EMP_ID, EMP_NAME, SALARY
        FROM EMPLOYEE
        WHERE SALARY > 3000000;
BEGIN
    -- 커서 오픈
    OPEN C1;
    
    LOOP
        FETCH C1 INTO EID, ENAME, SAL;
        
        EXIT WHEN C1%NOTFOUND;
                
        DBMS_OUTPUT.PUT_LINE(EID || ' ' || ENAME || ' ' || SAL);
    END LOOP;  
    
    CLOSE C1;
END;
/

-- 전체 부서에 대해 부서 코드, 부서명, 지역 조회(PROCEDURE)
CREATE OR REPLACE PROCEDURE CURSOR_DEPT
IS
    V_DEPT DEPARTMENT%ROWTYPE;
    
    CURSOR C1 IS
        SELECT * FROM DEPARTMENT;
BEGIN
    OPEN C1;
    
    LOOP
        FETCH C1 INTO V_DEPT.DEPT_ID, V_DEPT.DEPT_TITLE, V_DEPT.LOCATION_ID;
        
        EXIT WHEN C1%NOTFOUND;
        
        DBMS_OUTPUT.PUT_LINE(V_DEPT.DEPT_ID || ' ' || V_DEPT.DEPT_TITLE || ' ' || V_DEPT.LOCATION_ID);
    END LOOP;
    
    CLOSE C1;
END;
/

EXEC CURSOR_DEPT;

-- FOR IN LOOP를 이용한 커서 사용
CREATE OR REPLACE PROCEDURE CURSOR_DEPT
IS
    V_DEPT DEPARTMENT%ROWTYPE;
BEGIN
    FOR V_DEPT IN (SELECT * FROM DEPARTMENT)
    LOOP
        DBMS_OUTPUT.PUT_LINE(V_DEPT.DEPT_ID || ' ' || V_DEPT.DEPT_TITLE || ' ' || V_DEPT.LOCATION_ID);
    END LOOP;
END;
/

EXEC CURSOR_DEPT;


















