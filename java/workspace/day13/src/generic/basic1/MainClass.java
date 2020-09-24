package generic.basic1;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 제네릭클래스를 이용하면, 객체를 생성할 때 타입을 지정할 수 있고,
		 * 다목적 형태의 클래스를 안전하게 사용이 가능하다.
		 */
		ABC<String> abc = new ABC<String>();
		
		abc.setT("홍길자");
		String name = abc.getT();
		
		ABC<Integer> abc2 = new ABC<>();
		abc2.setT(1);
		
		int num = abc2.getT();
		
		ABC<Person> abc3 = new ABC<>();
		abc3.setT(new Person());
		Person p = abc3.getT();
	}
}
