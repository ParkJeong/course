package static_.field;

public class MainClass {
	public static void main(String[] args) {
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("일반멤버변수:" + c1.a);
		System.out.println("정적멤버변수:" + c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("일반멤버변수:" + c2.a);
		System.out.println("정적멤버변수:" + c2.b);
		
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		
		System.out.println("일반멤버변수:" + c3.a);
		System.out.println("정적멤버변수:" + c3.b);
		
		System.out.println("---------------------");
		
		/*
		 * static은 클래스 밖에 1개 생성된다. (모든 객체가 같은 값을 갖게 한다.)
		 * 객체생성 없이 "클래스명.변수명" 으로 사용한다.
		 */
		
		Count.b++;
		c3.b = 100;
		System.out.println(c1.b);
		System.out.println(c2.b);
		System.out.println(c3.b);
	}
	
}
