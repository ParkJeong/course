/*
오라클의 최고 관리자 계정으로 실행을 시킨다.
*/

--계정 생성명령
CREATE USER USER01 IDENTIFIED BY user01;

--생성된 계정에 권한 부여
GRANT CREATE SESSION,
      CREATE TABLE,
      CREATE SEQUENCE,
      CREATE VIEW
   TO USER01;

--기존에 있는 테이블 스페이스 (데이터가 물리적으로 저장되는 공간)
ALTER USER USER01
DEFAULT TABLESPACE USERS 
QUOTA UNLIMITED ON USERS;

--새롭게 생성한 테이블 스페이스를 사용하는 경우
ALTER USER USER01
DEFAULT TABLESPACE MY_DATA
QUOTA UNLIMITED ON MY_DATA;

/*
롤을 이용한 계정 생성과 권한 부여
*/
CREATE USER USER02 IDENTIFIED BY user02;

GRANT CONNECT, RESOURCE TO USER02;

ALTER USER USER02
DEFAULT TABLESPACE MY_DATA QUOTA UNLIMITED ON MY_DATA;;

