-- ����Ŭ �ּ��Դϴ�.
-- ������ ctrl + enter

select * from employees;

select first_name, last_name from employees;

select email, phone_number, hire_date from employees;

-- Į���� ��ȸ�ϴ� ��ġ���� + - * / ������ �����ϴ�.

select salary * 1.1 from employees;

--null�� Ȯ��
select * from employees;
select department_id, commission_pct, manager_id from employees;

select first_name �̸� from employees;

--||������
/*
 ����Ŭ Ȭ����ǥ�� ���ڸ� ǥ���ϱ� ������,
 ���ڿ��ȿ� '�� ǥ���ϰ� �ʹٸ� '' �ι� ���� �ȴ�.
*/
SELECT first_name || ' ' || last_name || '''s salary is $' || salary
FROM employees;

-- DISTINCT
SELECT DISTINCT department_id FROM employees;

SELECT ROWID, ROWNUM, employee_id, first_name
FROM employees;



