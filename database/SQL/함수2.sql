--숫자 함수
--ROUND - 반올림, -TRUNC - 절삭

SELECT ROUND(34.145), ROUND(34.145, 2), ROUND(34.145, 1), ROUND(34.145, 0), ROUND(35.145, -1)
FROM DUAL;

SELECT TRUNC(34.145), TRUNC(34.145, 2), TRUNC(34.145, 1),
    TRUNC(34.145), TRUNC(34.145, -1)
FROM DUAL;

--날짜 함수
/*
SYSDATE는 현재의 날짜를 반환하는 함수다.
SYSTIMESTAMP는 현재의 날짜와 시간을 반환하는 함수이다.
DUAL은 SYSDATE를 보기 위해 사용된 DUMMY 테이블이다.

DUAL이라는 더미 테이블로부터 SYSDATE를 선택하는 것이 관례이다.

년/월/일 시:분:초(ms단위) 

날짜는 숫자와 연산이 가능하다.
날짜 + 숫자 -> 날짜 (일(DAY)수를 날짜에 더한다.)
날짜 - 숫자 -> 날짜 (날짜에서 일(DAY)수를 뺀다.)
날짜 + 숫자/24 -> 날짜 (시간을 날짜에 더한다.)

날짜 - 날짜 -> 일수 (어떤 날짜에서 다른 날짜를 뺀다.)
*/
SELECT SYSDATE, SYSTIMESTAMP 
FROM DUAL;

SELECT SYSDATE + 3
FROM DUAL;

SELECT SYSDATE - 3
FROM DUAL;

SELECT SYSDATE - HIRE_DATE
FROM EMPLOYEES;


SELECT (SYSDATE - HIRE_DATE) / 7
FROM EMPLOYEES;

SELECT (SYSDATE - HIRE_DATE) / 365
FROM EMPLOYEES;


--날짜 반올림, 절삭
SELECT TRUNC(SYSDATE - HIRE_DATE)
FROM EMPLOYEES;

-- 특정 포맷형식으로 날짜 절삭
-- 년 기준으로 절삭
SELECT TRUNC(SYSDATE, 'YEAR')
FROM DUAL;

-- 월 기준으로 절삭
SELECT TRUNC(SYSDATE, 'MONTH')
FROM DUAL;

-- 일 기준으로 절삭(해당주의 일요일)
SELECT TRUNC(SYSDATE, 'DAY')
FROM DUAL;


/*
CHAR 고정형 문자열
VARCHAR2 가변형 문자열
NUMBER -> CHARACTER : TO_CHAR
CHARACTER -> NUMBER : TO_NUMBER
CHARACTER -> DATE : TO_DATE
DATE -> CHARACTER : TO_CHAR
*/

SELECT FIRST_NAME, TO_CHAR(HIRE_DATE, 'D/DD/DDD/MM/YY') AS MONTH_HIRED
FROM EMPLOYEES
WHERE FIRST_NAME = 'Steven';

SELECT FIRST_NAME,
    TO_CHAR(HIRE_DATE, 'YYYY"년" MM"월" DD"일"') AS HIREDATE
FROM EMPLOYEES;

SELECT TO_CHAR(1234, '99099999')
FROM DUAL;

SELECT RTRIM(' HELLO WORLD JAVA ')
FROM DUAL;

-- 문자를 숫자로 TO_NUMBER(문자, 형식)
-- 자동 형변환
SELECT '2000' + 2000, 2000, '2000'
FROM DUAL;

-- 명시적 형변환
SELECT TO_NUMBER('2000') + 2000
FROM DUAL;

-- 문자형이 $ , 같은 특정 문자를 지니고 있을 때는 자동 형변환이 불가능하다.
SELECT '$2000' + 2000
FROM DUAL;

-- 숫자 FMT이 지원하는 형식을 가진 경우, 명시적 형변환이 가능하다.
SELECT TO_NUMBER('$2000', '$9999') + 2000
FROM DUAL;

-- 문자를 날짜로 TO_DATE(문자, 형식)
-- 이런 경우는 바로 사용이 가능하다.
SELECT TO_DATE('2020-03-31')
FROM DUAL;

-- 날짜 FMT를 이용해서 변경도 가능
SELECT TO_DATE('2020-12-12', 'YY/MM/DD')
FROM DUAL;

