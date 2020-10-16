/*
VIEW�� �������� �ڷḸ �������ؼ� ����� �� �ִ� �������̺��� �����̴�.
��� �������̺��̱� ������ �ʿ��� Į���� ������ �θ� ������ ��ȸ�� ����������.
��� ������ �����Ͱ� ���������� ����� ���´� �ƴϴ�. (�������̺��� ������� ���ȴ�.)
�׷��� �信 DML�۾��� �ϰ� �Ǹ� ���� ���̺� ������ �ȴ�. (�ٸ�, ��������� ���� ������.)
*/

--�������� ����Ȯ��
SELECT *
  FROM USER_SYS_PRIVS;
  
--�ܼ��� - �ϳ��� ���̺��� ��������� ��
CREATE VIEW VIEW_EMP
AS (SELECT EMPLOYEE_ID,
           FIRST_NAME,
           LAST_NAME,
           JOB_ID,
           SALARY FROM EMPLOYEES);
SELECT *
  FROM VIEW_EMP;
  
--���պ� - ���� ���̺��� �����Ͽ� �ʿ��� �����͸� ������ ����
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


--���� ���� CREATE OR REPLACE VIEW �����̸�
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
-- ���պ�� �ʿ��� ������ ������ �ߴٸ� �������� ��ȸ�� ����
SELECT JOB_TITLE, AVG(SALARY), SUM(SALARY), COUNT(SALARY)
  FROM VIEW_EMP_DEPT_JOB
GROUP BY JOB_TITLE
ORDER BY AVG(SALARY);

-- �� ����
DROP VIEW VIEW_EMP;
DROP VIEW VIEW_EMP_DEPT_JOB;


/*
VIEW�� INSERT, UPDATE, DELETE�� �Ͼ�� ��쿡 �������̺��� �ݿ��� �ȴ�.
�׷��� ���� ��������� �ִ�.
DML���ÿ��� �䰡 �ƴ϶� �������̺� ����� ��.
*/

SELECT *
  FROM VIEW_EMP_DEPT_JOB;
-- NAME�� ���� ���̶� INSERT�� �ȵȴ�.
INSERT INTO VIEW_EMP_DEPT_JOB
VALUES (300, 'TEST', 'TEST', 'TEST');

--JOIN ���̺��� ��쿡�� UPDATE, INSERT�� �ȵȴ�.
INSERT INTO VIEW_EMP_DEPT_JOB(EMPLOYEE_ID, DEPARTMENT_NAME, JOB_TITLE)
VALUES (300, 'TEST', 'TEST');

--�信 ���� ���õ��� ���� NOT NULL���� �⺻ ���̺� �ִ� ���
INSERT INTO VIEW_EMP (EMPLOYEE_ID, FIRST_NAME,  SALARY)
VALUES (300, 'TEST', 10000);


-- ���� �������
-- WITH CHECK OPTION
-- ���� Į�� ���� �������� ���ϰ� �ϴ� �ɼ�
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
-- SELECT�� ����ϴ� �ɼ�, DML ������ ����� �� ���� �Ѵ�.
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
