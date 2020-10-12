-- ����ȯ �Լ� TO_CHAR, TO_NUMBER, TO_DATE

-- ��¥�� ���ڷ� TO_CHAR(��¥, ����)

--��¥ FMT ������ �빮�ڷ� ǥ��
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD')
FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS')
FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'YY-MM-DD HH24:MI')
FROM DUAL;

-- ��¥ FMT������ �ƴ϶� ����� �Ұ����� ��� ""��� ǥ��
SELECT TO_CHAR(SYSDATE, 'YYYY"��" MM"��" DD"��" HH"��" MI"��" SS"��"')
FROM DUAL;

SELECT FIRST_NAME, TO_CHAR(HIRE_DATE, 'YYYY"��" MM"��" DD"��"')
FROM EMPLOYEES;


-- ���ڸ� ���ڷ� TO_CHAR(����, ����)
-- 9�� �ڸ����� ǥ��
SELECT TO_CHAR(20000, '999999999900000')
FROM DUAL;

-- �ڸ����� ������ ��� #���� ǥ���ȴ�.
SELECT TO_CHAR(20000, '9')
FROM DUAL;

SELECT TO_CHAR(20000.21, '99999')
FROM DUAL;
-- $ , . �� ���ڿ��� ��밡���� FMT �����̴�.
SELECT TO_CHAR(SALARY, '$99999')
FROM EMPLOYEES;



