package library_test.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import main.DBInfo;

public class MemberDAO implements InterMember{
	private final String url = new DBInfo().getUrl();
	private final String uid = new DBInfo().getUid();
	private final String upw = new DBInfo().getUpw();

	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("클래스 로더 에러");
		}
	}

	@Override
	public ArrayList<MemberVO> select() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<MemberVO> result = new ArrayList<>();

		String sql = "SELECT MEMBER_NUM, MEMBER_NAME, MEMBER_PHONE "
				+ "  FROM MEMBER_TEST ";
		try {
			conn = DriverManager.getConnection(url, uid, upw);

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while(rs.next()) {
				int memberNum = rs.getInt("MEMBER_NUM");
				String memberName = rs.getString("MEMBER_NAME");
				String memberPhone = rs.getString("MEMBER_PHONE");
				MemberVO temp = new MemberVO(memberNum, memberName, memberPhone);

				result.add(temp);
				
				System.out.print("회원번호: " + memberNum);
				System.out.print(", 회원이름: " + memberName);
				System.out.print(", 전화번호: " + memberPhone);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}



		return result;
	}

	@Override
	public int insert(MemberVO vo) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "INSERT INTO MEMBER_TEST "
				+ "VALUES(MEMBER_TEST_SEQ.NEXTVAL, ?, ?)";

		try {
			conn = DriverManager.getConnection(url, uid, upw);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getMemberName());
			pstmt.setString(2, vo.getMemberPhone());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return result;
	}

	@Override
	public int update(MemberVO vo) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "UPDATE MEMBER_TEST "
				+ "   SET MEMBER_NAME  = ?,"
				+ "       PHONE_NUMBER = ? "
				+ " WHERE MEMBER_NUM   = ?";

		try {
			conn = DriverManager.getConnection(url, uid, upw);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getMemberName());
			pstmt.setString(2, vo.getMemberPhone());
			pstmt.setInt(3, vo.getMemberNum());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int delete(MemberVO vo) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstmt= null;

		String sql = "DELET MEMBER_TEST "
				+ "WHERE MEMEBER_NUM = ?";

		try {
			conn = DriverManager.getConnection(url, uid, upw);

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getMemberNum());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return result;
	}

	public void selectMenu() {
		Scanner stdIn = new Scanner(System.in);
		boolean flag = true;
		MemberVO vo = null;

		System.out.println("[1. 전체회원 조회, 2.회원추가, 3.회원정보수정, 4.회원삭제, 5.종료]");
		String menu = stdIn.next();
		
		if(menu.equals("2") || menu.equals("3") || menu.equals("4")) {
			System.out.print("name>");
			String memberName = stdIn.next();
			
			System.out.print("phonenumber>");
			String memberPhone = stdIn.next();
			
			vo = new MemberVO(-1, memberName, memberPhone);
		}
		
		while(flag) {
			switch (menu) {
			case "1":
				select();
				break;
			case "2":
				insert(vo);
				break;
			case "3":
				update(vo);
				break;
			case "4":
				delete(vo);
				break;
			case "5":
				flag = false;
				System.out.println("종료합니다.");
				break;

			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}

	}
}
