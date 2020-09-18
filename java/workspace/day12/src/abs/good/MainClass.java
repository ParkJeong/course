package abs.good;

public class MainClass {
	public static void main(String[] args) {
		// 1. 추상 클래스(추상 메서드)를 사용하면, 오버라이딩이 강제되기 때문에
		// 프로그래머의 실수를 줄일 수 있다.
		
		//2. 추상클래스(추상 메서드)를 사용하면, 다형성의 ㅎㅇ태를 보다 안전하게 사용할 수 있다.
		
//		HeadStore h = new HeadStore();
		
		Store s = new Store();
		System.out.println("상호명: " + s.getName());
		s.apple();
		s.banana();
		s.melon();
		s.orange();
	}
}
