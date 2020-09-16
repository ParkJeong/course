package encap.bad;

public class MyDate {
	// 은닉을 사용하지 않는다면?
	
	public int year;
	public int month;
	public int day;
	public String ssn;
	
	public void showInfo() {
		System.out.println("생일:" + year + "년" + month + "월" + day + "일");
		System.out.println("주민번호:" + ssn);
	}
	
}
