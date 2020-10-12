/*
���� 1.
�������ڸ� �������� EMPLOYEE���̺��� �Ի�����(hire_date)�� �����ؼ� �ټӳ���� 10�� �̻���
����� ������ ���� ������ ����� ����ϵ��� ������ �ۼ��� ������.
���� 1) �ټӳ���� ���� ��� ������� ����� �������� �մϴ�
*/
/* WHERE������ ��Ī�� ���� ������ �Ұ����ϴ�.
-- ���ο� ���̺��� ���� �����;� �Ѵ�.
-- WHERE������ ���ǽ��� �����ϸ� ������� �ƴ� ���� �ֵ��� ����.
-- EX WHERE (GRADE * 10 - 4) > 5�� WHERE GRADE > 0.9�� ���ľ���

SELECT  - (4)
FROM    - (0)
WHERE   - (1)
GROUP BY- (2)
HAVING  - (3)
ORDER BY- (5)
WHERE���� ALIAS�� ����� ��Ī�� �������� ���Ѵ�.
��Ī�� �ν��� GROUP BY�� ���ĺ��� �����ϴ�.
*/

SELECT EMPLOYEE_ID,
       CONCAT(FIRST_NAME, LAST_NAME),
       HIRE_DATE,
       TRUNC((SYSDATE - HIRE_DATE)/365) AS �ټӳ��
  FROM EMPLOYEES
 WHERE TRUNC((SYSDATE - HIRE_DATE)/365) >= 10
ORDER BY �ټӳ�� DESC;

SELECT EMPLOYEE_ID,
       NAME,
       HIRE_DATE,
       �ټӳ��
  FROM (SELECT EMPLOYEE_ID,
               CONCAT(FIRST_NAME, LAST_NAME) AS NAME,
               HIRE_DATE,
               TRUNC((SYSDATE - HIRE_DATE)/365) AS �ټӳ��
          FROM EMPLOYEES
        )
 WHERE �ټӳ�� >= 10
ORDER BY �ټӳ�� DESC;
/*
���� 2.
EMPLOYEE ���̺��� manager_id�÷��� Ȯ���Ͽ� first_name, manager_id, ������ ����մϴ�.
100�̶�� �������,
120�̶�� �����ӡ�
121�̶�� ���븮��
122��� �����塯
�������� ���ӿ��� ���� ����մϴ�.
���� 1) manager_id�� 50�� ������� ������θ� ��ȸ�մϴ�
*/

SELECT FIRST_NAME,
       MANAGER_ID,
       DECODE(MANAGER_ID, 100, '���',
                      120, '����',
                      121, '�븮',
                      122, '����',
                      '�ӿ�') AS ����
FROM EMPLOYEES
WHERE DEPARTMENT_ID = '50';
