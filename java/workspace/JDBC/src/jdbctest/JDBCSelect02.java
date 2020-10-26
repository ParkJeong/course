package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCSelect02 {
	/*
	 *  CREATE TABLE MEMBER(
		    ID VARCHAR2(30) PRIMARY KEY,
		    PW VARCHAR2(30),
		    NAME VARCHAR2(30),
		    EMAIL VARCHAR2(30)
		);
		
		INSERT INTO MEMBER 
		VALUES('test01', '1234', '홍길동', 'naver');
		INSERT INTO MEMBER 
		VALUES('test02', '1234', '이순신', 'naver');
		INSERT INTO MEMBER 
		VALUES('test03', '1234', '홍길자', 'google');
		
		COMMIT;
	 * */
	public static void main(String[] args) {
		
		//1. 필요한 변수 선언
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "USER01";
		String upw = "user01";
		
		String sql = "SELECT * FROM MEMBER WHERE NAME = ?";
				
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//try~catch에서 연결객체생성
		try {
			//2. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//3. 커넥션 생성
			conn = DriverManager.getConnection(url, uid, upw);
			//4. sql문 전달객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "홍길자"); // ?값 세팅
			
			//5. sql문 실행
			rs = pstmt.executeQuery();
			
			//6. 결과객체 처리
			while(rs.next()) {
				System.out.print("id:" + rs.getString("id"));
				System.out.print(", pw:" + rs.getString("pw"));
				System.out.print(", name:" + rs.getString("name"));
				System.out.print(", email:" + rs.getString("email"));
				
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 자원해제
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
