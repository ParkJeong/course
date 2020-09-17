package innerclass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass; // 내부 클래스 자료형 변수를 먼저 선언
	
	public OutClass() { // 외부 클래스가 생성된 후에 내부 클래스 생성 가능
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 100;
		//static int sInNum = 200;	// 인스턴스 내부 클래스에 정적 변수 선언 불가능
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
		}
		
		
	}
	public void usingClass() {
		inClass.inTest();
	}

	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
		}
	}
	
	
	
	
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		
		System.out.println("====================");
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();

		System.out.println("====================");
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();

		System.out.println("====================");
		System.out.println();
		System.out.println("정적 내부 클래스 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
	}
}
