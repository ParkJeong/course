--lower - (소문자), upper - (대문자), initcap - (첫글자 대문자)
SELECT  'abcDEF',lower('abcDEF'), upper('abcDEF'), initcap('abcDEF') FROM DUAL;

SELECT  * FROM employees;
select last_name, lower(last_name), UPPER(last_name), INITCAP(last_name) from employees;
select last_name from employees where lower(last_name) = 'bull'; --where 조건에도 함수의 적용이 가능

--length() - 길이, instr - 문자검색
select first_name , LENGTH(first_name) as 길이, instr(first_name , 'a') as 포함위치 from employees;
select length('abc'), instr('abcdefg', 'a') from dual;

--substr() - 문자열자르기, concat() - 문자열붙이기
select substr('abcdef',1,3), concat('abc','def') from dual;
select first_name, substr(first_name,1,3), concat(first_name, last_name) from employees;

-- LPAD, RPAD - 좌우측 지정 문자열로 채우기
select lpad('abc',10,'*') from dual;
select rpad('abc',10,'*') from dual;
select lpad(first_name, 10 ,'-'), rpad(first_name,10,'-') from employees;

-- LTRIM, RTRIM, TRIM - 공백제거, 문자제거
select ltrim('javascript_java', 'java') from dual; --왼쪽에서 java문자 제거
select rtrim('javascript_java', 'java') from dual; --오른쪽에서 java문자 제거
select trim('   java    ') from dual; --양측 공백제거
SELECT TRIM(' JAVA      '), LTRIM(' JAVA      '), RTRIM(' JAVA      ')
FROM DUAL;

--REPLACE - 문자열 치환
select 'my dream is president', replace('my dream is president','president','programmer') from dual;
select replace('my dream is president',' ','')from dual;
select ltrim(replace(replace('my dream is president','president','programmer'),' ',''),'my') from dual;

SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE JOB_ID = 'IT_PROG';

SELECT LAST_NAME, LOWER(LAST_NAME), INITCAP(LOWER(LAST_NAME)), UPPER(LAST_NAME)
FROM EMPLOYEES;

SELECT LAST_NAME, LOWER(LAST_NAME), INITCAP(LAST_NAME), UPPER(LAST_NAME)
FROM EMPLOYEES
WHERE LOWER(LAST_NAME) = 'austin';

SELECT FIRST_NAME, LENGTH(FIRST_NAME), INSTR(FIRST_NAME, 'a')
FROM EMPLOYEES;



/*
조건 1) 비교하기 위한 값은 소문자로 입력해야 합니다.(힌트 : lower 이용)
*/
SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE LOWER(JOB_ID) = 'it_prog';

/*
조건 2) 이름은 앞 3문자까지 출력하고 나머지는 *로 출력합니다.
이 열의 열 별칭은 name입니다.(힌트 : rpad와 substr 또는 substr 그리고 length 이용)
*/
SELECT RPAD(SUBSTR(FIRST_NAME, 1, 3), LENGTH(FIRST_NAME), '*') AS NAME, FIRST_NAME
FROM EMPLOYEES;

/*
조건 3) 급여는 전체 10자리로 출력하되 나머지 자리는 *로 출력합니다.
이 열의 열 별칭은 salary입니다.(힌트 : lpad 이용)
*/

SELECT RPAD(SUBSTR(FIRST_NAME, 1, 3), LENGTH(FIRST_NAME), '*') AS NAME, RPAD(SALARY, 10, '*') AS SALARY
FROM EMPLOYEES
WHERE LOWER(JOB_ID) = 'it_prog';


/*
문제 1.
EMPLOYEES 테이블 에서 이름, 입사일자 컬럼으로 변경해서 이름순으로 오름차순 출력 합니다.
조건 1) 이름 컬럼은 first_name, last_name을 붙여서 출력합니다.
조건 2) 입사일자 컬럼은 xx/xx/xx로 저장되어 있습니다. xxxxxx형태로 변경해서 출력합니다.
*/
SELECT CONCAT(FIRST_NAME,LAST_NAME) AS 이름, 
        REPLACE(HIRE_DATE, '/', '') AS 입사일자
FROM EMPLOYEES
ORDER BY 이름;

SELECT *
FROM EMPLOYEES;
/*
문제 2.
EMPLOYEES 테이블 에서 phone_numbe컬럼은 ###.###.####형태로 저장되어 있다
여기서 처음 세 자리 숫자 대신 서울 지역변호 (02)를 붙여 전화 번호를 출력하도록 쿼리를 작성하세요
*/
SELECT CONCAT('(02)', SUBSTR(PHONE_NUMBER, 4, LENGTH(PHONE_NUMBER))) AS PHONE_NUMBER, PHONE_NUMBER
FROM EMPLOYEES;

/*
문제 3.
EMPLOYEES 테이블에서 JOB_ID가 it_prog인 사원의 이름(first_name)과 급여(salary)를 출력하세요.
조건 1) 비교하기 위한 값은 소문자로 입력해야 합니다.(힌트 : lower 이용)
조건 2) 이름은 앞 3문자까지 출력하고 나머지는 *로 출력합니다.
이 열의 열 별칭은 name입니다.(힌트 : rpad와 substr 또는 substr 그리고 length 이용)
조건 3) 급여는 전체 10자리로 출력하되 나머지 자리는 *로 출력합니다.
이 열의 열 별칭은 salary입니다.(힌트 : lpad 이용)
*/
SELECT RPAD(SUBSTR(FIRST_NAME, 1, 3),LENGTH(FIRST_NAME),'*') AS NAME,
    LPAD(SALARY, 10, '*') AS SALARY
FROM EMPLOYEES
WHERE LOWER(JOB_ID) = 'it_prog';

/*
기억하기
ROUND - 반올림
TRUNC - 자르기

*/