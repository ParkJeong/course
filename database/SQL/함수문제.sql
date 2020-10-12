/*
문제 1.
현재일자를 기준으로 EMPLOYEE테이블의 입사일자(hire_date)를 참조해서 근속년수가 10년 이상인
사원을 다음과 같은 형태의 결과를 출력하도록 쿼리를 작성해 보세요.
조건 1) 근속년수가 높은 사원 순서대로 결과가 나오도록 합니다
*/
/* WHERE에서는 별칭을 통한 접근이 불가능하다.
-- 새로운 테이블을 만들어서 가져와야 한다.
-- WHERE에서의 조건식은 가능하면 연산식이 아닌 값을 넣도록 하자.
-- EX WHERE (GRADE * 10 - 4) > 5는 WHERE GRADE > 0.9로 고쳐쓰자

SELECT  - (4)
FROM    - (0)
WHERE   - (1)
GROUP BY- (2)
HAVING  - (3)
ORDER BY- (5)
WHERE절은 ALIAS로 변경된 별칭을 인지하지 못한다.
별칭의 인식은 GROUP BY절 이후부터 가능하다.
*/

SELECT EMPLOYEE_ID,
       CONCAT(FIRST_NAME, LAST_NAME),
       HIRE_DATE,
       TRUNC((SYSDATE - HIRE_DATE)/365) AS 근속년수
  FROM EMPLOYEES
 WHERE TRUNC((SYSDATE - HIRE_DATE)/365) >= 10
ORDER BY 근속년수 DESC;

SELECT EMPLOYEE_ID,
       NAME,
       HIRE_DATE,
       근속년수
  FROM (SELECT EMPLOYEE_ID,
               CONCAT(FIRST_NAME, LAST_NAME) AS NAME,
               HIRE_DATE,
               TRUNC((SYSDATE - HIRE_DATE)/365) AS 근속년수
          FROM EMPLOYEES
        )
 WHERE 근속년수 >= 10
ORDER BY 근속년수 DESC;
/*
문제 2.
EMPLOYEE 테이블의 manager_id컬럼을 확인하여 first_name, manager_id, 직급을 출력합니다.
100이라면 ‘사원’,
120이라면 ‘주임’
121이라면 ‘대리’
122라면 ‘과장’
나머지는 ‘임원’ 으로 출력합니다.
조건 1) manager_id가 50인 사람들을 대상으로만 조회합니다
*/

SELECT FIRST_NAME,
       MANAGER_ID,
       DECODE(MANAGER_ID, 100, '사원',
                      120, '주임',
                      121, '대리',
                      122, '과장',
                      '임원') AS 직급
FROM EMPLOYEES
WHERE DEPARTMENT_ID = '50';
