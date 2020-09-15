package overriding.basic2;

// 부모 클래스
public class Person {
	String name;
	int age;
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
}
