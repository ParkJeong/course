---- ���̺� ����----
CREATE TABLE DEPT (
    DEPTNO  NUMBER(2, 0), --2�ڸ� ����, �Ǽ��� �������� �ʴ´�.
    DNAME   VARCHAR2(14), --BYTE��� ���� ���ڿ�, 
    LOC     VARCHAR2(13),
    DEPT_DATE DATE,
    DEPT_BONUS NUMBER(10)
);

SELECT *
  FROM DEPT;

INSERT INTO DEPT
VALUES (99, '����', '����', SYSDATE, 2000000000);
  
DESC DEPT;


--- ���̺� ���� ALTER TABLE----
ALTER TABLE DEPT
ADD DEPT_COUNT NUMBER(3); -- �߰�

ALTER TABLE DEPT
MODIFY DEPT_COUNT NUMBER(10); -- ����

ALTER TABLE DEPT
RENAME COLUMN DEPT_COUNT TO EMP_COUNT; -- Į���� ����

ALTER TABLE DEPT
DROP COLUMN EMP_COUNT; -- ����


-- ���̺� ����
DROP TABLE DEPT;
-- �ش� ���̺� FK���������� ����ִ��� ������ ����.
DROP TABLE CASCADE CONSTRAINTS �������Ǹ�; 


--���̺� ������ ���� ����
TRUNCATE TABLE DEPT;

SELECT *
  FROM DEPT;
DESC DEPT;



-- ���̺� ������ ��������
/*
������ ��������(PK, FK, NOT NULL, CHECK, UNIQUE)
1. PK - ���̺� ���� �ĺ� Į��(NOT NULL + UNIQUE)
PRIMARY KEY
2. UNIQUE = ������ ���� �����ϴ� Į��(�ߺ��������� ����)
3. NOT NULL - NULL�� ������� �ʴ´�.
4. FK - �����ϴ� ���̺��� PK�� �����ϴ� Į��
FOREIGN KEY
5. CHECK - ���ǵ� ���ĸ� �������� ���

*/

CREATE TABLE DEPT (
    DEPT_NO NUMBER(2) CONSTRAINT DEPT_DEPT_NO_PK PRIMARY KEY,
    DEPT_NAME VARCHAR2(14) NOT NULL UNIQUE,
    LOCA NUMBER(4) REFERENCES LOCATIONS(LOCATION_ID),
    -- �ƹ��͵� �������� ������ �⺻���� ���ݽð��� ����
    DEPT_DATE DATE DEFAULT SYSDATE,
    DEPT_BONUS NUMBER(10),
    DEPT_GENDER CHAR(1) CHECK(DEPT_GENDER IN ('F','M'))
);

DROP TABLE DEPT;

/*
���̺� ���� ��������(��� ���� ������ �Ŀ� �Ʒ��ʿ� �������� �߰�)
NOT NULL�̳� DEFAULT�� ���߿� ������ �ȵȴ�.
���� �����ؾ��Ѵ�.

�������� �߰� 
�������� ��������_�̸� ��������_���� ����Į��
*/
;
CREATE TABLE DEPT(
    DEPT_NO NUMBER(2),
    DEPT_NAME VARCHAR(14) NOT NULL,
    LOCA NUMBER(4),
    DEPT_DATE DATE DEFAULT SYSDATE,
    DEPT_BONUS NUMBER(10),
    DEPT_GENDER CHAR(1),
    CONSTRAINT DEPT_DEPT_NO_PK PRIMARY KEY (DEPT_NO),
    CONSTRAINT DEPT_DEPT_NAME_UK UNIQUE (DEPT_NAME),
    CONSTRAINT DEPT_DEPT_GENDER_CK CHECK (DEPT_GENDER IN ('F', 'M')),
    CONSTRAINT DEPT_LOCA_LOCATION_LOCATION_ID_FK 
        FOREIGN KEY (LOCA) REFERENCES LOCATIONS(LOCATION_ID)  
);

DROP TABLE DEPT;


SELECT FIRST_NAME
          FROM EMPLOYEES;
          
SELECT (SELECT FIRST_NAME
          FROM EMPLOYEES E2
         WHERE E1.EMPLOYEE_ID = E2.EMPLOYEE_ID
        ) AS FIRST_NAME
  FROM EMPLOYEES E1;
  
SELECT (SELECT FIRST_NAME
          FROM EMPLOYEES E2
        ) AS FIRST_NAME
  FROM DUAL;
  
