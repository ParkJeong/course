package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCInsert {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("id>");
		String id = stdIn.next();
		
		System.out.print("pw>");
		String pw = stdIn.next();
		
		System.out.print("name>");
		String name = stdIn.next();
		
		System.out.print("email>");
		String email = stdIn.next();
		
		//1. 필요한 변수 선언
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "USER01";
		String upw = "user01";
		
		//i, u, d는 받아올 결과가 없기 때문에 ResultSet이 필요가 없다.
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO MEMBER(ID, PW, NAME, EMAIL) "
				   + "VALUES(?, ?, ?, ?)";
		
		try {
			// 2.드라이버로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 3.conn생성
			conn = DriverManager.getConnection(url, uid, upw);
			
			// 4.pstmt생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			// 5. sql문 실행 - i, u, d는 executeUpdate()
			// 업데이트 성공시 1을 반환, 실패시 0을 반환
			// 업데이트 성공시 COMMIT까지 자동으로 된다.
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("DB입력 성공");
			}else {
				System.out.println("DB입력 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
