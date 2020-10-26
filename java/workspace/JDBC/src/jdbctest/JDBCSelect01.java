package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class JDBCSelect01 {
   public static void main(String[] args) {
      
      //1. 연결할 주소, 아이디, 비밀번호를 변수로
      String url ="jdbc:oracle:thin:@localhost:1521/XEPDB1";//주소는 DB환경에 따라 변경
      String uid = "hr";
      String upw = "hr";
      
      String sql = "SELECT EMPLOYEE_ID, LAST_NAME, SALARY, HIRE_DATE "
    		     + "FROM EMPLOYEES "
    		     + "WHERE EMPLOYEE_ID = ?";
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      //2. java.sql패키지를 사용하게 되는데 , 
      //해당클래스는 전부 throws~Exception을 던지고 있기 때문에 try구문에서 실행을 시킵니다
      try {
         //3. 사용할 드라이버를 클래스로더에 생성
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         //4. 연결객체생성 (connection 객체)
         conn = DriverManager.getConnection(url,uid,upw);
         
         System.out.println(conn);
         
         //5. SQL문 쿼리를 전달하기 위한 Statement객체를 Connection에서 얻음
         //   만약에 SQL문에  전달할 값이 있다면, ?로 처리를 한다.
         //   ?는 ?가 SQL문에서 나오는 순서대로 1, 2, 3, ... 인덱스를 가지고 있다.
         pstmt = conn.prepareStatement(sql); 
         
         // SQL문에 있는 ?에 값을 전달하는 방법
         // 숫자는 setInt(index, 값)
         // 문자열은 setString(index, 값)을 통해 전달할 수 있다.
         // index는 ?의 index를 뜻한다.
         // ? 처리를 했다면 rs = pstmt.executeQuery(sql)을
         // rs = stmt.executeQuery()로 바꿔서 실행해야 한다.
         pstmt.setInt(1, 100);
         
         //6. SQL문을 실행
         //   - select구문일 경우는 executeQuery()
         //   - i, u, d구문일 경우는 executeUpdate()
         rs = pstmt.executeQuery();
         
         //7. rs를 반복문으로 돌려서  결과를 처리.
         //   - rs의 next()메서드를 통해 다음행을 조회하는 형식으로 처리합니다.
         
         while(rs.next()) {
        	 /*
        	  * SELECT의 결과를 하나씩 읽으려면 
        	  * 문자열은 getString(칼럼명)
        	  * 숫자는 getInt(칼럼명)
        	  * 날짜는 getTimestamp(칼럼명)
        	  * 
        	  * getTime은 년월일
        	  * getTimestamp는 년월일시분초
        	  */
        	 int employee_id = rs.getInt("EMPLOYEE_ID");		// 숫자형
        	 String last_name = rs.getString("LAST_NAME");		// 문자형
        	 int salary = rs.getInt("SALARY");					// 숫자형
        	 Timestamp hire_date = rs.getTimestamp("HIRE_DATE");// 날짜형
        	 
        	 System.out.print("사원아이디:" + employee_id);
        	 System.out.print(", 이름:" + last_name);
        	 System.out.print(", 급여:" + salary);
        	 System.out.print(", 입사일:" + hire_date);
        	 System.out.println();
         }
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}