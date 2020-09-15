package this_.basic;

// 부모 클래스
public class Person {
	String name;
	int age;
	
	Person() {
//		this.name = "이름미정";
//		this.age = 1;
		this("이름미정", 1);
	}

	Person(String name) {
//		this.name = name;
//		this.age = 1;
		this(name, 1);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this);
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
}
