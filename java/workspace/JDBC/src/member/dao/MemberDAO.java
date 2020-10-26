package member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO implements InterMember{
	private final String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	private final String uid = "USER01";
	private final String upw = "user01";
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 로더 에러");
		}
	}
	
	@Override
	public int insertMember(MemberVO vo) {
		int result = 0; // 결과반환 변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO MEMBER "
				   + "VALUES(?, ?, ?, ?)";
		try {
			//연결
			conn = DriverManager.getConnection(url, uid, upw);
			
			//sql문 전달
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			
			//sql문 실행
			result =  pstmt.executeUpdate();
		} catch (Exception e) {
		} finally {
			try {
				conn.close();
				pstmt.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return result;
	}

}
