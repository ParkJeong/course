/*
VIEW는 제한적인 자료만 보기위해서 사용할 수 있는 가상테이블의 개념이다.
뷰는 가상테이블이기 때문에 필요한 칼럼만 저장해 두면 데이터 조회가 용이해진다.
뷰는 실제로 데이터가 물리적으로 저장된 형태는 아니다. (원본테이블을 기반으로 사용된다.)
그래서 뷰에 DML작업을 하게 되면 실제 테이블에 적용이 된다. (다만, 제약사항이 많이 따른다.)
*/

--현재사용자 권한확인
SELECT *
  FROM USER_SYS_PRIVS;
  
--단순뷰 - 하나의 테이블을 기반으로한 뷰
CREATE VIEW VIEW_EMP
AS (SELECT EMPLOYEE_ID,
           FIRST_NAME,
           LAST_NAME,
           JOB_ID,
           SALARY FROM EMPLOYEES);
SELECT *
  FROM VIEW_EMP;
  
--복합뷰 - 여러 테이블을 조인하여 필요한 데이터를 저장한 형태
CREATE VIEW VIEW_EMP_DEPT_JOB
AS (SELECT E.EMPLOYEE_ID,
           FIRST_NAME || ' ' || LAST_NAME AS NAME,
           D.DEPARTMENT_NAME,
           J.JOB_TITLE
      FROM EMPLOYEES E
    LEFT OUTER JOIN DEPARTMENTS D
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
    LEFT OUTER JOIN JOBS J
    ON E.JOB_ID = J.JOB_ID);

SELECT *
  FROM VIEW_EMP_DEPT_JOB;


--뷰의 수정 CREATE OR REPLACE VIEW 동일이름
CREATE OR REPLACE VIEW VIEW_EMP_DEPT_JOB
AS (SELECT E.EMPLOYEE_ID,
           E.FIRST_NAME || ' ' || E.LAST_NAME AS NAME,
           D.DEPARTMENT_NAME,
           J.JOB_TITLE,
           E.SALARY,
           L.STREET_ADDRESS
      FROM EMPLOYEES E
    LEFT OUTER JOIN DEPARTMENTS D
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
    LEFT OUTER JOIN JOBS J
    ON E.JOB_ID = J.JOB_ID
    LEFT OUTER JOIN LOCATIONS L
    ON D.LOCATION_ID = L.LOCATION_ID);

SELECT *
  FROM VIEW_EMP_DEPT_JOB;
-- 복합뷰로 필요한 데이터 생성을 했다면 데이터의 조회가 간편
SELECT JOB_TITLE, AVG(SALARY), SUM(SALARY), COUNT(SALARY)
  FROM VIEW_EMP_DEPT_JOB
GROUP BY JOB_TITLE
ORDER BY AVG(SALARY);

-- 뷰 삭제
DROP VIEW VIEW_EMP;
DROP VIEW VIEW_EMP_DEPT_JOB;


/*
VIEW는 INSERT, UPDATE, DELETE가 일어나는 경우에 실제테이블에도 반영이 된다.
그래서 많은 제약사항이 있다.
DML사용시에는 뷰가 아니라 원본테이블에 사용할 것.
*/

SELECT *
  FROM VIEW_EMP_DEPT_JOB;
-- NAME은 가상 열이라서 INSERT가 안된다.
INSERT INTO VIEW_EMP_DEPT_JOB
VALUES (300, 'TEST', 'TEST', 'TEST');

--JOIN 테이블의 경우에도 UPDATE, INSERT가 안된다.
INSERT INTO VIEW_EMP_DEPT_JOB(EMPLOYEE_ID, DEPARTMENT_NAME, JOB_TITLE)
VALUES (300, 'TEST', 'TEST');

--뷰에 의해 선택되지 않은 NOT NULL열이 기본 테이블에 있는 경우
INSERT INTO VIEW_EMP (EMPLOYEE_ID, FIRST_NAME,  SALARY)
VALUES (300, 'TEST', 10000);


-- 뷰의 제약사항
-- WITH CHECK OPTION
-- 조건 칼럼 값을 변경하지 못하게 하는 옵션
CREATE VIEW VIEW_EMP_TEST
AS (SELECT EMPLOYEE_ID,
           FIRST_NAME,
           LAST_NAME,
           EMAIL,
           HIRE_DATE,
           JOB_ID,
           DEPARTMENT_ID
      FROM EMPLOYEES
     WHERE DEPARTMENT_ID = 60)
WITH CHECK OPTION;

SELECT *
  FROM VIEW_EMP_TEST2;
-- WITH READ ONLY
-- SELECT만 허용하는 옵션, DML 연산이 수행될 수 없게 한다.
CREATE VIEW VIEW_EMP_TEST2
AS (SELECT EMPLOYEE_ID,
           FIRST_NAME,
           LAST_NAME,
           EMAIL,
           HIRE_DATE,
           JOB_ID,
           DEPARTMENT_ID
      FROM EMPLOYEES
     WHERE DEPARTMENT_ID = 60)
WITH READ ONLY;
