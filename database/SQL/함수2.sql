--���� �Լ�
--ROUND - �ݿø�, -TRUNC - ����

SELECT ROUND(34.145), ROUND(34.145, 2), ROUND(34.145, 1), ROUND(34.145, 0), ROUND(35.145, -1)
FROM DUAL;

SELECT TRUNC(34.145), TRUNC(34.145, 2), TRUNC(34.145, 1),
    TRUNC(34.145), TRUNC(34.145, -1)
FROM DUAL;

--��¥ �Լ�
/*
SYSDATE�� ������ ��¥�� ��ȯ�ϴ� �Լ���.
SYSTIMESTAMP�� ������ ��¥�� �ð��� ��ȯ�ϴ� �Լ��̴�.
DUAL�� SYSDATE�� ���� ���� ���� DUMMY ���̺��̴�.

DUAL�̶�� ���� ���̺�κ��� SYSDATE�� �����ϴ� ���� �����̴�.

��/��/�� ��:��:��(ms����) 

��¥�� ���ڿ� ������ �����ϴ�.
��¥ + ���� -> ��¥ (��(DAY)���� ��¥�� ���Ѵ�.)
��¥ - ���� -> ��¥ (��¥���� ��(DAY)���� ����.)
��¥ + ����/24 -> ��¥ (�ð��� ��¥�� ���Ѵ�.)

��¥ - ��¥ -> �ϼ� (� ��¥���� �ٸ� ��¥�� ����.)
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


--��¥ �ݿø�, ����
SELECT TRUNC(SYSDATE - HIRE_DATE)
FROM EMPLOYEES;

-- Ư�� ������������ ��¥ ����
-- �� �������� ����
SELECT TRUNC(SYSDATE, 'YEAR')
FROM DUAL;

-- �� �������� ����
SELECT TRUNC(SYSDATE, 'MONTH')
FROM DUAL;

-- �� �������� ����(�ش����� �Ͽ���)
SELECT TRUNC(SYSDATE, 'DAY')
FROM DUAL;


/*
CHAR ������ ���ڿ�
VARCHAR2 ������ ���ڿ�
NUMBER -> CHARACTER : TO_CHAR
CHARACTER -> NUMBER : TO_NUMBER
CHARACTER -> DATE : TO_DATE
DATE -> CHARACTER : TO_CHAR
*/

SELECT FIRST_NAME, TO_CHAR(HIRE_DATE, 'D/DD/DDD/MM/YY') AS MONTH_HIRED
FROM EMPLOYEES
WHERE FIRST_NAME = 'Steven';

SELECT FIRST_NAME,
    TO_CHAR(HIRE_DATE, 'YYYY"��" MM"��" DD"��"') AS HIREDATE
FROM EMPLOYEES;

SELECT TO_CHAR(1234, '99099999')
FROM DUAL;

SELECT RTRIM(' HELLO WORLD JAVA ')
FROM DUAL;

-- ���ڸ� ���ڷ� TO_NUMBER(����, ����)
-- �ڵ� ����ȯ
SELECT '2000' + 2000, 2000, '2000'
FROM DUAL;

-- ����� ����ȯ
SELECT TO_NUMBER('2000') + 2000
FROM DUAL;

-- �������� $ , ���� Ư�� ���ڸ� ���ϰ� ���� ���� �ڵ� ����ȯ�� �Ұ����ϴ�.
SELECT '$2000' + 2000
FROM DUAL;

-- ���� FMT�� �����ϴ� ������ ���� ���, ����� ����ȯ�� �����ϴ�.
SELECT TO_NUMBER('$2000', '$9999') + 2000
FROM DUAL;

-- ���ڸ� ��¥�� TO_DATE(����, ����)
-- �̷� ���� �ٷ� ����� �����ϴ�.
SELECT TO_DATE('2020-03-31')
FROM DUAL;

-- ��¥ FMT�� �̿��ؼ� ���浵 ����
SELECT TO_DATE('2020-12-12', 'YY/MM/DD')
FROM DUAL;

-- ��¥ FMT�� �����ϴ� ������ ���� ���, ����ȯ�� ����
SELECT TO_DATE('2020-03-21 12:23:03', 'YYYY-MM-DD HH:MI:SS')
FROM DUAL;

-- NVL(������, NULL�� ��� ó���� ��)
-- NVL ���� NULL�� ��� ���ϴ� ������ �ٲ۴�.
-- NVL(EXPR1, EXP2)
-- EXPR1 : NULL�� ������ �� �ִ� ���̳� ǥ����. NULL�� �ƴϸ� �ش� ���� ���
-- EXPR2 : NULL ��ȯ�� ���� ��ǥ ���̴�. EXPR1�� NULL�� ��� ��µȴ�.

SELECT FIRST_NAME,
       SALARY,
       SALARY + SALARY * NVL(COMMISSION_PCT, 0) AS ANN_SAL
FROM EMPLOYEES;
-- NULL������ ���� ��� NULL���� ������ �ȴ�.

/*
NVL2(������, NULL�� �ƴ� ��� ó��, NULL�� ��� ó��)
NVL2(EXPR1, EXPR2, EXPR3)
NVL2 �Լ��� EXPR1�� ���� NULL�� �ƴ� ��쿡�� EXPR2�� ���� ��ȯ�ϰ�
NULL�� ��쿡�� EXPR3�� ���� ��ȯ�Ѵ�.
*/
SELECT NVL2(NULL, '�ξƴ�', '��')
FROM DUAL;


SELECT FIRST_NAME,
       NVL2(COMMISSION_PCT, SALARY + (SALARY * COMMISSION_PCT),
       SALARY) AS ANN_SAL
FROM EMPLOYEES;


/*
DECODE �Լ��� ���� ���� ����ϴ� IF-THEN-ELSE ������
������ ������� ǥ������ �ص��Ѵ�.
DECODE �Լ��� EXPRESSION�� �ص��� �� ������ SEARCHN�� ����
���Ѵ�.
ǥ������ ����� SEARCHN�� ������ RESULTN�� ��ȯ�ȴ�.
�⺻���� �����Ǹ� �˻� ���� ��� ���� ��ġ���� �ʴ� ����
NULL ���� ��ȯ�ȴ�.
DECODE(COLUMN OR EXPRESSION, SEARCH1, RESULT1,
                             [SEARCH2, RESULT2, ...,]
                             [DEFAULT])
*/
-- DECODE(������, �񱳰�, ���, �񱳰�, ���)
SELECT DECODE('C', 'A', 'A�Դϴ�',
                   'B', 'B�Դϴ�',
                   'C', 'C�Դϴ�',
                        'A,B,C�� �ƴմϴ�')
FROM DUAL;


SELECT JOB_ID, SALARY,
       DECODE(JOB_ID, 'IT_PROG',    SALARY * 1.10,
                      'FI_MGR',     SALARY * 1.15,
                      'FI_ACCOUNT', SALARY * 1.20,
                                    SALARY)
        AS REVISED_SALARY
 FROM EMPLOYEES;
 
/*
CASE ~ WHERN ~ THEN ����
�ڹ� ����� IF~ELSE �� �Ǵ� SWITCH ~ CASE ���� ���� ����� �Ѵ�.
CASE �� �ڿ� ǥ������ ���� ��� WHEN ������ ���� ����,
CASE �� �ڿ� �ƹ��͵� ���� ��� WHEN ���� ���ǽ��� �´�.

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
       