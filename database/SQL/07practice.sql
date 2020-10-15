--���� 1.
--DEPTS���̺��� ������ �߰��ϼ���

ROLLBACK;
SELECT *
  FROM DEPTS;

INSERT INTO DEPTS(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
VALUES(280, '����', NULL, 1800);
INSERT INTO DEPTS(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
VALUES(290, 'ȸ���', NULL, 1800);
INSERT INTO DEPTS(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
VALUES(300, '����', 301, 1800);
INSERT INTO DEPTS(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
VALUES(310, '�λ�', 302, 1800);
INSERT INTO DEPTS(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
VALUES(320, '����', 303, 1700);

SELECT *
  FROM DEPTS;

--���� 2.
--DEPTS���̺��� �����͸� �����մϴ�
--1. department_name �� IT Support �� �������� 
--department_name�� IT bank�� ����
--2. department_id�� 290�� �������� manager_id�� 301�� ����
--3. department_name�� IT Helpdesk�� �������� �μ����� IT Help�� ,
--�Ŵ������̵� 303����, �������̵� 1800���� �����ϼ���
--4. �̻�, ����, ����, �븮 �� �Ŵ������̵� 301�� �ѹ��� �����ϼ���.
SELECT *
  FROM DEPTS;
  
UPDATE DEPTS
SET    DEPARTMENT_NAME = 'IT bank'
 WHERE DEPARTMENT_NAME ='IT Support';

UPDATE DEPTS
   SET MANAGER_ID = 301
 WHERE DEPARTMENT_ID = 290;

UPDATE DEPTS
   SET DEPARTMENT_NAME = 'IT Help',
       MANAGER_ID = 303,
       LOCATION_ID = 1800
 WHERE DEPARTMENT_NAME = 'IT Helpdesk';

UPDATE DEPTS
   SET MANAGER_ID = 301
 WHERE MANAGER_ID >= 301;


SELECT *
  FROM EMPLOYEES;

SELECT *
  FROM DEPTS;



--���� 3.
--������ ������ �׻� primary key�� �մϴ�, 
--���⼭ primary key�� department_id��� �����մϴ�.
--1. �μ��� �����θ� ���� �ϼ���
--2. �μ��� NOC�� �����ϼ���

SELECT *
  FROM DEPTS;

DELETE FROM DEPTS
 WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID
                          FROM DEPTS
                         WHERE DEPARTMENT_NAME = '����');

DELETE FROM DEPTS
 WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID
                          FROM DEPTS
                         WHERE DEPARTMENT_NAME = 'NOC');

--����4
--1. Depts �纻���̺��� department_id �� 200���� ū �����͸� �����ϼ���.
--2. Depts �纻���̺��� manager_id�� null�� �ƴ� �������� manager_id�� ���� 100���� �����ϼ���.
--3. Depts ���̺��� Ÿ�� ���̺� �Դϴ�.
--4. Departments���̺��� �Ź� ������ �Ͼ�� ���̺��̶�� �����ϰ� Depts�� ���Ͽ�
--��ġ�ϴ� ��� Depts�� �μ���, �Ŵ���ID, ����ID�� ������Ʈ �ϰ�
--�������Ե� �����ʹ� �״�� �߰����ִ� merge���� �ۼ��ϼ���.
CREATE TABLE COPY_DEPTS AS SELECT * FROM DEPTS;

SELECT *
  FROM COPY_DEPTS;

DELETE COPY_DEPTS
 WHERE DEPARTMENT_ID > 200;

UPDATE COPY_DEPTS
   SET MANAGER_ID = 100
 WHERE MANAGER_ID IS NOT NULL;

MERGE INTO DEPARTMENTS D
USING (SELECT *
         FROM DEPTS
       ) D2
ON (D.DEPARTMENT_ID = D2.DEPARTMENT_ID)
WHEN MATCHED THEN
  UPDATE SET
    D.DEPARTMENT_NAME = D2.DEPARTMENT_NAME,
    D.MANAGER_ID = D2.MANAGER_ID,
    D.LOCATION_ID = D2.LOCATION_ID
WHEN NOT MATCHED THEN
  INSERT VALUES
    (D2.DEPARTMENT_ID, D2.DEPARTMENT_NAME, D2.MANAGER_ID,
     D2.LOCATION_ID);

SELECT *
  FROM COPY_DEPTS;

SELECT *
  FROM DEPTS;
  
ROLLBACK;

--���� 5
--1. jobs_it �纻 ���̺��� �����ϼ��� (������ min_salary�� 6000���� ū �����͸� �����մϴ�)
--2. jobs_it ���̺� ���� �����͸� �߰��ϼ���
--3. jobs_it�� Ÿ�� ���̺� �Դϴ�
--4. jobs���̺��� �Ź� ������ �Ͼ�� ���̺��̶�� �����ϰ� jobs_it�� ���Ͽ�
--min_salary�÷��� 0���� ū ��� ������ �����ʹ� min_salary, max_salary�� ������Ʈ �ϰ� ���� ���Ե�
--�����ʹ� �״�� �߰����ִ� merge���� �ۼ��ϼ���

CREATE TABLE JOBS_IT AS 
(SELECT * 
   FROM JOBS 
  WHERE MIN_SALARY > 6000);

INSERT INTO JOBS_IT(JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY)
VALUES ('IT_DEV', '����Ƽ������', 6000, 20000);

INSERT INTO JOBS_IT(JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY)
VALUES ('NET_DEV', '��Ʈ��ũ������', 5000, 20000);

INSERT INTO JOBS_IT(JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY)
VALUES ('SEC_DEV', '���Ȱ�����', 6000, 19000);

MERGE INTO JOBS J
USING (SELECT *
         FROM JOBS_IT
       ) J2
ON (J.JOB_ID = J2.JOB_ID
    AND MIN_SALARY > 0)
WHEN MATCHED THEN
  UPDATE SET
    J.MIN_SALARY = J2.MIN_SALARY,
    J.MAX_SALARY = J2.MAX_SALARY
WHEN NOT MATCHED THEN
  INSERT VALUES
  (J2.JOB_ID, J2.JOB_TITLE, J2.MIN_SALARY, J2.MAX_SALARY);
SELECT *
  FROM JOBS_IT;

SELECT *
  FROM JOBS;
  
CREATE TABLE COPY2_JOB AS (SELECT * FROM JOBS);

SELECT *
  FROM COPY2_JOB;
 
 
 
 INSERT INTO ���̺��̸�
 VALUES()
 
 UPDATE ���̺��̸�
    SET

DELETE FROM ���̺��̸�
 WHERE ����
 
 MERGE INTO 
 USING()
 ON()
 WHEN MATCHED THEN
    UPDATE SET
 WHEN NOT MATCHED THEN
    INSERT VALUES
    ;
COMMIT;