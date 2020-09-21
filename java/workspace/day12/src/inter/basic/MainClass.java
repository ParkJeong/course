package inter.basic;

public class MainClass {
	public static void main(String[] args) {
		Basic b = new Basic();
		b.method1();
		b.method2();
		b.method3();
		System.out.println(Basic.PI);
		System.out.println(Basic.ABC);
		
		System.out.println(Inter1.PI);
		System.out.println(Inter2.ABC);
		
		System.out.println("---------------------");
		
		/*
		 * 인터페이스도 하나의 데이터 타입이 될 수 있다.
		 * 인터페이스를 부모형 타입으로 사용할 때, 다형성의 형태와 동일하게 실행
		 */
		Inter1 i1 = new Basic();
		i1.method1();
//		i1.method2();
//		i1.method3();
		
		Inter2 i2 = new Basic();
//		i2.method1();
		i2.method2();
//		i2.method3();
		
	}
}
