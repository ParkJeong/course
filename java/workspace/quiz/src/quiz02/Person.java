package quiz02;

public class Person {
	String name;
	int age;
	int tall;
	
	// 프로그래머가 인위적으로 생성자를 만들면, 기본 생성자를 자동으로 만들어주지 않는다.
	Person(){
		
	}
	Person(String name, int age, int tall){
		this.name = name;
		this.age = age;
		this.tall = tall;
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키: " + tall);
	}
}
