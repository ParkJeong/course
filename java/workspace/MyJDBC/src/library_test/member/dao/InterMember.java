package library_test.member.dao;

import java.util.ArrayList;

/*
 * 회원 조회, 추가, 수정, 삭제
 * 
 */
public interface InterMember {
	public ArrayList<MemberVO> select();
	public int insert(MemberVO vo);
	public int update(MemberVO vo);
	public int delete(MemberVO vo);
	
	public void selectMenu();
}
