package poly.basic2;

public class MainClass {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method1();
		c.method2();
		c.method3();

		System.out.println("===============");
		
		Parent p = c;
		p.method1();
		p.method2();
		
		System.out.println(p);
		System.out.println(c);
		System.out.println(p == c);
		
		System.out.println("---------클래스 캐스팅--------");
		/*
		 * 다형성 적용시 자식이 원래 가지고 있던 멤버에 접근할 수 없는 문제가 발생하는 데,
		 * 클래스 캐스팅을 본래의 형태로 변경이 가능하다.
		 * 단, 다형성이 일어나지 않은 객체를 대상으로 캐스팅을 실행하면
		 * 에러가 발생한다.
		 */
		
		Child cc = (Child)p;
		cc.method1();
		cc.method2();
		cc.method3();
		
		
	}
}
