SELECT JOB, EMPNO, ENAME, SAL, DEPTNO, DNAME
  FROM EMP
 WHERE JOB IN (SELECT JOB
                FROM EMP
               WHERE ENAME = 'ALLEN');

----2-------------
SELECT EMPNO, ENAME, DNAME, HIREDATE,
        (SELECT LOCATION
           FROM DEPT D
          WHERE E.DEPTNO = D.DEPTNO) AS LOC,
        SAL,
        (SELECT GRADE
           FROM SALGRADE S
          WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL) AS GRADE
  FROM EMP E
 WHERE SAL > (SELECT AVG(SAL)
                FROM EMP) 
ORDER BY SAL DESC, EMPNO;

DESC EMPLOYEES;
---3-------------
SELECT EMPNO, ENAME, JOB, DEPTNO,
        (SELECT DNAME
           FROM DEPT D
          WHERE E10.DEPTNO = D.DEPTNO) AS DNAME,
        (SELECT LOCATION
           FROM LOCATIONS L
          WHERE E10.DEPTNO = L.DEPTNO) AS LOC
  FROM (SELECT EMPNO, ENAME, JOB, DEPTNO
          FROM EMP 
         WHERE DEPTNO = 10) E10
 WHERE E10.JOB NOT IN (SELECT JOB
                         FROM EMP
                        WHERE DEPT = 30);

---4-----------

SELECT EMPNO, ENAME, SAL,
        (SELECT GRADE
           FROM SALGRADE
          WHERE E.SAL BETWEEN LOSAL AND HISAL) AS GRADE
  FROM EMP E
 WHERE SAL > ALL (SELECT SAL
                    FROM EMP
                   WHERE JOB = 'SALESMAN');