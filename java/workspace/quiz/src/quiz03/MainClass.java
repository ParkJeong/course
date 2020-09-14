package quiz03;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 현실에서 찾아볼 수 있는 물건 등을 생각해서 클래스로 표현
		 * 
		 * 멤버변수 2개 이상, 메서드 2개 이상
		 * 
		 * 
		 */

		
		
		Student kim = new Student();
		Student lee = new Student("이순신", "010-1234-5678","남자");
		
		kim.name = "김길동";
		kim.phoneNumber = "010-5678-1234";
		kim.gender = "남자";
		
		kim.move();
		lee.move();
		
		kim.showInfo();
		lee.showInfo();
		
		System.out.println(kim);
		System.out.println(lee);
	}
}
