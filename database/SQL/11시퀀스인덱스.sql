-- ������ Ȯ�� ���
SELECT *
  FROM USER_SEQUENCES;
-- VIEW Ȯ�� ���
SELECT *
  FROM USER_VIEWS;
-- �������� Ȯ�θ��
SELECT *
  FROM USER_CONSTRAINTS;

-- ������ (���������� �����ϴ� ��)
-- ������ ����
CREATE SEQUENCE DEPT_SEQ;
-- ������ ����
DROP SEQUENCE DEPT_SEQ;

-- �ɼ������ϰ� ������ ����  ,�� ����.
CREATE SEQUENCE DEPT3_SEQ
  INCREMENT BY 1
  START WITH 1
  MAXVALUE 10
  NOCYCLE
  NOCACHE;

-- ���̺� ����
CREATE TABLE DEPT3(
    DEPT_NO NUMBER(3) CONSTRAINT DEPT3_DEPT_NO_PK PRIMARY KEY,
    DEPT_NAME VARCHAR2(20),
    DEPT_DATE DATE DEFAULT SYSDATE
);

-- ������ ����ϱ� CURRVAL, NEXTVAL
-- ������ MAXVALUE�� 10�̱� ������ 10���� �����Ǹ� ������ �߻���Ų��,
-- NEXTVAL�� ��𿡼� ���̵��� �ѹ� ���̸� ����ų �� ����. SEQUENCE ���� ������ ���´�.
INSERT INTO DEPT3(DEPT_NO, DEPT_NAME)
VALUES (DEPT3_SEQ.NEXTVAL, 'TEST');

-- ���� ������ Ȯ��
SELECT DEPT3.CURRVAL
  FROM DUAL;

-- ������ ����
-- ALTER SEQUENCE DEPT3_SEQ �ɼ�
-- EX
ALTER SEQUENCE DEPT3_SEQ MAXVALUE 9999; -- �ƽ��� 9999�� ����
ALTER SEQUENCE DEPT3_SEQ INCREMENT BY 10; -- ������ 10���� ����
ALTER SEQUENCE DEPT3_SEQ MINVALUE 1; -- �ּҰ� 1�� ����

--������ ��ȸ
SELECT DEPT3_SEQ.CURRVAL
  FROM DUAL;
SELECT DEPT3_SEQ.NEXTVAL
  FROM DUAL;

DROP SEQUENCE DEPT3_SEQ;

-- ������ Ȱ�� PK���� 20201016-��������
/*
1.DEPT3_SEQ����
2.PK�� VARCHAR2�� ����
3.INSERT���� TO_CHAR() || - || ������ ��
*/

INSERT INTO DEPT3
VALUES(TO_CHAR(SYSDATE, 'YYYYMMDD')||'-'||DEPT3_SEQ.NEXTVAL, 'TEST');

CREATE TABLE DEPT3(
    DEPT_NO VARCHAR2(30),
    DEPT_NAME VARCHAR2(30),
    CONSTRAINT DEPT3_DEPT_NO_PK PRIMARY KEY (DEPT_NO)
);

CREATE SEQUENCE DEPT3_SEQ
    INCREMENT BY 1
    START WITH 1
    MAXVALUE 100
    CYCLE
    NOCACHE;

INSERT INTO DEPT3
VALUES(TO_CHAR(SYSDATE, 'YYYYMMDD')||'-'||DEPT3_SEQ.NEXTVAL, 'TEST');

SELECT *
  FROM DEPT3;
  
  
  
--INDEX  
--INDEX�� PRIMARY KEY, UNIQUE �������ǿ��� �ڵ����� �����ǰ�, ��ȸ�� ������ ���ִ� HINT������ �Ѵ�.
--INDEX�� ��ȸ�� ������ ������, �ʹ� ���� �ε����� �����ؼ� ����ϸ� ������ ���� ���ϸ� ����ų �� �ִ�.
--�׷��� ������ �������� INDEX�� ����ϴ� ���� �ùٸ� �����
SELECT * FROM USER_INDEXES;

-- INDEX�� �������� �߰�
CREATE INDEX EMPS_FIRST_NAME_IX
ON EMPS(FIRST_NAME);

-- INDEX ����
DROP INDEX EMPS_FIRST_NAME_IX;