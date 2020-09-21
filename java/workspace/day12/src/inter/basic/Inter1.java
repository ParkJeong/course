package inter.basic;

public interface Inter1 {
	//상수와 추상메서드가 정의된다.
	double PI = 3.14; // 인터페이스 변수를 선언하면 자동으로 상수 취급된다.
	public void method1(); // 인터페이스에 메서드를 선언하면 자동으로 추상메서드가 된다.
	
	
	// 1.8버전 이후에 static메서드도 선언이 가능하다.
	public static void method2() {
		
	}
}
