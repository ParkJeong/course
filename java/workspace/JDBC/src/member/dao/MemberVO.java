package member.dao;

// MemberValue Object
// Member테이블의 칼럼형식을 가지고 값을 전달받고 리턴할때 사용
public class MemberVO {
	//데이터베이스 테이블이 가져야 할 칼럼을 변수로 선언
	private String id;
	private String pw;
	private String name;
	private String email;
	
	//기본 생성자
	public MemberVO(){
	}
	
	//모든 변수를 초기화하는 생성자	
	public MemberVO(String id, String pw, String name, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	}
	
	
	//getter, setter
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
