package static_.method;

public class Count {
	public int a;
	public static int b;
	
	// 일반 메서드 - 일반 멤버 변수, 정적 멤버 변수 모두 사용이 가능
	public int method01() {
		a = 10;
		return ++b;
	}
	// 정적 메서드 - static이 붙은 변수나 메서드만 사용이 가능
	//			- 단, 객체 생성을 통해서는 일반 변수도 사용이 가능
	public static int method02() {
		//a = 10;
		Count c = new Count();
		c.a = 10;
		return ++b;
	}
}
