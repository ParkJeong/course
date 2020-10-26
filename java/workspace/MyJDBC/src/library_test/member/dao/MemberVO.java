package library_test.member.dao;

public class MemberVO {
	private int memberNum;
	private String memberName;
	private String memberPhone;
	
	public MemberVO() {
	}

	public MemberVO(int memberNum, String memberName, String memberPhone) {
		super();
		this.memberNum = memberNum;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
	}
	
	
	public int getMemberNum() {
		return memberNum;
	}



	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	
	
}
