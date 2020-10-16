/*
����Ŭ�� �ְ� ������ �������� ������ ��Ų��.
*/

--���� �������
CREATE USER USER01 IDENTIFIED BY user01;

--������ ������ ���� �ο�
GRANT CREATE SESSION,
      CREATE TABLE,
      CREATE SEQUENCE,
      CREATE VIEW
   TO USER01;

--������ �ִ� ���̺� �����̽� (�����Ͱ� ���������� ����Ǵ� ����)
ALTER USER USER01
DEFAULT TABLESPACE USERS 
QUOTA UNLIMITED ON USERS;

--���Ӱ� ������ ���̺� �����̽��� ����ϴ� ���
ALTER USER USER01
DEFAULT TABLESPACE MY_DATA
QUOTA UNLIMITED ON MY_DATA;

/*
���� �̿��� ���� ������ ���� �ο�
*/
CREATE USER USER02 IDENTIFIED BY user02;

GRANT CONNECT, RESOURCE TO USER02;

ALTER USER USER02
DEFAULT TABLESPACE MY_DATA QUOTA UNLIMITED ON MY_DATA;;

