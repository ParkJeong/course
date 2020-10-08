-- 오라클 주석입니다.
-- 실행은 ctrl + enter

select * from employees;

select first_name, last_name from employees;

select email, phone_number, hire_date from employees;

-- 칼럼을 조회하는 위치에서 + - * / 연산이 가능하다.

select salary * 1.1 from employees;

--null값 확인
select * from employees;
select department_id, commission_pct, manager_id from employees;

select first_name 이름 from employees;

--||연결자
/*
 오라클 홑따옴표가 문자를 표현하기 때문에,
 문자열안에 '를 표현하고 싶다면 '' 두번 쓰면 된다.
*/
SELECT first_name || ' ' || last_name || '''s salary is $' || salary
FROM employees;

-- DISTINCT
SELECT DISTINCT department_id FROM employees;

SELECT ROWID, ROWNUM, employee_id, first_name
FROM employees;



