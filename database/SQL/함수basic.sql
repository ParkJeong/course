--lower - (�ҹ���), upper - (�빮��), initcap - (ù���� �빮��)
SELECT  'abcDEF',lower('abcDEF'), upper('abcDEF'), initcap('abcDEF') FROM DUAL;

SELECT  * FROM employees;
select last_name, lower(last_name), UPPER(last_name), INITCAP(last_name) from employees;
select last_name from employees where lower(last_name) = 'bull'; --where ���ǿ��� �Լ��� ������ ����

--length() - ����, instr - ���ڰ˻�
select first_name , LENGTH(first_name) as ����, instr(first_name , 'a') as ������ġ from employees;
select length('abc'), instr('abcdefg', 'a') from dual;

--substr() - ���ڿ��ڸ���, concat() - ���ڿ����̱�
select substr('abcdef',1,3), concat('abc','def') from dual;
select first_name, substr(first_name,1,3), concat(first_name, last_name) from employees;

-- LPAD, RPAD - �¿��� ���� ���ڿ��� ä���
select lpad('abc',10,'*') from dual;
select rpad('abc',10,'*') from dual;
select lpad(first_name, 10 ,'-'), rpad(first_name,10,'-') from employees;

-- LTRIM, RTRIM, TRIM - ��������, ��������
select ltrim('javascript_java', 'java') from dual; --���ʿ��� java���� ����
select rtrim('javascript_java', 'java') from dual; --�����ʿ��� java���� ����
select trim('   java    ') from dual; --���� ��������
SELECT TRIM(' JAVA      '), LTRIM(' JAVA      '), RTRIM(' JAVA      ')
FROM DUAL;

--REPLACE - ���ڿ� ġȯ
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
���� 1) ���ϱ� ���� ���� �ҹ��ڷ� �Է��ؾ� �մϴ�.(��Ʈ : lower �̿�)
*/
SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE LOWER(JOB_ID) = 'it_prog';

/*
���� 2) �̸��� �� 3���ڱ��� ����ϰ� �������� *�� ����մϴ�.
�� ���� �� ��Ī�� name�Դϴ�.(��Ʈ : rpad�� substr �Ǵ� substr �׸��� length �̿�)
*/
SELECT RPAD(SUBSTR(FIRST_NAME, 1, 3), LENGTH(FIRST_NAME), '*') AS NAME, FIRST_NAME
FROM EMPLOYEES;

/*
���� 3) �޿��� ��ü 10�ڸ��� ����ϵ� ������ �ڸ��� *�� ����մϴ�.
�� ���� �� ��Ī�� salary�Դϴ�.(��Ʈ : lpad �̿�)
*/

SELECT RPAD(SUBSTR(FIRST_NAME, 1, 3), LENGTH(FIRST_NAME), '*') AS NAME, RPAD(SALARY, 10, '*') AS SALARY
FROM EMPLOYEES
WHERE LOWER(JOB_ID) = 'it_prog';


/*
���� 1.
EMPLOYEES ���̺� ���� �̸�, �Ի����� �÷����� �����ؼ� �̸������� �������� ��� �մϴ�.
���� 1) �̸� �÷��� first_name, last_name�� �ٿ��� ����մϴ�.
���� 2) �Ի����� �÷��� xx/xx/xx�� ����Ǿ� �ֽ��ϴ�. xxxxxx���·� �����ؼ� ����մϴ�.
*/
SELECT CONCAT(FIRST_NAME,LAST_NAME) AS �̸�, 
        REPLACE(HIRE_DATE, '/', '') AS �Ի�����
FROM EMPLOYEES
ORDER BY �̸�;

SELECT *
FROM EMPLOYEES;
/*
���� 2.
EMPLOYEES ���̺� ���� phone_numbe�÷��� ###.###.####���·� ����Ǿ� �ִ�
���⼭ ó�� �� �ڸ� ���� ��� ���� ������ȣ (02)�� �ٿ� ��ȭ ��ȣ�� ����ϵ��� ������ �ۼ��ϼ���
*/
SELECT CONCAT('(02)', SUBSTR(PHONE_NUMBER, 4, LENGTH(PHONE_NUMBER))) AS PHONE_NUMBER, PHONE_NUMBER
FROM EMPLOYEES;

/*
���� 3.
EMPLOYEES ���̺��� JOB_ID�� it_prog�� ����� �̸�(first_name)�� �޿�(salary)�� ����ϼ���.
���� 1) ���ϱ� ���� ���� �ҹ��ڷ� �Է��ؾ� �մϴ�.(��Ʈ : lower �̿�)
���� 2) �̸��� �� 3���ڱ��� ����ϰ� �������� *�� ����մϴ�.
�� ���� �� ��Ī�� name�Դϴ�.(��Ʈ : rpad�� substr �Ǵ� substr �׸��� length �̿�)
���� 3) �޿��� ��ü 10�ڸ��� ����ϵ� ������ �ڸ��� *�� ����մϴ�.
�� ���� �� ��Ī�� salary�Դϴ�.(��Ʈ : lpad �̿�)
*/
SELECT RPAD(SUBSTR(FIRST_NAME, 1, 3),LENGTH(FIRST_NAME),'*') AS NAME,
    LPAD(SALARY, 10, '*') AS SALARY
FROM EMPLOYEES
WHERE LOWER(JOB_ID) = 'it_prog';

/*
����ϱ�
ROUND - �ݿø�
TRUNC - �ڸ���

*/