-- 날짜 FMT이 지원하는 형식을 가진 경우, 형변환이 가능
SELECT TO_DATE('2020-03-21 12:23:03', 'YYYY-MM-DD HH:MI:SS')
FROM DUAL;

-- NVL(데이터, NULL일 경우 처리할 값)
-- NVL 값이 NULL일 경우 원하는 값으로 바꾼다.
-- NVL(EXPR1, EXP2)
-- EXPR1 : NULL을 포함할 수 있는 값이나 표현식. NULL이 아니면 해당 값을 출력
-- EXPR2 : NULL 변환을 위한 목표 값이다. EXPR1이 NULL일 경우 출력된다.

SELECT FIRST_NAME,
       SALARY,
       SALARY + SALARY * NVL(COMMISSION_PCT, 0) AS ANN_SAL
FROM EMPLOYEES;
-- NULL연산이 들어가는 경우 NULL값이 나오게 된다.

/*
NVL2(데이터, NULL이 아닌 경우 처리, NULL인 경우 처리)
NVL2(EXPR1, EXPR2, EXPR3)
NVL2 함수는 EXPR1의 값이 NULL이 아닐 경우에는 EXPR2의 값을 반환하고
NULL일 경우에는 EXPR3의 값을 반환한다.
*/
SELECT NVL2(NULL, '널아님', '널')
FROM DUAL;


SELECT FIRST_NAME,
       NVL2(COMMISSION_PCT, SALARY + (SALARY * COMMISSION_PCT),
       SALARY) AS ANN_SAL
FROM EMPLOYEES;


/*
DECODE 함수는 여러 언어에서 사용하는 IF-THEN-ELSE 구문과
유사한 방법으로 표현식을 해독한다.
DECODE 함수는 EXPRESSION을 해독한 후 각각의 SEARCHN에 대해
비교한다.
표현식의 결과가 SEARCHN과 같으면 RESULTN이 반환된다.
기본값이 생략되면 검색 값이 결과 값과 일치하지 않는 곳에
NULL 값이 반환된다.
DECODE(COLUMN OR EXPRESSION, SEARCH1, RESULT1,
                             [SEARCH2, RESULT2, ...,]
                             [DEFAULT])
*/
-- DECODE(데이터, 비교값, 결과, 비교값, 결과)
SELECT DECODE('C', 'A', 'A입니다',
                   'B', 'B입니다',
                   'C', 'C입니다',
                        'A,B,C가 아닙니다')
FROM DUAL;


SELECT JOB_ID, SALARY,
       DECODE(JOB_ID, 'IT_PROG',    SALARY * 1.10,
                      'FI_MGR',     SALARY * 1.15,
                      'FI_ACCOUNT', SALARY * 1.20,
                                    SALARY)
        AS REVISED_SALARY
 FROM EMPLOYEES;
 
/*
CASE ~ WHERN ~ THEN 구문
자바 언어의 IF~ELSE 문 또는 SWITCH ~ CASE 문과 같은 기능을 한다.
CASE 절 뒤에 표현식이 있을 경우 WHEN 절에는 값이 오며,
CASE 절 뒤에 아무것도 없을 경우 WHEN 절에 조건식이 온다.

CASE COLUMN OR EXPRESSION WHEN CONDITION1 THEN RESULT1
                          WHEN CONDITION2 THEN RESULT2
                          ...
                          WHEN CONDITIONN THEN RESULTN
                          ELSE RESULT
END
*/
SELECT JOB_ID, SALARY,
  CASE JOB_ID WHEN 'IT_PROG'     THEN SALARY * 1.10
              WHEN 'FI_MGE'      THEN SALARY * 1.15
              WHEN 'FI_ACCOUNT'  THEN SALARY * 1.20
              ELSE SALARY
   END AS REVISED_SALARY
  FROM EMPLOYEES;
  
SELECT JOB_ID, SALARY,
  (CASE WHEN JOB_ID = 'IT_PROG'    THEN SALARY * 1.10
       WHEN JOB_ID = 'FI_MGR'     THEN SALARY * 1.15
       WHEN JOB_ID = 'FI_ACCOUNT' THEN SALARY * 1.20
       ELSE SALARY
   END) AS REVISED_SALARY
 FROM EMPLOYEES;
 
 
 
/*
TO_CHAR
TO_DATE

NVL
NVL2

DECODE
CASE WHEN THEN
*/
       